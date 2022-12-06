// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ShooterSubsystem extends SubsystemBase {
  /** Creates a new ShooterSubsystem. */
  public ShooterSubsystem() {}
  CANSparkMax exe1Num1=new CANSparkMax(1,CANSparkMaxLowLevel.MotorType.kBrushless);   
  CANSparkMax exe1Num2=new CANSparkMax(2,CANSparkMaxLowLevel.MotorType.kBrushless);    
  MotorControlerGroup onlyGroup = new MotorControlerGroup(exe1Num1,exe1Num2);
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
