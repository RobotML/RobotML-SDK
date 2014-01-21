package org.xtext.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.services.AthenaDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAthenaDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'language'", "'define'", "'is'", "'validity'", "'basic'", "'include'", "':'", "'='", "'lexicalCast'", "'array'", "'<'", "'>'", "'['", "']'", "'vector'", "'map'", "'struct'", "'union'", "'function'", "'inout'", "'in'", "'out'", "'processing'", "'parameter'", "'if'", "'then'", "'else'", "'while'", "'do'", "'execute'", "'prototype'", "'signal'", "'event'", "'{'", "'}'", "'=='", "'>='", "'<='", "'%%'", "'#'", "'!'", "'<>'", "'stateset'", "'transition'", "'from'", "'to'", "'on'", "'raise'", "'instance'", "'[]'", "'INHIBIT'", "'when'", "'::'", "'interaction'", "'reference'", "'as'", "'wrapper'", "'link-library'", "'implements-functions'", "'external-objects'", "'external-libraries'", "'test-apps'", "'begin'", "'end'", "'('", "')'", "'@'", "'.'", "','"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_ID=5;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__65=65;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int RULE_INT=6;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__80=80;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=4;
    public static final int T__32=32;
    public static final int T__71=71;
    public static final int T__33=33;
    public static final int T__72=72;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__70=70;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;

    // delegates
    // delegators


        public InternalAthenaDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAthenaDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAthenaDSLParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g"; }



     	private AthenaDSLGrammarAccess grammarAccess;
     	
        public InternalAthenaDSLParser(TokenStream input, AthenaDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Project";	
       	}
       	
       	@Override
       	protected AthenaDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleProject"
    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:67:1: entryRuleProject returns [EObject current=null] : iv_ruleProject= ruleProject EOF ;
    public final EObject entryRuleProject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProject = null;


        try {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:68:2: (iv_ruleProject= ruleProject EOF )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:69:2: iv_ruleProject= ruleProject EOF
            {
             newCompositeNode(grammarAccess.getProjectRule()); 
            pushFollow(FOLLOW_ruleProject_in_entryRuleProject75);
            iv_ruleProject=ruleProject();

            state._fsp--;

             current =iv_ruleProject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProject85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProject"


    // $ANTLR start "ruleProject"
    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:76:1: ruleProject returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_languages_1_0= ruleLanguageDeclaration ) )* ( (lv_types_2_0= ruleDataType ) )* ( (lv_validities_3_0= rulevalidityFunctionDeclaration ) )* ( (lv_imports_4_0= ruleImport ) )* ( (lv_functions_5_0= rulefunctionDeclaration ) )* ( (lv_imports_6_0= ruleImport ) )* ( (lv_processings_7_0= ruleProcessingDeclaration ) )* ( (lv_imports_8_0= ruleImport ) )* ( (lv_prototypes_9_0= ruleprototypeDeclaration ) )* ( (lv_imports_10_0= ruleImport ) )* ( (lv_wrappers_11_0= rulewrapperDeclaration ) )* ) ;
    public final EObject ruleProject() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_languages_1_0 = null;

        EObject lv_types_2_0 = null;

        EObject lv_validities_3_0 = null;

        EObject lv_imports_4_0 = null;

        EObject lv_functions_5_0 = null;

        EObject lv_imports_6_0 = null;

        EObject lv_processings_7_0 = null;

        EObject lv_imports_8_0 = null;

        EObject lv_prototypes_9_0 = null;

        EObject lv_imports_10_0 = null;

        EObject lv_wrappers_11_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:79:28: ( ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_languages_1_0= ruleLanguageDeclaration ) )* ( (lv_types_2_0= ruleDataType ) )* ( (lv_validities_3_0= rulevalidityFunctionDeclaration ) )* ( (lv_imports_4_0= ruleImport ) )* ( (lv_functions_5_0= rulefunctionDeclaration ) )* ( (lv_imports_6_0= ruleImport ) )* ( (lv_processings_7_0= ruleProcessingDeclaration ) )* ( (lv_imports_8_0= ruleImport ) )* ( (lv_prototypes_9_0= ruleprototypeDeclaration ) )* ( (lv_imports_10_0= ruleImport ) )* ( (lv_wrappers_11_0= rulewrapperDeclaration ) )* ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:80:1: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_languages_1_0= ruleLanguageDeclaration ) )* ( (lv_types_2_0= ruleDataType ) )* ( (lv_validities_3_0= rulevalidityFunctionDeclaration ) )* ( (lv_imports_4_0= ruleImport ) )* ( (lv_functions_5_0= rulefunctionDeclaration ) )* ( (lv_imports_6_0= ruleImport ) )* ( (lv_processings_7_0= ruleProcessingDeclaration ) )* ( (lv_imports_8_0= ruleImport ) )* ( (lv_prototypes_9_0= ruleprototypeDeclaration ) )* ( (lv_imports_10_0= ruleImport ) )* ( (lv_wrappers_11_0= rulewrapperDeclaration ) )* )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:80:1: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_languages_1_0= ruleLanguageDeclaration ) )* ( (lv_types_2_0= ruleDataType ) )* ( (lv_validities_3_0= rulevalidityFunctionDeclaration ) )* ( (lv_imports_4_0= ruleImport ) )* ( (lv_functions_5_0= rulefunctionDeclaration ) )* ( (lv_imports_6_0= ruleImport ) )* ( (lv_processings_7_0= ruleProcessingDeclaration ) )* ( (lv_imports_8_0= ruleImport ) )* ( (lv_prototypes_9_0= ruleprototypeDeclaration ) )* ( (lv_imports_10_0= ruleImport ) )* ( (lv_wrappers_11_0= rulewrapperDeclaration ) )* )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:80:2: ( (lv_imports_0_0= ruleImport ) )* ( (lv_languages_1_0= ruleLanguageDeclaration ) )* ( (lv_types_2_0= ruleDataType ) )* ( (lv_validities_3_0= rulevalidityFunctionDeclaration ) )* ( (lv_imports_4_0= ruleImport ) )* ( (lv_functions_5_0= rulefunctionDeclaration ) )* ( (lv_imports_6_0= ruleImport ) )* ( (lv_processings_7_0= ruleProcessingDeclaration ) )* ( (lv_imports_8_0= ruleImport ) )* ( (lv_prototypes_9_0= ruleprototypeDeclaration ) )* ( (lv_imports_10_0= ruleImport ) )* ( (lv_wrappers_11_0= rulewrapperDeclaration ) )*
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:80:2: ( (lv_imports_0_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    int LA1_2 = input.LA(2);

                    if ( (LA1_2==RULE_STRING) ) {
                        alt1=1;
                    }


                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:81:1: (lv_imports_0_0= ruleImport )
            	    {
            	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:81:1: (lv_imports_0_0= ruleImport )
            	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:82:3: lv_imports_0_0= ruleImport
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProjectAccess().getImportsImportParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImport_in_ruleProject131);
            	    lv_imports_0_0=ruleImport();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProjectRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"imports",
            	            		lv_imports_0_0, 
            	            		"Import");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:98:3: ( (lv_languages_1_0= ruleLanguageDeclaration ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:99:1: (lv_languages_1_0= ruleLanguageDeclaration )
            	    {
            	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:99:1: (lv_languages_1_0= ruleLanguageDeclaration )
            	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:100:3: lv_languages_1_0= ruleLanguageDeclaration
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProjectAccess().getLanguagesLanguageDeclarationParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleLanguageDeclaration_in_ruleProject153);
            	    lv_languages_1_0=ruleLanguageDeclaration();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProjectRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"languages",
            	            		lv_languages_1_0, 
            	            		"LanguageDeclaration");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:116:3: ( (lv_types_2_0= ruleDataType ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==13||LA3_0==16||LA3_0==21||(LA3_0>=26 && LA3_0<=29)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:117:1: (lv_types_2_0= ruleDataType )
            	    {
            	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:117:1: (lv_types_2_0= ruleDataType )
            	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:118:3: lv_types_2_0= ruleDataType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProjectAccess().getTypesDataTypeParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDataType_in_ruleProject175);
            	    lv_types_2_0=ruleDataType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProjectRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"types",
            	            		lv_types_2_0, 
            	            		"DataType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:134:3: ( (lv_validities_3_0= rulevalidityFunctionDeclaration ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:135:1: (lv_validities_3_0= rulevalidityFunctionDeclaration )
            	    {
            	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:135:1: (lv_validities_3_0= rulevalidityFunctionDeclaration )
            	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:136:3: lv_validities_3_0= rulevalidityFunctionDeclaration
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProjectAccess().getValiditiesValidityFunctionDeclarationParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulevalidityFunctionDeclaration_in_ruleProject197);
            	    lv_validities_3_0=rulevalidityFunctionDeclaration();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProjectRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"validities",
            	            		lv_validities_3_0, 
            	            		"validityFunctionDeclaration");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:152:3: ( (lv_imports_4_0= ruleImport ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==11) ) {
                    int LA5_2 = input.LA(2);

                    if ( (LA5_2==RULE_STRING) ) {
                        alt5=1;
                    }


                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:153:1: (lv_imports_4_0= ruleImport )
            	    {
            	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:153:1: (lv_imports_4_0= ruleImport )
            	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:154:3: lv_imports_4_0= ruleImport
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProjectAccess().getImportsImportParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImport_in_ruleProject219);
            	    lv_imports_4_0=ruleImport();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProjectRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"imports",
            	            		lv_imports_4_0, 
            	            		"Import");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:170:3: ( (lv_functions_5_0= rulefunctionDeclaration ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==30) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:171:1: (lv_functions_5_0= rulefunctionDeclaration )
            	    {
            	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:171:1: (lv_functions_5_0= rulefunctionDeclaration )
            	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:172:3: lv_functions_5_0= rulefunctionDeclaration
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProjectAccess().getFunctionsFunctionDeclarationParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulefunctionDeclaration_in_ruleProject241);
            	    lv_functions_5_0=rulefunctionDeclaration();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProjectRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"functions",
            	            		lv_functions_5_0, 
            	            		"functionDeclaration");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:188:3: ( (lv_imports_6_0= ruleImport ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==11) ) {
                    int LA7_2 = input.LA(2);

                    if ( (LA7_2==RULE_STRING) ) {
                        alt7=1;
                    }


                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:189:1: (lv_imports_6_0= ruleImport )
            	    {
            	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:189:1: (lv_imports_6_0= ruleImport )
            	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:190:3: lv_imports_6_0= ruleImport
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProjectAccess().getImportsImportParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImport_in_ruleProject263);
            	    lv_imports_6_0=ruleImport();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProjectRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"imports",
            	            		lv_imports_6_0, 
            	            		"Import");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:206:3: ( (lv_processings_7_0= ruleProcessingDeclaration ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==34) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:207:1: (lv_processings_7_0= ruleProcessingDeclaration )
            	    {
            	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:207:1: (lv_processings_7_0= ruleProcessingDeclaration )
            	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:208:3: lv_processings_7_0= ruleProcessingDeclaration
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProjectAccess().getProcessingsProcessingDeclarationParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleProcessingDeclaration_in_ruleProject285);
            	    lv_processings_7_0=ruleProcessingDeclaration();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProjectRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"processings",
            	            		lv_processings_7_0, 
            	            		"ProcessingDeclaration");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:224:3: ( (lv_imports_8_0= ruleImport ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==11) ) {
                    int LA9_2 = input.LA(2);

                    if ( (LA9_2==RULE_STRING) ) {
                        alt9=1;
                    }


                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:225:1: (lv_imports_8_0= ruleImport )
            	    {
            	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:225:1: (lv_imports_8_0= ruleImport )
            	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:226:3: lv_imports_8_0= ruleImport
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProjectAccess().getImportsImportParserRuleCall_8_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImport_in_ruleProject307);
            	    lv_imports_8_0=ruleImport();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProjectRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"imports",
            	            		lv_imports_8_0, 
            	            		"Import");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:242:3: ( (lv_prototypes_9_0= ruleprototypeDeclaration ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==42) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:243:1: (lv_prototypes_9_0= ruleprototypeDeclaration )
            	    {
            	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:243:1: (lv_prototypes_9_0= ruleprototypeDeclaration )
            	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:244:3: lv_prototypes_9_0= ruleprototypeDeclaration
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProjectAccess().getPrototypesPrototypeDeclarationParserRuleCall_9_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleprototypeDeclaration_in_ruleProject329);
            	    lv_prototypes_9_0=ruleprototypeDeclaration();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProjectRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"prototypes",
            	            		lv_prototypes_9_0, 
            	            		"prototypeDeclaration");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:260:3: ( (lv_imports_10_0= ruleImport ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==11) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:261:1: (lv_imports_10_0= ruleImport )
            	    {
            	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:261:1: (lv_imports_10_0= ruleImport )
            	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:262:3: lv_imports_10_0= ruleImport
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProjectAccess().getImportsImportParserRuleCall_10_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImport_in_ruleProject351);
            	    lv_imports_10_0=ruleImport();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProjectRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"imports",
            	            		lv_imports_10_0, 
            	            		"Import");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:278:3: ( (lv_wrappers_11_0= rulewrapperDeclaration ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==68) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:279:1: (lv_wrappers_11_0= rulewrapperDeclaration )
            	    {
            	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:279:1: (lv_wrappers_11_0= rulewrapperDeclaration )
            	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:280:3: lv_wrappers_11_0= rulewrapperDeclaration
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProjectAccess().getWrappersWrapperDeclarationParserRuleCall_11_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulewrapperDeclaration_in_ruleProject373);
            	    lv_wrappers_11_0=rulewrapperDeclaration();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProjectRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"wrappers",
            	            		lv_wrappers_11_0, 
            	            		"wrapperDeclaration");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProject"


    // $ANTLR start "entryRuleImport"
    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:304:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:305:2: (iv_ruleImport= ruleImport EOF )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:306:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport410);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport420); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:313:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:316:28: ( (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:317:1: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:317:1: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:317:3: otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleImport457); 

                	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:321:1: ( (lv_importURI_1_0= RULE_STRING ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:322:1: (lv_importURI_1_0= RULE_STRING )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:322:1: (lv_importURI_1_0= RULE_STRING )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:323:3: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleImport474); 

            			newLeafNode(lv_importURI_1_0, grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getImportRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"importURI",
                    		lv_importURI_1_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleLanguageDeclaration"
    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:347:1: entryRuleLanguageDeclaration returns [EObject current=null] : iv_ruleLanguageDeclaration= ruleLanguageDeclaration EOF ;
    public final EObject entryRuleLanguageDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLanguageDeclaration = null;


        try {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:348:2: (iv_ruleLanguageDeclaration= ruleLanguageDeclaration EOF )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:349:2: iv_ruleLanguageDeclaration= ruleLanguageDeclaration EOF
            {
             newCompositeNode(grammarAccess.getLanguageDeclarationRule()); 
            pushFollow(FOLLOW_ruleLanguageDeclaration_in_entryRuleLanguageDeclaration515);
            iv_ruleLanguageDeclaration=ruleLanguageDeclaration();

            state._fsp--;

             current =iv_ruleLanguageDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLanguageDeclaration525); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLanguageDeclaration"


    // $ANTLR start "ruleLanguageDeclaration"
    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:356:1: ruleLanguageDeclaration returns [EObject current=null] : (otherlv_0= 'language' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleLanguageDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:359:28: ( (otherlv_0= 'language' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:360:1: (otherlv_0= 'language' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:360:1: (otherlv_0= 'language' ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:360:3: otherlv_0= 'language' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleLanguageDeclaration562); 

                	newLeafNode(otherlv_0, grammarAccess.getLanguageDeclarationAccess().getLanguageKeyword_0());
                
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:364:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:365:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:365:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:366:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLanguageDeclaration579); 

            			newLeafNode(lv_name_1_0, grammarAccess.getLanguageDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLanguageDeclarationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLanguageDeclaration"


    // $ANTLR start "entryRuleDataType"
    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:390:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:391:2: (iv_ruleDataType= ruleDataType EOF )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:392:2: iv_ruleDataType= ruleDataType EOF
            {
             newCompositeNode(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_ruleDataType_in_entryRuleDataType620);
            iv_ruleDataType=ruleDataType();

            state._fsp--;

             current =iv_ruleDataType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataType630); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:399:1: ruleDataType returns [EObject current=null] : (this_basicType_0= rulebasicType | this_defineType_1= ruledefineType | this_arrayType_2= rulearrayType | this_vectorType_3= rulevectorType | this_mapType_4= rulemapType | this_structType_5= rulestructType | this_unionType_6= ruleunionType ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        EObject this_basicType_0 = null;

        EObject this_defineType_1 = null;

        EObject this_arrayType_2 = null;

        EObject this_vectorType_3 = null;

        EObject this_mapType_4 = null;

        EObject this_structType_5 = null;

        EObject this_unionType_6 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:402:28: ( (this_basicType_0= rulebasicType | this_defineType_1= ruledefineType | this_arrayType_2= rulearrayType | this_vectorType_3= rulevectorType | this_mapType_4= rulemapType | this_structType_5= rulestructType | this_unionType_6= ruleunionType ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:403:1: (this_basicType_0= rulebasicType | this_defineType_1= ruledefineType | this_arrayType_2= rulearrayType | this_vectorType_3= rulevectorType | this_mapType_4= rulemapType | this_structType_5= rulestructType | this_unionType_6= ruleunionType )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:403:1: (this_basicType_0= rulebasicType | this_defineType_1= ruledefineType | this_arrayType_2= rulearrayType | this_vectorType_3= rulevectorType | this_mapType_4= rulemapType | this_structType_5= rulestructType | this_unionType_6= ruleunionType )
            int alt13=7;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt13=1;
                }
                break;
            case 13:
                {
                alt13=2;
                }
                break;
            case 21:
                {
                alt13=3;
                }
                break;
            case 26:
                {
                alt13=4;
                }
                break;
            case 27:
                {
                alt13=5;
                }
                break;
            case 28:
                {
                alt13=6;
                }
                break;
            case 29:
                {
                alt13=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:404:5: this_basicType_0= rulebasicType
                    {
                     
                            newCompositeNode(grammarAccess.getDataTypeAccess().getBasicTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulebasicType_in_ruleDataType677);
                    this_basicType_0=rulebasicType();

                    state._fsp--;

                     
                            current = this_basicType_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:414:5: this_defineType_1= ruledefineType
                    {
                     
                            newCompositeNode(grammarAccess.getDataTypeAccess().getDefineTypeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruledefineType_in_ruleDataType704);
                    this_defineType_1=ruledefineType();

                    state._fsp--;

                     
                            current = this_defineType_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:424:5: this_arrayType_2= rulearrayType
                    {
                     
                            newCompositeNode(grammarAccess.getDataTypeAccess().getArrayTypeParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_rulearrayType_in_ruleDataType731);
                    this_arrayType_2=rulearrayType();

                    state._fsp--;

                     
                            current = this_arrayType_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:434:5: this_vectorType_3= rulevectorType
                    {
                     
                            newCompositeNode(grammarAccess.getDataTypeAccess().getVectorTypeParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_rulevectorType_in_ruleDataType758);
                    this_vectorType_3=rulevectorType();

                    state._fsp--;

                     
                            current = this_vectorType_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:444:5: this_mapType_4= rulemapType
                    {
                     
                            newCompositeNode(grammarAccess.getDataTypeAccess().getMapTypeParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_rulemapType_in_ruleDataType785);
                    this_mapType_4=rulemapType();

                    state._fsp--;

                     
                            current = this_mapType_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:454:5: this_structType_5= rulestructType
                    {
                     
                            newCompositeNode(grammarAccess.getDataTypeAccess().getStructTypeParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_rulestructType_in_ruleDataType812);
                    this_structType_5=rulestructType();

                    state._fsp--;

                     
                            current = this_structType_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:464:5: this_unionType_6= ruleunionType
                    {
                     
                            newCompositeNode(grammarAccess.getDataTypeAccess().getUnionTypeParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleunionType_in_ruleDataType839);
                    this_unionType_6=ruleunionType();

                    state._fsp--;

                     
                            current = this_unionType_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuledefineType"
    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:480:1: entryRuledefineType returns [EObject current=null] : iv_ruledefineType= ruledefineType EOF ;
    public final EObject entryRuledefineType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruledefineType = null;


        try {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:481:2: (iv_ruledefineType= ruledefineType EOF )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:482:2: iv_ruledefineType= ruledefineType EOF
            {
             newCompositeNode(grammarAccess.getDefineTypeRule()); 
            pushFollow(FOLLOW_ruledefineType_in_entryRuledefineType874);
            iv_ruledefineType=ruledefineType();

            state._fsp--;

             current =iv_ruledefineType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuledefineType884); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuledefineType"


    // $ANTLR start "ruledefineType"
    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:489:1: ruledefineType returns [EObject current=null] : (otherlv_0= 'define' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'is' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruledefineType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:492:28: ( (otherlv_0= 'define' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'is' ( (otherlv_3= RULE_ID ) ) ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:493:1: (otherlv_0= 'define' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'is' ( (otherlv_3= RULE_ID ) ) )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:493:1: (otherlv_0= 'define' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'is' ( (otherlv_3= RULE_ID ) ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:493:3: otherlv_0= 'define' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'is' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruledefineType921); 

                	newLeafNode(otherlv_0, grammarAccess.getDefineTypeAccess().getDefineKeyword_0());
                
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:497:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:498:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:498:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:499:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruledefineType938); 

            			newLeafNode(lv_name_1_0, grammarAccess.getDefineTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDefineTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruledefineType955); 

                	newLeafNode(otherlv_2, grammarAccess.getDefineTypeAccess().getIsKeyword_2());
                
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:519:1: ( (otherlv_3= RULE_ID ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:520:1: (otherlv_3= RULE_ID )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:520:1: (otherlv_3= RULE_ID )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:521:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDefineTypeRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruledefineType975); 

            		newLeafNode(otherlv_3, grammarAccess.getDefineTypeAccess().getTypenameDataTypeCrossReference_3_0()); 
            	

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruledefineType"


    // $ANTLR start "entryRulevalidityFunctionDeclaration"
    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:540:1: entryRulevalidityFunctionDeclaration returns [EObject current=null] : iv_rulevalidityFunctionDeclaration= rulevalidityFunctionDeclaration EOF ;
    public final EObject entryRulevalidityFunctionDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevalidityFunctionDeclaration = null;


        try {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:541:2: (iv_rulevalidityFunctionDeclaration= rulevalidityFunctionDeclaration EOF )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:542:2: iv_rulevalidityFunctionDeclaration= rulevalidityFunctionDeclaration EOF
            {
             newCompositeNode(grammarAccess.getValidityFunctionDeclarationRule()); 
            pushFollow(FOLLOW_rulevalidityFunctionDeclaration_in_entryRulevalidityFunctionDeclaration1011);
            iv_rulevalidityFunctionDeclaration=rulevalidityFunctionDeclaration();

            state._fsp--;

             current =iv_rulevalidityFunctionDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRulevalidityFunctionDeclaration1021); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulevalidityFunctionDeclaration"


    // $ANTLR start "rulevalidityFunctionDeclaration"
    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:549:1: rulevalidityFunctionDeclaration returns [EObject current=null] : (otherlv_0= 'validity' ( (otherlv_1= RULE_ID ) ) ( (lv_fctName_2_0= RULE_ID ) ) ) ;
    public final EObject rulevalidityFunctionDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_fctName_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:552:28: ( (otherlv_0= 'validity' ( (otherlv_1= RULE_ID ) ) ( (lv_fctName_2_0= RULE_ID ) ) ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:553:1: (otherlv_0= 'validity' ( (otherlv_1= RULE_ID ) ) ( (lv_fctName_2_0= RULE_ID ) ) )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:553:1: (otherlv_0= 'validity' ( (otherlv_1= RULE_ID ) ) ( (lv_fctName_2_0= RULE_ID ) ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:553:3: otherlv_0= 'validity' ( (otherlv_1= RULE_ID ) ) ( (lv_fctName_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_rulevalidityFunctionDeclaration1058); 

                	newLeafNode(otherlv_0, grammarAccess.getValidityFunctionDeclarationAccess().getValidityKeyword_0());
                
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:557:1: ( (otherlv_1= RULE_ID ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:558:1: (otherlv_1= RULE_ID )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:558:1: (otherlv_1= RULE_ID )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:559:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getValidityFunctionDeclarationRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulevalidityFunctionDeclaration1078); 

            		newLeafNode(otherlv_1, grammarAccess.getValidityFunctionDeclarationAccess().getTypenameDataTypeCrossReference_1_0()); 
            	

            }


            }

            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:570:2: ( (lv_fctName_2_0= RULE_ID ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:571:1: (lv_fctName_2_0= RULE_ID )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:571:1: (lv_fctName_2_0= RULE_ID )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:572:3: lv_fctName_2_0= RULE_ID
            {
            lv_fctName_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulevalidityFunctionDeclaration1095); 

            			newLeafNode(lv_fctName_2_0, grammarAccess.getValidityFunctionDeclarationAccess().getFctNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getValidityFunctionDeclarationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"fctName",
                    		lv_fctName_2_0, 
                    		"ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulevalidityFunctionDeclaration"


    // $ANTLR start "entryRulebasicType"
    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:596:1: entryRulebasicType returns [EObject current=null] : iv_rulebasicType= rulebasicType EOF ;
    public final EObject entryRulebasicType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulebasicType = null;


        try {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:597:2: (iv_rulebasicType= rulebasicType EOF )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:598:2: iv_rulebasicType= rulebasicType EOF
            {
             newCompositeNode(grammarAccess.getBasicTypeRule()); 
            pushFollow(FOLLOW_rulebasicType_in_entryRulebasicType1136);
            iv_rulebasicType=rulebasicType();

            state._fsp--;

             current =iv_rulebasicType; 
            match(input,EOF,FOLLOW_EOF_in_entryRulebasicType1146); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulebasicType"


    // $ANTLR start "rulebasicType"
    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:605:1: rulebasicType returns [EObject current=null] : (otherlv_0= 'basic' ( (lv_name_1_0= RULE_ID ) ) rulebegin ( (lv_includes_3_0= ruleincludeDecl ) )* ( (lv_languages_4_0= rulelanguageDecl ) )+ ( (lv_casts_5_0= rulelexicalCastDecl ) )* ruleend ) ;
    public final EObject rulebasicType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_includes_3_0 = null;

        EObject lv_languages_4_0 = null;

        EObject lv_casts_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:608:28: ( (otherlv_0= 'basic' ( (lv_name_1_0= RULE_ID ) ) rulebegin ( (lv_includes_3_0= ruleincludeDecl ) )* ( (lv_languages_4_0= rulelanguageDecl ) )+ ( (lv_casts_5_0= rulelexicalCastDecl ) )* ruleend ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:609:1: (otherlv_0= 'basic' ( (lv_name_1_0= RULE_ID ) ) rulebegin ( (lv_includes_3_0= ruleincludeDecl ) )* ( (lv_languages_4_0= rulelanguageDecl ) )+ ( (lv_casts_5_0= rulelexicalCastDecl ) )* ruleend )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:609:1: (otherlv_0= 'basic' ( (lv_name_1_0= RULE_ID ) ) rulebegin ( (lv_includes_3_0= ruleincludeDecl ) )* ( (lv_languages_4_0= rulelanguageDecl ) )+ ( (lv_casts_5_0= rulelexicalCastDecl ) )* ruleend )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:609:3: otherlv_0= 'basic' ( (lv_name_1_0= RULE_ID ) ) rulebegin ( (lv_includes_3_0= ruleincludeDecl ) )* ( (lv_languages_4_0= rulelanguageDecl ) )+ ( (lv_casts_5_0= rulelexicalCastDecl ) )* ruleend
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_rulebasicType1183); 

                	newLeafNode(otherlv_0, grammarAccess.getBasicTypeAccess().getBasicKeyword_0());
                
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:613:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:614:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:614:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:615:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulebasicType1200); 

            			newLeafNode(lv_name_1_0, grammarAccess.getBasicTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBasicTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

             
                    newCompositeNode(grammarAccess.getBasicTypeAccess().getBeginParserRuleCall_2()); 
                
            pushFollow(FOLLOW_rulebegin_in_rulebasicType1221);
            rulebegin();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:639:1: ( (lv_includes_3_0= ruleincludeDecl ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==17) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:640:1: (lv_includes_3_0= ruleincludeDecl )
            	    {
            	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:640:1: (lv_includes_3_0= ruleincludeDecl )
            	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:641:3: lv_includes_3_0= ruleincludeDecl
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBasicTypeAccess().getIncludesIncludeDeclParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleincludeDecl_in_rulebasicType1241);
            	    lv_includes_3_0=ruleincludeDecl();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBasicTypeRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"includes",
            	            		lv_includes_3_0, 
            	            		"includeDecl");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:657:3: ( (lv_languages_4_0= rulelanguageDecl ) )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==12) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:658:1: (lv_languages_4_0= rulelanguageDecl )
            	    {
            	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:658:1: (lv_languages_4_0= rulelanguageDecl )
            	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:659:3: lv_languages_4_0= rulelanguageDecl
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBasicTypeAccess().getLanguagesLanguageDeclParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulelanguageDecl_in_rulebasicType1263);
            	    lv_languages_4_0=rulelanguageDecl();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBasicTypeRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"languages",
            	            		lv_languages_4_0, 
            	            		"languageDecl");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);

            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:675:3: ( (lv_casts_5_0= rulelexicalCastDecl ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==20) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:676:1: (lv_casts_5_0= rulelexicalCastDecl )
            	    {
            	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:676:1: (lv_casts_5_0= rulelexicalCastDecl )
            	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:677:3: lv_casts_5_0= rulelexicalCastDecl
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBasicTypeAccess().getCastsLexicalCastDeclParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulelexicalCastDecl_in_rulebasicType1285);
            	    lv_casts_5_0=rulelexicalCastDecl();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBasicTypeRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"casts",
            	            		lv_casts_5_0, 
            	            		"lexicalCastDecl");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             
                    newCompositeNode(grammarAccess.getBasicTypeAccess().getEndParserRuleCall_6()); 
                
            pushFollow(FOLLOW_ruleend_in_rulebasicType1302);
            ruleend();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulebasicType"


    // $ANTLR start "entryRuleincludeDecl"
    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:709:1: entryRuleincludeDecl returns [EObject current=null] : iv_ruleincludeDecl= ruleincludeDecl EOF ;
    public final EObject entryRuleincludeDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleincludeDecl = null;


        try {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:710:2: (iv_ruleincludeDecl= ruleincludeDecl EOF )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:711:2: iv_ruleincludeDecl= ruleincludeDecl EOF
            {
             newCompositeNode(grammarAccess.getIncludeDeclRule()); 
            pushFollow(FOLLOW_ruleincludeDecl_in_entryRuleincludeDecl1337);
            iv_ruleincludeDecl=ruleincludeDecl();

            state._fsp--;

             current =iv_ruleincludeDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleincludeDecl1347); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleincludeDecl"


    // $ANTLR start "ruleincludeDecl"
    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:718:1: ruleincludeDecl returns [EObject current=null] : (otherlv_0= 'include' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( (lv_includeName_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleincludeDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_includeName_3_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:721:28: ( (otherlv_0= 'include' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( (lv_includeName_3_0= RULE_STRING ) ) ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:722:1: (otherlv_0= 'include' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( (lv_includeName_3_0= RULE_STRING ) ) )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:722:1: (otherlv_0= 'include' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( (lv_includeName_3_0= RULE_STRING ) ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:722:3: otherlv_0= 'include' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( (lv_includeName_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleincludeDecl1384); 

                	newLeafNode(otherlv_0, grammarAccess.getIncludeDeclAccess().getIncludeKeyword_0());
                
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:726:1: ( (otherlv_1= RULE_ID ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:727:1: (otherlv_1= RULE_ID )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:727:1: (otherlv_1= RULE_ID )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:728:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getIncludeDeclRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleincludeDecl1404); 

            		newLeafNode(otherlv_1, grammarAccess.getIncludeDeclAccess().getLangLanguageDeclarationCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleincludeDecl1416); 

                	newLeafNode(otherlv_2, grammarAccess.getIncludeDeclAccess().getColonKeyword_2());
                
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:743:1: ( (lv_includeName_3_0= RULE_STRING ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:744:1: (lv_includeName_3_0= RULE_STRING )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:744:1: (lv_includeName_3_0= RULE_STRING )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:745:3: lv_includeName_3_0= RULE_STRING
            {
            lv_includeName_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleincludeDecl1433); 

            			newLeafNode(lv_includeName_3_0, grammarAccess.getIncludeDeclAccess().getIncludeNameSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIncludeDeclRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"includeName",
                    		lv_includeName_3_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleincludeDecl"


    // $ANTLR start "entryRulelanguageDecl"
    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:769:1: entryRulelanguageDecl returns [EObject current=null] : iv_rulelanguageDecl= rulelanguageDecl EOF ;
    public final EObject entryRulelanguageDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelanguageDecl = null;


        try {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:770:2: (iv_rulelanguageDecl= rulelanguageDecl EOF )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:771:2: iv_rulelanguageDecl= rulelanguageDecl EOF
            {
             newCompositeNode(grammarAccess.getLanguageDeclRule()); 
            pushFollow(FOLLOW_rulelanguageDecl_in_entryRulelanguageDecl1474);
            iv_rulelanguageDecl=rulelanguageDecl();

            state._fsp--;

             current =iv_rulelanguageDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRulelanguageDecl1484); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulelanguageDecl"


    // $ANTLR start "rulelanguageDecl"
    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:778:1: rulelanguageDecl returns [EObject current=null] : (otherlv_0= 'language' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( (lv_trans_3_0= RULE_STRING ) ) otherlv_4= '=' ( (lv_value_5_0= RULE_STRING ) ) ) ;
    public final EObject rulelanguageDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_trans_3_0=null;
        Token otherlv_4=null;
        Token lv_value_5_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:781:28: ( (otherlv_0= 'language' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( (lv_trans_3_0= RULE_STRING ) ) otherlv_4= '=' ( (lv_value_5_0= RULE_STRING ) ) ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:782:1: (otherlv_0= 'language' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( (lv_trans_3_0= RULE_STRING ) ) otherlv_4= '=' ( (lv_value_5_0= RULE_STRING ) ) )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:782:1: (otherlv_0= 'language' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( (lv_trans_3_0= RULE_STRING ) ) otherlv_4= '=' ( (lv_value_5_0= RULE_STRING ) ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:782:3: otherlv_0= 'language' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( (lv_trans_3_0= RULE_STRING ) ) otherlv_4= '=' ( (lv_value_5_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_rulelanguageDecl1521); 

                	newLeafNode(otherlv_0, grammarAccess.getLanguageDeclAccess().getLanguageKeyword_0());
                
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:786:1: ( (otherlv_1= RULE_ID ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:787:1: (otherlv_1= RULE_ID )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:787:1: (otherlv_1= RULE_ID )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:788:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getLanguageDeclRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulelanguageDecl1541); 

            		newLeafNode(otherlv_1, grammarAccess.getLanguageDeclAccess().getLangLanguageDeclarationCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_rulelanguageDecl1553); 

                	newLeafNode(otherlv_2, grammarAccess.getLanguageDeclAccess().getColonKeyword_2());
                
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:803:1: ( (lv_trans_3_0= RULE_STRING ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:804:1: (lv_trans_3_0= RULE_STRING )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:804:1: (lv_trans_3_0= RULE_STRING )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:805:3: lv_trans_3_0= RULE_STRING
            {
            lv_trans_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulelanguageDecl1570); 

            			newLeafNode(lv_trans_3_0, grammarAccess.getLanguageDeclAccess().getTransSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLanguageDeclRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"trans",
                    		lv_trans_3_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_4=(Token)match(input,19,FOLLOW_19_in_rulelanguageDecl1587); 

                	newLeafNode(otherlv_4, grammarAccess.getLanguageDeclAccess().getEqualsSignKeyword_4());
                
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:825:1: ( (lv_value_5_0= RULE_STRING ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:826:1: (lv_value_5_0= RULE_STRING )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:826:1: (lv_value_5_0= RULE_STRING )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:827:3: lv_value_5_0= RULE_STRING
            {
            lv_value_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulelanguageDecl1604); 

            			newLeafNode(lv_value_5_0, grammarAccess.getLanguageDeclAccess().getValueSTRINGTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLanguageDeclRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_5_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulelanguageDecl"


    // $ANTLR start "entryRulelexicalCastDecl"
    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:851:1: entryRulelexicalCastDecl returns [EObject current=null] : iv_rulelexicalCastDecl= rulelexicalCastDecl EOF ;
    public final EObject entryRulelexicalCastDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelexicalCastDecl = null;


        try {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:852:2: (iv_rulelexicalCastDecl= rulelexicalCastDecl EOF )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:853:2: iv_rulelexicalCastDecl= rulelexicalCastDecl EOF
            {
             newCompositeNode(grammarAccess.getLexicalCastDeclRule()); 
            pushFollow(FOLLOW_rulelexicalCastDecl_in_entryRulelexicalCastDecl1645);
            iv_rulelexicalCastDecl=rulelexicalCastDecl();

            state._fsp--;

             current =iv_rulelexicalCastDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRulelexicalCastDecl1655); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulelexicalCastDecl"


    // $ANTLR start "rulelexicalCastDecl"
    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:860:1: rulelexicalCastDecl returns [EObject current=null] : (otherlv_0= 'lexicalCast' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( (lv_cast_3_0= RULE_STRING ) ) ) ;
    public final EObject rulelexicalCastDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_cast_3_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:863:28: ( (otherlv_0= 'lexicalCast' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( (lv_cast_3_0= RULE_STRING ) ) ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:864:1: (otherlv_0= 'lexicalCast' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( (lv_cast_3_0= RULE_STRING ) ) )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:864:1: (otherlv_0= 'lexicalCast' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( (lv_cast_3_0= RULE_STRING ) ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:864:3: otherlv_0= 'lexicalCast' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( (lv_cast_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_rulelexicalCastDecl1692); 

                	newLeafNode(otherlv_0, grammarAccess.getLexicalCastDeclAccess().getLexicalCastKeyword_0());
                
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:868:1: ( (otherlv_1= RULE_ID ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:869:1: (otherlv_1= RULE_ID )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:869:1: (otherlv_1= RULE_ID )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:870:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getLexicalCastDeclRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulelexicalCastDecl1712); 

            		newLeafNode(otherlv_1, grammarAccess.getLexicalCastDeclAccess().getLangLanguageDeclarationCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_rulelexicalCastDecl1724); 

                	newLeafNode(otherlv_2, grammarAccess.getLexicalCastDeclAccess().getColonKeyword_2());
                
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:885:1: ( (lv_cast_3_0= RULE_STRING ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:886:1: (lv_cast_3_0= RULE_STRING )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:886:1: (lv_cast_3_0= RULE_STRING )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:887:3: lv_cast_3_0= RULE_STRING
            {
            lv_cast_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulelexicalCastDecl1741); 

            			newLeafNode(lv_cast_3_0, grammarAccess.getLexicalCastDeclAccess().getCastSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLexicalCastDeclRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"cast",
                    		lv_cast_3_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulelexicalCastDecl"


    // $ANTLR start "entryRulearrayType"
    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:911:1: entryRulearrayType returns [EObject current=null] : iv_rulearrayType= rulearrayType EOF ;
    public final EObject entryRulearrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulearrayType = null;


        try {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:912:2: (iv_rulearrayType= rulearrayType EOF )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:913:2: iv_rulearrayType= rulearrayType EOF
            {
             newCompositeNode(grammarAccess.getArrayTypeRule()); 
            pushFollow(FOLLOW_rulearrayType_in_entryRulearrayType1782);
            iv_rulearrayType=rulearrayType();

            state._fsp--;

             current =iv_rulearrayType; 
            match(input,EOF,FOLLOW_EOF_in_entryRulearrayType1792); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulearrayType"


    // $ANTLR start "rulearrayType"
    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:920:1: rulearrayType returns [EObject current=null] : (otherlv_0= 'array' otherlv_1= '<' ( (otherlv_2= RULE_ID ) ) otherlv_3= '>' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '[' ( (lv_indices_6_0= ruleindex ) ) ( rulecoma ( (lv_indices_8_0= ruleindex ) ) )* otherlv_9= ']' ) ;
    public final EObject rulearrayType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_9=null;
        EObject lv_indices_6_0 = null;

        EObject lv_indices_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:923:28: ( (otherlv_0= 'array' otherlv_1= '<' ( (otherlv_2= RULE_ID ) ) otherlv_3= '>' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '[' ( (lv_indices_6_0= ruleindex ) ) ( rulecoma ( (lv_indices_8_0= ruleindex ) ) )* otherlv_9= ']' ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:924:1: (otherlv_0= 'array' otherlv_1= '<' ( (otherlv_2= RULE_ID ) ) otherlv_3= '>' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '[' ( (lv_indices_6_0= ruleindex ) ) ( rulecoma ( (lv_indices_8_0= ruleindex ) ) )* otherlv_9= ']' )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:924:1: (otherlv_0= 'array' otherlv_1= '<' ( (otherlv_2= RULE_ID ) ) otherlv_3= '>' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '[' ( (lv_indices_6_0= ruleindex ) ) ( rulecoma ( (lv_indices_8_0= ruleindex ) ) )* otherlv_9= ']' )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:924:3: otherlv_0= 'array' otherlv_1= '<' ( (otherlv_2= RULE_ID ) ) otherlv_3= '>' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '[' ( (lv_indices_6_0= ruleindex ) ) ( rulecoma ( (lv_indices_8_0= ruleindex ) ) )* otherlv_9= ']'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_rulearrayType1829); 

                	newLeafNode(otherlv_0, grammarAccess.getArrayTypeAccess().getArrayKeyword_0());
                
            otherlv_1=(Token)match(input,22,FOLLOW_22_in_rulearrayType1841); 

                	newLeafNode(otherlv_1, grammarAccess.getArrayTypeAccess().getLessThanSignKeyword_1());
                
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:932:1: ( (otherlv_2= RULE_ID ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:933:1: (otherlv_2= RULE_ID )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:933:1: (otherlv_2= RULE_ID )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:934:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getArrayTypeRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulearrayType1861); 

            		newLeafNode(otherlv_2, grammarAccess.getArrayTypeAccess().getTypenameDataTypeCrossReference_2_0()); 
            	

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_23_in_rulearrayType1873); 

                	newLeafNode(otherlv_3, grammarAccess.getArrayTypeAccess().getGreaterThanSignKeyword_3());
                
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:949:1: ( (lv_name_4_0= RULE_ID ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:950:1: (lv_name_4_0= RULE_ID )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:950:1: (lv_name_4_0= RULE_ID )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:951:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulearrayType1890); 

            			newLeafNode(lv_name_4_0, grammarAccess.getArrayTypeAccess().getNameIDTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getArrayTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_4_0, 
                    		"ID");
            	    

            }


            }

            otherlv_5=(Token)match(input,24,FOLLOW_24_in_rulearrayType1907); 

                	newLeafNode(otherlv_5, grammarAccess.getArrayTypeAccess().getLeftSquareBracketKeyword_5());
                
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:971:1: ( (lv_indices_6_0= ruleindex ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:972:1: (lv_indices_6_0= ruleindex )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:972:1: (lv_indices_6_0= ruleindex )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:973:3: lv_indices_6_0= ruleindex
            {
             
            	        newCompositeNode(grammarAccess.getArrayTypeAccess().getIndicesIndexParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleindex_in_rulearrayType1928);
            lv_indices_6_0=ruleindex();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getArrayTypeRule());
            	        }
                   		add(
                   			current, 
                   			"indices",
                    		lv_indices_6_0, 
                    		"index");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:989:2: ( rulecoma ( (lv_indices_8_0= ruleindex ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==80) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:990:5: rulecoma ( (lv_indices_8_0= ruleindex ) )
            	    {
            	     
            	            newCompositeNode(grammarAccess.getArrayTypeAccess().getComaParserRuleCall_7_0()); 
            	        
            	    pushFollow(FOLLOW_rulecoma_in_rulearrayType1945);
            	    rulecoma();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        
            	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:997:1: ( (lv_indices_8_0= ruleindex ) )
            	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:998:1: (lv_indices_8_0= ruleindex )
            	    {
            	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:998:1: (lv_indices_8_0= ruleindex )
            	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:999:3: lv_indices_8_0= ruleindex
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getArrayTypeAccess().getIndicesIndexParserRuleCall_7_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleindex_in_rulearrayType1965);
            	    lv_indices_8_0=ruleindex();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getArrayTypeRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"indices",
            	            		lv_indices_8_0, 
            	            		"index");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_9=(Token)match(input,25,FOLLOW_25_in_rulearrayType1979); 

                	newLeafNode(otherlv_9, grammarAccess.getArrayTypeAccess().getRightSquareBracketKeyword_8());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulearrayType"


    // $ANTLR start "entryRulevectorType"
    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1027:1: entryRulevectorType returns [EObject current=null] : iv_rulevectorType= rulevectorType EOF ;
    public final EObject entryRulevectorType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevectorType = null;


        try {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1028:2: (iv_rulevectorType= rulevectorType EOF )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1029:2: iv_rulevectorType= rulevectorType EOF
            {
             newCompositeNode(grammarAccess.getVectorTypeRule()); 
            pushFollow(FOLLOW_rulevectorType_in_entryRulevectorType2015);
            iv_rulevectorType=rulevectorType();

            state._fsp--;

             current =iv_rulevectorType; 
            match(input,EOF,FOLLOW_EOF_in_entryRulevectorType2025); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulevectorType"


    // $ANTLR start "rulevectorType"
    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1036:1: rulevectorType returns [EObject current=null] : (otherlv_0= 'vector' otherlv_1= '<' ( (otherlv_2= RULE_ID ) ) otherlv_3= '>' ( (lv_name_4_0= RULE_ID ) ) ) ;
    public final EObject rulevectorType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1039:28: ( (otherlv_0= 'vector' otherlv_1= '<' ( (otherlv_2= RULE_ID ) ) otherlv_3= '>' ( (lv_name_4_0= RULE_ID ) ) ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1040:1: (otherlv_0= 'vector' otherlv_1= '<' ( (otherlv_2= RULE_ID ) ) otherlv_3= '>' ( (lv_name_4_0= RULE_ID ) ) )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1040:1: (otherlv_0= 'vector' otherlv_1= '<' ( (otherlv_2= RULE_ID ) ) otherlv_3= '>' ( (lv_name_4_0= RULE_ID ) ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1040:3: otherlv_0= 'vector' otherlv_1= '<' ( (otherlv_2= RULE_ID ) ) otherlv_3= '>' ( (lv_name_4_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_rulevectorType2062); 

                	newLeafNode(otherlv_0, grammarAccess.getVectorTypeAccess().getVectorKeyword_0());
                
            otherlv_1=(Token)match(input,22,FOLLOW_22_in_rulevectorType2074); 

                	newLeafNode(otherlv_1, grammarAccess.getVectorTypeAccess().getLessThanSignKeyword_1());
                
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1048:1: ( (otherlv_2= RULE_ID ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1049:1: (otherlv_2= RULE_ID )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1049:1: (otherlv_2= RULE_ID )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1050:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getVectorTypeRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulevectorType2094); 

            		newLeafNode(otherlv_2, grammarAccess.getVectorTypeAccess().getTypenameDataTypeCrossReference_2_0()); 
            	

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_23_in_rulevectorType2106); 

                	newLeafNode(otherlv_3, grammarAccess.getVectorTypeAccess().getGreaterThanSignKeyword_3());
                
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1065:1: ( (lv_name_4_0= RULE_ID ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1066:1: (lv_name_4_0= RULE_ID )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1066:1: (lv_name_4_0= RULE_ID )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1067:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulevectorType2123); 

            			newLeafNode(lv_name_4_0, grammarAccess.getVectorTypeAccess().getNameIDTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVectorTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_4_0, 
                    		"ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulevectorType"


    // $ANTLR start "entryRulemapType"
    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1091:1: entryRulemapType returns [EObject current=null] : iv_rulemapType= rulemapType EOF ;
    public final EObject entryRulemapType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemapType = null;


        try {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1092:2: (iv_rulemapType= rulemapType EOF )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1093:2: iv_rulemapType= rulemapType EOF
            {
             newCompositeNode(grammarAccess.getMapTypeRule()); 
            pushFollow(FOLLOW_rulemapType_in_entryRulemapType2164);
            iv_rulemapType=rulemapType();

            state._fsp--;

             current =iv_rulemapType; 
            match(input,EOF,FOLLOW_EOF_in_entryRulemapType2174); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulemapType"


    // $ANTLR start "rulemapType"
    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1100:1: rulemapType returns [EObject current=null] : (otherlv_0= 'map' otherlv_1= '<' ( (otherlv_2= RULE_ID ) ) rulecoma ( (otherlv_4= RULE_ID ) ) otherlv_5= '>' ( (lv_name_6_0= RULE_ID ) ) ) ;
    public final EObject rulemapType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_name_6_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1103:28: ( (otherlv_0= 'map' otherlv_1= '<' ( (otherlv_2= RULE_ID ) ) rulecoma ( (otherlv_4= RULE_ID ) ) otherlv_5= '>' ( (lv_name_6_0= RULE_ID ) ) ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1104:1: (otherlv_0= 'map' otherlv_1= '<' ( (otherlv_2= RULE_ID ) ) rulecoma ( (otherlv_4= RULE_ID ) ) otherlv_5= '>' ( (lv_name_6_0= RULE_ID ) ) )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1104:1: (otherlv_0= 'map' otherlv_1= '<' ( (otherlv_2= RULE_ID ) ) rulecoma ( (otherlv_4= RULE_ID ) ) otherlv_5= '>' ( (lv_name_6_0= RULE_ID ) ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1104:3: otherlv_0= 'map' otherlv_1= '<' ( (otherlv_2= RULE_ID ) ) rulecoma ( (otherlv_4= RULE_ID ) ) otherlv_5= '>' ( (lv_name_6_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_rulemapType2211); 

                	newLeafNode(otherlv_0, grammarAccess.getMapTypeAccess().getMapKeyword_0());
                
            otherlv_1=(Token)match(input,22,FOLLOW_22_in_rulemapType2223); 

                	newLeafNode(otherlv_1, grammarAccess.getMapTypeAccess().getLessThanSignKeyword_1());
                
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1112:1: ( (otherlv_2= RULE_ID ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1113:1: (otherlv_2= RULE_ID )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1113:1: (otherlv_2= RULE_ID )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1114:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMapTypeRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulemapType2243); 

            		newLeafNode(otherlv_2, grammarAccess.getMapTypeAccess().getKeytypeDataTypeCrossReference_2_0()); 
            	

            }


            }

             
                    newCompositeNode(grammarAccess.getMapTypeAccess().getComaParserRuleCall_3()); 
                
            pushFollow(FOLLOW_rulecoma_in_rulemapType2259);
            rulecoma();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1133:1: ( (otherlv_4= RULE_ID ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1134:1: (otherlv_4= RULE_ID )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1134:1: (otherlv_4= RULE_ID )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1135:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMapTypeRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulemapType2278); 

            		newLeafNode(otherlv_4, grammarAccess.getMapTypeAccess().getValtypeDataTypeCrossReference_4_0()); 
            	

            }


            }

            otherlv_5=(Token)match(input,23,FOLLOW_23_in_rulemapType2290); 

                	newLeafNode(otherlv_5, grammarAccess.getMapTypeAccess().getGreaterThanSignKeyword_5());
                
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1150:1: ( (lv_name_6_0= RULE_ID ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1151:1: (lv_name_6_0= RULE_ID )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1151:1: (lv_name_6_0= RULE_ID )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1152:3: lv_name_6_0= RULE_ID
            {
            lv_name_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulemapType2307); 

            			newLeafNode(lv_name_6_0, grammarAccess.getMapTypeAccess().getNameIDTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMapTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_6_0, 
                    		"ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulemapType"


    // $ANTLR start "entryRulestructType"
    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1176:1: entryRulestructType returns [EObject current=null] : iv_rulestructType= rulestructType EOF ;
    public final EObject entryRulestructType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestructType = null;


        try {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1177:2: (iv_rulestructType= rulestructType EOF )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1178:2: iv_rulestructType= rulestructType EOF
            {
             newCompositeNode(grammarAccess.getStructTypeRule()); 
            pushFollow(FOLLOW_rulestructType_in_entryRulestructType2348);
            iv_rulestructType=rulestructType();

            state._fsp--;

             current =iv_rulestructType; 
            match(input,EOF,FOLLOW_EOF_in_entryRulestructType2358); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulestructType"


    // $ANTLR start "rulestructType"
    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1185:1: rulestructType returns [EObject current=null] : (otherlv_0= 'struct' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '<' ( (lv_indices_3_0= ruleindex ) ) ( rulecoma ( (lv_indices_5_0= ruleindex ) ) )* otherlv_6= '>' )? rulebegin ( (lv_parameters_8_0= rulestructElement ) )+ ruleend ) ;
    public final EObject rulestructType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_indices_3_0 = null;

        EObject lv_indices_5_0 = null;

        EObject lv_parameters_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1188:28: ( (otherlv_0= 'struct' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '<' ( (lv_indices_3_0= ruleindex ) ) ( rulecoma ( (lv_indices_5_0= ruleindex ) ) )* otherlv_6= '>' )? rulebegin ( (lv_parameters_8_0= rulestructElement ) )+ ruleend ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1189:1: (otherlv_0= 'struct' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '<' ( (lv_indices_3_0= ruleindex ) ) ( rulecoma ( (lv_indices_5_0= ruleindex ) ) )* otherlv_6= '>' )? rulebegin ( (lv_parameters_8_0= rulestructElement ) )+ ruleend )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1189:1: (otherlv_0= 'struct' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '<' ( (lv_indices_3_0= ruleindex ) ) ( rulecoma ( (lv_indices_5_0= ruleindex ) ) )* otherlv_6= '>' )? rulebegin ( (lv_parameters_8_0= rulestructElement ) )+ ruleend )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1189:3: otherlv_0= 'struct' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '<' ( (lv_indices_3_0= ruleindex ) ) ( rulecoma ( (lv_indices_5_0= ruleindex ) ) )* otherlv_6= '>' )? rulebegin ( (lv_parameters_8_0= rulestructElement ) )+ ruleend
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_rulestructType2395); 

                	newLeafNode(otherlv_0, grammarAccess.getStructTypeAccess().getStructKeyword_0());
                
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1193:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1194:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1194:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1195:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulestructType2412); 

            			newLeafNode(lv_name_1_0, grammarAccess.getStructTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStructTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1211:2: (otherlv_2= '<' ( (lv_indices_3_0= ruleindex ) ) ( rulecoma ( (lv_indices_5_0= ruleindex ) ) )* otherlv_6= '>' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==22) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1211:4: otherlv_2= '<' ( (lv_indices_3_0= ruleindex ) ) ( rulecoma ( (lv_indices_5_0= ruleindex ) ) )* otherlv_6= '>'
                    {
                    otherlv_2=(Token)match(input,22,FOLLOW_22_in_rulestructType2430); 

                        	newLeafNode(otherlv_2, grammarAccess.getStructTypeAccess().getLessThanSignKeyword_2_0());
                        
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1215:1: ( (lv_indices_3_0= ruleindex ) )
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1216:1: (lv_indices_3_0= ruleindex )
                    {
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1216:1: (lv_indices_3_0= ruleindex )
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1217:3: lv_indices_3_0= ruleindex
                    {
                     
                    	        newCompositeNode(grammarAccess.getStructTypeAccess().getIndicesIndexParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleindex_in_rulestructType2451);
                    lv_indices_3_0=ruleindex();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStructTypeRule());
                    	        }
                           		add(
                           			current, 
                           			"indices",
                            		lv_indices_3_0, 
                            		"index");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1233:2: ( rulecoma ( (lv_indices_5_0= ruleindex ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==80) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1234:5: rulecoma ( (lv_indices_5_0= ruleindex ) )
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getStructTypeAccess().getComaParserRuleCall_2_2_0()); 
                    	        
                    	    pushFollow(FOLLOW_rulecoma_in_rulestructType2468);
                    	    rulecoma();

                    	    state._fsp--;

                    	     
                    	            afterParserOrEnumRuleCall();
                    	        
                    	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1241:1: ( (lv_indices_5_0= ruleindex ) )
                    	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1242:1: (lv_indices_5_0= ruleindex )
                    	    {
                    	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1242:1: (lv_indices_5_0= ruleindex )
                    	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1243:3: lv_indices_5_0= ruleindex
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStructTypeAccess().getIndicesIndexParserRuleCall_2_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleindex_in_rulestructType2488);
                    	    lv_indices_5_0=ruleindex();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getStructTypeRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"indices",
                    	            		lv_indices_5_0, 
                    	            		"index");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,23,FOLLOW_23_in_rulestructType2502); 

                        	newLeafNode(otherlv_6, grammarAccess.getStructTypeAccess().getGreaterThanSignKeyword_2_3());
                        

                    }
                    break;

            }

             
                    newCompositeNode(grammarAccess.getStructTypeAccess().getBeginParserRuleCall_3()); 
                
            pushFollow(FOLLOW_rulebegin_in_rulestructType2520);
            rulebegin();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1271:1: ( (lv_parameters_8_0= rulestructElement ) )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1272:1: (lv_parameters_8_0= rulestructElement )
            	    {
            	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1272:1: (lv_parameters_8_0= rulestructElement )
            	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1273:3: lv_parameters_8_0= rulestructElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStructTypeAccess().getParametersStructElementParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulestructElement_in_rulestructType2540);
            	    lv_parameters_8_0=rulestructElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStructTypeRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"parameters",
            	            		lv_parameters_8_0, 
            	            		"structElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);

             
                    newCompositeNode(grammarAccess.getStructTypeAccess().getEndParserRuleCall_5()); 
                
            pushFollow(FOLLOW_ruleend_in_rulestructType2557);
            ruleend();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulestructType"


    // $ANTLR start "entryRulestructElement"
    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1305:1: entryRulestructElement returns [EObject current=null] : iv_rulestructElement= rulestructElement EOF ;
    public final EObject entryRulestructElement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestructElement = null;


        try {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1306:2: (iv_rulestructElement= rulestructElement EOF )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1307:2: iv_rulestructElement= rulestructElement EOF
            {
             newCompositeNode(grammarAccess.getStructElementRule()); 
            pushFollow(FOLLOW_rulestructElement_in_entryRulestructElement2592);
            iv_rulestructElement=rulestructElement();

            state._fsp--;

             current =iv_rulestructElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRulestructElement2602); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulestructElement"


    // $ANTLR start "rulestructElement"
    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1314:1: rulestructElement returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '<' ( (lv_indices_2_0= ruleindex ) ) ( rulecoma ( (lv_indices_4_0= ruleindex ) ) )* otherlv_5= '>' )? ( (lv_name_6_0= RULE_ID ) ) ( ( (lv_hasInitValue_7_0= '=' ) ) ( (lv_initValue_8_0= RULE_STRING ) ) )? ) ;
    public final EObject rulestructElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_5=null;
        Token lv_name_6_0=null;
        Token lv_hasInitValue_7_0=null;
        Token lv_initValue_8_0=null;
        EObject lv_indices_2_0 = null;

        EObject lv_indices_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1317:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '<' ( (lv_indices_2_0= ruleindex ) ) ( rulecoma ( (lv_indices_4_0= ruleindex ) ) )* otherlv_5= '>' )? ( (lv_name_6_0= RULE_ID ) ) ( ( (lv_hasInitValue_7_0= '=' ) ) ( (lv_initValue_8_0= RULE_STRING ) ) )? ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1318:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '<' ( (lv_indices_2_0= ruleindex ) ) ( rulecoma ( (lv_indices_4_0= ruleindex ) ) )* otherlv_5= '>' )? ( (lv_name_6_0= RULE_ID ) ) ( ( (lv_hasInitValue_7_0= '=' ) ) ( (lv_initValue_8_0= RULE_STRING ) ) )? )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1318:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '<' ( (lv_indices_2_0= ruleindex ) ) ( rulecoma ( (lv_indices_4_0= ruleindex ) ) )* otherlv_5= '>' )? ( (lv_name_6_0= RULE_ID ) ) ( ( (lv_hasInitValue_7_0= '=' ) ) ( (lv_initValue_8_0= RULE_STRING ) ) )? )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1318:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '<' ( (lv_indices_2_0= ruleindex ) ) ( rulecoma ( (lv_indices_4_0= ruleindex ) ) )* otherlv_5= '>' )? ( (lv_name_6_0= RULE_ID ) ) ( ( (lv_hasInitValue_7_0= '=' ) ) ( (lv_initValue_8_0= RULE_STRING ) ) )?
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1318:2: ( (otherlv_0= RULE_ID ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1319:1: (otherlv_0= RULE_ID )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1319:1: (otherlv_0= RULE_ID )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1320:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getStructElementRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulestructElement2647); 

            		newLeafNode(otherlv_0, grammarAccess.getStructElementAccess().getTypenameDataTypeCrossReference_0_0()); 
            	

            }


            }

            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1331:2: (otherlv_1= '<' ( (lv_indices_2_0= ruleindex ) ) ( rulecoma ( (lv_indices_4_0= ruleindex ) ) )* otherlv_5= '>' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==22) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1331:4: otherlv_1= '<' ( (lv_indices_2_0= ruleindex ) ) ( rulecoma ( (lv_indices_4_0= ruleindex ) ) )* otherlv_5= '>'
                    {
                    otherlv_1=(Token)match(input,22,FOLLOW_22_in_rulestructElement2660); 

                        	newLeafNode(otherlv_1, grammarAccess.getStructElementAccess().getLessThanSignKeyword_1_0());
                        
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1335:1: ( (lv_indices_2_0= ruleindex ) )
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1336:1: (lv_indices_2_0= ruleindex )
                    {
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1336:1: (lv_indices_2_0= ruleindex )
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1337:3: lv_indices_2_0= ruleindex
                    {
                     
                    	        newCompositeNode(grammarAccess.getStructElementAccess().getIndicesIndexParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleindex_in_rulestructElement2681);
                    lv_indices_2_0=ruleindex();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStructElementRule());
                    	        }
                           		add(
                           			current, 
                           			"indices",
                            		lv_indices_2_0, 
                            		"index");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1353:2: ( rulecoma ( (lv_indices_4_0= ruleindex ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==80) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1354:5: rulecoma ( (lv_indices_4_0= ruleindex ) )
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getStructElementAccess().getComaParserRuleCall_1_2_0()); 
                    	        
                    	    pushFollow(FOLLOW_rulecoma_in_rulestructElement2698);
                    	    rulecoma();

                    	    state._fsp--;

                    	     
                    	            afterParserOrEnumRuleCall();
                    	        
                    	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1361:1: ( (lv_indices_4_0= ruleindex ) )
                    	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1362:1: (lv_indices_4_0= ruleindex )
                    	    {
                    	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1362:1: (lv_indices_4_0= ruleindex )
                    	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1363:3: lv_indices_4_0= ruleindex
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStructElementAccess().getIndicesIndexParserRuleCall_1_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleindex_in_rulestructElement2718);
                    	    lv_indices_4_0=ruleindex();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getStructElementRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"indices",
                    	            		lv_indices_4_0, 
                    	            		"index");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,23,FOLLOW_23_in_rulestructElement2732); 

                        	newLeafNode(otherlv_5, grammarAccess.getStructElementAccess().getGreaterThanSignKeyword_1_3());
                        

                    }
                    break;

            }

            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1383:3: ( (lv_name_6_0= RULE_ID ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1384:1: (lv_name_6_0= RULE_ID )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1384:1: (lv_name_6_0= RULE_ID )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1385:3: lv_name_6_0= RULE_ID
            {
            lv_name_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulestructElement2751); 

            			newLeafNode(lv_name_6_0, grammarAccess.getStructElementAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStructElementRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_6_0, 
                    		"ID");
            	    

            }


            }

            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1401:2: ( ( (lv_hasInitValue_7_0= '=' ) ) ( (lv_initValue_8_0= RULE_STRING ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==19) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1401:3: ( (lv_hasInitValue_7_0= '=' ) ) ( (lv_initValue_8_0= RULE_STRING ) )
                    {
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1401:3: ( (lv_hasInitValue_7_0= '=' ) )
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1402:1: (lv_hasInitValue_7_0= '=' )
                    {
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1402:1: (lv_hasInitValue_7_0= '=' )
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1403:3: lv_hasInitValue_7_0= '='
                    {
                    lv_hasInitValue_7_0=(Token)match(input,19,FOLLOW_19_in_rulestructElement2775); 

                            newLeafNode(lv_hasInitValue_7_0, grammarAccess.getStructElementAccess().getHasInitValueEqualsSignKeyword_3_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStructElementRule());
                    	        }
                           		setWithLastConsumed(current, "hasInitValue", true, "=");
                    	    

                    }


                    }

                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1416:2: ( (lv_initValue_8_0= RULE_STRING ) )
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1417:1: (lv_initValue_8_0= RULE_STRING )
                    {
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1417:1: (lv_initValue_8_0= RULE_STRING )
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1418:3: lv_initValue_8_0= RULE_STRING
                    {
                    lv_initValue_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulestructElement2805); 

                    			newLeafNode(lv_initValue_8_0, grammarAccess.getStructElementAccess().getInitValueSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStructElementRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"initValue",
                            		lv_initValue_8_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulestructElement"


    // $ANTLR start "entryRuleindex"
    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1442:1: entryRuleindex returns [EObject current=null] : iv_ruleindex= ruleindex EOF ;
    public final EObject entryRuleindex() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleindex = null;


        try {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1443:2: (iv_ruleindex= ruleindex EOF )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1444:2: iv_ruleindex= ruleindex EOF
            {
             newCompositeNode(grammarAccess.getIndexRule()); 
            pushFollow(FOLLOW_ruleindex_in_entryRuleindex2848);
            iv_ruleindex=ruleindex();

            state._fsp--;

             current =iv_ruleindex; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleindex2858); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleindex"


    // $ANTLR start "ruleindex"
    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1451:1: ruleindex returns [EObject current=null] : ( ( (lv_dim_0_0= RULE_ID ) ) ( ( (lv_hasValue_1_0= '=' ) ) ( (lv_value_2_0= RULE_INT ) ) )? ) ;
    public final EObject ruleindex() throws RecognitionException {
        EObject current = null;

        Token lv_dim_0_0=null;
        Token lv_hasValue_1_0=null;
        Token lv_value_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1454:28: ( ( ( (lv_dim_0_0= RULE_ID ) ) ( ( (lv_hasValue_1_0= '=' ) ) ( (lv_value_2_0= RULE_INT ) ) )? ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1455:1: ( ( (lv_dim_0_0= RULE_ID ) ) ( ( (lv_hasValue_1_0= '=' ) ) ( (lv_value_2_0= RULE_INT ) ) )? )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1455:1: ( ( (lv_dim_0_0= RULE_ID ) ) ( ( (lv_hasValue_1_0= '=' ) ) ( (lv_value_2_0= RULE_INT ) ) )? )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1455:2: ( (lv_dim_0_0= RULE_ID ) ) ( ( (lv_hasValue_1_0= '=' ) ) ( (lv_value_2_0= RULE_INT ) ) )?
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1455:2: ( (lv_dim_0_0= RULE_ID ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1456:1: (lv_dim_0_0= RULE_ID )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1456:1: (lv_dim_0_0= RULE_ID )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1457:3: lv_dim_0_0= RULE_ID
            {
            lv_dim_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleindex2900); 

            			newLeafNode(lv_dim_0_0, grammarAccess.getIndexAccess().getDimIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIndexRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"dim",
                    		lv_dim_0_0, 
                    		"ID");
            	    

            }


            }

            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1473:2: ( ( (lv_hasValue_1_0= '=' ) ) ( (lv_value_2_0= RULE_INT ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==19) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1473:3: ( (lv_hasValue_1_0= '=' ) ) ( (lv_value_2_0= RULE_INT ) )
                    {
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1473:3: ( (lv_hasValue_1_0= '=' ) )
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1474:1: (lv_hasValue_1_0= '=' )
                    {
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1474:1: (lv_hasValue_1_0= '=' )
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1475:3: lv_hasValue_1_0= '='
                    {
                    lv_hasValue_1_0=(Token)match(input,19,FOLLOW_19_in_ruleindex2924); 

                            newLeafNode(lv_hasValue_1_0, grammarAccess.getIndexAccess().getHasValueEqualsSignKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIndexRule());
                    	        }
                           		setWithLastConsumed(current, "hasValue", true, "=");
                    	    

                    }


                    }

                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1488:2: ( (lv_value_2_0= RULE_INT ) )
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1489:1: (lv_value_2_0= RULE_INT )
                    {
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1489:1: (lv_value_2_0= RULE_INT )
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1490:3: lv_value_2_0= RULE_INT
                    {
                    lv_value_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleindex2954); 

                    			newLeafNode(lv_value_2_0, grammarAccess.getIndexAccess().getValueINTTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIndexRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_2_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleindex"


    // $ANTLR start "entryRuleunionType"
    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1514:1: entryRuleunionType returns [EObject current=null] : iv_ruleunionType= ruleunionType EOF ;
    public final EObject entryRuleunionType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleunionType = null;


        try {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1515:2: (iv_ruleunionType= ruleunionType EOF )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1516:2: iv_ruleunionType= ruleunionType EOF
            {
             newCompositeNode(grammarAccess.getUnionTypeRule()); 
            pushFollow(FOLLOW_ruleunionType_in_entryRuleunionType2997);
            iv_ruleunionType=ruleunionType();

            state._fsp--;

             current =iv_ruleunionType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleunionType3007); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleunionType"


    // $ANTLR start "ruleunionType"
    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1523:1: ruleunionType returns [EObject current=null] : (otherlv_0= 'union' ( (lv_name_1_0= RULE_ID ) ) rulebegin ( (otherlv_3= RULE_ID ) ) ( rulecoma ( (otherlv_5= RULE_ID ) ) )+ ruleend ) ;
    public final EObject ruleunionType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1526:28: ( (otherlv_0= 'union' ( (lv_name_1_0= RULE_ID ) ) rulebegin ( (otherlv_3= RULE_ID ) ) ( rulecoma ( (otherlv_5= RULE_ID ) ) )+ ruleend ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1527:1: (otherlv_0= 'union' ( (lv_name_1_0= RULE_ID ) ) rulebegin ( (otherlv_3= RULE_ID ) ) ( rulecoma ( (otherlv_5= RULE_ID ) ) )+ ruleend )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1527:1: (otherlv_0= 'union' ( (lv_name_1_0= RULE_ID ) ) rulebegin ( (otherlv_3= RULE_ID ) ) ( rulecoma ( (otherlv_5= RULE_ID ) ) )+ ruleend )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1527:3: otherlv_0= 'union' ( (lv_name_1_0= RULE_ID ) ) rulebegin ( (otherlv_3= RULE_ID ) ) ( rulecoma ( (otherlv_5= RULE_ID ) ) )+ ruleend
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleunionType3044); 

                	newLeafNode(otherlv_0, grammarAccess.getUnionTypeAccess().getUnionKeyword_0());
                
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1531:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1532:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1532:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1533:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleunionType3061); 

            			newLeafNode(lv_name_1_0, grammarAccess.getUnionTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getUnionTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

             
                    newCompositeNode(grammarAccess.getUnionTypeAccess().getBeginParserRuleCall_2()); 
                
            pushFollow(FOLLOW_rulebegin_in_ruleunionType3082);
            rulebegin();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1557:1: ( (otherlv_3= RULE_ID ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1558:1: (otherlv_3= RULE_ID )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1558:1: (otherlv_3= RULE_ID )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1559:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getUnionTypeRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleunionType3101); 

            		newLeafNode(otherlv_3, grammarAccess.getUnionTypeAccess().getElementsDataTypeCrossReference_3_0()); 
            	

            }


            }

            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1570:2: ( rulecoma ( (otherlv_5= RULE_ID ) ) )+
            int cnt25=0;
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==80) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1571:5: rulecoma ( (otherlv_5= RULE_ID ) )
            	    {
            	     
            	            newCompositeNode(grammarAccess.getUnionTypeAccess().getComaParserRuleCall_4_0()); 
            	        
            	    pushFollow(FOLLOW_rulecoma_in_ruleunionType3118);
            	    rulecoma();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        
            	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1578:1: ( (otherlv_5= RULE_ID ) )
            	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1579:1: (otherlv_5= RULE_ID )
            	    {
            	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1579:1: (otherlv_5= RULE_ID )
            	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1580:3: otherlv_5= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getUnionTypeRule());
            	    	        }
            	            
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleunionType3137); 

            	    		newLeafNode(otherlv_5, grammarAccess.getUnionTypeAccess().getElementsDataTypeCrossReference_4_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt25 >= 1 ) break loop25;
                        EarlyExitException eee =
                            new EarlyExitException(25, input);
                        throw eee;
                }
                cnt25++;
            } while (true);

             
                    newCompositeNode(grammarAccess.getUnionTypeAccess().getEndParserRuleCall_5()); 
                
            pushFollow(FOLLOW_ruleend_in_ruleunionType3155);
            ruleend();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleunionType"


    // $ANTLR start "entryRulefunctionDeclaration"
    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1609:1: entryRulefunctionDeclaration returns [EObject current=null] : iv_rulefunctionDeclaration= rulefunctionDeclaration EOF ;
    public final EObject entryRulefunctionDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefunctionDeclaration = null;


        try {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1610:2: (iv_rulefunctionDeclaration= rulefunctionDeclaration EOF )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1611:2: iv_rulefunctionDeclaration= rulefunctionDeclaration EOF
            {
             newCompositeNode(grammarAccess.getFunctionDeclarationRule()); 
            pushFollow(FOLLOW_rulefunctionDeclaration_in_entryRulefunctionDeclaration3192);
            iv_rulefunctionDeclaration=rulefunctionDeclaration();

            state._fsp--;

             current =iv_rulefunctionDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRulefunctionDeclaration3202); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulefunctionDeclaration"


    // $ANTLR start "rulefunctionDeclaration"
    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1618:1: rulefunctionDeclaration returns [EObject current=null] : (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '<' ( (otherlv_3= RULE_ID ) ) otherlv_4= '>' ruleopenPar ( (lv_args_6_0= ruleargumentsDeclaration ) )? ruleclosePar ) ;
    public final EObject rulefunctionDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_args_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1621:28: ( (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '<' ( (otherlv_3= RULE_ID ) ) otherlv_4= '>' ruleopenPar ( (lv_args_6_0= ruleargumentsDeclaration ) )? ruleclosePar ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1622:1: (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '<' ( (otherlv_3= RULE_ID ) ) otherlv_4= '>' ruleopenPar ( (lv_args_6_0= ruleargumentsDeclaration ) )? ruleclosePar )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1622:1: (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '<' ( (otherlv_3= RULE_ID ) ) otherlv_4= '>' ruleopenPar ( (lv_args_6_0= ruleargumentsDeclaration ) )? ruleclosePar )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1622:3: otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '<' ( (otherlv_3= RULE_ID ) ) otherlv_4= '>' ruleopenPar ( (lv_args_6_0= ruleargumentsDeclaration ) )? ruleclosePar
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_rulefunctionDeclaration3239); 

                	newLeafNode(otherlv_0, grammarAccess.getFunctionDeclarationAccess().getFunctionKeyword_0());
                
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1626:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1627:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1627:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1628:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulefunctionDeclaration3256); 

            			newLeafNode(lv_name_1_0, grammarAccess.getFunctionDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFunctionDeclarationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_22_in_rulefunctionDeclaration3273); 

                	newLeafNode(otherlv_2, grammarAccess.getFunctionDeclarationAccess().getLessThanSignKeyword_2());
                
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1648:1: ( (otherlv_3= RULE_ID ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1649:1: (otherlv_3= RULE_ID )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1649:1: (otherlv_3= RULE_ID )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1650:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getFunctionDeclarationRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulefunctionDeclaration3293); 

            		newLeafNode(otherlv_3, grammarAccess.getFunctionDeclarationAccess().getLangLanguageDeclarationCrossReference_3_0()); 
            	

            }


            }

            otherlv_4=(Token)match(input,23,FOLLOW_23_in_rulefunctionDeclaration3305); 

                	newLeafNode(otherlv_4, grammarAccess.getFunctionDeclarationAccess().getGreaterThanSignKeyword_4());
                
             
                    newCompositeNode(grammarAccess.getFunctionDeclarationAccess().getOpenParParserRuleCall_5()); 
                
            pushFollow(FOLLOW_ruleopenPar_in_rulefunctionDeclaration3321);
            ruleopenPar();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1673:1: ( (lv_args_6_0= ruleargumentsDeclaration ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=31 && LA26_0<=33)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1674:1: (lv_args_6_0= ruleargumentsDeclaration )
                    {
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1674:1: (lv_args_6_0= ruleargumentsDeclaration )
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1675:3: lv_args_6_0= ruleargumentsDeclaration
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunctionDeclarationAccess().getArgsArgumentsDeclarationParserRuleCall_6_0()); 
                    	    
                    pushFollow(FOLLOW_ruleargumentsDeclaration_in_rulefunctionDeclaration3341);
                    lv_args_6_0=ruleargumentsDeclaration();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFunctionDeclarationRule());
                    	        }
                           		set(
                           			current, 
                           			"args",
                            		lv_args_6_0, 
                            		"argumentsDeclaration");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

             
                    newCompositeNode(grammarAccess.getFunctionDeclarationAccess().getCloseParParserRuleCall_7()); 
                
            pushFollow(FOLLOW_ruleclosePar_in_rulefunctionDeclaration3358);
            ruleclosePar();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulefunctionDeclaration"


    // $ANTLR start "entryRuleargumentsDeclaration"
    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1707:1: entryRuleargumentsDeclaration returns [EObject current=null] : iv_ruleargumentsDeclaration= ruleargumentsDeclaration EOF ;
    public final EObject entryRuleargumentsDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleargumentsDeclaration = null;


        try {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1708:2: (iv_ruleargumentsDeclaration= ruleargumentsDeclaration EOF )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1709:2: iv_ruleargumentsDeclaration= ruleargumentsDeclaration EOF
            {
             newCompositeNode(grammarAccess.getArgumentsDeclarationRule()); 
            pushFollow(FOLLOW_ruleargumentsDeclaration_in_entryRuleargumentsDeclaration3393);
            iv_ruleargumentsDeclaration=ruleargumentsDeclaration();

            state._fsp--;

             current =iv_ruleargumentsDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleargumentsDeclaration3403); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleargumentsDeclaration"


    // $ANTLR start "ruleargumentsDeclaration"
    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1716:1: ruleargumentsDeclaration returns [EObject current=null] : ( ( (lv_arguments_0_0= rulearg ) ) ( (lv_arguments_1_0= rulearg ) )* ) ;
    public final EObject ruleargumentsDeclaration() throws RecognitionException {
        EObject current = null;

        EObject lv_arguments_0_0 = null;

        EObject lv_arguments_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1719:28: ( ( ( (lv_arguments_0_0= rulearg ) ) ( (lv_arguments_1_0= rulearg ) )* ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1720:1: ( ( (lv_arguments_0_0= rulearg ) ) ( (lv_arguments_1_0= rulearg ) )* )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1720:1: ( ( (lv_arguments_0_0= rulearg ) ) ( (lv_arguments_1_0= rulearg ) )* )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1720:2: ( (lv_arguments_0_0= rulearg ) ) ( (lv_arguments_1_0= rulearg ) )*
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1720:2: ( (lv_arguments_0_0= rulearg ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1721:1: (lv_arguments_0_0= rulearg )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1721:1: (lv_arguments_0_0= rulearg )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1722:3: lv_arguments_0_0= rulearg
            {
             
            	        newCompositeNode(grammarAccess.getArgumentsDeclarationAccess().getArgumentsArgParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulearg_in_ruleargumentsDeclaration3449);
            lv_arguments_0_0=rulearg();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getArgumentsDeclarationRule());
            	        }
                   		add(
                   			current, 
                   			"arguments",
                    		lv_arguments_0_0, 
                    		"arg");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1738:2: ( (lv_arguments_1_0= rulearg ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=31 && LA27_0<=33)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1739:1: (lv_arguments_1_0= rulearg )
            	    {
            	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1739:1: (lv_arguments_1_0= rulearg )
            	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1740:3: lv_arguments_1_0= rulearg
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getArgumentsDeclarationAccess().getArgumentsArgParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulearg_in_ruleargumentsDeclaration3470);
            	    lv_arguments_1_0=rulearg();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getArgumentsDeclarationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"arguments",
            	            		lv_arguments_1_0, 
            	            		"arg");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleargumentsDeclaration"


    // $ANTLR start "entryRulearg"
    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1764:1: entryRulearg returns [EObject current=null] : iv_rulearg= rulearg EOF ;
    public final EObject entryRulearg() throws RecognitionException {
        EObject current = null;

        EObject iv_rulearg = null;


        try {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1765:2: (iv_rulearg= rulearg EOF )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1766:2: iv_rulearg= rulearg EOF
            {
             newCompositeNode(grammarAccess.getArgRule()); 
            pushFollow(FOLLOW_rulearg_in_entryRulearg3507);
            iv_rulearg=rulearg();

            state._fsp--;

             current =iv_rulearg; 
            match(input,EOF,FOLLOW_EOF_in_entryRulearg3517); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulearg"


    // $ANTLR start "rulearg"
    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1773:1: rulearg returns [EObject current=null] : ( ( ( (lv_modifier_0_1= 'inout' | lv_modifier_0_2= 'in' | lv_modifier_0_3= 'out' ) ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) )? ) ;
    public final EObject rulearg() throws RecognitionException {
        EObject current = null;

        Token lv_modifier_0_1=null;
        Token lv_modifier_0_2=null;
        Token lv_modifier_0_3=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1776:28: ( ( ( ( (lv_modifier_0_1= 'inout' | lv_modifier_0_2= 'in' | lv_modifier_0_3= 'out' ) ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) )? ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1777:1: ( ( ( (lv_modifier_0_1= 'inout' | lv_modifier_0_2= 'in' | lv_modifier_0_3= 'out' ) ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) )? )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1777:1: ( ( ( (lv_modifier_0_1= 'inout' | lv_modifier_0_2= 'in' | lv_modifier_0_3= 'out' ) ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) )? )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1777:2: ( ( (lv_modifier_0_1= 'inout' | lv_modifier_0_2= 'in' | lv_modifier_0_3= 'out' ) ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) )?
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1777:2: ( ( (lv_modifier_0_1= 'inout' | lv_modifier_0_2= 'in' | lv_modifier_0_3= 'out' ) ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1778:1: ( (lv_modifier_0_1= 'inout' | lv_modifier_0_2= 'in' | lv_modifier_0_3= 'out' ) )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1778:1: ( (lv_modifier_0_1= 'inout' | lv_modifier_0_2= 'in' | lv_modifier_0_3= 'out' ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1779:1: (lv_modifier_0_1= 'inout' | lv_modifier_0_2= 'in' | lv_modifier_0_3= 'out' )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1779:1: (lv_modifier_0_1= 'inout' | lv_modifier_0_2= 'in' | lv_modifier_0_3= 'out' )
            int alt28=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt28=1;
                }
                break;
            case 32:
                {
                alt28=2;
                }
                break;
            case 33:
                {
                alt28=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1780:3: lv_modifier_0_1= 'inout'
                    {
                    lv_modifier_0_1=(Token)match(input,31,FOLLOW_31_in_rulearg3562); 

                            newLeafNode(lv_modifier_0_1, grammarAccess.getArgAccess().getModifierInoutKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getArgRule());
                    	        }
                           		setWithLastConsumed(current, "modifier", lv_modifier_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1792:8: lv_modifier_0_2= 'in'
                    {
                    lv_modifier_0_2=(Token)match(input,32,FOLLOW_32_in_rulearg3591); 

                            newLeafNode(lv_modifier_0_2, grammarAccess.getArgAccess().getModifierInKeyword_0_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getArgRule());
                    	        }
                           		setWithLastConsumed(current, "modifier", lv_modifier_0_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1804:8: lv_modifier_0_3= 'out'
                    {
                    lv_modifier_0_3=(Token)match(input,33,FOLLOW_33_in_rulearg3620); 

                            newLeafNode(lv_modifier_0_3, grammarAccess.getArgAccess().getModifierOutKeyword_0_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getArgRule());
                    	        }
                           		setWithLastConsumed(current, "modifier", lv_modifier_0_3, null);
                    	    

                    }
                    break;

            }


            }


            }

            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1819:2: ( (otherlv_1= RULE_ID ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1820:1: (otherlv_1= RULE_ID )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1820:1: (otherlv_1= RULE_ID )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1821:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getArgRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulearg3656); 

            		newLeafNode(otherlv_1, grammarAccess.getArgAccess().getTypeDataTypeCrossReference_1_0()); 
            	

            }


            }

            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1832:2: ( (lv_name_2_0= RULE_ID ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_ID) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1833:1: (lv_name_2_0= RULE_ID )
                    {
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1833:1: (lv_name_2_0= RULE_ID )
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1834:3: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulearg3673); 

                    			newLeafNode(lv_name_2_0, grammarAccess.getArgAccess().getNameIDTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getArgRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_2_0, 
                            		"ID");
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulearg"


    // $ANTLR start "entryRuleProcessingDeclaration"
    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1858:1: entryRuleProcessingDeclaration returns [EObject current=null] : iv_ruleProcessingDeclaration= ruleProcessingDeclaration EOF ;
    public final EObject entryRuleProcessingDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessingDeclaration = null;


        try {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1859:2: (iv_ruleProcessingDeclaration= ruleProcessingDeclaration EOF )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1860:2: iv_ruleProcessingDeclaration= ruleProcessingDeclaration EOF
            {
             newCompositeNode(grammarAccess.getProcessingDeclarationRule()); 
            pushFollow(FOLLOW_ruleProcessingDeclaration_in_entryRuleProcessingDeclaration3715);
            iv_ruleProcessingDeclaration=ruleProcessingDeclaration();

            state._fsp--;

             current =iv_ruleProcessingDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcessingDeclaration3725); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProcessingDeclaration"


    // $ANTLR start "ruleProcessingDeclaration"
    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1867:1: ruleProcessingDeclaration returns [EObject current=null] : (otherlv_0= 'processing' ( (lv_name_1_0= RULE_ID ) ) ruleopenPar ( (lv_args_3_0= ruleargumentsDeclaration ) )? ruleclosePar rulebegin ( (lv_localParameters_6_0= rulelocalParameterDeclaration ) )* ( (lv_localEvents_7_0= rulelocalEventDeclaration ) )* ( (lv_statements_8_0= rulestatement ) )* ruleend ) ;
    public final EObject ruleProcessingDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_args_3_0 = null;

        EObject lv_localParameters_6_0 = null;

        EObject lv_localEvents_7_0 = null;

        EObject lv_statements_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1870:28: ( (otherlv_0= 'processing' ( (lv_name_1_0= RULE_ID ) ) ruleopenPar ( (lv_args_3_0= ruleargumentsDeclaration ) )? ruleclosePar rulebegin ( (lv_localParameters_6_0= rulelocalParameterDeclaration ) )* ( (lv_localEvents_7_0= rulelocalEventDeclaration ) )* ( (lv_statements_8_0= rulestatement ) )* ruleend ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1871:1: (otherlv_0= 'processing' ( (lv_name_1_0= RULE_ID ) ) ruleopenPar ( (lv_args_3_0= ruleargumentsDeclaration ) )? ruleclosePar rulebegin ( (lv_localParameters_6_0= rulelocalParameterDeclaration ) )* ( (lv_localEvents_7_0= rulelocalEventDeclaration ) )* ( (lv_statements_8_0= rulestatement ) )* ruleend )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1871:1: (otherlv_0= 'processing' ( (lv_name_1_0= RULE_ID ) ) ruleopenPar ( (lv_args_3_0= ruleargumentsDeclaration ) )? ruleclosePar rulebegin ( (lv_localParameters_6_0= rulelocalParameterDeclaration ) )* ( (lv_localEvents_7_0= rulelocalEventDeclaration ) )* ( (lv_statements_8_0= rulestatement ) )* ruleend )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1871:3: otherlv_0= 'processing' ( (lv_name_1_0= RULE_ID ) ) ruleopenPar ( (lv_args_3_0= ruleargumentsDeclaration ) )? ruleclosePar rulebegin ( (lv_localParameters_6_0= rulelocalParameterDeclaration ) )* ( (lv_localEvents_7_0= rulelocalEventDeclaration ) )* ( (lv_statements_8_0= rulestatement ) )* ruleend
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleProcessingDeclaration3762); 

                	newLeafNode(otherlv_0, grammarAccess.getProcessingDeclarationAccess().getProcessingKeyword_0());
                
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1875:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1876:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1876:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1877:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProcessingDeclaration3779); 

            			newLeafNode(lv_name_1_0, grammarAccess.getProcessingDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getProcessingDeclarationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

             
                    newCompositeNode(grammarAccess.getProcessingDeclarationAccess().getOpenParParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleopenPar_in_ruleProcessingDeclaration3800);
            ruleopenPar();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1901:1: ( (lv_args_3_0= ruleargumentsDeclaration ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=31 && LA30_0<=33)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1902:1: (lv_args_3_0= ruleargumentsDeclaration )
                    {
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1902:1: (lv_args_3_0= ruleargumentsDeclaration )
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1903:3: lv_args_3_0= ruleargumentsDeclaration
                    {
                     
                    	        newCompositeNode(grammarAccess.getProcessingDeclarationAccess().getArgsArgumentsDeclarationParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleargumentsDeclaration_in_ruleProcessingDeclaration3820);
                    lv_args_3_0=ruleargumentsDeclaration();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getProcessingDeclarationRule());
                    	        }
                           		set(
                           			current, 
                           			"args",
                            		lv_args_3_0, 
                            		"argumentsDeclaration");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

             
                    newCompositeNode(grammarAccess.getProcessingDeclarationAccess().getCloseParParserRuleCall_4()); 
                
            pushFollow(FOLLOW_ruleclosePar_in_ruleProcessingDeclaration3837);
            ruleclosePar();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
             
                    newCompositeNode(grammarAccess.getProcessingDeclarationAccess().getBeginParserRuleCall_5()); 
                
            pushFollow(FOLLOW_rulebegin_in_ruleProcessingDeclaration3852);
            rulebegin();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1935:1: ( (lv_localParameters_6_0= rulelocalParameterDeclaration ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==35) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1936:1: (lv_localParameters_6_0= rulelocalParameterDeclaration )
            	    {
            	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1936:1: (lv_localParameters_6_0= rulelocalParameterDeclaration )
            	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1937:3: lv_localParameters_6_0= rulelocalParameterDeclaration
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProcessingDeclarationAccess().getLocalParametersLocalParameterDeclarationParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulelocalParameterDeclaration_in_ruleProcessingDeclaration3872);
            	    lv_localParameters_6_0=rulelocalParameterDeclaration();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProcessingDeclarationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"localParameters",
            	            		lv_localParameters_6_0, 
            	            		"localParameterDeclaration");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1953:3: ( (lv_localEvents_7_0= rulelocalEventDeclaration ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==44) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1954:1: (lv_localEvents_7_0= rulelocalEventDeclaration )
            	    {
            	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1954:1: (lv_localEvents_7_0= rulelocalEventDeclaration )
            	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1955:3: lv_localEvents_7_0= rulelocalEventDeclaration
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProcessingDeclarationAccess().getLocalEventsLocalEventDeclarationParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulelocalEventDeclaration_in_ruleProcessingDeclaration3894);
            	    lv_localEvents_7_0=rulelocalEventDeclaration();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProcessingDeclarationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"localEvents",
            	            		lv_localEvents_7_0, 
            	            		"localEventDeclaration");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1971:3: ( (lv_statements_8_0= rulestatement ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==36||LA33_0==39||LA33_0==41) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1972:1: (lv_statements_8_0= rulestatement )
            	    {
            	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1972:1: (lv_statements_8_0= rulestatement )
            	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:1973:3: lv_statements_8_0= rulestatement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProcessingDeclarationAccess().getStatementsStatementParserRuleCall_8_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulestatement_in_ruleProcessingDeclaration3916);
            	    lv_statements_8_0=rulestatement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProcessingDeclarationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"statements",
            	            		lv_statements_8_0, 
            	            		"statement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             
                    newCompositeNode(grammarAccess.getProcessingDeclarationAccess().getEndParserRuleCall_9()); 
                
            pushFollow(FOLLOW_ruleend_in_ruleProcessingDeclaration3933);
            ruleend();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProcessingDeclaration"


    // $ANTLR start "entryRulestatement"
    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2005:1: entryRulestatement returns [EObject current=null] : iv_rulestatement= rulestatement EOF ;
    public final EObject entryRulestatement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestatement = null;


        try {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2006:2: (iv_rulestatement= rulestatement EOF )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2007:2: iv_rulestatement= rulestatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_rulestatement_in_entryRulestatement3968);
            iv_rulestatement=rulestatement();

            state._fsp--;

             current =iv_rulestatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRulestatement3978); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulestatement"


    // $ANTLR start "rulestatement"
    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2014:1: rulestatement returns [EObject current=null] : ( ( (lv_call_0_1= rulefunctionCall | lv_call_0_2= rulewhileblock | lv_call_0_3= ruleifblock ) ) ) ;
    public final EObject rulestatement() throws RecognitionException {
        EObject current = null;

        EObject lv_call_0_1 = null;

        EObject lv_call_0_2 = null;

        EObject lv_call_0_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2017:28: ( ( ( (lv_call_0_1= rulefunctionCall | lv_call_0_2= rulewhileblock | lv_call_0_3= ruleifblock ) ) ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2018:1: ( ( (lv_call_0_1= rulefunctionCall | lv_call_0_2= rulewhileblock | lv_call_0_3= ruleifblock ) ) )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2018:1: ( ( (lv_call_0_1= rulefunctionCall | lv_call_0_2= rulewhileblock | lv_call_0_3= ruleifblock ) ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2019:1: ( (lv_call_0_1= rulefunctionCall | lv_call_0_2= rulewhileblock | lv_call_0_3= ruleifblock ) )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2019:1: ( (lv_call_0_1= rulefunctionCall | lv_call_0_2= rulewhileblock | lv_call_0_3= ruleifblock ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2020:1: (lv_call_0_1= rulefunctionCall | lv_call_0_2= rulewhileblock | lv_call_0_3= ruleifblock )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2020:1: (lv_call_0_1= rulefunctionCall | lv_call_0_2= rulewhileblock | lv_call_0_3= ruleifblock )
            int alt34=3;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt34=1;
                }
                break;
            case 39:
                {
                alt34=2;
                }
                break;
            case 36:
                {
                alt34=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2021:3: lv_call_0_1= rulefunctionCall
                    {
                     
                    	        newCompositeNode(grammarAccess.getStatementAccess().getCallFunctionCallParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulefunctionCall_in_rulestatement4025);
                    lv_call_0_1=rulefunctionCall();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStatementRule());
                    	        }
                           		set(
                           			current, 
                           			"call",
                            		lv_call_0_1, 
                            		"functionCall");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 2 :
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2036:8: lv_call_0_2= rulewhileblock
                    {
                     
                    	        newCompositeNode(grammarAccess.getStatementAccess().getCallWhileblockParserRuleCall_0_1()); 
                    	    
                    pushFollow(FOLLOW_rulewhileblock_in_rulestatement4044);
                    lv_call_0_2=rulewhileblock();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStatementRule());
                    	        }
                           		set(
                           			current, 
                           			"call",
                            		lv_call_0_2, 
                            		"whileblock");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 3 :
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2051:8: lv_call_0_3= ruleifblock
                    {
                     
                    	        newCompositeNode(grammarAccess.getStatementAccess().getCallIfblockParserRuleCall_0_2()); 
                    	    
                    pushFollow(FOLLOW_ruleifblock_in_rulestatement4063);
                    lv_call_0_3=ruleifblock();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStatementRule());
                    	        }
                           		set(
                           			current, 
                           			"call",
                            		lv_call_0_3, 
                            		"ifblock");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulestatement"


    // $ANTLR start "entryRulelocalParameterDeclaration"
    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2077:1: entryRulelocalParameterDeclaration returns [EObject current=null] : iv_rulelocalParameterDeclaration= rulelocalParameterDeclaration EOF ;
    public final EObject entryRulelocalParameterDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelocalParameterDeclaration = null;


        try {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2078:2: (iv_rulelocalParameterDeclaration= rulelocalParameterDeclaration EOF )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2079:2: iv_rulelocalParameterDeclaration= rulelocalParameterDeclaration EOF
            {
             newCompositeNode(grammarAccess.getLocalParameterDeclarationRule()); 
            pushFollow(FOLLOW_rulelocalParameterDeclaration_in_entryRulelocalParameterDeclaration4101);
            iv_rulelocalParameterDeclaration=rulelocalParameterDeclaration();

            state._fsp--;

             current =iv_rulelocalParameterDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRulelocalParameterDeclaration4111); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulelocalParameterDeclaration"


    // $ANTLR start "rulelocalParameterDeclaration"
    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2086:1: rulelocalParameterDeclaration returns [EObject current=null] : (otherlv_0= 'parameter' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_hasValue_3_0= '=' ) ) ( (lv_value_4_0= RULE_STRING ) ) )? ) ;
    public final EObject rulelocalParameterDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token lv_hasValue_3_0=null;
        Token lv_value_4_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2089:28: ( (otherlv_0= 'parameter' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_hasValue_3_0= '=' ) ) ( (lv_value_4_0= RULE_STRING ) ) )? ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2090:1: (otherlv_0= 'parameter' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_hasValue_3_0= '=' ) ) ( (lv_value_4_0= RULE_STRING ) ) )? )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2090:1: (otherlv_0= 'parameter' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_hasValue_3_0= '=' ) ) ( (lv_value_4_0= RULE_STRING ) ) )? )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2090:3: otherlv_0= 'parameter' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_hasValue_3_0= '=' ) ) ( (lv_value_4_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_rulelocalParameterDeclaration4148); 

                	newLeafNode(otherlv_0, grammarAccess.getLocalParameterDeclarationAccess().getParameterKeyword_0());
                
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2094:1: ( (otherlv_1= RULE_ID ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2095:1: (otherlv_1= RULE_ID )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2095:1: (otherlv_1= RULE_ID )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2096:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getLocalParameterDeclarationRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulelocalParameterDeclaration4168); 

            		newLeafNode(otherlv_1, grammarAccess.getLocalParameterDeclarationAccess().getTypeDataTypeCrossReference_1_0()); 
            	

            }


            }

            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2107:2: ( (lv_name_2_0= RULE_ID ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2108:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2108:1: (lv_name_2_0= RULE_ID )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2109:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulelocalParameterDeclaration4185); 

            			newLeafNode(lv_name_2_0, grammarAccess.getLocalParameterDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLocalParameterDeclarationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2125:2: ( ( (lv_hasValue_3_0= '=' ) ) ( (lv_value_4_0= RULE_STRING ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==19) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2125:3: ( (lv_hasValue_3_0= '=' ) ) ( (lv_value_4_0= RULE_STRING ) )
                    {
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2125:3: ( (lv_hasValue_3_0= '=' ) )
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2126:1: (lv_hasValue_3_0= '=' )
                    {
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2126:1: (lv_hasValue_3_0= '=' )
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2127:3: lv_hasValue_3_0= '='
                    {
                    lv_hasValue_3_0=(Token)match(input,19,FOLLOW_19_in_rulelocalParameterDeclaration4209); 

                            newLeafNode(lv_hasValue_3_0, grammarAccess.getLocalParameterDeclarationAccess().getHasValueEqualsSignKeyword_3_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLocalParameterDeclarationRule());
                    	        }
                           		setWithLastConsumed(current, "hasValue", true, "=");
                    	    

                    }


                    }

                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2140:2: ( (lv_value_4_0= RULE_STRING ) )
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2141:1: (lv_value_4_0= RULE_STRING )
                    {
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2141:1: (lv_value_4_0= RULE_STRING )
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2142:3: lv_value_4_0= RULE_STRING
                    {
                    lv_value_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulelocalParameterDeclaration4239); 

                    			newLeafNode(lv_value_4_0, grammarAccess.getLocalParameterDeclarationAccess().getValueSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLocalParameterDeclarationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_4_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulelocalParameterDeclaration"


    // $ANTLR start "entryRulelocalEventDeclaration"
    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2166:1: entryRulelocalEventDeclaration returns [EObject current=null] : iv_rulelocalEventDeclaration= rulelocalEventDeclaration EOF ;
    public final EObject entryRulelocalEventDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelocalEventDeclaration = null;


        try {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2167:2: (iv_rulelocalEventDeclaration= rulelocalEventDeclaration EOF )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2168:2: iv_rulelocalEventDeclaration= rulelocalEventDeclaration EOF
            {
             newCompositeNode(grammarAccess.getLocalEventDeclarationRule()); 
            pushFollow(FOLLOW_rulelocalEventDeclaration_in_entryRulelocalEventDeclaration4282);
            iv_rulelocalEventDeclaration=rulelocalEventDeclaration();

            state._fsp--;

             current =iv_rulelocalEventDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRulelocalEventDeclaration4292); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulelocalEventDeclaration"


    // $ANTLR start "rulelocalEventDeclaration"
    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2175:1: rulelocalEventDeclaration returns [EObject current=null] : this_eventDeclaration_0= ruleeventDeclaration ;
    public final EObject rulelocalEventDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_eventDeclaration_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2178:28: (this_eventDeclaration_0= ruleeventDeclaration )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2180:5: this_eventDeclaration_0= ruleeventDeclaration
            {
             
                    newCompositeNode(grammarAccess.getLocalEventDeclarationAccess().getEventDeclarationParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleeventDeclaration_in_rulelocalEventDeclaration4338);
            this_eventDeclaration_0=ruleeventDeclaration();

            state._fsp--;

             
                    current = this_eventDeclaration_0; 
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulelocalEventDeclaration"


    // $ANTLR start "entryRuleifblock"
    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2196:1: entryRuleifblock returns [EObject current=null] : iv_ruleifblock= ruleifblock EOF ;
    public final EObject entryRuleifblock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleifblock = null;


        try {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2197:2: (iv_ruleifblock= ruleifblock EOF )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2198:2: iv_ruleifblock= ruleifblock EOF
            {
             newCompositeNode(grammarAccess.getIfblockRule()); 
            pushFollow(FOLLOW_ruleifblock_in_entryRuleifblock4372);
            iv_ruleifblock=ruleifblock();

            state._fsp--;

             current =iv_ruleifblock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleifblock4382); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleifblock"


    // $ANTLR start "ruleifblock"
    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2205:1: ruleifblock returns [EObject current=null] : (otherlv_0= 'if' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'then' rulebegin ( (lv_ifBlocks_4_0= rulestatement ) )+ ruleend ( ( (lv_hasElse_6_0= 'else' ) ) rulebegin ( (lv_elseBlocks_8_0= rulestatement ) )+ ruleend )? ) ;
    public final EObject ruleifblock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_hasElse_6_0=null;
        EObject lv_ifBlocks_4_0 = null;

        EObject lv_elseBlocks_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2208:28: ( (otherlv_0= 'if' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'then' rulebegin ( (lv_ifBlocks_4_0= rulestatement ) )+ ruleend ( ( (lv_hasElse_6_0= 'else' ) ) rulebegin ( (lv_elseBlocks_8_0= rulestatement ) )+ ruleend )? ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2209:1: (otherlv_0= 'if' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'then' rulebegin ( (lv_ifBlocks_4_0= rulestatement ) )+ ruleend ( ( (lv_hasElse_6_0= 'else' ) ) rulebegin ( (lv_elseBlocks_8_0= rulestatement ) )+ ruleend )? )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2209:1: (otherlv_0= 'if' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'then' rulebegin ( (lv_ifBlocks_4_0= rulestatement ) )+ ruleend ( ( (lv_hasElse_6_0= 'else' ) ) rulebegin ( (lv_elseBlocks_8_0= rulestatement ) )+ ruleend )? )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2209:3: otherlv_0= 'if' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'then' rulebegin ( (lv_ifBlocks_4_0= rulestatement ) )+ ruleend ( ( (lv_hasElse_6_0= 'else' ) ) rulebegin ( (lv_elseBlocks_8_0= rulestatement ) )+ ruleend )?
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleifblock4419); 

                	newLeafNode(otherlv_0, grammarAccess.getIfblockAccess().getIfKeyword_0());
                
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2213:1: ( (otherlv_1= RULE_ID ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2214:1: (otherlv_1= RULE_ID )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2214:1: (otherlv_1= RULE_ID )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2215:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getIfblockRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleifblock4439); 

            		newLeafNode(otherlv_1, grammarAccess.getIfblockAccess().getEventNameLocalEventDeclarationCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,37,FOLLOW_37_in_ruleifblock4451); 

                	newLeafNode(otherlv_2, grammarAccess.getIfblockAccess().getThenKeyword_2());
                
             
                    newCompositeNode(grammarAccess.getIfblockAccess().getBeginParserRuleCall_3()); 
                
            pushFollow(FOLLOW_rulebegin_in_ruleifblock4467);
            rulebegin();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2238:1: ( (lv_ifBlocks_4_0= rulestatement ) )+
            int cnt36=0;
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==36||LA36_0==39||LA36_0==41) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2239:1: (lv_ifBlocks_4_0= rulestatement )
            	    {
            	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2239:1: (lv_ifBlocks_4_0= rulestatement )
            	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2240:3: lv_ifBlocks_4_0= rulestatement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getIfblockAccess().getIfBlocksStatementParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulestatement_in_ruleifblock4487);
            	    lv_ifBlocks_4_0=rulestatement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getIfblockRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"ifBlocks",
            	            		lv_ifBlocks_4_0, 
            	            		"statement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt36 >= 1 ) break loop36;
                        EarlyExitException eee =
                            new EarlyExitException(36, input);
                        throw eee;
                }
                cnt36++;
            } while (true);

             
                    newCompositeNode(grammarAccess.getIfblockAccess().getEndParserRuleCall_5()); 
                
            pushFollow(FOLLOW_ruleend_in_ruleifblock4504);
            ruleend();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2264:1: ( ( (lv_hasElse_6_0= 'else' ) ) rulebegin ( (lv_elseBlocks_8_0= rulestatement ) )+ ruleend )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==38) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2264:2: ( (lv_hasElse_6_0= 'else' ) ) rulebegin ( (lv_elseBlocks_8_0= rulestatement ) )+ ruleend
                    {
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2264:2: ( (lv_hasElse_6_0= 'else' ) )
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2265:1: (lv_hasElse_6_0= 'else' )
                    {
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2265:1: (lv_hasElse_6_0= 'else' )
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2266:3: lv_hasElse_6_0= 'else'
                    {
                    lv_hasElse_6_0=(Token)match(input,38,FOLLOW_38_in_ruleifblock4522); 

                            newLeafNode(lv_hasElse_6_0, grammarAccess.getIfblockAccess().getHasElseElseKeyword_6_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIfblockRule());
                    	        }
                           		setWithLastConsumed(current, "hasElse", true, "else");
                    	    

                    }


                    }

                     
                            newCompositeNode(grammarAccess.getIfblockAccess().getBeginParserRuleCall_6_1()); 
                        
                    pushFollow(FOLLOW_rulebegin_in_ruleifblock4551);
                    rulebegin();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2287:1: ( (lv_elseBlocks_8_0= rulestatement ) )+
                    int cnt37=0;
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==36||LA37_0==39||LA37_0==41) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2288:1: (lv_elseBlocks_8_0= rulestatement )
                    	    {
                    	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2288:1: (lv_elseBlocks_8_0= rulestatement )
                    	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2289:3: lv_elseBlocks_8_0= rulestatement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getIfblockAccess().getElseBlocksStatementParserRuleCall_6_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_rulestatement_in_ruleifblock4571);
                    	    lv_elseBlocks_8_0=rulestatement();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getIfblockRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"elseBlocks",
                    	            		lv_elseBlocks_8_0, 
                    	            		"statement");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt37 >= 1 ) break loop37;
                                EarlyExitException eee =
                                    new EarlyExitException(37, input);
                                throw eee;
                        }
                        cnt37++;
                    } while (true);

                     
                            newCompositeNode(grammarAccess.getIfblockAccess().getEndParserRuleCall_6_3()); 
                        
                    pushFollow(FOLLOW_ruleend_in_ruleifblock4588);
                    ruleend();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleifblock"


    // $ANTLR start "entryRulewhileblock"
    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2321:1: entryRulewhileblock returns [EObject current=null] : iv_rulewhileblock= rulewhileblock EOF ;
    public final EObject entryRulewhileblock() throws RecognitionException {
        EObject current = null;

        EObject iv_rulewhileblock = null;


        try {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2322:2: (iv_rulewhileblock= rulewhileblock EOF )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2323:2: iv_rulewhileblock= rulewhileblock EOF
            {
             newCompositeNode(grammarAccess.getWhileblockRule()); 
            pushFollow(FOLLOW_rulewhileblock_in_entryRulewhileblock4625);
            iv_rulewhileblock=rulewhileblock();

            state._fsp--;

             current =iv_rulewhileblock; 
            match(input,EOF,FOLLOW_EOF_in_entryRulewhileblock4635); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulewhileblock"


    // $ANTLR start "rulewhileblock"
    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2330:1: rulewhileblock returns [EObject current=null] : (otherlv_0= 'while' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'do' rulebegin ( (lv_blocks_4_0= rulestatement ) )+ ruleend ) ;
    public final EObject rulewhileblock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_blocks_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2333:28: ( (otherlv_0= 'while' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'do' rulebegin ( (lv_blocks_4_0= rulestatement ) )+ ruleend ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2334:1: (otherlv_0= 'while' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'do' rulebegin ( (lv_blocks_4_0= rulestatement ) )+ ruleend )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2334:1: (otherlv_0= 'while' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'do' rulebegin ( (lv_blocks_4_0= rulestatement ) )+ ruleend )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2334:3: otherlv_0= 'while' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'do' rulebegin ( (lv_blocks_4_0= rulestatement ) )+ ruleend
            {
            otherlv_0=(Token)match(input,39,FOLLOW_39_in_rulewhileblock4672); 

                	newLeafNode(otherlv_0, grammarAccess.getWhileblockAccess().getWhileKeyword_0());
                
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2338:1: ( (otherlv_1= RULE_ID ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2339:1: (otherlv_1= RULE_ID )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2339:1: (otherlv_1= RULE_ID )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2340:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getWhileblockRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulewhileblock4692); 

            		newLeafNode(otherlv_1, grammarAccess.getWhileblockAccess().getEventNameLocalEventDeclarationCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,40,FOLLOW_40_in_rulewhileblock4704); 

                	newLeafNode(otherlv_2, grammarAccess.getWhileblockAccess().getDoKeyword_2());
                
             
                    newCompositeNode(grammarAccess.getWhileblockAccess().getBeginParserRuleCall_3()); 
                
            pushFollow(FOLLOW_rulebegin_in_rulewhileblock4720);
            rulebegin();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2363:1: ( (lv_blocks_4_0= rulestatement ) )+
            int cnt39=0;
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==36||LA39_0==39||LA39_0==41) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2364:1: (lv_blocks_4_0= rulestatement )
            	    {
            	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2364:1: (lv_blocks_4_0= rulestatement )
            	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2365:3: lv_blocks_4_0= rulestatement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getWhileblockAccess().getBlocksStatementParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulestatement_in_rulewhileblock4740);
            	    lv_blocks_4_0=rulestatement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getWhileblockRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"blocks",
            	            		lv_blocks_4_0, 
            	            		"statement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt39 >= 1 ) break loop39;
                        EarlyExitException eee =
                            new EarlyExitException(39, input);
                        throw eee;
                }
                cnt39++;
            } while (true);

             
                    newCompositeNode(grammarAccess.getWhileblockAccess().getEndParserRuleCall_5()); 
                
            pushFollow(FOLLOW_ruleend_in_rulewhileblock4757);
            ruleend();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulewhileblock"


    // $ANTLR start "entryRulefunctionCall"
    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2397:1: entryRulefunctionCall returns [EObject current=null] : iv_rulefunctionCall= rulefunctionCall EOF ;
    public final EObject entryRulefunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefunctionCall = null;


        try {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2398:2: (iv_rulefunctionCall= rulefunctionCall EOF )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2399:2: iv_rulefunctionCall= rulefunctionCall EOF
            {
             newCompositeNode(grammarAccess.getFunctionCallRule()); 
            pushFollow(FOLLOW_rulefunctionCall_in_entryRulefunctionCall4792);
            iv_rulefunctionCall=rulefunctionCall();

            state._fsp--;

             current =iv_rulefunctionCall; 
            match(input,EOF,FOLLOW_EOF_in_entryRulefunctionCall4802); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulefunctionCall"


    // $ANTLR start "rulefunctionCall"
    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2406:1: rulefunctionCall returns [EObject current=null] : (otherlv_0= 'execute' ( (otherlv_1= RULE_ID ) ) ruleopenPar ( ( (lv_arguments_3_0= rulefarg ) ) ( rulecoma ( (lv_arguments_5_0= rulefarg ) ) )* )? ruleclosePar ) ;
    public final EObject rulefunctionCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_arguments_3_0 = null;

        EObject lv_arguments_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2409:28: ( (otherlv_0= 'execute' ( (otherlv_1= RULE_ID ) ) ruleopenPar ( ( (lv_arguments_3_0= rulefarg ) ) ( rulecoma ( (lv_arguments_5_0= rulefarg ) ) )* )? ruleclosePar ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2410:1: (otherlv_0= 'execute' ( (otherlv_1= RULE_ID ) ) ruleopenPar ( ( (lv_arguments_3_0= rulefarg ) ) ( rulecoma ( (lv_arguments_5_0= rulefarg ) ) )* )? ruleclosePar )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2410:1: (otherlv_0= 'execute' ( (otherlv_1= RULE_ID ) ) ruleopenPar ( ( (lv_arguments_3_0= rulefarg ) ) ( rulecoma ( (lv_arguments_5_0= rulefarg ) ) )* )? ruleclosePar )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2410:3: otherlv_0= 'execute' ( (otherlv_1= RULE_ID ) ) ruleopenPar ( ( (lv_arguments_3_0= rulefarg ) ) ( rulecoma ( (lv_arguments_5_0= rulefarg ) ) )* )? ruleclosePar
            {
            otherlv_0=(Token)match(input,41,FOLLOW_41_in_rulefunctionCall4839); 

                	newLeafNode(otherlv_0, grammarAccess.getFunctionCallAccess().getExecuteKeyword_0());
                
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2414:1: ( (otherlv_1= RULE_ID ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2415:1: (otherlv_1= RULE_ID )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2415:1: (otherlv_1= RULE_ID )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2416:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getFunctionCallRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulefunctionCall4859); 

            		newLeafNode(otherlv_1, grammarAccess.getFunctionCallAccess().getNameFuncProcCrossReference_1_0()); 
            	

            }


            }

             
                    newCompositeNode(grammarAccess.getFunctionCallAccess().getOpenParParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleopenPar_in_rulefunctionCall4875);
            ruleopenPar();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2435:1: ( ( (lv_arguments_3_0= rulefarg ) ) ( rulecoma ( (lv_arguments_5_0= rulefarg ) ) )* )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_ID) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2435:2: ( (lv_arguments_3_0= rulefarg ) ) ( rulecoma ( (lv_arguments_5_0= rulefarg ) ) )*
                    {
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2435:2: ( (lv_arguments_3_0= rulefarg ) )
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2436:1: (lv_arguments_3_0= rulefarg )
                    {
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2436:1: (lv_arguments_3_0= rulefarg )
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2437:3: lv_arguments_3_0= rulefarg
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunctionCallAccess().getArgumentsFargParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulefarg_in_rulefunctionCall4896);
                    lv_arguments_3_0=rulefarg();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFunctionCallRule());
                    	        }
                           		add(
                           			current, 
                           			"arguments",
                            		lv_arguments_3_0, 
                            		"farg");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2453:2: ( rulecoma ( (lv_arguments_5_0= rulefarg ) ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==80) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2454:5: rulecoma ( (lv_arguments_5_0= rulefarg ) )
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getFunctionCallAccess().getComaParserRuleCall_3_1_0()); 
                    	        
                    	    pushFollow(FOLLOW_rulecoma_in_rulefunctionCall4913);
                    	    rulecoma();

                    	    state._fsp--;

                    	     
                    	            afterParserOrEnumRuleCall();
                    	        
                    	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2461:1: ( (lv_arguments_5_0= rulefarg ) )
                    	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2462:1: (lv_arguments_5_0= rulefarg )
                    	    {
                    	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2462:1: (lv_arguments_5_0= rulefarg )
                    	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2463:3: lv_arguments_5_0= rulefarg
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFunctionCallAccess().getArgumentsFargParserRuleCall_3_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_rulefarg_in_rulefunctionCall4933);
                    	    lv_arguments_5_0=rulefarg();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getFunctionCallRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"arguments",
                    	            		lv_arguments_5_0, 
                    	            		"farg");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);


                    }
                    break;

            }

             
                    newCompositeNode(grammarAccess.getFunctionCallAccess().getCloseParParserRuleCall_4()); 
                
            pushFollow(FOLLOW_ruleclosePar_in_rulefunctionCall4953);
            ruleclosePar();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulefunctionCall"


    // $ANTLR start "entryRuleprototypeDeclaration"
    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2495:1: entryRuleprototypeDeclaration returns [EObject current=null] : iv_ruleprototypeDeclaration= ruleprototypeDeclaration EOF ;
    public final EObject entryRuleprototypeDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprototypeDeclaration = null;


        try {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2496:2: (iv_ruleprototypeDeclaration= ruleprototypeDeclaration EOF )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2497:2: iv_ruleprototypeDeclaration= ruleprototypeDeclaration EOF
            {
             newCompositeNode(grammarAccess.getPrototypeDeclarationRule()); 
            pushFollow(FOLLOW_ruleprototypeDeclaration_in_entryRuleprototypeDeclaration4988);
            iv_ruleprototypeDeclaration=ruleprototypeDeclaration();

            state._fsp--;

             current =iv_ruleprototypeDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleprototypeDeclaration4998); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleprototypeDeclaration"


    // $ANTLR start "ruleprototypeDeclaration"
    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2504:1: ruleprototypeDeclaration returns [EObject current=null] : (otherlv_0= 'prototype' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'is' ( (otherlv_3= RULE_ID ) ) )? rulebegin ( (lv_definitions_5_0= rulearchitectureElement ) )* ruleend ) ;
    public final EObject ruleprototypeDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_definitions_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2507:28: ( (otherlv_0= 'prototype' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'is' ( (otherlv_3= RULE_ID ) ) )? rulebegin ( (lv_definitions_5_0= rulearchitectureElement ) )* ruleend ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2508:1: (otherlv_0= 'prototype' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'is' ( (otherlv_3= RULE_ID ) ) )? rulebegin ( (lv_definitions_5_0= rulearchitectureElement ) )* ruleend )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2508:1: (otherlv_0= 'prototype' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'is' ( (otherlv_3= RULE_ID ) ) )? rulebegin ( (lv_definitions_5_0= rulearchitectureElement ) )* ruleend )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2508:3: otherlv_0= 'prototype' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'is' ( (otherlv_3= RULE_ID ) ) )? rulebegin ( (lv_definitions_5_0= rulearchitectureElement ) )* ruleend
            {
            otherlv_0=(Token)match(input,42,FOLLOW_42_in_ruleprototypeDeclaration5035); 

                	newLeafNode(otherlv_0, grammarAccess.getPrototypeDeclarationAccess().getPrototypeKeyword_0());
                
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2512:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2513:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2513:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2514:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleprototypeDeclaration5052); 

            			newLeafNode(lv_name_1_0, grammarAccess.getPrototypeDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPrototypeDeclarationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2530:2: (otherlv_2= 'is' ( (otherlv_3= RULE_ID ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==14) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2530:4: otherlv_2= 'is' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleprototypeDeclaration5070); 

                        	newLeafNode(otherlv_2, grammarAccess.getPrototypeDeclarationAccess().getIsKeyword_2_0());
                        
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2534:1: ( (otherlv_3= RULE_ID ) )
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2535:1: (otherlv_3= RULE_ID )
                    {
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2535:1: (otherlv_3= RULE_ID )
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2536:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrototypeDeclarationRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleprototypeDeclaration5090); 

                    		newLeafNode(otherlv_3, grammarAccess.getPrototypeDeclarationAccess().getSuperTypePrototypeDeclarationCrossReference_2_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

             
                    newCompositeNode(grammarAccess.getPrototypeDeclarationAccess().getBeginParserRuleCall_3()); 
                
            pushFollow(FOLLOW_rulebegin_in_ruleprototypeDeclaration5108);
            rulebegin();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2555:1: ( (lv_definitions_5_0= rulearchitectureElement ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( ((LA43_0>=35 && LA43_0<=36)||(LA43_0>=43 && LA43_0<=44)||LA43_0==54||LA43_0==60||LA43_0==63||LA43_0==66||LA43_0==74) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2556:1: (lv_definitions_5_0= rulearchitectureElement )
            	    {
            	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2556:1: (lv_definitions_5_0= rulearchitectureElement )
            	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2557:3: lv_definitions_5_0= rulearchitectureElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPrototypeDeclarationAccess().getDefinitionsArchitectureElementParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulearchitectureElement_in_ruleprototypeDeclaration5128);
            	    lv_definitions_5_0=rulearchitectureElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPrototypeDeclarationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"definitions",
            	            		lv_definitions_5_0, 
            	            		"architectureElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

             
                    newCompositeNode(grammarAccess.getPrototypeDeclarationAccess().getEndParserRuleCall_5()); 
                
            pushFollow(FOLLOW_ruleend_in_ruleprototypeDeclaration5145);
            ruleend();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleprototypeDeclaration"


    // $ANTLR start "entryRulearchitectureElement"
    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2589:1: entryRulearchitectureElement returns [EObject current=null] : iv_rulearchitectureElement= rulearchitectureElement EOF ;
    public final EObject entryRulearchitectureElement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulearchitectureElement = null;


        try {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2590:2: (iv_rulearchitectureElement= rulearchitectureElement EOF )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2591:2: iv_rulearchitectureElement= rulearchitectureElement EOF
            {
             newCompositeNode(grammarAccess.getArchitectureElementRule()); 
            pushFollow(FOLLOW_rulearchitectureElement_in_entryRulearchitectureElement5180);
            iv_rulearchitectureElement=rulearchitectureElement();

            state._fsp--;

             current =iv_rulearchitectureElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRulearchitectureElement5190); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulearchitectureElement"


    // $ANTLR start "rulearchitectureElement"
    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2598:1: rulearchitectureElement returns [EObject current=null] : (this_parameterDeclaration_0= ruleparameterDeclaration | this_referenceDeclaration_1= rulereferenceDeclaration | this_eventDeclaration_2= ruleeventDeclaration | this_statesetDeclaration_3= rulestatesetDeclaration | this_instanceDeclaration_4= ruleinstanceDeclaration | this_interactionDeclaration_5= ruleinteractionDeclaration | this_signalDeclaration_6= rulesignalDeclaration ) ;
    public final EObject rulearchitectureElement() throws RecognitionException {
        EObject current = null;

        EObject this_parameterDeclaration_0 = null;

        EObject this_referenceDeclaration_1 = null;

        EObject this_eventDeclaration_2 = null;

        EObject this_statesetDeclaration_3 = null;

        EObject this_instanceDeclaration_4 = null;

        EObject this_interactionDeclaration_5 = null;

        EObject this_signalDeclaration_6 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2601:28: ( (this_parameterDeclaration_0= ruleparameterDeclaration | this_referenceDeclaration_1= rulereferenceDeclaration | this_eventDeclaration_2= ruleeventDeclaration | this_statesetDeclaration_3= rulestatesetDeclaration | this_instanceDeclaration_4= ruleinstanceDeclaration | this_interactionDeclaration_5= ruleinteractionDeclaration | this_signalDeclaration_6= rulesignalDeclaration ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2602:1: (this_parameterDeclaration_0= ruleparameterDeclaration | this_referenceDeclaration_1= rulereferenceDeclaration | this_eventDeclaration_2= ruleeventDeclaration | this_statesetDeclaration_3= rulestatesetDeclaration | this_instanceDeclaration_4= ruleinstanceDeclaration | this_interactionDeclaration_5= ruleinteractionDeclaration | this_signalDeclaration_6= rulesignalDeclaration )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2602:1: (this_parameterDeclaration_0= ruleparameterDeclaration | this_referenceDeclaration_1= rulereferenceDeclaration | this_eventDeclaration_2= ruleeventDeclaration | this_statesetDeclaration_3= rulestatesetDeclaration | this_instanceDeclaration_4= ruleinstanceDeclaration | this_interactionDeclaration_5= ruleinteractionDeclaration | this_signalDeclaration_6= rulesignalDeclaration )
            int alt44=7;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt44=1;
                }
                break;
            case 66:
                {
                alt44=2;
                }
                break;
            case 44:
                {
                alt44=3;
                }
                break;
            case 54:
                {
                alt44=4;
                }
                break;
            case 60:
                {
                alt44=5;
                }
                break;
            case 36:
            case 63:
            case 74:
                {
                alt44=6;
                }
                break;
            case 43:
                {
                alt44=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2603:5: this_parameterDeclaration_0= ruleparameterDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getArchitectureElementAccess().getParameterDeclarationParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleparameterDeclaration_in_rulearchitectureElement5237);
                    this_parameterDeclaration_0=ruleparameterDeclaration();

                    state._fsp--;

                     
                            current = this_parameterDeclaration_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2613:5: this_referenceDeclaration_1= rulereferenceDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getArchitectureElementAccess().getReferenceDeclarationParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulereferenceDeclaration_in_rulearchitectureElement5264);
                    this_referenceDeclaration_1=rulereferenceDeclaration();

                    state._fsp--;

                     
                            current = this_referenceDeclaration_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2623:5: this_eventDeclaration_2= ruleeventDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getArchitectureElementAccess().getEventDeclarationParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleeventDeclaration_in_rulearchitectureElement5291);
                    this_eventDeclaration_2=ruleeventDeclaration();

                    state._fsp--;

                     
                            current = this_eventDeclaration_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2633:5: this_statesetDeclaration_3= rulestatesetDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getArchitectureElementAccess().getStatesetDeclarationParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_rulestatesetDeclaration_in_rulearchitectureElement5318);
                    this_statesetDeclaration_3=rulestatesetDeclaration();

                    state._fsp--;

                     
                            current = this_statesetDeclaration_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2643:5: this_instanceDeclaration_4= ruleinstanceDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getArchitectureElementAccess().getInstanceDeclarationParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleinstanceDeclaration_in_rulearchitectureElement5345);
                    this_instanceDeclaration_4=ruleinstanceDeclaration();

                    state._fsp--;

                     
                            current = this_instanceDeclaration_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2653:5: this_interactionDeclaration_5= ruleinteractionDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getArchitectureElementAccess().getInteractionDeclarationParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleinteractionDeclaration_in_rulearchitectureElement5372);
                    this_interactionDeclaration_5=ruleinteractionDeclaration();

                    state._fsp--;

                     
                            current = this_interactionDeclaration_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2663:5: this_signalDeclaration_6= rulesignalDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getArchitectureElementAccess().getSignalDeclarationParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_rulesignalDeclaration_in_rulearchitectureElement5399);
                    this_signalDeclaration_6=rulesignalDeclaration();

                    state._fsp--;

                     
                            current = this_signalDeclaration_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulearchitectureElement"


    // $ANTLR start "entryRulesignalDeclaration"
    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2679:1: entryRulesignalDeclaration returns [EObject current=null] : iv_rulesignalDeclaration= rulesignalDeclaration EOF ;
    public final EObject entryRulesignalDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesignalDeclaration = null;


        try {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2680:2: (iv_rulesignalDeclaration= rulesignalDeclaration EOF )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2681:2: iv_rulesignalDeclaration= rulesignalDeclaration EOF
            {
             newCompositeNode(grammarAccess.getSignalDeclarationRule()); 
            pushFollow(FOLLOW_rulesignalDeclaration_in_entryRulesignalDeclaration5434);
            iv_rulesignalDeclaration=rulesignalDeclaration();

            state._fsp--;

             current =iv_rulesignalDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRulesignalDeclaration5444); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulesignalDeclaration"


    // $ANTLR start "rulesignalDeclaration"
    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2688:1: rulesignalDeclaration returns [EObject current=null] : (otherlv_0= 'signal' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject rulesignalDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2691:28: ( (otherlv_0= 'signal' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2692:1: (otherlv_0= 'signal' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2692:1: (otherlv_0= 'signal' ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2692:3: otherlv_0= 'signal' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,43,FOLLOW_43_in_rulesignalDeclaration5481); 

                	newLeafNode(otherlv_0, grammarAccess.getSignalDeclarationAccess().getSignalKeyword_0());
                
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2696:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2697:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2697:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2698:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulesignalDeclaration5498); 

            			newLeafNode(lv_name_1_0, grammarAccess.getSignalDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSignalDeclarationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulesignalDeclaration"


    // $ANTLR start "entryRuleeventDeclaration"
    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2722:1: entryRuleeventDeclaration returns [EObject current=null] : iv_ruleeventDeclaration= ruleeventDeclaration EOF ;
    public final EObject entryRuleeventDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleeventDeclaration = null;


        try {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2723:2: (iv_ruleeventDeclaration= ruleeventDeclaration EOF )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2724:2: iv_ruleeventDeclaration= ruleeventDeclaration EOF
            {
             newCompositeNode(grammarAccess.getEventDeclarationRule()); 
            pushFollow(FOLLOW_ruleeventDeclaration_in_entryRuleeventDeclaration5539);
            iv_ruleeventDeclaration=ruleeventDeclaration();

            state._fsp--;

             current =iv_ruleeventDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleeventDeclaration5549); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleeventDeclaration"


    // $ANTLR start "ruleeventDeclaration"
    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2731:1: ruleeventDeclaration returns [EObject current=null] : (otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_conditions_3_0= ruleeventCondition ) ) ( rulecoma ( (lv_conditions_5_0= ruleeventCondition ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleeventDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_conditions_3_0 = null;

        EObject lv_conditions_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2734:28: ( (otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_conditions_3_0= ruleeventCondition ) ) ( rulecoma ( (lv_conditions_5_0= ruleeventCondition ) ) )* otherlv_6= '}' ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2735:1: (otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_conditions_3_0= ruleeventCondition ) ) ( rulecoma ( (lv_conditions_5_0= ruleeventCondition ) ) )* otherlv_6= '}' )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2735:1: (otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_conditions_3_0= ruleeventCondition ) ) ( rulecoma ( (lv_conditions_5_0= ruleeventCondition ) ) )* otherlv_6= '}' )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2735:3: otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_conditions_3_0= ruleeventCondition ) ) ( rulecoma ( (lv_conditions_5_0= ruleeventCondition ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_44_in_ruleeventDeclaration5586); 

                	newLeafNode(otherlv_0, grammarAccess.getEventDeclarationAccess().getEventKeyword_0());
                
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2739:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2740:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2740:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2741:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleeventDeclaration5603); 

            			newLeafNode(lv_name_1_0, grammarAccess.getEventDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEventDeclarationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,45,FOLLOW_45_in_ruleeventDeclaration5620); 

                	newLeafNode(otherlv_2, grammarAccess.getEventDeclarationAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2761:1: ( (lv_conditions_3_0= ruleeventCondition ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2762:1: (lv_conditions_3_0= ruleeventCondition )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2762:1: (lv_conditions_3_0= ruleeventCondition )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2763:3: lv_conditions_3_0= ruleeventCondition
            {
             
            	        newCompositeNode(grammarAccess.getEventDeclarationAccess().getConditionsEventConditionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleeventCondition_in_ruleeventDeclaration5641);
            lv_conditions_3_0=ruleeventCondition();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEventDeclarationRule());
            	        }
                   		add(
                   			current, 
                   			"conditions",
                    		lv_conditions_3_0, 
                    		"eventCondition");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2779:2: ( rulecoma ( (lv_conditions_5_0= ruleeventCondition ) ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==80) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2780:5: rulecoma ( (lv_conditions_5_0= ruleeventCondition ) )
            	    {
            	     
            	            newCompositeNode(grammarAccess.getEventDeclarationAccess().getComaParserRuleCall_4_0()); 
            	        
            	    pushFollow(FOLLOW_rulecoma_in_ruleeventDeclaration5658);
            	    rulecoma();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        
            	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2787:1: ( (lv_conditions_5_0= ruleeventCondition ) )
            	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2788:1: (lv_conditions_5_0= ruleeventCondition )
            	    {
            	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2788:1: (lv_conditions_5_0= ruleeventCondition )
            	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2789:3: lv_conditions_5_0= ruleeventCondition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEventDeclarationAccess().getConditionsEventConditionParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleeventCondition_in_ruleeventDeclaration5678);
            	    lv_conditions_5_0=ruleeventCondition();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEventDeclarationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"conditions",
            	            		lv_conditions_5_0, 
            	            		"eventCondition");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

            otherlv_6=(Token)match(input,46,FOLLOW_46_in_ruleeventDeclaration5692); 

                	newLeafNode(otherlv_6, grammarAccess.getEventDeclarationAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleeventDeclaration"


    // $ANTLR start "entryRuleeventCondition"
    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2817:1: entryRuleeventCondition returns [EObject current=null] : iv_ruleeventCondition= ruleeventCondition EOF ;
    public final EObject entryRuleeventCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleeventCondition = null;


        try {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2818:2: (iv_ruleeventCondition= ruleeventCondition EOF )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2819:2: iv_ruleeventCondition= ruleeventCondition EOF
            {
             newCompositeNode(grammarAccess.getEventConditionRule()); 
            pushFollow(FOLLOW_ruleeventCondition_in_entryRuleeventCondition5728);
            iv_ruleeventCondition=ruleeventCondition();

            state._fsp--;

             current =iv_ruleeventCondition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleeventCondition5738); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleeventCondition"


    // $ANTLR start "ruleeventCondition"
    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2826:1: ruleeventCondition returns [EObject current=null] : ( ( (lv_leftPart_0_0= RULE_ID ) ) ( ( (lv_cond_1_1= '==' | lv_cond_1_2= '>=' | lv_cond_1_3= '<=' | lv_cond_1_4= '<' | lv_cond_1_5= '>' | lv_cond_1_6= '%%' ) ) ) ( ( (lv_rightPartI_2_0= RULE_ID ) ) | ( (lv_rightPartN_3_0= RULE_INT ) ) | ( (lv_rightPartS_4_0= RULE_STRING ) ) ) ) ;
    public final EObject ruleeventCondition() throws RecognitionException {
        EObject current = null;

        Token lv_leftPart_0_0=null;
        Token lv_cond_1_1=null;
        Token lv_cond_1_2=null;
        Token lv_cond_1_3=null;
        Token lv_cond_1_4=null;
        Token lv_cond_1_5=null;
        Token lv_cond_1_6=null;
        Token lv_rightPartI_2_0=null;
        Token lv_rightPartN_3_0=null;
        Token lv_rightPartS_4_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2829:28: ( ( ( (lv_leftPart_0_0= RULE_ID ) ) ( ( (lv_cond_1_1= '==' | lv_cond_1_2= '>=' | lv_cond_1_3= '<=' | lv_cond_1_4= '<' | lv_cond_1_5= '>' | lv_cond_1_6= '%%' ) ) ) ( ( (lv_rightPartI_2_0= RULE_ID ) ) | ( (lv_rightPartN_3_0= RULE_INT ) ) | ( (lv_rightPartS_4_0= RULE_STRING ) ) ) ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2830:1: ( ( (lv_leftPart_0_0= RULE_ID ) ) ( ( (lv_cond_1_1= '==' | lv_cond_1_2= '>=' | lv_cond_1_3= '<=' | lv_cond_1_4= '<' | lv_cond_1_5= '>' | lv_cond_1_6= '%%' ) ) ) ( ( (lv_rightPartI_2_0= RULE_ID ) ) | ( (lv_rightPartN_3_0= RULE_INT ) ) | ( (lv_rightPartS_4_0= RULE_STRING ) ) ) )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2830:1: ( ( (lv_leftPart_0_0= RULE_ID ) ) ( ( (lv_cond_1_1= '==' | lv_cond_1_2= '>=' | lv_cond_1_3= '<=' | lv_cond_1_4= '<' | lv_cond_1_5= '>' | lv_cond_1_6= '%%' ) ) ) ( ( (lv_rightPartI_2_0= RULE_ID ) ) | ( (lv_rightPartN_3_0= RULE_INT ) ) | ( (lv_rightPartS_4_0= RULE_STRING ) ) ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2830:2: ( (lv_leftPart_0_0= RULE_ID ) ) ( ( (lv_cond_1_1= '==' | lv_cond_1_2= '>=' | lv_cond_1_3= '<=' | lv_cond_1_4= '<' | lv_cond_1_5= '>' | lv_cond_1_6= '%%' ) ) ) ( ( (lv_rightPartI_2_0= RULE_ID ) ) | ( (lv_rightPartN_3_0= RULE_INT ) ) | ( (lv_rightPartS_4_0= RULE_STRING ) ) )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2830:2: ( (lv_leftPart_0_0= RULE_ID ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2831:1: (lv_leftPart_0_0= RULE_ID )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2831:1: (lv_leftPart_0_0= RULE_ID )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2832:3: lv_leftPart_0_0= RULE_ID
            {
            lv_leftPart_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleeventCondition5780); 

            			newLeafNode(lv_leftPart_0_0, grammarAccess.getEventConditionAccess().getLeftPartIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEventConditionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"leftPart",
                    		lv_leftPart_0_0, 
                    		"ID");
            	    

            }


            }

            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2848:2: ( ( (lv_cond_1_1= '==' | lv_cond_1_2= '>=' | lv_cond_1_3= '<=' | lv_cond_1_4= '<' | lv_cond_1_5= '>' | lv_cond_1_6= '%%' ) ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2849:1: ( (lv_cond_1_1= '==' | lv_cond_1_2= '>=' | lv_cond_1_3= '<=' | lv_cond_1_4= '<' | lv_cond_1_5= '>' | lv_cond_1_6= '%%' ) )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2849:1: ( (lv_cond_1_1= '==' | lv_cond_1_2= '>=' | lv_cond_1_3= '<=' | lv_cond_1_4= '<' | lv_cond_1_5= '>' | lv_cond_1_6= '%%' ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2850:1: (lv_cond_1_1= '==' | lv_cond_1_2= '>=' | lv_cond_1_3= '<=' | lv_cond_1_4= '<' | lv_cond_1_5= '>' | lv_cond_1_6= '%%' )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2850:1: (lv_cond_1_1= '==' | lv_cond_1_2= '>=' | lv_cond_1_3= '<=' | lv_cond_1_4= '<' | lv_cond_1_5= '>' | lv_cond_1_6= '%%' )
            int alt46=6;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt46=1;
                }
                break;
            case 48:
                {
                alt46=2;
                }
                break;
            case 49:
                {
                alt46=3;
                }
                break;
            case 22:
                {
                alt46=4;
                }
                break;
            case 23:
                {
                alt46=5;
                }
                break;
            case 50:
                {
                alt46=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2851:3: lv_cond_1_1= '=='
                    {
                    lv_cond_1_1=(Token)match(input,47,FOLLOW_47_in_ruleeventCondition5805); 

                            newLeafNode(lv_cond_1_1, grammarAccess.getEventConditionAccess().getCondEqualsSignEqualsSignKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEventConditionRule());
                    	        }
                           		setWithLastConsumed(current, "cond", lv_cond_1_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2863:8: lv_cond_1_2= '>='
                    {
                    lv_cond_1_2=(Token)match(input,48,FOLLOW_48_in_ruleeventCondition5834); 

                            newLeafNode(lv_cond_1_2, grammarAccess.getEventConditionAccess().getCondGreaterThanSignEqualsSignKeyword_1_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEventConditionRule());
                    	        }
                           		setWithLastConsumed(current, "cond", lv_cond_1_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2875:8: lv_cond_1_3= '<='
                    {
                    lv_cond_1_3=(Token)match(input,49,FOLLOW_49_in_ruleeventCondition5863); 

                            newLeafNode(lv_cond_1_3, grammarAccess.getEventConditionAccess().getCondLessThanSignEqualsSignKeyword_1_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEventConditionRule());
                    	        }
                           		setWithLastConsumed(current, "cond", lv_cond_1_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2887:8: lv_cond_1_4= '<'
                    {
                    lv_cond_1_4=(Token)match(input,22,FOLLOW_22_in_ruleeventCondition5892); 

                            newLeafNode(lv_cond_1_4, grammarAccess.getEventConditionAccess().getCondLessThanSignKeyword_1_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEventConditionRule());
                    	        }
                           		setWithLastConsumed(current, "cond", lv_cond_1_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2899:8: lv_cond_1_5= '>'
                    {
                    lv_cond_1_5=(Token)match(input,23,FOLLOW_23_in_ruleeventCondition5921); 

                            newLeafNode(lv_cond_1_5, grammarAccess.getEventConditionAccess().getCondGreaterThanSignKeyword_1_0_4());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEventConditionRule());
                    	        }
                           		setWithLastConsumed(current, "cond", lv_cond_1_5, null);
                    	    

                    }
                    break;
                case 6 :
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2911:8: lv_cond_1_6= '%%'
                    {
                    lv_cond_1_6=(Token)match(input,50,FOLLOW_50_in_ruleeventCondition5950); 

                            newLeafNode(lv_cond_1_6, grammarAccess.getEventConditionAccess().getCondPercentSignPercentSignKeyword_1_0_5());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEventConditionRule());
                    	        }
                           		setWithLastConsumed(current, "cond", lv_cond_1_6, null);
                    	    

                    }
                    break;

            }


            }


            }

            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2926:2: ( ( (lv_rightPartI_2_0= RULE_ID ) ) | ( (lv_rightPartN_3_0= RULE_INT ) ) | ( (lv_rightPartS_4_0= RULE_STRING ) ) )
            int alt47=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt47=1;
                }
                break;
            case RULE_INT:
                {
                alt47=2;
                }
                break;
            case RULE_STRING:
                {
                alt47=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2926:3: ( (lv_rightPartI_2_0= RULE_ID ) )
                    {
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2926:3: ( (lv_rightPartI_2_0= RULE_ID ) )
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2927:1: (lv_rightPartI_2_0= RULE_ID )
                    {
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2927:1: (lv_rightPartI_2_0= RULE_ID )
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2928:3: lv_rightPartI_2_0= RULE_ID
                    {
                    lv_rightPartI_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleeventCondition5984); 

                    			newLeafNode(lv_rightPartI_2_0, grammarAccess.getEventConditionAccess().getRightPartIIDTerminalRuleCall_2_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEventConditionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"rightPartI",
                            		lv_rightPartI_2_0, 
                            		"ID");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2945:6: ( (lv_rightPartN_3_0= RULE_INT ) )
                    {
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2945:6: ( (lv_rightPartN_3_0= RULE_INT ) )
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2946:1: (lv_rightPartN_3_0= RULE_INT )
                    {
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2946:1: (lv_rightPartN_3_0= RULE_INT )
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2947:3: lv_rightPartN_3_0= RULE_INT
                    {
                    lv_rightPartN_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleeventCondition6012); 

                    			newLeafNode(lv_rightPartN_3_0, grammarAccess.getEventConditionAccess().getRightPartNINTTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEventConditionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"rightPartN",
                            		lv_rightPartN_3_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2964:6: ( (lv_rightPartS_4_0= RULE_STRING ) )
                    {
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2964:6: ( (lv_rightPartS_4_0= RULE_STRING ) )
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2965:1: (lv_rightPartS_4_0= RULE_STRING )
                    {
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2965:1: (lv_rightPartS_4_0= RULE_STRING )
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2966:3: lv_rightPartS_4_0= RULE_STRING
                    {
                    lv_rightPartS_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleeventCondition6040); 

                    			newLeafNode(lv_rightPartS_4_0, grammarAccess.getEventConditionAccess().getRightPartSSTRINGTerminalRuleCall_2_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEventConditionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"rightPartS",
                            		lv_rightPartS_4_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleeventCondition"


    // $ANTLR start "entryRuleparameterDeclaration"
    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2990:1: entryRuleparameterDeclaration returns [EObject current=null] : iv_ruleparameterDeclaration= ruleparameterDeclaration EOF ;
    public final EObject entryRuleparameterDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleparameterDeclaration = null;


        try {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2991:2: (iv_ruleparameterDeclaration= ruleparameterDeclaration EOF )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2992:2: iv_ruleparameterDeclaration= ruleparameterDeclaration EOF
            {
             newCompositeNode(grammarAccess.getParameterDeclarationRule()); 
            pushFollow(FOLLOW_ruleparameterDeclaration_in_entryRuleparameterDeclaration6082);
            iv_ruleparameterDeclaration=ruleparameterDeclaration();

            state._fsp--;

             current =iv_ruleparameterDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleparameterDeclaration6092); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleparameterDeclaration"


    // $ANTLR start "ruleparameterDeclaration"
    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:2999:1: ruleparameterDeclaration returns [EObject current=null] : (otherlv_0= 'parameter' ( (otherlv_1= RULE_ID ) ) ( ( (lv_hasNbW_2_0= '#' ) ) ruleopenPar ( (lv_nbw_4_0= RULE_INT ) ) ruleclosePar )? ( (lv_hasInfiniteWriter_6_0= '!' ) )? ( (lv_name_7_0= RULE_ID ) ) ( ( ( (lv_hasValue_8_0= '=' ) ) ( (lv_value_9_0= RULE_STRING ) ) ) | ( ( (lv_hasConfig_10_0= '=' ) ) otherlv_11= '<>' ) | ( ( (lv_hasConfigWithDefaultValue_12_0= '=' ) ) otherlv_13= '<' ( (lv_value_14_0= RULE_STRING ) ) otherlv_15= '>' ) )? ) ;
    public final EObject ruleparameterDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_hasNbW_2_0=null;
        Token lv_nbw_4_0=null;
        Token lv_hasInfiniteWriter_6_0=null;
        Token lv_name_7_0=null;
        Token lv_hasValue_8_0=null;
        Token lv_value_9_0=null;
        Token lv_hasConfig_10_0=null;
        Token otherlv_11=null;
        Token lv_hasConfigWithDefaultValue_12_0=null;
        Token otherlv_13=null;
        Token lv_value_14_0=null;
        Token otherlv_15=null;

         enterRule(); 
            
        try {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3002:28: ( (otherlv_0= 'parameter' ( (otherlv_1= RULE_ID ) ) ( ( (lv_hasNbW_2_0= '#' ) ) ruleopenPar ( (lv_nbw_4_0= RULE_INT ) ) ruleclosePar )? ( (lv_hasInfiniteWriter_6_0= '!' ) )? ( (lv_name_7_0= RULE_ID ) ) ( ( ( (lv_hasValue_8_0= '=' ) ) ( (lv_value_9_0= RULE_STRING ) ) ) | ( ( (lv_hasConfig_10_0= '=' ) ) otherlv_11= '<>' ) | ( ( (lv_hasConfigWithDefaultValue_12_0= '=' ) ) otherlv_13= '<' ( (lv_value_14_0= RULE_STRING ) ) otherlv_15= '>' ) )? ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3003:1: (otherlv_0= 'parameter' ( (otherlv_1= RULE_ID ) ) ( ( (lv_hasNbW_2_0= '#' ) ) ruleopenPar ( (lv_nbw_4_0= RULE_INT ) ) ruleclosePar )? ( (lv_hasInfiniteWriter_6_0= '!' ) )? ( (lv_name_7_0= RULE_ID ) ) ( ( ( (lv_hasValue_8_0= '=' ) ) ( (lv_value_9_0= RULE_STRING ) ) ) | ( ( (lv_hasConfig_10_0= '=' ) ) otherlv_11= '<>' ) | ( ( (lv_hasConfigWithDefaultValue_12_0= '=' ) ) otherlv_13= '<' ( (lv_value_14_0= RULE_STRING ) ) otherlv_15= '>' ) )? )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3003:1: (otherlv_0= 'parameter' ( (otherlv_1= RULE_ID ) ) ( ( (lv_hasNbW_2_0= '#' ) ) ruleopenPar ( (lv_nbw_4_0= RULE_INT ) ) ruleclosePar )? ( (lv_hasInfiniteWriter_6_0= '!' ) )? ( (lv_name_7_0= RULE_ID ) ) ( ( ( (lv_hasValue_8_0= '=' ) ) ( (lv_value_9_0= RULE_STRING ) ) ) | ( ( (lv_hasConfig_10_0= '=' ) ) otherlv_11= '<>' ) | ( ( (lv_hasConfigWithDefaultValue_12_0= '=' ) ) otherlv_13= '<' ( (lv_value_14_0= RULE_STRING ) ) otherlv_15= '>' ) )? )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3003:3: otherlv_0= 'parameter' ( (otherlv_1= RULE_ID ) ) ( ( (lv_hasNbW_2_0= '#' ) ) ruleopenPar ( (lv_nbw_4_0= RULE_INT ) ) ruleclosePar )? ( (lv_hasInfiniteWriter_6_0= '!' ) )? ( (lv_name_7_0= RULE_ID ) ) ( ( ( (lv_hasValue_8_0= '=' ) ) ( (lv_value_9_0= RULE_STRING ) ) ) | ( ( (lv_hasConfig_10_0= '=' ) ) otherlv_11= '<>' ) | ( ( (lv_hasConfigWithDefaultValue_12_0= '=' ) ) otherlv_13= '<' ( (lv_value_14_0= RULE_STRING ) ) otherlv_15= '>' ) )?
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleparameterDeclaration6129); 

                	newLeafNode(otherlv_0, grammarAccess.getParameterDeclarationAccess().getParameterKeyword_0());
                
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3007:1: ( (otherlv_1= RULE_ID ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3008:1: (otherlv_1= RULE_ID )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3008:1: (otherlv_1= RULE_ID )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3009:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getParameterDeclarationRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleparameterDeclaration6149); 

            		newLeafNode(otherlv_1, grammarAccess.getParameterDeclarationAccess().getTypeNameDataTypeCrossReference_1_0()); 
            	

            }


            }

            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3020:2: ( ( (lv_hasNbW_2_0= '#' ) ) ruleopenPar ( (lv_nbw_4_0= RULE_INT ) ) ruleclosePar )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==51) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3020:3: ( (lv_hasNbW_2_0= '#' ) ) ruleopenPar ( (lv_nbw_4_0= RULE_INT ) ) ruleclosePar
                    {
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3020:3: ( (lv_hasNbW_2_0= '#' ) )
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3021:1: (lv_hasNbW_2_0= '#' )
                    {
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3021:1: (lv_hasNbW_2_0= '#' )
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3022:3: lv_hasNbW_2_0= '#'
                    {
                    lv_hasNbW_2_0=(Token)match(input,51,FOLLOW_51_in_ruleparameterDeclaration6168); 

                            newLeafNode(lv_hasNbW_2_0, grammarAccess.getParameterDeclarationAccess().getHasNbWNumberSignKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getParameterDeclarationRule());
                    	        }
                           		setWithLastConsumed(current, "hasNbW", true, "#");
                    	    

                    }


                    }

                     
                            newCompositeNode(grammarAccess.getParameterDeclarationAccess().getOpenParParserRuleCall_2_1()); 
                        
                    pushFollow(FOLLOW_ruleopenPar_in_ruleparameterDeclaration6197);
                    ruleopenPar();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3043:1: ( (lv_nbw_4_0= RULE_INT ) )
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3044:1: (lv_nbw_4_0= RULE_INT )
                    {
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3044:1: (lv_nbw_4_0= RULE_INT )
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3045:3: lv_nbw_4_0= RULE_INT
                    {
                    lv_nbw_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleparameterDeclaration6213); 

                    			newLeafNode(lv_nbw_4_0, grammarAccess.getParameterDeclarationAccess().getNbwINTTerminalRuleCall_2_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getParameterDeclarationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"nbw",
                            		lv_nbw_4_0, 
                            		"INT");
                    	    

                    }


                    }

                     
                            newCompositeNode(grammarAccess.getParameterDeclarationAccess().getCloseParParserRuleCall_2_3()); 
                        
                    pushFollow(FOLLOW_ruleclosePar_in_ruleparameterDeclaration6234);
                    ruleclosePar();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3069:3: ( (lv_hasInfiniteWriter_6_0= '!' ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==52) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3070:1: (lv_hasInfiniteWriter_6_0= '!' )
                    {
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3070:1: (lv_hasInfiniteWriter_6_0= '!' )
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3071:3: lv_hasInfiniteWriter_6_0= '!'
                    {
                    lv_hasInfiniteWriter_6_0=(Token)match(input,52,FOLLOW_52_in_ruleparameterDeclaration6253); 

                            newLeafNode(lv_hasInfiniteWriter_6_0, grammarAccess.getParameterDeclarationAccess().getHasInfiniteWriterExclamationMarkKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getParameterDeclarationRule());
                    	        }
                           		setWithLastConsumed(current, "hasInfiniteWriter", true, "!");
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3084:3: ( (lv_name_7_0= RULE_ID ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3085:1: (lv_name_7_0= RULE_ID )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3085:1: (lv_name_7_0= RULE_ID )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3086:3: lv_name_7_0= RULE_ID
            {
            lv_name_7_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleparameterDeclaration6284); 

            			newLeafNode(lv_name_7_0, grammarAccess.getParameterDeclarationAccess().getNameIDTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getParameterDeclarationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_7_0, 
                    		"ID");
            	    

            }


            }

            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3102:2: ( ( ( (lv_hasValue_8_0= '=' ) ) ( (lv_value_9_0= RULE_STRING ) ) ) | ( ( (lv_hasConfig_10_0= '=' ) ) otherlv_11= '<>' ) | ( ( (lv_hasConfigWithDefaultValue_12_0= '=' ) ) otherlv_13= '<' ( (lv_value_14_0= RULE_STRING ) ) otherlv_15= '>' ) )?
            int alt50=4;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==19) ) {
                switch ( input.LA(2) ) {
                    case RULE_STRING:
                        {
                        alt50=1;
                        }
                        break;
                    case 22:
                        {
                        alt50=3;
                        }
                        break;
                    case 53:
                        {
                        alt50=2;
                        }
                        break;
                }

            }
            switch (alt50) {
                case 1 :
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3102:3: ( ( (lv_hasValue_8_0= '=' ) ) ( (lv_value_9_0= RULE_STRING ) ) )
                    {
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3102:3: ( ( (lv_hasValue_8_0= '=' ) ) ( (lv_value_9_0= RULE_STRING ) ) )
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3102:4: ( (lv_hasValue_8_0= '=' ) ) ( (lv_value_9_0= RULE_STRING ) )
                    {
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3102:4: ( (lv_hasValue_8_0= '=' ) )
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3103:1: (lv_hasValue_8_0= '=' )
                    {
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3103:1: (lv_hasValue_8_0= '=' )
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3104:3: lv_hasValue_8_0= '='
                    {
                    lv_hasValue_8_0=(Token)match(input,19,FOLLOW_19_in_ruleparameterDeclaration6309); 

                            newLeafNode(lv_hasValue_8_0, grammarAccess.getParameterDeclarationAccess().getHasValueEqualsSignKeyword_5_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getParameterDeclarationRule());
                    	        }
                           		setWithLastConsumed(current, "hasValue", true, "=");
                    	    

                    }


                    }

                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3117:2: ( (lv_value_9_0= RULE_STRING ) )
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3118:1: (lv_value_9_0= RULE_STRING )
                    {
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3118:1: (lv_value_9_0= RULE_STRING )
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3119:3: lv_value_9_0= RULE_STRING
                    {
                    lv_value_9_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleparameterDeclaration6339); 

                    			newLeafNode(lv_value_9_0, grammarAccess.getParameterDeclarationAccess().getValueSTRINGTerminalRuleCall_5_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getParameterDeclarationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_9_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3136:6: ( ( (lv_hasConfig_10_0= '=' ) ) otherlv_11= '<>' )
                    {
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3136:6: ( ( (lv_hasConfig_10_0= '=' ) ) otherlv_11= '<>' )
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3136:7: ( (lv_hasConfig_10_0= '=' ) ) otherlv_11= '<>'
                    {
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3136:7: ( (lv_hasConfig_10_0= '=' ) )
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3137:1: (lv_hasConfig_10_0= '=' )
                    {
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3137:1: (lv_hasConfig_10_0= '=' )
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3138:3: lv_hasConfig_10_0= '='
                    {
                    lv_hasConfig_10_0=(Token)match(input,19,FOLLOW_19_in_ruleparameterDeclaration6370); 

                            newLeafNode(lv_hasConfig_10_0, grammarAccess.getParameterDeclarationAccess().getHasConfigEqualsSignKeyword_5_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getParameterDeclarationRule());
                    	        }
                           		setWithLastConsumed(current, "hasConfig", true, "=");
                    	    

                    }


                    }

                    otherlv_11=(Token)match(input,53,FOLLOW_53_in_ruleparameterDeclaration6395); 

                        	newLeafNode(otherlv_11, grammarAccess.getParameterDeclarationAccess().getLessThanSignGreaterThanSignKeyword_5_1_1());
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3156:6: ( ( (lv_hasConfigWithDefaultValue_12_0= '=' ) ) otherlv_13= '<' ( (lv_value_14_0= RULE_STRING ) ) otherlv_15= '>' )
                    {
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3156:6: ( ( (lv_hasConfigWithDefaultValue_12_0= '=' ) ) otherlv_13= '<' ( (lv_value_14_0= RULE_STRING ) ) otherlv_15= '>' )
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3156:7: ( (lv_hasConfigWithDefaultValue_12_0= '=' ) ) otherlv_13= '<' ( (lv_value_14_0= RULE_STRING ) ) otherlv_15= '>'
                    {
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3156:7: ( (lv_hasConfigWithDefaultValue_12_0= '=' ) )
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3157:1: (lv_hasConfigWithDefaultValue_12_0= '=' )
                    {
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3157:1: (lv_hasConfigWithDefaultValue_12_0= '=' )
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3158:3: lv_hasConfigWithDefaultValue_12_0= '='
                    {
                    lv_hasConfigWithDefaultValue_12_0=(Token)match(input,19,FOLLOW_19_in_ruleparameterDeclaration6421); 

                            newLeafNode(lv_hasConfigWithDefaultValue_12_0, grammarAccess.getParameterDeclarationAccess().getHasConfigWithDefaultValueEqualsSignKeyword_5_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getParameterDeclarationRule());
                    	        }
                           		setWithLastConsumed(current, "hasConfigWithDefaultValue", true, "=");
                    	    

                    }


                    }

                    otherlv_13=(Token)match(input,22,FOLLOW_22_in_ruleparameterDeclaration6446); 

                        	newLeafNode(otherlv_13, grammarAccess.getParameterDeclarationAccess().getLessThanSignKeyword_5_2_1());
                        
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3175:1: ( (lv_value_14_0= RULE_STRING ) )
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3176:1: (lv_value_14_0= RULE_STRING )
                    {
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3176:1: (lv_value_14_0= RULE_STRING )
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3177:3: lv_value_14_0= RULE_STRING
                    {
                    lv_value_14_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleparameterDeclaration6463); 

                    			newLeafNode(lv_value_14_0, grammarAccess.getParameterDeclarationAccess().getValueSTRINGTerminalRuleCall_5_2_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getParameterDeclarationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_14_0, 
                            		"STRING");
                    	    

                    }


                    }

                    otherlv_15=(Token)match(input,23,FOLLOW_23_in_ruleparameterDeclaration6480); 

                        	newLeafNode(otherlv_15, grammarAccess.getParameterDeclarationAccess().getGreaterThanSignKeyword_5_2_3());
                        

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleparameterDeclaration"


    // $ANTLR start "entryRulestatesetDeclaration"
    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3205:1: entryRulestatesetDeclaration returns [EObject current=null] : iv_rulestatesetDeclaration= rulestatesetDeclaration EOF ;
    public final EObject entryRulestatesetDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestatesetDeclaration = null;


        try {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3206:2: (iv_rulestatesetDeclaration= rulestatesetDeclaration EOF )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3207:2: iv_rulestatesetDeclaration= rulestatesetDeclaration EOF
            {
             newCompositeNode(grammarAccess.getStatesetDeclarationRule()); 
            pushFollow(FOLLOW_rulestatesetDeclaration_in_entryRulestatesetDeclaration6519);
            iv_rulestatesetDeclaration=rulestatesetDeclaration();

            state._fsp--;

             current =iv_rulestatesetDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRulestatesetDeclaration6529); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulestatesetDeclaration"


    // $ANTLR start "rulestatesetDeclaration"
    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3214:1: rulestatesetDeclaration returns [EObject current=null] : (otherlv_0= 'stateset' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_states_3_0= rulestateDeclaration ) ) rulecoma ( (lv_states_5_0= rulestateDeclaration ) ) ( rulecoma ( (lv_states_7_0= rulestateDeclaration ) ) )* otherlv_8= '}' otherlv_9= '=' ( (otherlv_10= RULE_ID ) ) rulebegin ( (lv_transitions_12_0= ruletransitionDeclaration ) )* ruleend ) ;
    public final EObject rulestatesetDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_states_3_0 = null;

        EObject lv_states_5_0 = null;

        EObject lv_states_7_0 = null;

        EObject lv_transitions_12_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3217:28: ( (otherlv_0= 'stateset' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_states_3_0= rulestateDeclaration ) ) rulecoma ( (lv_states_5_0= rulestateDeclaration ) ) ( rulecoma ( (lv_states_7_0= rulestateDeclaration ) ) )* otherlv_8= '}' otherlv_9= '=' ( (otherlv_10= RULE_ID ) ) rulebegin ( (lv_transitions_12_0= ruletransitionDeclaration ) )* ruleend ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3218:1: (otherlv_0= 'stateset' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_states_3_0= rulestateDeclaration ) ) rulecoma ( (lv_states_5_0= rulestateDeclaration ) ) ( rulecoma ( (lv_states_7_0= rulestateDeclaration ) ) )* otherlv_8= '}' otherlv_9= '=' ( (otherlv_10= RULE_ID ) ) rulebegin ( (lv_transitions_12_0= ruletransitionDeclaration ) )* ruleend )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3218:1: (otherlv_0= 'stateset' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_states_3_0= rulestateDeclaration ) ) rulecoma ( (lv_states_5_0= rulestateDeclaration ) ) ( rulecoma ( (lv_states_7_0= rulestateDeclaration ) ) )* otherlv_8= '}' otherlv_9= '=' ( (otherlv_10= RULE_ID ) ) rulebegin ( (lv_transitions_12_0= ruletransitionDeclaration ) )* ruleend )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3218:3: otherlv_0= 'stateset' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_states_3_0= rulestateDeclaration ) ) rulecoma ( (lv_states_5_0= rulestateDeclaration ) ) ( rulecoma ( (lv_states_7_0= rulestateDeclaration ) ) )* otherlv_8= '}' otherlv_9= '=' ( (otherlv_10= RULE_ID ) ) rulebegin ( (lv_transitions_12_0= ruletransitionDeclaration ) )* ruleend
            {
            otherlv_0=(Token)match(input,54,FOLLOW_54_in_rulestatesetDeclaration6566); 

                	newLeafNode(otherlv_0, grammarAccess.getStatesetDeclarationAccess().getStatesetKeyword_0());
                
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3222:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3223:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3223:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3224:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulestatesetDeclaration6583); 

            			newLeafNode(lv_name_1_0, grammarAccess.getStatesetDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStatesetDeclarationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,45,FOLLOW_45_in_rulestatesetDeclaration6600); 

                	newLeafNode(otherlv_2, grammarAccess.getStatesetDeclarationAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3244:1: ( (lv_states_3_0= rulestateDeclaration ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3245:1: (lv_states_3_0= rulestateDeclaration )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3245:1: (lv_states_3_0= rulestateDeclaration )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3246:3: lv_states_3_0= rulestateDeclaration
            {
             
            	        newCompositeNode(grammarAccess.getStatesetDeclarationAccess().getStatesStateDeclarationParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_rulestateDeclaration_in_rulestatesetDeclaration6621);
            lv_states_3_0=rulestateDeclaration();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStatesetDeclarationRule());
            	        }
                   		add(
                   			current, 
                   			"states",
                    		lv_states_3_0, 
                    		"stateDeclaration");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

             
                    newCompositeNode(grammarAccess.getStatesetDeclarationAccess().getComaParserRuleCall_4()); 
                
            pushFollow(FOLLOW_rulecoma_in_rulestatesetDeclaration6637);
            rulecoma();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3270:1: ( (lv_states_5_0= rulestateDeclaration ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3271:1: (lv_states_5_0= rulestateDeclaration )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3271:1: (lv_states_5_0= rulestateDeclaration )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3272:3: lv_states_5_0= rulestateDeclaration
            {
             
            	        newCompositeNode(grammarAccess.getStatesetDeclarationAccess().getStatesStateDeclarationParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_rulestateDeclaration_in_rulestatesetDeclaration6657);
            lv_states_5_0=rulestateDeclaration();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStatesetDeclarationRule());
            	        }
                   		add(
                   			current, 
                   			"states",
                    		lv_states_5_0, 
                    		"stateDeclaration");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3288:2: ( rulecoma ( (lv_states_7_0= rulestateDeclaration ) ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==80) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3289:5: rulecoma ( (lv_states_7_0= rulestateDeclaration ) )
            	    {
            	     
            	            newCompositeNode(grammarAccess.getStatesetDeclarationAccess().getComaParserRuleCall_6_0()); 
            	        
            	    pushFollow(FOLLOW_rulecoma_in_rulestatesetDeclaration6674);
            	    rulecoma();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        
            	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3296:1: ( (lv_states_7_0= rulestateDeclaration ) )
            	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3297:1: (lv_states_7_0= rulestateDeclaration )
            	    {
            	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3297:1: (lv_states_7_0= rulestateDeclaration )
            	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3298:3: lv_states_7_0= rulestateDeclaration
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStatesetDeclarationAccess().getStatesStateDeclarationParserRuleCall_6_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulestateDeclaration_in_rulestatesetDeclaration6694);
            	    lv_states_7_0=rulestateDeclaration();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStatesetDeclarationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"states",
            	            		lv_states_7_0, 
            	            		"stateDeclaration");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

            otherlv_8=(Token)match(input,46,FOLLOW_46_in_rulestatesetDeclaration6708); 

                	newLeafNode(otherlv_8, grammarAccess.getStatesetDeclarationAccess().getRightCurlyBracketKeyword_7());
                
            otherlv_9=(Token)match(input,19,FOLLOW_19_in_rulestatesetDeclaration6720); 

                	newLeafNode(otherlv_9, grammarAccess.getStatesetDeclarationAccess().getEqualsSignKeyword_8());
                
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3322:1: ( (otherlv_10= RULE_ID ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3323:1: (otherlv_10= RULE_ID )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3323:1: (otherlv_10= RULE_ID )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3324:3: otherlv_10= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getStatesetDeclarationRule());
            	        }
                    
            otherlv_10=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulestatesetDeclaration6740); 

            		newLeafNode(otherlv_10, grammarAccess.getStatesetDeclarationAccess().getInitStateDeclarationCrossReference_9_0()); 
            	

            }


            }

             
                    newCompositeNode(grammarAccess.getStatesetDeclarationAccess().getBeginParserRuleCall_10()); 
                
            pushFollow(FOLLOW_rulebegin_in_rulestatesetDeclaration6756);
            rulebegin();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3343:1: ( (lv_transitions_12_0= ruletransitionDeclaration ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==55) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3344:1: (lv_transitions_12_0= ruletransitionDeclaration )
            	    {
            	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3344:1: (lv_transitions_12_0= ruletransitionDeclaration )
            	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3345:3: lv_transitions_12_0= ruletransitionDeclaration
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStatesetDeclarationAccess().getTransitionsTransitionDeclarationParserRuleCall_11_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruletransitionDeclaration_in_rulestatesetDeclaration6776);
            	    lv_transitions_12_0=ruletransitionDeclaration();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStatesetDeclarationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"transitions",
            	            		lv_transitions_12_0, 
            	            		"transitionDeclaration");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

             
                    newCompositeNode(grammarAccess.getStatesetDeclarationAccess().getEndParserRuleCall_12()); 
                
            pushFollow(FOLLOW_ruleend_in_rulestatesetDeclaration6793);
            ruleend();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulestatesetDeclaration"


    // $ANTLR start "entryRulestateDeclaration"
    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3377:1: entryRulestateDeclaration returns [EObject current=null] : iv_rulestateDeclaration= rulestateDeclaration EOF ;
    public final EObject entryRulestateDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestateDeclaration = null;


        try {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3378:2: (iv_rulestateDeclaration= rulestateDeclaration EOF )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3379:2: iv_rulestateDeclaration= rulestateDeclaration EOF
            {
             newCompositeNode(grammarAccess.getStateDeclarationRule()); 
            pushFollow(FOLLOW_rulestateDeclaration_in_entryRulestateDeclaration6828);
            iv_rulestateDeclaration=rulestateDeclaration();

            state._fsp--;

             current =iv_rulestateDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRulestateDeclaration6838); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulestateDeclaration"


    // $ANTLR start "rulestateDeclaration"
    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3386:1: rulestateDeclaration returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject rulestateDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3389:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3390:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3390:1: ( (lv_name_0_0= RULE_ID ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3391:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3391:1: (lv_name_0_0= RULE_ID )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3392:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulestateDeclaration6879); 

            			newLeafNode(lv_name_0_0, grammarAccess.getStateDeclarationAccess().getNameIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStateDeclarationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulestateDeclaration"


    // $ANTLR start "entryRuletransitionDeclaration"
    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3416:1: entryRuletransitionDeclaration returns [EObject current=null] : iv_ruletransitionDeclaration= ruletransitionDeclaration EOF ;
    public final EObject entryRuletransitionDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletransitionDeclaration = null;


        try {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3417:2: (iv_ruletransitionDeclaration= ruletransitionDeclaration EOF )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3418:2: iv_ruletransitionDeclaration= ruletransitionDeclaration EOF
            {
             newCompositeNode(grammarAccess.getTransitionDeclarationRule()); 
            pushFollow(FOLLOW_ruletransitionDeclaration_in_entryRuletransitionDeclaration6919);
            iv_ruletransitionDeclaration=ruletransitionDeclaration();

            state._fsp--;

             current =iv_ruletransitionDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuletransitionDeclaration6929); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuletransitionDeclaration"


    // $ANTLR start "ruletransitionDeclaration"
    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3425:1: ruletransitionDeclaration returns [EObject current=null] : (otherlv_0= 'transition' otherlv_1= 'from' ( (lv_from_2_0= RULE_ID ) ) otherlv_3= 'to' ( (lv_to_4_0= RULE_ID ) ) otherlv_5= 'on' ( (lv_evt_6_0= RULE_ID ) ) ( ( (lv_raise_7_0= 'raise' ) ) ( (lv_sig_8_0= RULE_ID ) ) )? ) ;
    public final EObject ruletransitionDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_from_2_0=null;
        Token otherlv_3=null;
        Token lv_to_4_0=null;
        Token otherlv_5=null;
        Token lv_evt_6_0=null;
        Token lv_raise_7_0=null;
        Token lv_sig_8_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3428:28: ( (otherlv_0= 'transition' otherlv_1= 'from' ( (lv_from_2_0= RULE_ID ) ) otherlv_3= 'to' ( (lv_to_4_0= RULE_ID ) ) otherlv_5= 'on' ( (lv_evt_6_0= RULE_ID ) ) ( ( (lv_raise_7_0= 'raise' ) ) ( (lv_sig_8_0= RULE_ID ) ) )? ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3429:1: (otherlv_0= 'transition' otherlv_1= 'from' ( (lv_from_2_0= RULE_ID ) ) otherlv_3= 'to' ( (lv_to_4_0= RULE_ID ) ) otherlv_5= 'on' ( (lv_evt_6_0= RULE_ID ) ) ( ( (lv_raise_7_0= 'raise' ) ) ( (lv_sig_8_0= RULE_ID ) ) )? )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3429:1: (otherlv_0= 'transition' otherlv_1= 'from' ( (lv_from_2_0= RULE_ID ) ) otherlv_3= 'to' ( (lv_to_4_0= RULE_ID ) ) otherlv_5= 'on' ( (lv_evt_6_0= RULE_ID ) ) ( ( (lv_raise_7_0= 'raise' ) ) ( (lv_sig_8_0= RULE_ID ) ) )? )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3429:3: otherlv_0= 'transition' otherlv_1= 'from' ( (lv_from_2_0= RULE_ID ) ) otherlv_3= 'to' ( (lv_to_4_0= RULE_ID ) ) otherlv_5= 'on' ( (lv_evt_6_0= RULE_ID ) ) ( ( (lv_raise_7_0= 'raise' ) ) ( (lv_sig_8_0= RULE_ID ) ) )?
            {
            otherlv_0=(Token)match(input,55,FOLLOW_55_in_ruletransitionDeclaration6966); 

                	newLeafNode(otherlv_0, grammarAccess.getTransitionDeclarationAccess().getTransitionKeyword_0());
                
            otherlv_1=(Token)match(input,56,FOLLOW_56_in_ruletransitionDeclaration6978); 

                	newLeafNode(otherlv_1, grammarAccess.getTransitionDeclarationAccess().getFromKeyword_1());
                
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3437:1: ( (lv_from_2_0= RULE_ID ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3438:1: (lv_from_2_0= RULE_ID )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3438:1: (lv_from_2_0= RULE_ID )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3439:3: lv_from_2_0= RULE_ID
            {
            lv_from_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruletransitionDeclaration6995); 

            			newLeafNode(lv_from_2_0, grammarAccess.getTransitionDeclarationAccess().getFromIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTransitionDeclarationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"from",
                    		lv_from_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,57,FOLLOW_57_in_ruletransitionDeclaration7012); 

                	newLeafNode(otherlv_3, grammarAccess.getTransitionDeclarationAccess().getToKeyword_3());
                
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3459:1: ( (lv_to_4_0= RULE_ID ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3460:1: (lv_to_4_0= RULE_ID )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3460:1: (lv_to_4_0= RULE_ID )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3461:3: lv_to_4_0= RULE_ID
            {
            lv_to_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruletransitionDeclaration7029); 

            			newLeafNode(lv_to_4_0, grammarAccess.getTransitionDeclarationAccess().getToIDTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTransitionDeclarationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"to",
                    		lv_to_4_0, 
                    		"ID");
            	    

            }


            }

            otherlv_5=(Token)match(input,58,FOLLOW_58_in_ruletransitionDeclaration7046); 

                	newLeafNode(otherlv_5, grammarAccess.getTransitionDeclarationAccess().getOnKeyword_5());
                
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3481:1: ( (lv_evt_6_0= RULE_ID ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3482:1: (lv_evt_6_0= RULE_ID )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3482:1: (lv_evt_6_0= RULE_ID )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3483:3: lv_evt_6_0= RULE_ID
            {
            lv_evt_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruletransitionDeclaration7063); 

            			newLeafNode(lv_evt_6_0, grammarAccess.getTransitionDeclarationAccess().getEvtIDTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTransitionDeclarationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"evt",
                    		lv_evt_6_0, 
                    		"ID");
            	    

            }


            }

            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3499:2: ( ( (lv_raise_7_0= 'raise' ) ) ( (lv_sig_8_0= RULE_ID ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==59) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3499:3: ( (lv_raise_7_0= 'raise' ) ) ( (lv_sig_8_0= RULE_ID ) )
                    {
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3499:3: ( (lv_raise_7_0= 'raise' ) )
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3500:1: (lv_raise_7_0= 'raise' )
                    {
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3500:1: (lv_raise_7_0= 'raise' )
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3501:3: lv_raise_7_0= 'raise'
                    {
                    lv_raise_7_0=(Token)match(input,59,FOLLOW_59_in_ruletransitionDeclaration7087); 

                            newLeafNode(lv_raise_7_0, grammarAccess.getTransitionDeclarationAccess().getRaiseRaiseKeyword_7_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTransitionDeclarationRule());
                    	        }
                           		setWithLastConsumed(current, "raise", true, "raise");
                    	    

                    }


                    }

                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3514:2: ( (lv_sig_8_0= RULE_ID ) )
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3515:1: (lv_sig_8_0= RULE_ID )
                    {
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3515:1: (lv_sig_8_0= RULE_ID )
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3516:3: lv_sig_8_0= RULE_ID
                    {
                    lv_sig_8_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruletransitionDeclaration7117); 

                    			newLeafNode(lv_sig_8_0, grammarAccess.getTransitionDeclarationAccess().getSigIDTerminalRuleCall_7_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTransitionDeclarationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"sig",
                            		lv_sig_8_0, 
                            		"ID");
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletransitionDeclaration"


    // $ANTLR start "entryRuleinstanceDeclaration"
    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3540:1: entryRuleinstanceDeclaration returns [EObject current=null] : iv_ruleinstanceDeclaration= ruleinstanceDeclaration EOF ;
    public final EObject entryRuleinstanceDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleinstanceDeclaration = null;


        try {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3541:2: (iv_ruleinstanceDeclaration= ruleinstanceDeclaration EOF )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3542:2: iv_ruleinstanceDeclaration= ruleinstanceDeclaration EOF
            {
             newCompositeNode(grammarAccess.getInstanceDeclarationRule()); 
            pushFollow(FOLLOW_ruleinstanceDeclaration_in_entryRuleinstanceDeclaration7160);
            iv_ruleinstanceDeclaration=ruleinstanceDeclaration();

            state._fsp--;

             current =iv_ruleinstanceDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleinstanceDeclaration7170); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleinstanceDeclaration"


    // $ANTLR start "ruleinstanceDeclaration"
    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3549:1: ruleinstanceDeclaration returns [EObject current=null] : (otherlv_0= 'instance' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[]' )? ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'INHIBIT' )? ) ;
    public final EObject ruleinstanceDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3552:28: ( (otherlv_0= 'instance' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[]' )? ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'INHIBIT' )? ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3553:1: (otherlv_0= 'instance' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[]' )? ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'INHIBIT' )? )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3553:1: (otherlv_0= 'instance' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[]' )? ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'INHIBIT' )? )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3553:3: otherlv_0= 'instance' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[]' )? ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'INHIBIT' )?
            {
            otherlv_0=(Token)match(input,60,FOLLOW_60_in_ruleinstanceDeclaration7207); 

                	newLeafNode(otherlv_0, grammarAccess.getInstanceDeclarationAccess().getInstanceKeyword_0());
                
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3557:1: ( (otherlv_1= RULE_ID ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3558:1: (otherlv_1= RULE_ID )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3558:1: (otherlv_1= RULE_ID )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3559:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getInstanceDeclarationRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleinstanceDeclaration7227); 

            		newLeafNode(otherlv_1, grammarAccess.getInstanceDeclarationAccess().getTypeNamePrototypeDeclarationCrossReference_1_0()); 
            	

            }


            }

            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3570:2: (otherlv_2= '[]' )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==61) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3570:4: otherlv_2= '[]'
                    {
                    otherlv_2=(Token)match(input,61,FOLLOW_61_in_ruleinstanceDeclaration7240); 

                        	newLeafNode(otherlv_2, grammarAccess.getInstanceDeclarationAccess().getLeftSquareBracketRightSquareBracketKeyword_2());
                        

                    }
                    break;

            }

            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3574:3: ( (lv_name_3_0= RULE_ID ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3575:1: (lv_name_3_0= RULE_ID )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3575:1: (lv_name_3_0= RULE_ID )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3576:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleinstanceDeclaration7259); 

            			newLeafNode(lv_name_3_0, grammarAccess.getInstanceDeclarationAccess().getNameIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInstanceDeclarationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"ID");
            	    

            }


            }

            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3592:2: (otherlv_4= 'INHIBIT' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==62) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3592:4: otherlv_4= 'INHIBIT'
                    {
                    otherlv_4=(Token)match(input,62,FOLLOW_62_in_ruleinstanceDeclaration7277); 

                        	newLeafNode(otherlv_4, grammarAccess.getInstanceDeclarationAccess().getINHIBITKeyword_4());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleinstanceDeclaration"


    // $ANTLR start "entryRuleinteractionDeclaration"
    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3604:1: entryRuleinteractionDeclaration returns [EObject current=null] : iv_ruleinteractionDeclaration= ruleinteractionDeclaration EOF ;
    public final EObject entryRuleinteractionDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleinteractionDeclaration = null;


        try {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3605:2: (iv_ruleinteractionDeclaration= ruleinteractionDeclaration EOF )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3606:2: iv_ruleinteractionDeclaration= ruleinteractionDeclaration EOF
            {
             newCompositeNode(grammarAccess.getInteractionDeclarationRule()); 
            pushFollow(FOLLOW_ruleinteractionDeclaration_in_entryRuleinteractionDeclaration7315);
            iv_ruleinteractionDeclaration=ruleinteractionDeclaration();

            state._fsp--;

             current =iv_ruleinteractionDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleinteractionDeclaration7325); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleinteractionDeclaration"


    // $ANTLR start "ruleinteractionDeclaration"
    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3613:1: ruleinteractionDeclaration returns [EObject current=null] : ( ( ( (lv_wwhen_0_0= 'when' ) ) ruleopenPar ( (lv_stateset_2_0= RULE_ID ) ) otherlv_3= '::' ( (lv_wstate_4_0= RULE_ID ) ) ruleclosePar )? ( ( (lv_iif_6_0= 'if' ) ) ruleopenPar ( (lv_event_8_0= RULE_ID ) ) ruleclosePar )? rulebegin ( (lv_icalls_11_0= ruleinteractionCall ) )+ (otherlv_12= 'INHIBIT' )? ruleend ) ;
    public final EObject ruleinteractionDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_wwhen_0_0=null;
        Token lv_stateset_2_0=null;
        Token otherlv_3=null;
        Token lv_wstate_4_0=null;
        Token lv_iif_6_0=null;
        Token lv_event_8_0=null;
        Token otherlv_12=null;
        EObject lv_icalls_11_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3616:28: ( ( ( ( (lv_wwhen_0_0= 'when' ) ) ruleopenPar ( (lv_stateset_2_0= RULE_ID ) ) otherlv_3= '::' ( (lv_wstate_4_0= RULE_ID ) ) ruleclosePar )? ( ( (lv_iif_6_0= 'if' ) ) ruleopenPar ( (lv_event_8_0= RULE_ID ) ) ruleclosePar )? rulebegin ( (lv_icalls_11_0= ruleinteractionCall ) )+ (otherlv_12= 'INHIBIT' )? ruleend ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3617:1: ( ( ( (lv_wwhen_0_0= 'when' ) ) ruleopenPar ( (lv_stateset_2_0= RULE_ID ) ) otherlv_3= '::' ( (lv_wstate_4_0= RULE_ID ) ) ruleclosePar )? ( ( (lv_iif_6_0= 'if' ) ) ruleopenPar ( (lv_event_8_0= RULE_ID ) ) ruleclosePar )? rulebegin ( (lv_icalls_11_0= ruleinteractionCall ) )+ (otherlv_12= 'INHIBIT' )? ruleend )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3617:1: ( ( ( (lv_wwhen_0_0= 'when' ) ) ruleopenPar ( (lv_stateset_2_0= RULE_ID ) ) otherlv_3= '::' ( (lv_wstate_4_0= RULE_ID ) ) ruleclosePar )? ( ( (lv_iif_6_0= 'if' ) ) ruleopenPar ( (lv_event_8_0= RULE_ID ) ) ruleclosePar )? rulebegin ( (lv_icalls_11_0= ruleinteractionCall ) )+ (otherlv_12= 'INHIBIT' )? ruleend )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3617:2: ( ( (lv_wwhen_0_0= 'when' ) ) ruleopenPar ( (lv_stateset_2_0= RULE_ID ) ) otherlv_3= '::' ( (lv_wstate_4_0= RULE_ID ) ) ruleclosePar )? ( ( (lv_iif_6_0= 'if' ) ) ruleopenPar ( (lv_event_8_0= RULE_ID ) ) ruleclosePar )? rulebegin ( (lv_icalls_11_0= ruleinteractionCall ) )+ (otherlv_12= 'INHIBIT' )? ruleend
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3617:2: ( ( (lv_wwhen_0_0= 'when' ) ) ruleopenPar ( (lv_stateset_2_0= RULE_ID ) ) otherlv_3= '::' ( (lv_wstate_4_0= RULE_ID ) ) ruleclosePar )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==63) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3617:3: ( (lv_wwhen_0_0= 'when' ) ) ruleopenPar ( (lv_stateset_2_0= RULE_ID ) ) otherlv_3= '::' ( (lv_wstate_4_0= RULE_ID ) ) ruleclosePar
                    {
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3617:3: ( (lv_wwhen_0_0= 'when' ) )
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3618:1: (lv_wwhen_0_0= 'when' )
                    {
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3618:1: (lv_wwhen_0_0= 'when' )
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3619:3: lv_wwhen_0_0= 'when'
                    {
                    lv_wwhen_0_0=(Token)match(input,63,FOLLOW_63_in_ruleinteractionDeclaration7369); 

                            newLeafNode(lv_wwhen_0_0, grammarAccess.getInteractionDeclarationAccess().getWwhenWhenKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInteractionDeclarationRule());
                    	        }
                           		setWithLastConsumed(current, "wwhen", true, "when");
                    	    

                    }


                    }

                     
                            newCompositeNode(grammarAccess.getInteractionDeclarationAccess().getOpenParParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleopenPar_in_ruleinteractionDeclaration7398);
                    ruleopenPar();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3640:1: ( (lv_stateset_2_0= RULE_ID ) )
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3641:1: (lv_stateset_2_0= RULE_ID )
                    {
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3641:1: (lv_stateset_2_0= RULE_ID )
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3642:3: lv_stateset_2_0= RULE_ID
                    {
                    lv_stateset_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleinteractionDeclaration7414); 

                    			newLeafNode(lv_stateset_2_0, grammarAccess.getInteractionDeclarationAccess().getStatesetIDTerminalRuleCall_0_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInteractionDeclarationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"stateset",
                            		lv_stateset_2_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_3=(Token)match(input,64,FOLLOW_64_in_ruleinteractionDeclaration7431); 

                        	newLeafNode(otherlv_3, grammarAccess.getInteractionDeclarationAccess().getColonColonKeyword_0_3());
                        
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3662:1: ( (lv_wstate_4_0= RULE_ID ) )
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3663:1: (lv_wstate_4_0= RULE_ID )
                    {
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3663:1: (lv_wstate_4_0= RULE_ID )
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3664:3: lv_wstate_4_0= RULE_ID
                    {
                    lv_wstate_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleinteractionDeclaration7448); 

                    			newLeafNode(lv_wstate_4_0, grammarAccess.getInteractionDeclarationAccess().getWstateIDTerminalRuleCall_0_4_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInteractionDeclarationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"wstate",
                            		lv_wstate_4_0, 
                            		"ID");
                    	    

                    }


                    }

                     
                            newCompositeNode(grammarAccess.getInteractionDeclarationAccess().getCloseParParserRuleCall_0_5()); 
                        
                    pushFollow(FOLLOW_ruleclosePar_in_ruleinteractionDeclaration7469);
                    ruleclosePar();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3688:3: ( ( (lv_iif_6_0= 'if' ) ) ruleopenPar ( (lv_event_8_0= RULE_ID ) ) ruleclosePar )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==36) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3688:4: ( (lv_iif_6_0= 'if' ) ) ruleopenPar ( (lv_event_8_0= RULE_ID ) ) ruleclosePar
                    {
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3688:4: ( (lv_iif_6_0= 'if' ) )
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3689:1: (lv_iif_6_0= 'if' )
                    {
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3689:1: (lv_iif_6_0= 'if' )
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3690:3: lv_iif_6_0= 'if'
                    {
                    lv_iif_6_0=(Token)match(input,36,FOLLOW_36_in_ruleinteractionDeclaration7489); 

                            newLeafNode(lv_iif_6_0, grammarAccess.getInteractionDeclarationAccess().getIifIfKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInteractionDeclarationRule());
                    	        }
                           		setWithLastConsumed(current, "iif", true, "if");
                    	    

                    }


                    }

                     
                            newCompositeNode(grammarAccess.getInteractionDeclarationAccess().getOpenParParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruleopenPar_in_ruleinteractionDeclaration7518);
                    ruleopenPar();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3711:1: ( (lv_event_8_0= RULE_ID ) )
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3712:1: (lv_event_8_0= RULE_ID )
                    {
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3712:1: (lv_event_8_0= RULE_ID )
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3713:3: lv_event_8_0= RULE_ID
                    {
                    lv_event_8_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleinteractionDeclaration7534); 

                    			newLeafNode(lv_event_8_0, grammarAccess.getInteractionDeclarationAccess().getEventIDTerminalRuleCall_1_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInteractionDeclarationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"event",
                            		lv_event_8_0, 
                            		"ID");
                    	    

                    }


                    }

                     
                            newCompositeNode(grammarAccess.getInteractionDeclarationAccess().getCloseParParserRuleCall_1_3()); 
                        
                    pushFollow(FOLLOW_ruleclosePar_in_ruleinteractionDeclaration7555);
                    ruleclosePar();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

             
                    newCompositeNode(grammarAccess.getInteractionDeclarationAccess().getBeginParserRuleCall_2()); 
                
            pushFollow(FOLLOW_rulebegin_in_ruleinteractionDeclaration7572);
            rulebegin();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3745:1: ( (lv_icalls_11_0= ruleinteractionCall ) )+
            int cnt58=0;
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==65) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3746:1: (lv_icalls_11_0= ruleinteractionCall )
            	    {
            	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3746:1: (lv_icalls_11_0= ruleinteractionCall )
            	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3747:3: lv_icalls_11_0= ruleinteractionCall
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInteractionDeclarationAccess().getIcallsInteractionCallParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleinteractionCall_in_ruleinteractionDeclaration7592);
            	    lv_icalls_11_0=ruleinteractionCall();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getInteractionDeclarationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"icalls",
            	            		lv_icalls_11_0, 
            	            		"interactionCall");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt58 >= 1 ) break loop58;
                        EarlyExitException eee =
                            new EarlyExitException(58, input);
                        throw eee;
                }
                cnt58++;
            } while (true);

            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3763:3: (otherlv_12= 'INHIBIT' )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==62) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3763:5: otherlv_12= 'INHIBIT'
                    {
                    otherlv_12=(Token)match(input,62,FOLLOW_62_in_ruleinteractionDeclaration7606); 

                        	newLeafNode(otherlv_12, grammarAccess.getInteractionDeclarationAccess().getINHIBITKeyword_4());
                        

                    }
                    break;

            }

             
                    newCompositeNode(grammarAccess.getInteractionDeclarationAccess().getEndParserRuleCall_5()); 
                
            pushFollow(FOLLOW_ruleend_in_ruleinteractionDeclaration7624);
            ruleend();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleinteractionDeclaration"


    // $ANTLR start "entryRuleinteractionCall"
    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3783:1: entryRuleinteractionCall returns [EObject current=null] : iv_ruleinteractionCall= ruleinteractionCall EOF ;
    public final EObject entryRuleinteractionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleinteractionCall = null;


        try {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3784:2: (iv_ruleinteractionCall= ruleinteractionCall EOF )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3785:2: iv_ruleinteractionCall= ruleinteractionCall EOF
            {
             newCompositeNode(grammarAccess.getInteractionCallRule()); 
            pushFollow(FOLLOW_ruleinteractionCall_in_entryRuleinteractionCall7659);
            iv_ruleinteractionCall=ruleinteractionCall();

            state._fsp--;

             current =iv_ruleinteractionCall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleinteractionCall7669); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleinteractionCall"


    // $ANTLR start "ruleinteractionCall"
    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3792:1: ruleinteractionCall returns [EObject current=null] : (otherlv_0= 'interaction' ( (otherlv_1= RULE_ID ) ) ruleopenPar ( ( (lv_arguments_3_0= rulefarg ) ) ( rulecoma ( (lv_arguments_5_0= rulefarg ) ) )* )? ruleclosePar ) ;
    public final EObject ruleinteractionCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_arguments_3_0 = null;

        EObject lv_arguments_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3795:28: ( (otherlv_0= 'interaction' ( (otherlv_1= RULE_ID ) ) ruleopenPar ( ( (lv_arguments_3_0= rulefarg ) ) ( rulecoma ( (lv_arguments_5_0= rulefarg ) ) )* )? ruleclosePar ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3796:1: (otherlv_0= 'interaction' ( (otherlv_1= RULE_ID ) ) ruleopenPar ( ( (lv_arguments_3_0= rulefarg ) ) ( rulecoma ( (lv_arguments_5_0= rulefarg ) ) )* )? ruleclosePar )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3796:1: (otherlv_0= 'interaction' ( (otherlv_1= RULE_ID ) ) ruleopenPar ( ( (lv_arguments_3_0= rulefarg ) ) ( rulecoma ( (lv_arguments_5_0= rulefarg ) ) )* )? ruleclosePar )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3796:3: otherlv_0= 'interaction' ( (otherlv_1= RULE_ID ) ) ruleopenPar ( ( (lv_arguments_3_0= rulefarg ) ) ( rulecoma ( (lv_arguments_5_0= rulefarg ) ) )* )? ruleclosePar
            {
            otherlv_0=(Token)match(input,65,FOLLOW_65_in_ruleinteractionCall7706); 

                	newLeafNode(otherlv_0, grammarAccess.getInteractionCallAccess().getInteractionKeyword_0());
                
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3800:1: ( (otherlv_1= RULE_ID ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3801:1: (otherlv_1= RULE_ID )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3801:1: (otherlv_1= RULE_ID )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3802:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getInteractionCallRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleinteractionCall7726); 

            		newLeafNode(otherlv_1, grammarAccess.getInteractionCallAccess().getFctNameFuncProcCrossReference_1_0()); 
            	

            }


            }

             
                    newCompositeNode(grammarAccess.getInteractionCallAccess().getOpenParParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleopenPar_in_ruleinteractionCall7742);
            ruleopenPar();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3821:1: ( ( (lv_arguments_3_0= rulefarg ) ) ( rulecoma ( (lv_arguments_5_0= rulefarg ) ) )* )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==RULE_ID) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3821:2: ( (lv_arguments_3_0= rulefarg ) ) ( rulecoma ( (lv_arguments_5_0= rulefarg ) ) )*
                    {
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3821:2: ( (lv_arguments_3_0= rulefarg ) )
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3822:1: (lv_arguments_3_0= rulefarg )
                    {
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3822:1: (lv_arguments_3_0= rulefarg )
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3823:3: lv_arguments_3_0= rulefarg
                    {
                     
                    	        newCompositeNode(grammarAccess.getInteractionCallAccess().getArgumentsFargParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulefarg_in_ruleinteractionCall7763);
                    lv_arguments_3_0=rulefarg();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInteractionCallRule());
                    	        }
                           		add(
                           			current, 
                           			"arguments",
                            		lv_arguments_3_0, 
                            		"farg");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3839:2: ( rulecoma ( (lv_arguments_5_0= rulefarg ) ) )*
                    loop60:
                    do {
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( (LA60_0==80) ) {
                            alt60=1;
                        }


                        switch (alt60) {
                    	case 1 :
                    	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3840:5: rulecoma ( (lv_arguments_5_0= rulefarg ) )
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getInteractionCallAccess().getComaParserRuleCall_3_1_0()); 
                    	        
                    	    pushFollow(FOLLOW_rulecoma_in_ruleinteractionCall7780);
                    	    rulecoma();

                    	    state._fsp--;

                    	     
                    	            afterParserOrEnumRuleCall();
                    	        
                    	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3847:1: ( (lv_arguments_5_0= rulefarg ) )
                    	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3848:1: (lv_arguments_5_0= rulefarg )
                    	    {
                    	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3848:1: (lv_arguments_5_0= rulefarg )
                    	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3849:3: lv_arguments_5_0= rulefarg
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getInteractionCallAccess().getArgumentsFargParserRuleCall_3_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_rulefarg_in_ruleinteractionCall7800);
                    	    lv_arguments_5_0=rulefarg();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getInteractionCallRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"arguments",
                    	            		lv_arguments_5_0, 
                    	            		"farg");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop60;
                        }
                    } while (true);


                    }
                    break;

            }

             
                    newCompositeNode(grammarAccess.getInteractionCallAccess().getCloseParParserRuleCall_4()); 
                
            pushFollow(FOLLOW_ruleclosePar_in_ruleinteractionCall7820);
            ruleclosePar();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleinteractionCall"


    // $ANTLR start "entryRulefarg"
    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3881:1: entryRulefarg returns [EObject current=null] : iv_rulefarg= rulefarg EOF ;
    public final EObject entryRulefarg() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefarg = null;


        try {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3882:2: (iv_rulefarg= rulefarg EOF )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3883:2: iv_rulefarg= rulefarg EOF
            {
             newCompositeNode(grammarAccess.getFargRule()); 
            pushFollow(FOLLOW_rulefarg_in_entryRulefarg7855);
            iv_rulefarg=rulefarg();

            state._fsp--;

             current =iv_rulefarg; 
            match(input,EOF,FOLLOW_EOF_in_entryRulefarg7865); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulefarg"


    // $ANTLR start "rulefarg"
    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3890:1: rulefarg returns [EObject current=null] : ( (lv_varName_0_0= RULE_ID ) ) ;
    public final EObject rulefarg() throws RecognitionException {
        EObject current = null;

        Token lv_varName_0_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3893:28: ( ( (lv_varName_0_0= RULE_ID ) ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3894:1: ( (lv_varName_0_0= RULE_ID ) )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3894:1: ( (lv_varName_0_0= RULE_ID ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3895:1: (lv_varName_0_0= RULE_ID )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3895:1: (lv_varName_0_0= RULE_ID )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3896:3: lv_varName_0_0= RULE_ID
            {
            lv_varName_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulefarg7906); 

            			newLeafNode(lv_varName_0_0, grammarAccess.getFargAccess().getVarNameIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFargRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"varName",
                    		lv_varName_0_0, 
                    		"ID");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulefarg"


    // $ANTLR start "entryRulereferenceDeclaration"
    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3920:1: entryRulereferenceDeclaration returns [EObject current=null] : iv_rulereferenceDeclaration= rulereferenceDeclaration EOF ;
    public final EObject entryRulereferenceDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulereferenceDeclaration = null;


        try {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3921:2: (iv_rulereferenceDeclaration= rulereferenceDeclaration EOF )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3922:2: iv_rulereferenceDeclaration= rulereferenceDeclaration EOF
            {
             newCompositeNode(grammarAccess.getReferenceDeclarationRule()); 
            pushFollow(FOLLOW_rulereferenceDeclaration_in_entryRulereferenceDeclaration7946);
            iv_rulereferenceDeclaration=rulereferenceDeclaration();

            state._fsp--;

             current =iv_rulereferenceDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRulereferenceDeclaration7956); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulereferenceDeclaration"


    // $ANTLR start "rulereferenceDeclaration"
    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3929:1: rulereferenceDeclaration returns [EObject current=null] : (otherlv_0= 'reference' otherlv_1= '<' ( (otherlv_2= RULE_ID ) ) otherlv_3= '>' ( (lv_upway_4_0= ruleat ) )? ( (lv_name_5_0= rulequalifiedName ) ) (otherlv_6= 'as' ( (lv_alias_7_0= RULE_ID ) ) )? ) ;
    public final EObject rulereferenceDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token lv_alias_7_0=null;
        AntlrDatatypeRuleToken lv_upway_4_0 = null;

        EObject lv_name_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3932:28: ( (otherlv_0= 'reference' otherlv_1= '<' ( (otherlv_2= RULE_ID ) ) otherlv_3= '>' ( (lv_upway_4_0= ruleat ) )? ( (lv_name_5_0= rulequalifiedName ) ) (otherlv_6= 'as' ( (lv_alias_7_0= RULE_ID ) ) )? ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3933:1: (otherlv_0= 'reference' otherlv_1= '<' ( (otherlv_2= RULE_ID ) ) otherlv_3= '>' ( (lv_upway_4_0= ruleat ) )? ( (lv_name_5_0= rulequalifiedName ) ) (otherlv_6= 'as' ( (lv_alias_7_0= RULE_ID ) ) )? )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3933:1: (otherlv_0= 'reference' otherlv_1= '<' ( (otherlv_2= RULE_ID ) ) otherlv_3= '>' ( (lv_upway_4_0= ruleat ) )? ( (lv_name_5_0= rulequalifiedName ) ) (otherlv_6= 'as' ( (lv_alias_7_0= RULE_ID ) ) )? )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3933:3: otherlv_0= 'reference' otherlv_1= '<' ( (otherlv_2= RULE_ID ) ) otherlv_3= '>' ( (lv_upway_4_0= ruleat ) )? ( (lv_name_5_0= rulequalifiedName ) ) (otherlv_6= 'as' ( (lv_alias_7_0= RULE_ID ) ) )?
            {
            otherlv_0=(Token)match(input,66,FOLLOW_66_in_rulereferenceDeclaration7993); 

                	newLeafNode(otherlv_0, grammarAccess.getReferenceDeclarationAccess().getReferenceKeyword_0());
                
            otherlv_1=(Token)match(input,22,FOLLOW_22_in_rulereferenceDeclaration8005); 

                	newLeafNode(otherlv_1, grammarAccess.getReferenceDeclarationAccess().getLessThanSignKeyword_1());
                
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3941:1: ( (otherlv_2= RULE_ID ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3942:1: (otherlv_2= RULE_ID )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3942:1: (otherlv_2= RULE_ID )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3943:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getReferenceDeclarationRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulereferenceDeclaration8025); 

            		newLeafNode(otherlv_2, grammarAccess.getReferenceDeclarationAccess().getTypeNameDataTypeCrossReference_2_0()); 
            	

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_23_in_rulereferenceDeclaration8037); 

                	newLeafNode(otherlv_3, grammarAccess.getReferenceDeclarationAccess().getGreaterThanSignKeyword_3());
                
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3958:1: ( (lv_upway_4_0= ruleat ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==78) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3959:1: (lv_upway_4_0= ruleat )
                    {
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3959:1: (lv_upway_4_0= ruleat )
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3960:3: lv_upway_4_0= ruleat
                    {
                     
                    	        newCompositeNode(grammarAccess.getReferenceDeclarationAccess().getUpwayAtParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleat_in_rulereferenceDeclaration8058);
                    lv_upway_4_0=ruleat();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getReferenceDeclarationRule());
                    	        }
                           		set(
                           			current, 
                           			"upway",
                            		true, 
                            		"at");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3976:3: ( (lv_name_5_0= rulequalifiedName ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3977:1: (lv_name_5_0= rulequalifiedName )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3977:1: (lv_name_5_0= rulequalifiedName )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3978:3: lv_name_5_0= rulequalifiedName
            {
             
            	        newCompositeNode(grammarAccess.getReferenceDeclarationAccess().getNameQualifiedNameParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_rulequalifiedName_in_rulereferenceDeclaration8080);
            lv_name_5_0=rulequalifiedName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getReferenceDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_5_0, 
                    		"qualifiedName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3994:2: (otherlv_6= 'as' ( (lv_alias_7_0= RULE_ID ) ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==67) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3994:4: otherlv_6= 'as' ( (lv_alias_7_0= RULE_ID ) )
                    {
                    otherlv_6=(Token)match(input,67,FOLLOW_67_in_rulereferenceDeclaration8093); 

                        	newLeafNode(otherlv_6, grammarAccess.getReferenceDeclarationAccess().getAsKeyword_6_0());
                        
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3998:1: ( (lv_alias_7_0= RULE_ID ) )
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3999:1: (lv_alias_7_0= RULE_ID )
                    {
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:3999:1: (lv_alias_7_0= RULE_ID )
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4000:3: lv_alias_7_0= RULE_ID
                    {
                    lv_alias_7_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulereferenceDeclaration8110); 

                    			newLeafNode(lv_alias_7_0, grammarAccess.getReferenceDeclarationAccess().getAliasIDTerminalRuleCall_6_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getReferenceDeclarationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"alias",
                            		lv_alias_7_0, 
                            		"ID");
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulereferenceDeclaration"


    // $ANTLR start "entryRulequalifiedName"
    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4024:1: entryRulequalifiedName returns [EObject current=null] : iv_rulequalifiedName= rulequalifiedName EOF ;
    public final EObject entryRulequalifiedName() throws RecognitionException {
        EObject current = null;

        EObject iv_rulequalifiedName = null;


        try {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4025:2: (iv_rulequalifiedName= rulequalifiedName EOF )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4026:2: iv_rulequalifiedName= rulequalifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_rulequalifiedName_in_entryRulequalifiedName8153);
            iv_rulequalifiedName=rulequalifiedName();

            state._fsp--;

             current =iv_rulequalifiedName; 
            match(input,EOF,FOLLOW_EOF_in_entryRulequalifiedName8163); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulequalifiedName"


    // $ANTLR start "rulequalifiedName"
    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4033:1: rulequalifiedName returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( ruledot ( (lv_name_2_0= RULE_ID ) ) )* ) ;
    public final EObject rulequalifiedName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_name_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4036:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( ruledot ( (lv_name_2_0= RULE_ID ) ) )* ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4037:1: ( ( (lv_name_0_0= RULE_ID ) ) ( ruledot ( (lv_name_2_0= RULE_ID ) ) )* )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4037:1: ( ( (lv_name_0_0= RULE_ID ) ) ( ruledot ( (lv_name_2_0= RULE_ID ) ) )* )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4037:2: ( (lv_name_0_0= RULE_ID ) ) ( ruledot ( (lv_name_2_0= RULE_ID ) ) )*
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4037:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4038:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4038:1: (lv_name_0_0= RULE_ID )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4039:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulequalifiedName8205); 

            			newLeafNode(lv_name_0_0, grammarAccess.getQualifiedNameAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getQualifiedNameRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4055:2: ( ruledot ( (lv_name_2_0= RULE_ID ) ) )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==79) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4056:5: ruledot ( (lv_name_2_0= RULE_ID ) )
            	    {
            	     
            	            newCompositeNode(grammarAccess.getQualifiedNameAccess().getDotParserRuleCall_1_0()); 
            	        
            	    pushFollow(FOLLOW_ruledot_in_rulequalifiedName8227);
            	    ruledot();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        
            	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4063:1: ( (lv_name_2_0= RULE_ID ) )
            	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4064:1: (lv_name_2_0= RULE_ID )
            	    {
            	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4064:1: (lv_name_2_0= RULE_ID )
            	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4065:3: lv_name_2_0= RULE_ID
            	    {
            	    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulequalifiedName8243); 

            	    			newLeafNode(lv_name_2_0, grammarAccess.getQualifiedNameAccess().getNameIDTerminalRuleCall_1_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getQualifiedNameRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"name",
            	            		lv_name_2_0, 
            	            		"ID");
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulequalifiedName"


    // $ANTLR start "entryRulewrapperDeclaration"
    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4089:1: entryRulewrapperDeclaration returns [EObject current=null] : iv_rulewrapperDeclaration= rulewrapperDeclaration EOF ;
    public final EObject entryRulewrapperDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulewrapperDeclaration = null;


        try {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4090:2: (iv_rulewrapperDeclaration= rulewrapperDeclaration EOF )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4091:2: iv_rulewrapperDeclaration= rulewrapperDeclaration EOF
            {
             newCompositeNode(grammarAccess.getWrapperDeclarationRule()); 
            pushFollow(FOLLOW_rulewrapperDeclaration_in_entryRulewrapperDeclaration8286);
            iv_rulewrapperDeclaration=rulewrapperDeclaration();

            state._fsp--;

             current =iv_rulewrapperDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRulewrapperDeclaration8296); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulewrapperDeclaration"


    // $ANTLR start "rulewrapperDeclaration"
    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4098:1: rulewrapperDeclaration returns [EObject current=null] : (otherlv_0= 'wrapper' ( (lv_name_1_0= RULE_ID ) ) rulebegin otherlv_3= 'link-library' rulebeginAcc ( (lv_link_5_0= RULE_STRING ) ) ruleendAcc otherlv_7= 'implements-functions' rulebeginAcc ( ( (lv_functions_9_0= RULE_ID ) ) ( rulecoma ( (lv_functions_11_0= RULE_ID ) ) )* )? ruleendAcc otherlv_13= 'external-objects' rulebeginAcc ( ( (lv_objects_15_0= RULE_ID ) ) ( rulecoma ( (lv_objects_17_0= RULE_ID ) ) )* )? ruleendAcc otherlv_19= 'external-libraries' rulebeginAcc ( ( (lv_libraries_21_0= RULE_STRING ) ) ( rulecoma ( (lv_libraries_23_0= RULE_STRING ) ) )* )? ruleendAcc otherlv_25= 'test-apps' rulebeginAcc ( ( (lv_tests_27_0= RULE_ID ) ) ( rulecoma ( (lv_tests_29_0= RULE_ID ) ) )* )? ruleendAcc ruleend ) ;
    public final EObject rulewrapperDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token lv_link_5_0=null;
        Token otherlv_7=null;
        Token lv_functions_9_0=null;
        Token lv_functions_11_0=null;
        Token otherlv_13=null;
        Token lv_objects_15_0=null;
        Token lv_objects_17_0=null;
        Token otherlv_19=null;
        Token lv_libraries_21_0=null;
        Token lv_libraries_23_0=null;
        Token otherlv_25=null;
        Token lv_tests_27_0=null;
        Token lv_tests_29_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4101:28: ( (otherlv_0= 'wrapper' ( (lv_name_1_0= RULE_ID ) ) rulebegin otherlv_3= 'link-library' rulebeginAcc ( (lv_link_5_0= RULE_STRING ) ) ruleendAcc otherlv_7= 'implements-functions' rulebeginAcc ( ( (lv_functions_9_0= RULE_ID ) ) ( rulecoma ( (lv_functions_11_0= RULE_ID ) ) )* )? ruleendAcc otherlv_13= 'external-objects' rulebeginAcc ( ( (lv_objects_15_0= RULE_ID ) ) ( rulecoma ( (lv_objects_17_0= RULE_ID ) ) )* )? ruleendAcc otherlv_19= 'external-libraries' rulebeginAcc ( ( (lv_libraries_21_0= RULE_STRING ) ) ( rulecoma ( (lv_libraries_23_0= RULE_STRING ) ) )* )? ruleendAcc otherlv_25= 'test-apps' rulebeginAcc ( ( (lv_tests_27_0= RULE_ID ) ) ( rulecoma ( (lv_tests_29_0= RULE_ID ) ) )* )? ruleendAcc ruleend ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4102:1: (otherlv_0= 'wrapper' ( (lv_name_1_0= RULE_ID ) ) rulebegin otherlv_3= 'link-library' rulebeginAcc ( (lv_link_5_0= RULE_STRING ) ) ruleendAcc otherlv_7= 'implements-functions' rulebeginAcc ( ( (lv_functions_9_0= RULE_ID ) ) ( rulecoma ( (lv_functions_11_0= RULE_ID ) ) )* )? ruleendAcc otherlv_13= 'external-objects' rulebeginAcc ( ( (lv_objects_15_0= RULE_ID ) ) ( rulecoma ( (lv_objects_17_0= RULE_ID ) ) )* )? ruleendAcc otherlv_19= 'external-libraries' rulebeginAcc ( ( (lv_libraries_21_0= RULE_STRING ) ) ( rulecoma ( (lv_libraries_23_0= RULE_STRING ) ) )* )? ruleendAcc otherlv_25= 'test-apps' rulebeginAcc ( ( (lv_tests_27_0= RULE_ID ) ) ( rulecoma ( (lv_tests_29_0= RULE_ID ) ) )* )? ruleendAcc ruleend )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4102:1: (otherlv_0= 'wrapper' ( (lv_name_1_0= RULE_ID ) ) rulebegin otherlv_3= 'link-library' rulebeginAcc ( (lv_link_5_0= RULE_STRING ) ) ruleendAcc otherlv_7= 'implements-functions' rulebeginAcc ( ( (lv_functions_9_0= RULE_ID ) ) ( rulecoma ( (lv_functions_11_0= RULE_ID ) ) )* )? ruleendAcc otherlv_13= 'external-objects' rulebeginAcc ( ( (lv_objects_15_0= RULE_ID ) ) ( rulecoma ( (lv_objects_17_0= RULE_ID ) ) )* )? ruleendAcc otherlv_19= 'external-libraries' rulebeginAcc ( ( (lv_libraries_21_0= RULE_STRING ) ) ( rulecoma ( (lv_libraries_23_0= RULE_STRING ) ) )* )? ruleendAcc otherlv_25= 'test-apps' rulebeginAcc ( ( (lv_tests_27_0= RULE_ID ) ) ( rulecoma ( (lv_tests_29_0= RULE_ID ) ) )* )? ruleendAcc ruleend )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4102:3: otherlv_0= 'wrapper' ( (lv_name_1_0= RULE_ID ) ) rulebegin otherlv_3= 'link-library' rulebeginAcc ( (lv_link_5_0= RULE_STRING ) ) ruleendAcc otherlv_7= 'implements-functions' rulebeginAcc ( ( (lv_functions_9_0= RULE_ID ) ) ( rulecoma ( (lv_functions_11_0= RULE_ID ) ) )* )? ruleendAcc otherlv_13= 'external-objects' rulebeginAcc ( ( (lv_objects_15_0= RULE_ID ) ) ( rulecoma ( (lv_objects_17_0= RULE_ID ) ) )* )? ruleendAcc otherlv_19= 'external-libraries' rulebeginAcc ( ( (lv_libraries_21_0= RULE_STRING ) ) ( rulecoma ( (lv_libraries_23_0= RULE_STRING ) ) )* )? ruleendAcc otherlv_25= 'test-apps' rulebeginAcc ( ( (lv_tests_27_0= RULE_ID ) ) ( rulecoma ( (lv_tests_29_0= RULE_ID ) ) )* )? ruleendAcc ruleend
            {
            otherlv_0=(Token)match(input,68,FOLLOW_68_in_rulewrapperDeclaration8333); 

                	newLeafNode(otherlv_0, grammarAccess.getWrapperDeclarationAccess().getWrapperKeyword_0());
                
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4106:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4107:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4107:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4108:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulewrapperDeclaration8350); 

            			newLeafNode(lv_name_1_0, grammarAccess.getWrapperDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getWrapperDeclarationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

             
                    newCompositeNode(grammarAccess.getWrapperDeclarationAccess().getBeginParserRuleCall_2()); 
                
            pushFollow(FOLLOW_rulebegin_in_rulewrapperDeclaration8371);
            rulebegin();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            otherlv_3=(Token)match(input,69,FOLLOW_69_in_rulewrapperDeclaration8382); 

                	newLeafNode(otherlv_3, grammarAccess.getWrapperDeclarationAccess().getLinkLibraryKeyword_3());
                
             
                    newCompositeNode(grammarAccess.getWrapperDeclarationAccess().getBeginAccParserRuleCall_4()); 
                
            pushFollow(FOLLOW_rulebeginAcc_in_rulewrapperDeclaration8398);
            rulebeginAcc();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4144:1: ( (lv_link_5_0= RULE_STRING ) )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4145:1: (lv_link_5_0= RULE_STRING )
            {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4145:1: (lv_link_5_0= RULE_STRING )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4146:3: lv_link_5_0= RULE_STRING
            {
            lv_link_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulewrapperDeclaration8414); 

            			newLeafNode(lv_link_5_0, grammarAccess.getWrapperDeclarationAccess().getLinkSTRINGTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getWrapperDeclarationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"link",
                    		lv_link_5_0, 
                    		"STRING");
            	    

            }


            }

             
                    newCompositeNode(grammarAccess.getWrapperDeclarationAccess().getEndAccParserRuleCall_6()); 
                
            pushFollow(FOLLOW_ruleendAcc_in_rulewrapperDeclaration8435);
            ruleendAcc();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            otherlv_7=(Token)match(input,70,FOLLOW_70_in_rulewrapperDeclaration8446); 

                	newLeafNode(otherlv_7, grammarAccess.getWrapperDeclarationAccess().getImplementsFunctionsKeyword_7());
                
             
                    newCompositeNode(grammarAccess.getWrapperDeclarationAccess().getBeginAccParserRuleCall_8()); 
                
            pushFollow(FOLLOW_rulebeginAcc_in_rulewrapperDeclaration8462);
            rulebeginAcc();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4182:1: ( ( (lv_functions_9_0= RULE_ID ) ) ( rulecoma ( (lv_functions_11_0= RULE_ID ) ) )* )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==RULE_ID) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4182:2: ( (lv_functions_9_0= RULE_ID ) ) ( rulecoma ( (lv_functions_11_0= RULE_ID ) ) )*
                    {
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4182:2: ( (lv_functions_9_0= RULE_ID ) )
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4183:1: (lv_functions_9_0= RULE_ID )
                    {
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4183:1: (lv_functions_9_0= RULE_ID )
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4184:3: lv_functions_9_0= RULE_ID
                    {
                    lv_functions_9_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulewrapperDeclaration8479); 

                    			newLeafNode(lv_functions_9_0, grammarAccess.getWrapperDeclarationAccess().getFunctionsIDTerminalRuleCall_9_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWrapperDeclarationRule());
                    	        }
                           		addWithLastConsumed(
                           			current, 
                           			"functions",
                            		lv_functions_9_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4200:2: ( rulecoma ( (lv_functions_11_0= RULE_ID ) ) )*
                    loop65:
                    do {
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( (LA65_0==80) ) {
                            alt65=1;
                        }


                        switch (alt65) {
                    	case 1 :
                    	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4201:5: rulecoma ( (lv_functions_11_0= RULE_ID ) )
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getWrapperDeclarationAccess().getComaParserRuleCall_9_1_0()); 
                    	        
                    	    pushFollow(FOLLOW_rulecoma_in_rulewrapperDeclaration8501);
                    	    rulecoma();

                    	    state._fsp--;

                    	     
                    	            afterParserOrEnumRuleCall();
                    	        
                    	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4208:1: ( (lv_functions_11_0= RULE_ID ) )
                    	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4209:1: (lv_functions_11_0= RULE_ID )
                    	    {
                    	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4209:1: (lv_functions_11_0= RULE_ID )
                    	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4210:3: lv_functions_11_0= RULE_ID
                    	    {
                    	    lv_functions_11_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulewrapperDeclaration8517); 

                    	    			newLeafNode(lv_functions_11_0, grammarAccess.getWrapperDeclarationAccess().getFunctionsIDTerminalRuleCall_9_1_1_0()); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getWrapperDeclarationRule());
                    	    	        }
                    	           		addWithLastConsumed(
                    	           			current, 
                    	           			"functions",
                    	            		lv_functions_11_0, 
                    	            		"ID");
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop65;
                        }
                    } while (true);


                    }
                    break;

            }

             
                    newCompositeNode(grammarAccess.getWrapperDeclarationAccess().getEndAccParserRuleCall_10()); 
                
            pushFollow(FOLLOW_ruleendAcc_in_rulewrapperDeclaration8542);
            ruleendAcc();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            otherlv_13=(Token)match(input,71,FOLLOW_71_in_rulewrapperDeclaration8553); 

                	newLeafNode(otherlv_13, grammarAccess.getWrapperDeclarationAccess().getExternalObjectsKeyword_11());
                
             
                    newCompositeNode(grammarAccess.getWrapperDeclarationAccess().getBeginAccParserRuleCall_12()); 
                
            pushFollow(FOLLOW_rulebeginAcc_in_rulewrapperDeclaration8569);
            rulebeginAcc();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4246:1: ( ( (lv_objects_15_0= RULE_ID ) ) ( rulecoma ( (lv_objects_17_0= RULE_ID ) ) )* )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==RULE_ID) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4246:2: ( (lv_objects_15_0= RULE_ID ) ) ( rulecoma ( (lv_objects_17_0= RULE_ID ) ) )*
                    {
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4246:2: ( (lv_objects_15_0= RULE_ID ) )
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4247:1: (lv_objects_15_0= RULE_ID )
                    {
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4247:1: (lv_objects_15_0= RULE_ID )
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4248:3: lv_objects_15_0= RULE_ID
                    {
                    lv_objects_15_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulewrapperDeclaration8586); 

                    			newLeafNode(lv_objects_15_0, grammarAccess.getWrapperDeclarationAccess().getObjectsIDTerminalRuleCall_13_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWrapperDeclarationRule());
                    	        }
                           		addWithLastConsumed(
                           			current, 
                           			"objects",
                            		lv_objects_15_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4264:2: ( rulecoma ( (lv_objects_17_0= RULE_ID ) ) )*
                    loop67:
                    do {
                        int alt67=2;
                        int LA67_0 = input.LA(1);

                        if ( (LA67_0==80) ) {
                            alt67=1;
                        }


                        switch (alt67) {
                    	case 1 :
                    	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4265:5: rulecoma ( (lv_objects_17_0= RULE_ID ) )
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getWrapperDeclarationAccess().getComaParserRuleCall_13_1_0()); 
                    	        
                    	    pushFollow(FOLLOW_rulecoma_in_rulewrapperDeclaration8608);
                    	    rulecoma();

                    	    state._fsp--;

                    	     
                    	            afterParserOrEnumRuleCall();
                    	        
                    	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4272:1: ( (lv_objects_17_0= RULE_ID ) )
                    	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4273:1: (lv_objects_17_0= RULE_ID )
                    	    {
                    	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4273:1: (lv_objects_17_0= RULE_ID )
                    	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4274:3: lv_objects_17_0= RULE_ID
                    	    {
                    	    lv_objects_17_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulewrapperDeclaration8624); 

                    	    			newLeafNode(lv_objects_17_0, grammarAccess.getWrapperDeclarationAccess().getObjectsIDTerminalRuleCall_13_1_1_0()); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getWrapperDeclarationRule());
                    	    	        }
                    	           		addWithLastConsumed(
                    	           			current, 
                    	           			"objects",
                    	            		lv_objects_17_0, 
                    	            		"ID");
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop67;
                        }
                    } while (true);


                    }
                    break;

            }

             
                    newCompositeNode(grammarAccess.getWrapperDeclarationAccess().getEndAccParserRuleCall_14()); 
                
            pushFollow(FOLLOW_ruleendAcc_in_rulewrapperDeclaration8649);
            ruleendAcc();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            otherlv_19=(Token)match(input,72,FOLLOW_72_in_rulewrapperDeclaration8660); 

                	newLeafNode(otherlv_19, grammarAccess.getWrapperDeclarationAccess().getExternalLibrariesKeyword_15());
                
             
                    newCompositeNode(grammarAccess.getWrapperDeclarationAccess().getBeginAccParserRuleCall_16()); 
                
            pushFollow(FOLLOW_rulebeginAcc_in_rulewrapperDeclaration8676);
            rulebeginAcc();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4310:1: ( ( (lv_libraries_21_0= RULE_STRING ) ) ( rulecoma ( (lv_libraries_23_0= RULE_STRING ) ) )* )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==RULE_STRING) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4310:2: ( (lv_libraries_21_0= RULE_STRING ) ) ( rulecoma ( (lv_libraries_23_0= RULE_STRING ) ) )*
                    {
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4310:2: ( (lv_libraries_21_0= RULE_STRING ) )
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4311:1: (lv_libraries_21_0= RULE_STRING )
                    {
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4311:1: (lv_libraries_21_0= RULE_STRING )
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4312:3: lv_libraries_21_0= RULE_STRING
                    {
                    lv_libraries_21_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulewrapperDeclaration8693); 

                    			newLeafNode(lv_libraries_21_0, grammarAccess.getWrapperDeclarationAccess().getLibrariesSTRINGTerminalRuleCall_17_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWrapperDeclarationRule());
                    	        }
                           		addWithLastConsumed(
                           			current, 
                           			"libraries",
                            		lv_libraries_21_0, 
                            		"STRING");
                    	    

                    }


                    }

                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4328:2: ( rulecoma ( (lv_libraries_23_0= RULE_STRING ) ) )*
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( (LA69_0==80) ) {
                            alt69=1;
                        }


                        switch (alt69) {
                    	case 1 :
                    	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4329:5: rulecoma ( (lv_libraries_23_0= RULE_STRING ) )
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getWrapperDeclarationAccess().getComaParserRuleCall_17_1_0()); 
                    	        
                    	    pushFollow(FOLLOW_rulecoma_in_rulewrapperDeclaration8715);
                    	    rulecoma();

                    	    state._fsp--;

                    	     
                    	            afterParserOrEnumRuleCall();
                    	        
                    	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4336:1: ( (lv_libraries_23_0= RULE_STRING ) )
                    	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4337:1: (lv_libraries_23_0= RULE_STRING )
                    	    {
                    	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4337:1: (lv_libraries_23_0= RULE_STRING )
                    	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4338:3: lv_libraries_23_0= RULE_STRING
                    	    {
                    	    lv_libraries_23_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulewrapperDeclaration8731); 

                    	    			newLeafNode(lv_libraries_23_0, grammarAccess.getWrapperDeclarationAccess().getLibrariesSTRINGTerminalRuleCall_17_1_1_0()); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getWrapperDeclarationRule());
                    	    	        }
                    	           		addWithLastConsumed(
                    	           			current, 
                    	           			"libraries",
                    	            		lv_libraries_23_0, 
                    	            		"STRING");
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop69;
                        }
                    } while (true);


                    }
                    break;

            }

             
                    newCompositeNode(grammarAccess.getWrapperDeclarationAccess().getEndAccParserRuleCall_18()); 
                
            pushFollow(FOLLOW_ruleendAcc_in_rulewrapperDeclaration8756);
            ruleendAcc();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            otherlv_25=(Token)match(input,73,FOLLOW_73_in_rulewrapperDeclaration8767); 

                	newLeafNode(otherlv_25, grammarAccess.getWrapperDeclarationAccess().getTestAppsKeyword_19());
                
             
                    newCompositeNode(grammarAccess.getWrapperDeclarationAccess().getBeginAccParserRuleCall_20()); 
                
            pushFollow(FOLLOW_rulebeginAcc_in_rulewrapperDeclaration8783);
            rulebeginAcc();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4374:1: ( ( (lv_tests_27_0= RULE_ID ) ) ( rulecoma ( (lv_tests_29_0= RULE_ID ) ) )* )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==RULE_ID) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4374:2: ( (lv_tests_27_0= RULE_ID ) ) ( rulecoma ( (lv_tests_29_0= RULE_ID ) ) )*
                    {
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4374:2: ( (lv_tests_27_0= RULE_ID ) )
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4375:1: (lv_tests_27_0= RULE_ID )
                    {
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4375:1: (lv_tests_27_0= RULE_ID )
                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4376:3: lv_tests_27_0= RULE_ID
                    {
                    lv_tests_27_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulewrapperDeclaration8800); 

                    			newLeafNode(lv_tests_27_0, grammarAccess.getWrapperDeclarationAccess().getTestsIDTerminalRuleCall_21_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWrapperDeclarationRule());
                    	        }
                           		addWithLastConsumed(
                           			current, 
                           			"tests",
                            		lv_tests_27_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4392:2: ( rulecoma ( (lv_tests_29_0= RULE_ID ) ) )*
                    loop71:
                    do {
                        int alt71=2;
                        int LA71_0 = input.LA(1);

                        if ( (LA71_0==80) ) {
                            alt71=1;
                        }


                        switch (alt71) {
                    	case 1 :
                    	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4393:5: rulecoma ( (lv_tests_29_0= RULE_ID ) )
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getWrapperDeclarationAccess().getComaParserRuleCall_21_1_0()); 
                    	        
                    	    pushFollow(FOLLOW_rulecoma_in_rulewrapperDeclaration8822);
                    	    rulecoma();

                    	    state._fsp--;

                    	     
                    	            afterParserOrEnumRuleCall();
                    	        
                    	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4400:1: ( (lv_tests_29_0= RULE_ID ) )
                    	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4401:1: (lv_tests_29_0= RULE_ID )
                    	    {
                    	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4401:1: (lv_tests_29_0= RULE_ID )
                    	    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4402:3: lv_tests_29_0= RULE_ID
                    	    {
                    	    lv_tests_29_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulewrapperDeclaration8838); 

                    	    			newLeafNode(lv_tests_29_0, grammarAccess.getWrapperDeclarationAccess().getTestsIDTerminalRuleCall_21_1_1_0()); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getWrapperDeclarationRule());
                    	    	        }
                    	           		addWithLastConsumed(
                    	           			current, 
                    	           			"tests",
                    	            		lv_tests_29_0, 
                    	            		"ID");
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop71;
                        }
                    } while (true);


                    }
                    break;

            }

             
                    newCompositeNode(grammarAccess.getWrapperDeclarationAccess().getEndAccParserRuleCall_22()); 
                
            pushFollow(FOLLOW_ruleendAcc_in_rulewrapperDeclaration8863);
            ruleendAcc();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
             
                    newCompositeNode(grammarAccess.getWrapperDeclarationAccess().getEndParserRuleCall_23()); 
                
            pushFollow(FOLLOW_ruleend_in_rulewrapperDeclaration8878);
            ruleend();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulewrapperDeclaration"


    // $ANTLR start "entryRulebeginAcc"
    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4442:1: entryRulebeginAcc returns [String current=null] : iv_rulebeginAcc= rulebeginAcc EOF ;
    public final String entryRulebeginAcc() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulebeginAcc = null;


        try {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4443:2: (iv_rulebeginAcc= rulebeginAcc EOF )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4444:2: iv_rulebeginAcc= rulebeginAcc EOF
            {
             newCompositeNode(grammarAccess.getBeginAccRule()); 
            pushFollow(FOLLOW_rulebeginAcc_in_entryRulebeginAcc8914);
            iv_rulebeginAcc=rulebeginAcc();

            state._fsp--;

             current =iv_rulebeginAcc.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulebeginAcc8925); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulebeginAcc"


    // $ANTLR start "rulebeginAcc"
    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4451:1: rulebeginAcc returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '{' ;
    public final AntlrDatatypeRuleToken rulebeginAcc() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4454:28: (kw= '{' )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4456:2: kw= '{'
            {
            kw=(Token)match(input,45,FOLLOW_45_in_rulebeginAcc8962); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getBeginAccAccess().getLeftCurlyBracketKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulebeginAcc"


    // $ANTLR start "entryRuleendAcc"
    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4469:1: entryRuleendAcc returns [String current=null] : iv_ruleendAcc= ruleendAcc EOF ;
    public final String entryRuleendAcc() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleendAcc = null;


        try {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4470:2: (iv_ruleendAcc= ruleendAcc EOF )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4471:2: iv_ruleendAcc= ruleendAcc EOF
            {
             newCompositeNode(grammarAccess.getEndAccRule()); 
            pushFollow(FOLLOW_ruleendAcc_in_entryRuleendAcc9002);
            iv_ruleendAcc=ruleendAcc();

            state._fsp--;

             current =iv_ruleendAcc.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleendAcc9013); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleendAcc"


    // $ANTLR start "ruleendAcc"
    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4478:1: ruleendAcc returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '}' ;
    public final AntlrDatatypeRuleToken ruleendAcc() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4481:28: (kw= '}' )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4483:2: kw= '}'
            {
            kw=(Token)match(input,46,FOLLOW_46_in_ruleendAcc9050); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEndAccAccess().getRightCurlyBracketKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleendAcc"


    // $ANTLR start "entryRulebegin"
    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4496:1: entryRulebegin returns [String current=null] : iv_rulebegin= rulebegin EOF ;
    public final String entryRulebegin() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulebegin = null;


        try {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4497:2: (iv_rulebegin= rulebegin EOF )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4498:2: iv_rulebegin= rulebegin EOF
            {
             newCompositeNode(grammarAccess.getBeginRule()); 
            pushFollow(FOLLOW_rulebegin_in_entryRulebegin9090);
            iv_rulebegin=rulebegin();

            state._fsp--;

             current =iv_rulebegin.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulebegin9101); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulebegin"


    // $ANTLR start "rulebegin"
    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4505:1: rulebegin returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'begin' ;
    public final AntlrDatatypeRuleToken rulebegin() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4508:28: (kw= 'begin' )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4510:2: kw= 'begin'
            {
            kw=(Token)match(input,74,FOLLOW_74_in_rulebegin9138); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getBeginAccess().getBeginKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulebegin"


    // $ANTLR start "entryRuleend"
    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4523:1: entryRuleend returns [String current=null] : iv_ruleend= ruleend EOF ;
    public final String entryRuleend() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleend = null;


        try {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4524:2: (iv_ruleend= ruleend EOF )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4525:2: iv_ruleend= ruleend EOF
            {
             newCompositeNode(grammarAccess.getEndRule()); 
            pushFollow(FOLLOW_ruleend_in_entryRuleend9178);
            iv_ruleend=ruleend();

            state._fsp--;

             current =iv_ruleend.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleend9189); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleend"


    // $ANTLR start "ruleend"
    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4532:1: ruleend returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'end' ;
    public final AntlrDatatypeRuleToken ruleend() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4535:28: (kw= 'end' )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4537:2: kw= 'end'
            {
            kw=(Token)match(input,75,FOLLOW_75_in_ruleend9226); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEndAccess().getEndKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleend"


    // $ANTLR start "entryRuleopenPar"
    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4550:1: entryRuleopenPar returns [String current=null] : iv_ruleopenPar= ruleopenPar EOF ;
    public final String entryRuleopenPar() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleopenPar = null;


        try {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4551:2: (iv_ruleopenPar= ruleopenPar EOF )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4552:2: iv_ruleopenPar= ruleopenPar EOF
            {
             newCompositeNode(grammarAccess.getOpenParRule()); 
            pushFollow(FOLLOW_ruleopenPar_in_entryRuleopenPar9266);
            iv_ruleopenPar=ruleopenPar();

            state._fsp--;

             current =iv_ruleopenPar.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleopenPar9277); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleopenPar"


    // $ANTLR start "ruleopenPar"
    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4559:1: ruleopenPar returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '(' ;
    public final AntlrDatatypeRuleToken ruleopenPar() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4562:28: (kw= '(' )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4564:2: kw= '('
            {
            kw=(Token)match(input,76,FOLLOW_76_in_ruleopenPar9314); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getOpenParAccess().getLeftParenthesisKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleopenPar"


    // $ANTLR start "entryRuleclosePar"
    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4577:1: entryRuleclosePar returns [String current=null] : iv_ruleclosePar= ruleclosePar EOF ;
    public final String entryRuleclosePar() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleclosePar = null;


        try {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4578:2: (iv_ruleclosePar= ruleclosePar EOF )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4579:2: iv_ruleclosePar= ruleclosePar EOF
            {
             newCompositeNode(grammarAccess.getCloseParRule()); 
            pushFollow(FOLLOW_ruleclosePar_in_entryRuleclosePar9354);
            iv_ruleclosePar=ruleclosePar();

            state._fsp--;

             current =iv_ruleclosePar.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleclosePar9365); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleclosePar"


    // $ANTLR start "ruleclosePar"
    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4586:1: ruleclosePar returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= ')' ;
    public final AntlrDatatypeRuleToken ruleclosePar() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4589:28: (kw= ')' )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4591:2: kw= ')'
            {
            kw=(Token)match(input,77,FOLLOW_77_in_ruleclosePar9402); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getCloseParAccess().getRightParenthesisKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleclosePar"


    // $ANTLR start "entryRuleat"
    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4604:1: entryRuleat returns [String current=null] : iv_ruleat= ruleat EOF ;
    public final String entryRuleat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleat = null;


        try {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4605:2: (iv_ruleat= ruleat EOF )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4606:2: iv_ruleat= ruleat EOF
            {
             newCompositeNode(grammarAccess.getAtRule()); 
            pushFollow(FOLLOW_ruleat_in_entryRuleat9442);
            iv_ruleat=ruleat();

            state._fsp--;

             current =iv_ruleat.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleat9453); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleat"


    // $ANTLR start "ruleat"
    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4613:1: ruleat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '@' ;
    public final AntlrDatatypeRuleToken ruleat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4616:28: (kw= '@' )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4618:2: kw= '@'
            {
            kw=(Token)match(input,78,FOLLOW_78_in_ruleat9490); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getAtAccess().getCommercialAtKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleat"


    // $ANTLR start "entryRuledot"
    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4631:1: entryRuledot returns [String current=null] : iv_ruledot= ruledot EOF ;
    public final String entryRuledot() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruledot = null;


        try {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4632:2: (iv_ruledot= ruledot EOF )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4633:2: iv_ruledot= ruledot EOF
            {
             newCompositeNode(grammarAccess.getDotRule()); 
            pushFollow(FOLLOW_ruledot_in_entryRuledot9530);
            iv_ruledot=ruledot();

            state._fsp--;

             current =iv_ruledot.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuledot9541); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuledot"


    // $ANTLR start "ruledot"
    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4640:1: ruledot returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '.' ;
    public final AntlrDatatypeRuleToken ruledot() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4643:28: (kw= '.' )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4645:2: kw= '.'
            {
            kw=(Token)match(input,79,FOLLOW_79_in_ruledot9578); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getDotAccess().getFullStopKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruledot"


    // $ANTLR start "entryRulecoma"
    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4658:1: entryRulecoma returns [String current=null] : iv_rulecoma= rulecoma EOF ;
    public final String entryRulecoma() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulecoma = null;


        try {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4659:2: (iv_rulecoma= rulecoma EOF )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4660:2: iv_rulecoma= rulecoma EOF
            {
             newCompositeNode(grammarAccess.getComaRule()); 
            pushFollow(FOLLOW_rulecoma_in_entryRulecoma9618);
            iv_rulecoma=rulecoma();

            state._fsp--;

             current =iv_rulecoma.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecoma9629); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecoma"


    // $ANTLR start "rulecoma"
    // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4667:1: rulecoma returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= ',' ;
    public final AntlrDatatypeRuleToken rulecoma() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4670:28: (kw= ',' )
            // ../org.xtext.AthenaDSL/src-gen/org/xtext/parser/antlr/internal/InternalAthenaDSL.g:4672:2: kw= ','
            {
            kw=(Token)match(input,80,FOLLOW_80_in_rulecoma9666); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getComaAccess().getCommaKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecoma"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleProject_in_entryRuleProject75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProject85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleProject131 = new BitSet(new long[]{0x000004047C21B802L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleLanguageDeclaration_in_ruleProject153 = new BitSet(new long[]{0x000004047C21B802L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDataType_in_ruleProject175 = new BitSet(new long[]{0x000004047C21A802L,0x0000000000000010L});
    public static final BitSet FOLLOW_rulevalidityFunctionDeclaration_in_ruleProject197 = new BitSet(new long[]{0x0000040440008802L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleImport_in_ruleProject219 = new BitSet(new long[]{0x0000040440000802L,0x0000000000000010L});
    public static final BitSet FOLLOW_rulefunctionDeclaration_in_ruleProject241 = new BitSet(new long[]{0x0000040440000802L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleImport_in_ruleProject263 = new BitSet(new long[]{0x0000040400000802L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleProcessingDeclaration_in_ruleProject285 = new BitSet(new long[]{0x0000040400000802L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleImport_in_ruleProject307 = new BitSet(new long[]{0x0000040000000802L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleprototypeDeclaration_in_ruleProject329 = new BitSet(new long[]{0x0000040000000802L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleImport_in_ruleProject351 = new BitSet(new long[]{0x0000000000000802L,0x0000000000000010L});
    public static final BitSet FOLLOW_rulewrapperDeclaration_in_ruleProject373 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport410 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleImport457 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImport474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLanguageDeclaration_in_entryRuleLanguageDeclaration515 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLanguageDeclaration525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleLanguageDeclaration562 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLanguageDeclaration579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_entryRuleDataType620 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataType630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulebasicType_in_ruleDataType677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledefineType_in_ruleDataType704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulearrayType_in_ruleDataType731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevectorType_in_ruleDataType758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemapType_in_ruleDataType785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestructType_in_ruleDataType812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleunionType_in_ruleDataType839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledefineType_in_entryRuledefineType874 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuledefineType884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruledefineType921 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruledefineType938 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruledefineType955 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruledefineType975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevalidityFunctionDeclaration_in_entryRulevalidityFunctionDeclaration1011 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevalidityFunctionDeclaration1021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rulevalidityFunctionDeclaration1058 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulevalidityFunctionDeclaration1078 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulevalidityFunctionDeclaration1095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulebasicType_in_entryRulebasicType1136 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulebasicType1146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rulebasicType1183 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulebasicType1200 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_rulebegin_in_rulebasicType1221 = new BitSet(new long[]{0x0000000000021000L});
    public static final BitSet FOLLOW_ruleincludeDecl_in_rulebasicType1241 = new BitSet(new long[]{0x0000000000021000L});
    public static final BitSet FOLLOW_rulelanguageDecl_in_rulebasicType1263 = new BitSet(new long[]{0x0000000000121000L,0x0000000000000800L});
    public static final BitSet FOLLOW_rulelexicalCastDecl_in_rulebasicType1285 = new BitSet(new long[]{0x0000000000100000L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleend_in_rulebasicType1302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleincludeDecl_in_entryRuleincludeDecl1337 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleincludeDecl1347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleincludeDecl1384 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleincludeDecl1404 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleincludeDecl1416 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleincludeDecl1433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelanguageDecl_in_entryRulelanguageDecl1474 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulelanguageDecl1484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rulelanguageDecl1521 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulelanguageDecl1541 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_rulelanguageDecl1553 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulelanguageDecl1570 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_rulelanguageDecl1587 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulelanguageDecl1604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelexicalCastDecl_in_entryRulelexicalCastDecl1645 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulelexicalCastDecl1655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rulelexicalCastDecl1692 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulelexicalCastDecl1712 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_rulelexicalCastDecl1724 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulelexicalCastDecl1741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulearrayType_in_entryRulearrayType1782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulearrayType1792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rulearrayType1829 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_rulearrayType1841 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulearrayType1861 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_rulearrayType1873 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulearrayType1890 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_rulearrayType1907 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleindex_in_rulearrayType1928 = new BitSet(new long[]{0x0000000002000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_rulecoma_in_rulearrayType1945 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleindex_in_rulearrayType1965 = new BitSet(new long[]{0x0000000002000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_25_in_rulearrayType1979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevectorType_in_entryRulevectorType2015 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevectorType2025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rulevectorType2062 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_rulevectorType2074 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulevectorType2094 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_rulevectorType2106 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulevectorType2123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemapType_in_entryRulemapType2164 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulemapType2174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rulemapType2211 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_rulemapType2223 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulemapType2243 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_rulecoma_in_rulemapType2259 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulemapType2278 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_rulemapType2290 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulemapType2307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestructType_in_entryRulestructType2348 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestructType2358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rulestructType2395 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulestructType2412 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000400L});
    public static final BitSet FOLLOW_22_in_rulestructType2430 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleindex_in_rulestructType2451 = new BitSet(new long[]{0x0000000000800000L,0x0000000000010000L});
    public static final BitSet FOLLOW_rulecoma_in_rulestructType2468 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleindex_in_rulestructType2488 = new BitSet(new long[]{0x0000000000800000L,0x0000000000010000L});
    public static final BitSet FOLLOW_23_in_rulestructType2502 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_rulebegin_in_rulestructType2520 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rulestructElement_in_rulestructType2540 = new BitSet(new long[]{0x0000000000100020L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleend_in_rulestructType2557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestructElement_in_entryRulestructElement2592 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestructElement2602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulestructElement2647 = new BitSet(new long[]{0x0000000000400020L});
    public static final BitSet FOLLOW_22_in_rulestructElement2660 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleindex_in_rulestructElement2681 = new BitSet(new long[]{0x0000000000800000L,0x0000000000010000L});
    public static final BitSet FOLLOW_rulecoma_in_rulestructElement2698 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleindex_in_rulestructElement2718 = new BitSet(new long[]{0x0000000000800000L,0x0000000000010000L});
    public static final BitSet FOLLOW_23_in_rulestructElement2732 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulestructElement2751 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_rulestructElement2775 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulestructElement2805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleindex_in_entryRuleindex2848 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleindex2858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleindex2900 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleindex2924 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleindex2954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleunionType_in_entryRuleunionType2997 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleunionType3007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleunionType3044 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleunionType3061 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_rulebegin_in_ruleunionType3082 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleunionType3101 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_rulecoma_in_ruleunionType3118 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleunionType3137 = new BitSet(new long[]{0x0000000000100000L,0x0000000000010800L});
    public static final BitSet FOLLOW_ruleend_in_ruleunionType3155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunctionDeclaration_in_entryRulefunctionDeclaration3192 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefunctionDeclaration3202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rulefunctionDeclaration3239 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulefunctionDeclaration3256 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_rulefunctionDeclaration3273 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulefunctionDeclaration3293 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_rulefunctionDeclaration3305 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleopenPar_in_rulefunctionDeclaration3321 = new BitSet(new long[]{0x0000000380000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_ruleargumentsDeclaration_in_rulefunctionDeclaration3341 = new BitSet(new long[]{0x0000000380000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_ruleclosePar_in_rulefunctionDeclaration3358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleargumentsDeclaration_in_entryRuleargumentsDeclaration3393 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleargumentsDeclaration3403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulearg_in_ruleargumentsDeclaration3449 = new BitSet(new long[]{0x0000000380000002L});
    public static final BitSet FOLLOW_rulearg_in_ruleargumentsDeclaration3470 = new BitSet(new long[]{0x0000000380000002L});
    public static final BitSet FOLLOW_rulearg_in_entryRulearg3507 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulearg3517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rulearg3562 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_32_in_rulearg3591 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_33_in_rulearg3620 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulearg3656 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_ID_in_rulearg3673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessingDeclaration_in_entryRuleProcessingDeclaration3715 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcessingDeclaration3725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleProcessingDeclaration3762 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProcessingDeclaration3779 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleopenPar_in_ruleProcessingDeclaration3800 = new BitSet(new long[]{0x0000000380000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_ruleargumentsDeclaration_in_ruleProcessingDeclaration3820 = new BitSet(new long[]{0x0000000380000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_ruleclosePar_in_ruleProcessingDeclaration3837 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_rulebegin_in_ruleProcessingDeclaration3852 = new BitSet(new long[]{0x0000129800100000L,0x0000000000000800L});
    public static final BitSet FOLLOW_rulelocalParameterDeclaration_in_ruleProcessingDeclaration3872 = new BitSet(new long[]{0x0000129800100000L,0x0000000000000800L});
    public static final BitSet FOLLOW_rulelocalEventDeclaration_in_ruleProcessingDeclaration3894 = new BitSet(new long[]{0x0000129000100000L,0x0000000000000800L});
    public static final BitSet FOLLOW_rulestatement_in_ruleProcessingDeclaration3916 = new BitSet(new long[]{0x0000029000100000L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleend_in_ruleProcessingDeclaration3933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_in_entryRulestatement3968 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestatement3978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunctionCall_in_rulestatement4025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulewhileblock_in_rulestatement4044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleifblock_in_rulestatement4063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelocalParameterDeclaration_in_entryRulelocalParameterDeclaration4101 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulelocalParameterDeclaration4111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rulelocalParameterDeclaration4148 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulelocalParameterDeclaration4168 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulelocalParameterDeclaration4185 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_rulelocalParameterDeclaration4209 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulelocalParameterDeclaration4239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelocalEventDeclaration_in_entryRulelocalEventDeclaration4282 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulelocalEventDeclaration4292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleeventDeclaration_in_rulelocalEventDeclaration4338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleifblock_in_entryRuleifblock4372 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleifblock4382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleifblock4419 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleifblock4439 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleifblock4451 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_rulebegin_in_ruleifblock4467 = new BitSet(new long[]{0x0000029000000000L});
    public static final BitSet FOLLOW_rulestatement_in_ruleifblock4487 = new BitSet(new long[]{0x0000029000100000L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleend_in_ruleifblock4504 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_ruleifblock4522 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_rulebegin_in_ruleifblock4551 = new BitSet(new long[]{0x0000029000000000L});
    public static final BitSet FOLLOW_rulestatement_in_ruleifblock4571 = new BitSet(new long[]{0x0000029000100000L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleend_in_ruleifblock4588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulewhileblock_in_entryRulewhileblock4625 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulewhileblock4635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rulewhileblock4672 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulewhileblock4692 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_rulewhileblock4704 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_rulebegin_in_rulewhileblock4720 = new BitSet(new long[]{0x0000029000000000L});
    public static final BitSet FOLLOW_rulestatement_in_rulewhileblock4740 = new BitSet(new long[]{0x0000029000100000L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleend_in_rulewhileblock4757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunctionCall_in_entryRulefunctionCall4792 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefunctionCall4802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rulefunctionCall4839 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulefunctionCall4859 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleopenPar_in_rulefunctionCall4875 = new BitSet(new long[]{0x0000000380000020L,0x0000000000002000L});
    public static final BitSet FOLLOW_rulefarg_in_rulefunctionCall4896 = new BitSet(new long[]{0x0000000380000000L,0x0000000000012000L});
    public static final BitSet FOLLOW_rulecoma_in_rulefunctionCall4913 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rulefarg_in_rulefunctionCall4933 = new BitSet(new long[]{0x0000000380000000L,0x0000000000012000L});
    public static final BitSet FOLLOW_ruleclosePar_in_rulefunctionCall4953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprototypeDeclaration_in_entryRuleprototypeDeclaration4988 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleprototypeDeclaration4998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleprototypeDeclaration5035 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleprototypeDeclaration5052 = new BitSet(new long[]{0x0000000000004000L,0x0000000000000400L});
    public static final BitSet FOLLOW_14_in_ruleprototypeDeclaration5070 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleprototypeDeclaration5090 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_rulebegin_in_ruleprototypeDeclaration5108 = new BitSet(new long[]{0x9040181800100000L,0x0000000000000C04L});
    public static final BitSet FOLLOW_rulearchitectureElement_in_ruleprototypeDeclaration5128 = new BitSet(new long[]{0x9040181800100000L,0x0000000000000C04L});
    public static final BitSet FOLLOW_ruleend_in_ruleprototypeDeclaration5145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulearchitectureElement_in_entryRulearchitectureElement5180 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulearchitectureElement5190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleparameterDeclaration_in_rulearchitectureElement5237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulereferenceDeclaration_in_rulearchitectureElement5264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleeventDeclaration_in_rulearchitectureElement5291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatesetDeclaration_in_rulearchitectureElement5318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleinstanceDeclaration_in_rulearchitectureElement5345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleinteractionDeclaration_in_rulearchitectureElement5372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesignalDeclaration_in_rulearchitectureElement5399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesignalDeclaration_in_entryRulesignalDeclaration5434 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesignalDeclaration5444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rulesignalDeclaration5481 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulesignalDeclaration5498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleeventDeclaration_in_entryRuleeventDeclaration5539 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleeventDeclaration5549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleeventDeclaration5586 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleeventDeclaration5603 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleeventDeclaration5620 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleeventCondition_in_ruleeventDeclaration5641 = new BitSet(new long[]{0x0000400000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_rulecoma_in_ruleeventDeclaration5658 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleeventCondition_in_ruleeventDeclaration5678 = new BitSet(new long[]{0x0000400000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_46_in_ruleeventDeclaration5692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleeventCondition_in_entryRuleeventCondition5728 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleeventCondition5738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleeventCondition5780 = new BitSet(new long[]{0x0007800000C00000L});
    public static final BitSet FOLLOW_47_in_ruleeventCondition5805 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_48_in_ruleeventCondition5834 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_49_in_ruleeventCondition5863 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_22_in_ruleeventCondition5892 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_23_in_ruleeventCondition5921 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_50_in_ruleeventCondition5950 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleeventCondition5984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleeventCondition6012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleeventCondition6040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleparameterDeclaration_in_entryRuleparameterDeclaration6082 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleparameterDeclaration6092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleparameterDeclaration6129 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleparameterDeclaration6149 = new BitSet(new long[]{0x0018000000000020L});
    public static final BitSet FOLLOW_51_in_ruleparameterDeclaration6168 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleopenPar_in_ruleparameterDeclaration6197 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleparameterDeclaration6213 = new BitSet(new long[]{0x0000000380000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_ruleclosePar_in_ruleparameterDeclaration6234 = new BitSet(new long[]{0x0010000000000020L});
    public static final BitSet FOLLOW_52_in_ruleparameterDeclaration6253 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleparameterDeclaration6284 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleparameterDeclaration6309 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleparameterDeclaration6339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleparameterDeclaration6370 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleparameterDeclaration6395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleparameterDeclaration6421 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleparameterDeclaration6446 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleparameterDeclaration6463 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleparameterDeclaration6480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatesetDeclaration_in_entryRulestatesetDeclaration6519 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestatesetDeclaration6529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rulestatesetDeclaration6566 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulestatesetDeclaration6583 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_rulestatesetDeclaration6600 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rulestateDeclaration_in_rulestatesetDeclaration6621 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_rulecoma_in_rulestatesetDeclaration6637 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rulestateDeclaration_in_rulestatesetDeclaration6657 = new BitSet(new long[]{0x0000400000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_rulecoma_in_rulestatesetDeclaration6674 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rulestateDeclaration_in_rulestatesetDeclaration6694 = new BitSet(new long[]{0x0000400000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_46_in_rulestatesetDeclaration6708 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_rulestatesetDeclaration6720 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulestatesetDeclaration6740 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_rulebegin_in_rulestatesetDeclaration6756 = new BitSet(new long[]{0x0080000000100000L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruletransitionDeclaration_in_rulestatesetDeclaration6776 = new BitSet(new long[]{0x0080000000100000L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleend_in_rulestatesetDeclaration6793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestateDeclaration_in_entryRulestateDeclaration6828 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestateDeclaration6838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulestateDeclaration6879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletransitionDeclaration_in_entryRuletransitionDeclaration6919 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletransitionDeclaration6929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruletransitionDeclaration6966 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruletransitionDeclaration6978 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruletransitionDeclaration6995 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ruletransitionDeclaration7012 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruletransitionDeclaration7029 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_ruletransitionDeclaration7046 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruletransitionDeclaration7063 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_59_in_ruletransitionDeclaration7087 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruletransitionDeclaration7117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleinstanceDeclaration_in_entryRuleinstanceDeclaration7160 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleinstanceDeclaration7170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleinstanceDeclaration7207 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleinstanceDeclaration7227 = new BitSet(new long[]{0x2000000000000020L});
    public static final BitSet FOLLOW_61_in_ruleinstanceDeclaration7240 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleinstanceDeclaration7259 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleinstanceDeclaration7277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleinteractionDeclaration_in_entryRuleinteractionDeclaration7315 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleinteractionDeclaration7325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleinteractionDeclaration7369 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleopenPar_in_ruleinteractionDeclaration7398 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleinteractionDeclaration7414 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ruleinteractionDeclaration7431 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleinteractionDeclaration7448 = new BitSet(new long[]{0x0000000380000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_ruleclosePar_in_ruleinteractionDeclaration7469 = new BitSet(new long[]{0x0000001000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_36_in_ruleinteractionDeclaration7489 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleopenPar_in_ruleinteractionDeclaration7518 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleinteractionDeclaration7534 = new BitSet(new long[]{0x0000000380000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_ruleclosePar_in_ruleinteractionDeclaration7555 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_rulebegin_in_ruleinteractionDeclaration7572 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_ruleinteractionCall_in_ruleinteractionDeclaration7592 = new BitSet(new long[]{0x4000000000100000L,0x0000000000000802L});
    public static final BitSet FOLLOW_62_in_ruleinteractionDeclaration7606 = new BitSet(new long[]{0x0000000000100000L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleend_in_ruleinteractionDeclaration7624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleinteractionCall_in_entryRuleinteractionCall7659 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleinteractionCall7669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleinteractionCall7706 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleinteractionCall7726 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleopenPar_in_ruleinteractionCall7742 = new BitSet(new long[]{0x0000000380000020L,0x0000000000002000L});
    public static final BitSet FOLLOW_rulefarg_in_ruleinteractionCall7763 = new BitSet(new long[]{0x0000000380000000L,0x0000000000012000L});
    public static final BitSet FOLLOW_rulecoma_in_ruleinteractionCall7780 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rulefarg_in_ruleinteractionCall7800 = new BitSet(new long[]{0x0000000380000000L,0x0000000000012000L});
    public static final BitSet FOLLOW_ruleclosePar_in_ruleinteractionCall7820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefarg_in_entryRulefarg7855 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefarg7865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulefarg7906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulereferenceDeclaration_in_entryRulereferenceDeclaration7946 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulereferenceDeclaration7956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_rulereferenceDeclaration7993 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_rulereferenceDeclaration8005 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulereferenceDeclaration8025 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_rulereferenceDeclaration8037 = new BitSet(new long[]{0x0000000000000020L,0x0000000000004000L});
    public static final BitSet FOLLOW_ruleat_in_rulereferenceDeclaration8058 = new BitSet(new long[]{0x0000000000000020L,0x0000000000004000L});
    public static final BitSet FOLLOW_rulequalifiedName_in_rulereferenceDeclaration8080 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_rulereferenceDeclaration8093 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulereferenceDeclaration8110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulequalifiedName_in_entryRulequalifiedName8153 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulequalifiedName8163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulequalifiedName8205 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruledot_in_rulequalifiedName8227 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulequalifiedName8243 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_rulewrapperDeclaration_in_entryRulewrapperDeclaration8286 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulewrapperDeclaration8296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_rulewrapperDeclaration8333 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulewrapperDeclaration8350 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_rulebegin_in_rulewrapperDeclaration8371 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_rulewrapperDeclaration8382 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rulebeginAcc_in_rulewrapperDeclaration8398 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulewrapperDeclaration8414 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_ruleendAcc_in_rulewrapperDeclaration8435 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_rulewrapperDeclaration8446 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rulebeginAcc_in_rulewrapperDeclaration8462 = new BitSet(new long[]{0x0000400000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulewrapperDeclaration8479 = new BitSet(new long[]{0x0000400000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_rulecoma_in_rulewrapperDeclaration8501 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulewrapperDeclaration8517 = new BitSet(new long[]{0x0000400000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleendAcc_in_rulewrapperDeclaration8542 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_rulewrapperDeclaration8553 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rulebeginAcc_in_rulewrapperDeclaration8569 = new BitSet(new long[]{0x0000400000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulewrapperDeclaration8586 = new BitSet(new long[]{0x0000400000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_rulecoma_in_rulewrapperDeclaration8608 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulewrapperDeclaration8624 = new BitSet(new long[]{0x0000400000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleendAcc_in_rulewrapperDeclaration8649 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_rulewrapperDeclaration8660 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rulebeginAcc_in_rulewrapperDeclaration8676 = new BitSet(new long[]{0x0000400000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulewrapperDeclaration8693 = new BitSet(new long[]{0x0000400000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_rulecoma_in_rulewrapperDeclaration8715 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulewrapperDeclaration8731 = new BitSet(new long[]{0x0000400000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleendAcc_in_rulewrapperDeclaration8756 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_rulewrapperDeclaration8767 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rulebeginAcc_in_rulewrapperDeclaration8783 = new BitSet(new long[]{0x0000400000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulewrapperDeclaration8800 = new BitSet(new long[]{0x0000400000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_rulecoma_in_rulewrapperDeclaration8822 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulewrapperDeclaration8838 = new BitSet(new long[]{0x0000400000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleendAcc_in_rulewrapperDeclaration8863 = new BitSet(new long[]{0x0000000000100000L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleend_in_rulewrapperDeclaration8878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulebeginAcc_in_entryRulebeginAcc8914 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulebeginAcc8925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rulebeginAcc8962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleendAcc_in_entryRuleendAcc9002 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleendAcc9013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleendAcc9050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulebegin_in_entryRulebegin9090 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulebegin9101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_rulebegin9138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleend_in_entryRuleend9178 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleend9189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleend9226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleopenPar_in_entryRuleopenPar9266 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleopenPar9277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleopenPar9314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleclosePar_in_entryRuleclosePar9354 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleclosePar9365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleclosePar9402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleat_in_entryRuleat9442 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleat9453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleat9490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledot_in_entryRuledot9530 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuledot9541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruledot9578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecoma_in_entryRulecoma9618 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecoma9629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_rulecoma9666 = new BitSet(new long[]{0x0000000000000002L});

}