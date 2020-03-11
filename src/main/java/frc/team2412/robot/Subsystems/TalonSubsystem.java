package frc.team2412.robot.Subsystems;

import static frc.team2412.robot.Subsystems.constants.TalonConstants.ticksPerRevolution;

import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

public class TalonSubsystem {

	private WPI_TalonSRX m_frontMotor;
	private WPI_TalonFX m_backMotor;

	public TalonSubsystem(WPI_TalonSRX frontMotor, WPI_TalonFX backMotor) {
		m_frontMotor = frontMotor;
		m_backMotor = backMotor;
	}

	public void on() {
		set(1);
	}

	public void off() {
		set(0);
	}

	public void out() {
		set(-1);
	}

	public void set(double speed) {
		m_frontMotor.set(speed);
		m_backMotor.set(speed);
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
