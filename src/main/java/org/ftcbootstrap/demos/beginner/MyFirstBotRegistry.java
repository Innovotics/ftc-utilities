package org.ftcbootstrap.demos.beginner;

import org.ftcbootstrap.BootstrapRegistrar;
import org.ftcbootstrap.demos.TelemetryTest;
import org.ftcbootstrap.demos.beginner.opmodes.OpMode1RunForTime;
import org.ftcbootstrap.demos.beginner.opmodes.OpMode2RunForTime;
import org.ftcbootstrap.demos.beginner.opmodes.OpMode3RunForTime;
import org.ftcbootstrap.demos.beginner.opmodes.OpMode4RunUntilTouch;
import org.ftcbootstrap.demos.beginner.opmodes.OpMode5StateMachine;
import org.ftcbootstrap.demos.beginner.opmodes.OpMode6DriveWithGamepad;
import org.ftcbootstrap.demos.beginner.opmodes.OpMode7ServoWithGamepad;


/**
 * Register Op Modes
 */
public class MyFirstBotRegistry extends BootstrapRegistrar {


  protected Class[] getOpmodeClasses() {
    Class[] classes = {

            OpMode1RunForTime.class,
            OpMode2RunForTime.class,
            OpMode3RunForTime.class,
            OpMode4RunUntilTouch.class,
            OpMode5StateMachine.class,
            OpMode6DriveWithGamepad.class,
            OpMode7ServoWithGamepad.class,
            TelemetryTest.class
    };

    return classes;
  }


}
