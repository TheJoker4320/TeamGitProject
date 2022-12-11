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
  WPI_TalonSRX masterMotor=new WPI_TalonSRX(Constants.firstName);
  WPI_TalonSRX slaveMotor=new WPI_TalonSRX(Constants.secondName);
  MotorControllerGroup shoterEngens = new MotorControllerGroup(masterMotor,slaveMotor);
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    slaveMotor.follow(masterMotor);
  }
}
