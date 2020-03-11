package frc.team2412.robot;

import frc.team2412.robot.Subsystems.IntakeSubsystem;
import frc.team2412.robot.Subsystems.LiftSubsystem;
import frc.team2412.robot.Subsystems.DrivebaseSubsystem;

// this is the class for containing all the subsystems of the robot
public class RobotContainer {

	DrivebaseSubsystem m_drivebaseSubsystem;

	IntakeSubsystem m_intakeSubsystem;

	LiftSubsystem m_liftSubsystem;

	public RobotContainer() {

		m_drivebaseSubsystem = RobotMap.DrivebaseConnected
				? new DrivebaseSubsystem(RobotMap.drivebaseFrontMotor, RobotMap.drivebaseBackMotor)
				: null;

		m_intakeSubsystem = RobotMap.IntakeConnected ? new IntakeSubsystem(RobotMap.intakeMotor)
				: null;

		m_liftSubsystem = RobotMap.LiftConnected
				? new LiftSubsystem(RobotMap.liftSolenoid, RobotMap.liftDoubleSolenoid)
				: null;

	}
}
