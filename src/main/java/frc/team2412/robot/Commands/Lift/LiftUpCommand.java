package frc.team2412.robot.Commands.Lift;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.team2412.robot.Subsystems.LiftSubsystem;

public class LiftUpCommand extends CommandBase {

	private LiftSubsystem m_liftSubsystem;
	
	public LiftUpCommand(LiftSubsystem liftSubsystem) {
		m_liftSubsystem = liftSubsystem;
	}

	public void execute() {
		m_liftSubsystem.doubleSolenoidForward();
		m_liftSubsystem.solenoidOn();
	}

	public void end(boolean cancelled) {

	}

	public boolean isFinished() {
		return true;
	}

}
