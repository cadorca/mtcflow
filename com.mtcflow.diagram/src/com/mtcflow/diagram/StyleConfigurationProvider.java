package com.mtcflow.diagram;

import org.eclipse.sirius.diagram.description.DiagramElementMapping;
import org.eclipse.sirius.diagram.ui.tools.api.graphical.edit.styles.IStyleConfigurationProvider;
import org.eclipse.sirius.diagram.ui.tools.api.graphical.edit.styles.StyleConfiguration;
import org.eclipse.sirius.viewpoint.Style;

public class StyleConfigurationProvider implements IStyleConfigurationProvider {

	public StyleConfigurationProvider() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean provides(DiagramElementMapping mapping, Style style) {
		if (mapping.getName().toLowerCase().startsWith("artifact"))
			return true;
		else
			return false;
	}

	@Override
	public StyleConfiguration createStyleConfiguration(
			DiagramElementMapping mapping, Style style) {
		return new ArtifactStyleConfiguration();
	}

}
