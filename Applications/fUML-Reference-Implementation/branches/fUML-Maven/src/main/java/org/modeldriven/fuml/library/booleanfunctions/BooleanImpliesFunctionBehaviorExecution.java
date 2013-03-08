/*
 * Copyright 2008 Lockheed Martin Corporation, except as stated in the file 
 * entitled Licensing-Information. All modifications copyright 2009 Data Access Technologies, Inc. Licensed under the Academic Free License 
 * version 3.0 (http://www.opensource.org/licenses/afl-3.0.php), except as stated 
 * in the file entitled Licensing-Information. 
 *
 * Contributors:
 *   MDS - initial API and implementation
 *
 */
package org.modeldriven.fuml.library.booleanfunctions;

import fUML.Debug;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>org::modeldriven::fuml::library::booleanfunctions::BooleanImpliesFunctionBehaviorExecution</b></em> '.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link BooleanImpliesFunctionBehaviorExecution#doBooleanFunction <em>
 * doBooleanFunction</em>}</li>
 * <li>{@link BooleanImpliesFunctionBehaviorExecution#new_ <em>new_</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */

public class BooleanImpliesFunctionBehaviorExecution extends
	org.modeldriven.fuml.library.booleanfunctions.BooleanFunctionBehaviorExecution {

	// Attributes

	// Operations of the class
	
    /**
     * operation doBooleanFunction <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean doBooleanFunction(boolean b1, boolean b2) {      	
    	boolean result = (!b1) || (b1 && b2);
    	Debug.println("[doBody] Boolean Implies result = " + result);
    	return (result);    	
    }
    
    /**
     * operation new_ <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
	public fUML.Semantics.Classes.Kernel.Value new_() {
        // Create a new instance of this kind of function behavior execution.
        return new BooleanImpliesFunctionBehaviorExecution();
    }	    

} // BooleanImpliesFunctionBehaviorExecution