
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

package fUML.Syntax.Actions.CompleteActions;

import fUML.Debug;
import UMLPrimitiveTypes.*;

public class ReadIsClassifiedObjectAction extends
		fUML.Syntax.Actions.BasicActions.Action {

	public boolean isDirect = false;
	public fUML.Syntax.Classes.Kernel.Classifier classifier = null;
	public fUML.Syntax.Actions.BasicActions.OutputPin result = null;
	public fUML.Syntax.Actions.BasicActions.InputPin object = null;

	public void setIsDirect(boolean isDirect) {
		this.isDirect = isDirect;
	} // setIsDirect

	public void setClassifier(fUML.Syntax.Classes.Kernel.Classifier classifier) {
		this.classifier = classifier;
	} // setClassifier

	public void setResult(fUML.Syntax.Actions.BasicActions.OutputPin result) {
		super.addOutput(result);
		this.result = result;
	} // setResult

	public void setObject(fUML.Syntax.Actions.BasicActions.InputPin object) {
		super.addInput(object);
		this.object = object;
	} // setObject

} // ReadIsClassifiedObjectAction
