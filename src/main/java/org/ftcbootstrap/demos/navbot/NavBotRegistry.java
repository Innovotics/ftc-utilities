package org.ftcbootstrap.demos.navbot;

import org.ftcbootstrap.BootstrapRegistrar;
import org.ftcbootstrap.demos.TelemetryTest;
import org.ftcbootstrap.demos.navbot.opmodes.*;
import org.firstinspires.ftc.robotcontroller.external.samples.SensorMRColor;
import org.ftcbootstrap.demos.navbot.opmodes.NavigateWithEncoders;

/**
 * Register Op Modes
 */
public class NavBotRegistry extends BootstrapRegistrar {


    protected Class[] getOpmodeClasses() {
        Class[] classes = {

                NavigateWithEncoders.class,
                NavBotManual.class,
                EncodersWithEventOpmode.class,
                EncoderMotorTest.class,
                EncoderTestFromGamepadSticks.class,
                EncoderTestFromGamepadButtons.class,
                NavBotTelemetry.class,
                SensorMRColor.class,
                TelemetryTest.class
        };

        return classes;

    }
}
