package org.ftcbootstrap.demos.onemc;

import com.qualcomm.robotcore.eventloop.opmode.OpModeManager;
import com.qualcomm.robotcore.eventloop.opmode.OpModeRegister;

import org.ftcbootstrap.demos.TelemetryTest;
import org.ftcbootstrap.demos.navbot.opmodes.EncoderMotorTest;
import org.ftcbootstrap.demos.navbot.opmodes.EncoderTestFromGamepadButtons;
import org.ftcbootstrap.demos.navbot.opmodes.EncoderTestFromGamepadSticks;
import org.ftcbootstrap.demos.navbot.opmodes.EncodersWithEventOpmode;
import org.ftcbootstrap.demos.navbot.opmodes.NavBotManual;
import org.ftcbootstrap.demos.navbot.opmodes.NavBotTelemetry;
import org.ftcbootstrap.demos.navbot.opmodes.NavigateWithEncoders;

/**
 * Register Op Modes
 */
public class OneMCRegistry implements OpModeRegister {

    /**
     * The Op Mode Manager will call this method when it wants a list of all
     * available op modes. Add your op mode to the list to enable it.
     *
     * @param manager op mode manager
     */
    public void register(OpModeManager manager) {

    /*
     * register your op modes here.
     * The first parameter is the name of the op mode
     * The second parameter is the op mode class property
     *
     * If two or more op modes are registered with the same name, the app will display an error.
     */


        //manager.register("OneMCBot", OneMCBot.class);
        manager.register("TelemetryTest", TelemetryTest.class);

    }
}
