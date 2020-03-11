package frc.team2412.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Solenoid;

//This is the class in charge of all the motors, motor ids, and any other sensors the robot uses. 
//remember to declare robot container at the bottom of this class 
public class RobotMap {

	// Subsystem Cases
	public static final boolean DrivebaseConnected = true;
	public static final boolean IntakeConnected = true;
	public static final boolean LiftConnected = true;

	// IDs
	public static final int DRIVEBASE_FRONT_MOTOR_ID = 1;
	public static final int DRIVEBASE_BACK_MOTOR_ID = 2;

	public static final int INTAKE_MOTOR_ID = 3;

	public static final int LIFT_SOLENOID_PORT = 1;

	public static final int LIFT_DOUBLE_SOLENOID_PORT_1 = 1;
	public static final int LIFT_DOUBLE_SOLENOID_PORT_2 = 2;

	// Hardware stuff
	public static WPI_TalonFX drivebaseBackMotor = DrivebaseConnected ? new WPI_TalonFX(DRIVEBASE_BACK_MOTOR_ID) : null;
	public static WPI_TalonSRX drivebaseFrontMotor = DrivebaseConnected ? new WPI_TalonSRX(DRIVEBASE_FRONT_MOTOR_ID)
			: null;

	public static CANSparkMax intakeMotor = IntakeConnected ? new CANSparkMax(INTAKE_MOTOR_ID, MotorType.kBrushless)
			: null;

	public static Solenoid liftSolenoid = LiftConnected ? new Solenoid(LIFT_SOLENOID_PORT) : null;
	
	public static DoubleSolenoid liftDoubleSolenoid = LiftConnected
			? new DoubleSolenoid(LIFT_DOUBLE_SOLENOID_PORT_1, LIFT_DOUBLE_SOLENOID_PORT_2)
			: null;

	// Robot container
	public static RobotContainer m_robotContainer = new RobotContainer();
	public static OI m_oi = new OI(m_robotContainer);
}
