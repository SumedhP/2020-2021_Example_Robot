package frc.team2412.robot;

import frc.team2412.robot.Subsystems.CANSparkMaxSubsystem;
import frc.team2412.robot.Subsystems.SolenoidSubsystem;
import frc.team2412.robot.Subsystems.TalonSubsystem;

// this is the class for containing all the subsystems of the robot
public class RobotContainer {

	TalonSubsystem m_talonSubsystem;

	CANSparkMaxSubsystem m_CANSparkMaxSubsystem;

	SolenoidSubsystem m_solenoidSubsystem;

	public RobotContainer() {

		m_talonSubsystem = RobotMap.TalonSubsystemConnected
				? new TalonSubsystem(RobotMap.frontMotor, RobotMap.backMotor)
				: null;

		m_CANSparkMaxSubsystem = RobotMap.CANSpakMaxSubsystemConnected ? new CANSparkMaxSubsystem(RobotMap.motor)
				: null;

		m_solenoidSubsystem = RobotMap.SolenoidSubsystemConnected
				? new SolenoidSubsystem(RobotMap.solenoid, RobotMap.doubleSolenoid)
				: null;

	}
}
