package frc.team2412.robot.Subsystems;

import static frc.team2412.robot.Subsystems.constants.DrivebaseConstants.ticksPerRevolution;

import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DrivebaseSubsystem extends SubsystemBase {

	private WPI_TalonSRX m_frontMotor;
	private WPI_TalonFX m_backMotor;
	
	private DifferentialDrive m_drive;

	public DrivebaseSubsystem(WPI_TalonSRX frontMotor, WPI_TalonFX backMotor) {
		m_frontMotor = frontMotor;
		m_backMotor = backMotor;
		m_drive = new DifferentialDrive(new SpeedControllerGroup(m_frontMotor), new SpeedControllerGroup(m_backMotor));
	}

	public void drive(Joystick joystick) {
		m_drive.arcadeDrive(joystick.getY(), Math.pow(joystick.getTwist(), 3));
	}
	
	public double getRevolutions() {
		return m_frontMotor.getSelectedSensorPosition() / ticksPerRevolution;
	}

	public void setBrakeMode() {
		m_frontMotor.setNeutralMode(NeutralMode.Brake);
		m_backMotor.setNeutralMode(NeutralMode.Brake);
	}

	public void setCoastMode() {
		m_frontMotor.setNeutralMode(NeutralMode.Coast);
		m_backMotor.setNeutralMode(NeutralMode.Coast);
	}

}
