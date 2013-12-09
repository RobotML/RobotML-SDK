/*****************************************************************************
 * Copyright (c) 2013 CEA LIST.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *
 *****************************************************************************/
package org.eclipse.papyrus.robotml.deployment.core;

public class Stereotypes {

	// CPP stereotypes
	// TODO: move CPP stereotypes (& their application) into C++ plug-in
	public final static String cppPtr = "PapyrusCpp::CppPtr";

	public final static String cppVirtual = "PapyrusCpp::CppVirtual";

	public final static String cppPureVirtual = "PapyrusCpp::CppVirtualPure";

	public final static String cppNoCodeGen = "PapyrusCpp::CppNoCodeGen";

	public final static String cppExternClass = "PapyrusCpp::CppExternClass";

	public final static String cppInclude = "PapyrusCpp::CppInclude";

	public final static String cppConstInit = "PapyrusCpp::CppConstInit";

	// FT stereotypes
	public final static String activeWithVoting = "FTRedundancy::FTActiveWithVotingReplicationStyle";

	public final static String replicationInfo = "DP::Replication";
}
