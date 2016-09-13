package org.ftcbootstrap.demos.pushbot;

import org.ftcbootstrap.BootstrapRegistrar;
import org.ftcbootstrap.demos.TelemetryTest;
import org.ftcbootstrap.demos.pushbot.opmodes.PushBotAuto;
import org.ftcbootstrap.demos.pushbot.opmodes.PushBotManual;
import org.ftcbootstrap.demos.pushbot.opmodes.PushBotManual2;
import org.ftcbootstrap.demos.pushbot.opmodes.PushBotAutoSensors;
import org.ftcbootstrap.demos.pushbot.opmodes.PushBotOdsFollowEvent;
import org.ftcbootstrap.demos.pushbot.opmodes.PushBotOdsDetectEvent;
import org.ftcbootstrap.demos.pushbot.opmodes.PushBotTouchEvent;


/**
 * Register Op Modes
 */
public class PushBotRegistry extends BootstrapRegistrar {

    protected Class[] getOpmodeClasses() {
        Class[] classes = {

                PushBotAuto.class,
                PushBotAutoSensors.class,
                PushBotManual.class,
                PushBotManual2.class,
                PushBotOdsDetectEvent.class,
                PushBotOdsFollowEvent.class,
                PushBotTouchEvent.class,
                TelemetryTest.class
        };
        return classes;
    }
}
