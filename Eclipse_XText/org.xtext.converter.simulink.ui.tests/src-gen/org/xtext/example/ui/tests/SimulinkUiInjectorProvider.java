/*
 * generated by Xtext 2.13.0
 */
package org.xtext.example.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.xtext.converter.simulink.ui.internal.SimulinkActivator;

public class SimulinkUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return SimulinkActivator.getInstance().getInjector("org.xtext.example.Simulink");
	}

}