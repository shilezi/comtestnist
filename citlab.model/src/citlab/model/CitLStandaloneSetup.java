/*******************************************************************************
 * Copyright (c) 2013 University of Bergamo - Italy
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Paolo Vavassori - initial API and implementation
 *   Angelo Gargantini - utils and architecture
 ******************************************************************************/
package citlab.model;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class CitLStandaloneSetup extends CitLStandaloneSetupGenerated{

	public static void doSetup() {
		new CitLStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

