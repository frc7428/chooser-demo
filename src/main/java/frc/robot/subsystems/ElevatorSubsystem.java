/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.PWMVictorSPX;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class ElevatorSubsystem extends SubsystemBase {
  private final SpeedController mElevator = new PWMVictorSPX(Constants.PWM.ELEVATOR_MOTOR);
  /**
   * Creates a new ElevatorSubsystem.
   */
  public ElevatorSubsystem() {

  }

  public void raise() {
    mElevator.set(1);
  }

  public void lower() {
    mElevator.set(-1);
  }

  public void stop() {
    mElevator.set(0);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
