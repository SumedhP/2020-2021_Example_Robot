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
	public static final boolean TalonSubsystemConnected = true;
	public static final boolean CANSpakMaxSubsystemConnected = true;
	public static final boolean SolenoidSubsystemConnected = true;

	// IDs
	public static final int FRONT_TALON_MOTOR_ID = 1;
	public static final int BACK_TALON_MOTOR_ID = 2;

	public static final int CANSPARKMAX_ID = 3;

	public static final int SOLENOID_PORT = 1;

	public static final int DOUBLE_SOLENOID_PORT_1 = 1;
	public static final int DOUBLE_SOLENOID_PORT_2 = 2;

	// Hardware stuff
	public static WPI_TalonFX backMotor = TalonSubsystemConnected ? new WPI_TalonFX(BACK_TALON_MOTOR_ID) : null;
	public static WPI_TalonSRX frontMotor = TalonSubsystemConnected ? new WPI_TalonSRX(FRONT_TALON_MOTOR_ID) : null;

	public static CANSparkMax motor = CANSpakMaxSubsystemConnected
			? new CANSparkMax(CANSPARKMAX_ID, MotorType.kBrushless)
			: null;

	public static Solenoid solenoid = SolenoidSubsystemConnected ? new Solenoid(SOLENOID_PORT) : null;
	public static DoubleSolenoid doubleSolenoid = SolenoidSubsystemConnected
			? new DoubleSolenoid(DOUBLE_SOLENOID_PORT_1, DOUBLE_SOLENOID_PORT_2)
			: null;

	// Robot container
	public static RobotContainer robotContainer = new RobotContainer();
	public static OI oi = new OI(robotContainer);
}
