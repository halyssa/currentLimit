// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.*;

/** Add your docs here. */
public class OI {
    public static Joystick driveJoy = new Joystick(RobotMap.driveJoyPort);
    public static Button driveLeft = new JoystickButton(driveJoy, 0);
    public static Button driveRight = new JoystickButton(driveJoy, 1);

    public void bindButtons(){
        //drivetrain
        driveLeft.whileHeld(new DriveTeleop());
        driveRight.whileHeld(new DriveTeleop());
    }
}
