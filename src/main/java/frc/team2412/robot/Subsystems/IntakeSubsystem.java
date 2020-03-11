package frc.team2412.robot.Subsystems;

import static frc.team2412.robot.Subsystems.constants.IntakeConstants.ticksPerRevolution;

import com.revrobotics.CANEncoder;
import com.revrobotics.CANPIDController;
import com.revrobotics.CANSparkMax;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class IntakeSubsystem extends SubsystemBase{

	private CANSparkMax m_motor;

	private CANEncoder m_encoder;

	private CANPIDController m_pid;

	public IntakeSubsystem(CANSparkMax motor) {
		m_motor = motor;
		m_encoder = motor.getEncoder();
		m_pid = motor.getPIDController();

		m_encoder.setPositionConversionFactor(ticksPerRevolution);
	}

	public void in() {
		set(1);
	}

	public void out() {
		set(-1);
	}

	public void off() {
		set(0);
	}

	public void set(double speed) {
		m_motor.set(speed);
	}

	public double getRevolutions() {
		return m_encoder.getPosition();
	}

	public void setP(double gain) {
		m_pid.setP(gain);
	}

}
