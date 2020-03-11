package frc.team2412.robot.Commands.Drivebase;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.team2412.robot.Subsystems.DrivebaseSubsystem;

public class DriveCommand extends CommandBase {

	private DrivebaseSubsystem m_drivebaseSubsystem;
	private Joystick m_joystick;

	public DriveCommand(DrivebaseSubsystem drivebaseSubsystem, Joystick joystick) {
		m_drivebaseSubsystem = drivebaseSubsystem;
		m_joystick = joystick;
	}

	public void execute() {
		m_drivebaseSubsystem.drive(m_joystick);
	}

	public boolean isFinished() {
		return false;
	}

}
