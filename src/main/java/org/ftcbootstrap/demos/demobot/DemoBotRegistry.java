package org.ftcbootstrap.demos.demobot;

import org.ftcbootstrap.BootstrapRegistrar;
import org.ftcbootstrap.demos.TelemetryTest;
import org.ftcbootstrap.demos.demobot.opmodes.DemoBotAdvancedOpMode;
import org.ftcbootstrap.demos.demobot.opmodes.DemoBotOpMode1;
import org.ftcbootstrap.demos.demobot.opmodes.DemoBotTeleOpMode;
import org.ftcbootstrap.demos.demobot.opmodes.EncoderMotorOpMode;
import org.ftcbootstrap.demos.demobot.opmodes.EncoderTankDriveOpMode;

/**
 * Register Op Modes
 */
public class DemoBotRegistry extends BootstrapRegistrar {


    protected Class[] getOpmodeClasses() {
        Class[] classes = {

                DemoBotOpMode1.class,
                DemoBotTeleOpMode.class,
                EncoderMotorOpMode.class,
                EncoderTankDriveOpMode.class,
                DemoBotAdvancedOpMode.class,
                TelemetryTest.class
        };

        return classes;

    }
}
