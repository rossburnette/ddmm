/**
 * generated by Xtext 2.12.0
 */
package de.fhdo.ddmm.technology.mappingdsl;

import de.fhdo.ddmm.technology.mappingdsl.MappingDslStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class MappingDslStandaloneSetup extends MappingDslStandaloneSetupGenerated {
  public static void doSetup() {
    new MappingDslStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}
