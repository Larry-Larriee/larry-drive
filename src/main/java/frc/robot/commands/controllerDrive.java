// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.Drivebase;
import edu.wpi.first.wpilibj2.command.CommandBase;

/** An example command that uses an example subsystem. */
public class controllerDrive extends CommandBase {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
  private final Drivebase m_Drivebase;

  double leftJoystickY = 0.0;
  double rightJoystickX = 0.0;

  // Joystick returns a double
  public controllerDrive(Drivebase subsystem, double leftJoystickY, double rightJoystickX) {
    m_Drivebase = subsystem;
 
    this.leftJoystickY = leftJoystickY;
    this.rightJoystickX = rightJoystickX;

    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(subsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {

    // Robot moves depending on the moving of the joystick
    // The joystick returns doubles which change aracadedrive speed and direction
    m_Drivebase.ArcadeDrive(leftJoystickY, rightJoystickX);
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {}

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
