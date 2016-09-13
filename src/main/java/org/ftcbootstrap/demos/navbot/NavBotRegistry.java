package org.ftcbootstrap.demos.navbot;

import org.ftcbootstrap.BootstrapRegistrar;
import org.ftcbootstrap.demos.TelemetryTest;
import org.ftcbootstrap.demos.navbot.opmodes.EncoderTestFromGamepadButtons;
import org.ftcbootstrap.demos.navbot.opmodes.EncoderTestFromGamepadSticks;
import org.ftcbootstrap.demos.navbot.opmodes.NavBotTelemetry;
import org.ftcbootstrap.demos.navbot.opmodes.EncoderMotorTest;
import org.ftcbootstrap.demos.navbot.opmodes.EncodersWithEventOpmode;
import org.ftcbootstrap.demos.navbot.opmodes.NavBotManual;
import org.firstinspires.ftc.robotcontroller.external.samples.SensorMRColor;
/**
 * Register Op Modes
 */
public class NavBotRegistry extends BootstrapRegistrar {


    protected Class[] getOpmodeClasses() {
        Class[] classes = {

                EncodersWithEventOpmode.class,
                EncoderMotorTest.class,
                EncoderTestFromGamepadSticks.class,
                EncoderTestFromGamepadButtons.class,
                NavBotManual.class,
                NavBotTelemetry.class,
                SensorMRColor.class,
                TelemetryTest.class
        };

        return classes;

    }
}
