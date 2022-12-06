// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class ShooterSubsystem extends SubsystemBase {
  /** Creates a new ShooterSubsystem. */
  public ShooterSubsystem() {}
  WPI_TalonSRX exe1Num1=new WPI_TalonSRX(Constants.firstName);
  WPI_TalonSRX exe1Num2=new WPI_TalonSRX(Constants.secondName);
  MotorControllerGroup shoterEngens = new MotorControllerGroup(exe1Num1,exe1Num2);
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    exe1Num1.follow(exe1Num2);
  }
}
