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
package org.modeldriven.fuml.config;

import org.modeldriven.fuml.FumlException;

public class FumlConfigurationException extends FumlException {

	public FumlConfigurationException(String msg) {
		super(msg);
	}

	public FumlConfigurationException(Throwable t) {
		super(t);
	}

}
