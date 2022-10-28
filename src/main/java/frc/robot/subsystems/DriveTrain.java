// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import frc.robot.commands.DriveTeleop;
import frc.robot.OI;
import edu.wpi.first.wpilibj.Joystick;

/** Add your docs here. */
public class DriveTrain extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  public static CANSparkMax frontRight = new CANSparkMax(RobotMap.frontRightPort, MotorType.kBrushless);
  public static CANSparkMax frontLeft = new CANSparkMax(RobotMap.frontLeftPort, MotorType.kBrushless);
  public static CANSparkMax midRight = new CANSparkMax(RobotMap.midRightPort, MotorType.kBrushless);
  public static CANSparkMax midLeft = new CANSparkMax(RobotMap.midLeftPort, MotorType.kBrushless);
  public static CANSparkMax rearRight = new CANSparkMax(RobotMap.rearRightPort, MotorType.kBrushless);
  public static CANSparkMax rearLeft = new CANSparkMax(RobotMap.rearLeftPort, MotorType.kBrushless);

  public static void driveTeleop(){
    double leftSpeed = OI.driveLeft.getRawAxis(0);
    double rightSpeed = OI.driveRight.getRawAxis(1);
    frontRight.set(speed);
    frontLeft.set(speed);
    midRight.set(speed);
    midLeft.set(speed);
    rearRight.set(speed);
    rearLeft.set(speed);
  }

  public static void stopMotors(){
    double speed = 0.0;
    frontRight.set(speed);
    frontLeft.set(speed);
    midRight.set(speed);
    midLeft.set(speed);
    rearRight.set(speed);
    rearLeft.set(speed);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
    setDefaultCommand(new DriveTeleop());
  }
}
