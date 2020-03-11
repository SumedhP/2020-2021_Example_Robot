package frc.team2412.robot.Commands.Intake;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.team2412.robot.Subsystems.IntakeSubsystem;

public class IntakeInCommand extends CommandBase {

	private IntakeSubsystem m_intakeSubsystem;

	public IntakeInCommand(IntakeSubsystem intakeSubsysem) {
		m_intakeSubsystem = intakeSubsysem;
	}

	public void execute() {
		m_intakeSubsystem.in();
	}

	public void end(boolean cancelled) {
		if(cancelled) {
			m_intakeSubsystem.off();
		}	
	}

	public boolean isFinished() {
		return true;
	}
}
