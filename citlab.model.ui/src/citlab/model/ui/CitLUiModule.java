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
/*
 * generated by Xtext
 */
package citlab.model.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.editor.contentassist.XtextContentAssistProcessor;
import org.eclipse.xtext.ui.editor.outline.impl.OutlineFilterAndSorter.IComparator;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;

import com.google.inject.Binder;

import citlab.model.ui.outline.CitLOutlineNodeComparator;
import citlab.model.ui.highlighting.*;

/**
 * Use this class to register components to be used within the IDE.
 */
public class CitLUiModule extends citlab.model.ui.AbstractCitLUiModule {
	@Override
	public Class<? extends IComparator> bindOutlineFilterAndSorter$IComparator() {
		return CitLOutlineNodeComparator.class;
	}

	public Class<? extends IHighlightingConfiguration> bindIHighlightingConfiguration() {
		return DefaultHighlightingConfiguration.class;
	}

	@Override
	public void configure(Binder binder) {
		super.configure(binder);
		binder.bind(String.class)
				.annotatedWith(
						com.google.inject.name.Names
								.named((XtextContentAssistProcessor.COMPLETION_AUTO_ACTIVATION_CHARS)))
				.toInstance("=,:");
	}

	public CitLUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}
}
