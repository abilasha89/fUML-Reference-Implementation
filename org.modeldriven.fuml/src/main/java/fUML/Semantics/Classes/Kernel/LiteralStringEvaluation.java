
/*
 * Initial version copyright 2008 Lockheed Martin Corporation, except  
 * as stated in the file entitled Licensing-Information. 
 * 
 * All modifications copyright 2009-2012 Data Access Technologies, Inc.
 *
 * Licensed under the Academic Free License version 3.0 
 * (http://www.opensource.org/licenses/afl-3.0.php), except as stated 
 * in the file entitled Licensing-Information. 
 */

package fUML.Semantics.Classes.Kernel;

import fUML.Debug;
import UMLPrimitiveTypes.*;

import fUML.Syntax.*;
import fUML.Syntax.Classes.Kernel.*;

import fUML.Semantics.*;
import fUML.Semantics.Loci.*;

public class LiteralStringEvaluation extends
		fUML.Semantics.Classes.Kernel.LiteralEvaluation {

	public fUML.Semantics.Classes.Kernel.Value evaluate() {
		// Evaluate a literal string, producing a string value.

		LiteralString literal = (LiteralString) specification;
		StringValue stringValue = new StringValue();
		stringValue.type = this.getType("String");
		stringValue.value = literal.value;

		return stringValue;
	} // evaluate

} // LiteralStringEvaluation
