// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class ChassisSubSystem extends SubsystemBase {
  //Here i create all the motors
  TalonSRX frontRightChassisMotor = new TalonSRX(Constants.ChassisConstants.frontRightMotorId);
  TalonSRX frontLeftChassisMotor = new TalonSRX(Constants.ChassisConstants.frontLeftMotorId);
  TalonSRX backRightChassisMotor = new TalonSRX(Constants.ChassisConstants.backRightMotorId);
  TalonSRX backLeftChassisMotor = new TalonSRX(Constants.ChassisConstants.backLeftMotorId);
  
  //Now i create two encoder
  Encoder rightChassisMotorEncoder = new Encoder(0, 1, false, Encoder.EncodingType.k4X);
  Encoder leftChassisMotorEncoder = new Encoder(1, 2, true, Encoder.EncodingType.k4X);


  /** Creates a new ExampleSubsystem. */
  public ChassisSubSystem() {
    //I will cause the corresponding motors to follow eachother
    backLeftChassisMotor.follow(frontLeftChassisMotor);
    backRightChassisMotor.follow(frontRightChassisMotor);

    //Now i will reset the encoders
    rightChassisMotorEncoder.reset();
    leftChassisMotorEncoder.reset();
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
