/*
 * generated by Xtext 2.25.0
 */
package robLANG_ASOS;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class RobLANGStandaloneSetup extends RobLANGStandaloneSetupGenerated {

	public static void doSetup() {
		new RobLANGStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
