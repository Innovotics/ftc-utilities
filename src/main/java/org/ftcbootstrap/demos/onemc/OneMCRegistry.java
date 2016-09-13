package org.ftcbootstrap.demos.onemc;

import org.ftcbootstrap.BootstrapRegistrar;
import org.ftcbootstrap.demos.TelemetryTest;


/**
 * Register Op Modes
 */
public class OneMCRegistry extends BootstrapRegistrar {


    protected Class[] getOpmodeClasses() {
        Class[] classes = {

                TelemetryTest.class
        };

        return classes;


    }
}
