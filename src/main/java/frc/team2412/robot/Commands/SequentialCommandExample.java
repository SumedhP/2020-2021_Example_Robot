package frc.team2412.robot.Commands;

import java.util.function.BooleanSupplier;

import edu.wpi.first.wpilibj2.command.ConditionalCommand;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.team2412.robot.Commands.Intake.IntakeInCommand;
import frc.team2412.robot.Commands.Lift.LiftUpCommand;
import frc.team2412.robot.Subsystems.IntakeSubsystem;
import frc.team2412.robot.Subsystems.LiftSubsystem;

public class SequentialCommandExample extends SequentialCommandGroup {

	public SequentialCommandExample(IntakeSubsystem intakeSubsystem, LiftSubsystem liftSubsystem, BooleanSupplier shootOut) {
		super(
				new LiftUpCommand(liftSubsystem),
				new InstantCommand(() -> intakeSubsystem.out()),
				new ConditionalCommand(new IntakeInCommand(intakeSubsystem), new LiftUpCommand(liftSubsystem), shootOut)
				);
	}

}
