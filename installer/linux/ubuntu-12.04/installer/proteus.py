#!/usr/bin/python

import os
import sys
import subprocess
import threading

try:
    import gtk
except ImportError:
    sys.exit("pygtk not found. install python-gtk2")

import gobject

UI_FILE = "data/ui/proteus.glade"
SH_FILE = "data/sh/install.sh"
PACKAGES = ['proteus-urbanoarp', 'proteus-airlandoarp','proteus-offroadoarp', 'proteus-interventionoarp', 'proteus-rycchallenge', 'robotml']

app = None

def proc_exec_async(args, callback=None):
    threading.Thread(target=proc_exec, args=(args, callback)).start()

def proc_exec(args, callback=None):
    cmd = args.split(' ')
    subprocess.Popen(cmd).wait()
    callback()

def install(args):
    sh = os.path.join(os.path.dirname(__file__), SH_FILE)
    proc_exec_async("sh %s %s"%(sh, args), app.stop_spinner)

class GUI:
    def __init__(self):
        self.builder = gtk.Builder()
        self.builder.add_from_file(UI_FILE)
        self.window = self.builder.get_object("window_installer")
        self.builder.connect_signals(self)
        self.window.connect("delete_event", self.quit)

        # init packages
        vbox = self.builder.get_object("vbox_packages")
        self.bpackages = {}
        for package in PACKAGES:
            # add checkbox
            button = gtk.CheckButton(package)
            button.connect("toggled", self.on_package_toggled, package)
            vbox.pack_start(button)
            button.show()
            self.bpackages[package] = False

    def quit(self, widget, *event):
        gtk.main_quit()

    def on_package_toggled(self, widget, data=None):
        self.bpackages[data] = widget.get_active()

    def on_login_next_clicked(self, widget, *event):
        notebook = self.builder.get_object("notebook_installer")
        notebook.next_page()

    def on_btn_deselectall_clicked(self, widget, *event):
        self.set_all(False)

    def on_btn_selectall_clicked(self, widget, *event):
        self.set_all(True)

    def set_all(self, value):
        # get all CheckButton representing the packages
        buttons = self.builder.get_object("vbox_packages").children()
        for b in buttons:
            b.set_active(value)

    def bpackages_list(self):
        # return a list of active packages
        return [p for p in self.bpackages if self.bpackages[p]]

    def install_args(self):
        login = self.builder.get_object("entry_login").get_text().replace(' ', '')
        passw = self.builder.get_object("entry_password").get_text().replace(' ', '')
        packages = self.bpackages_list()
        args = "%s %s %s"%(login, passw, " ".join(packages))
        return args

    def on_btn_install_clicked(self, widget, *event):
        button = self.builder.get_object("btn_install")
        spinner = self.builder.get_object("spinner_installing")
        spinner.show() # .start()
        button.set_sensitive(False)
        # install
        install(self.install_args())

    def stop_spinner(self):
        # pending to the default UI main loop
        gobject.idle_add(self.stop_spinner_unsafe)

    def stop_spinner_unsafe(self):
        button = self.builder.get_object("btn_install")
        spinner = self.builder.get_object("spinner_installing")
        button.set_sensitive(True)
        spinner.hide() # .stop()


def main():
    global app
    app = GUI()
    app.window.show()
    gtk.gdk.threads_init()
    gtk.main()
    return 0

if __name__ == "__main__":
    sys.exit(main())
