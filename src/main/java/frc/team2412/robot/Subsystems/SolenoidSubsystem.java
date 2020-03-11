package frc.team2412.robot.Subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Solenoid;

public class SolenoidSubsystem {

	private Solenoid m_solenoid;
	private DoubleSolenoid m_doubleSolenoid;

	public SolenoidSubsystem(Solenoid solenoid, DoubleSolenoid doubleSolenoid) {
		m_solenoid = solenoid;
		m_doubleSolenoid = doubleSolenoid;
	}

	public void solenoidOn() {
		setSelonoid(true);
	}

	public void solenoidOff() {
		setSelonoid(false);
	}

	public void setSelonoid(boolean on) {
		m_solenoid.set(on);
	}

	public void doubleSolenoidForward() {
		setDoubleSolenoid(DoubleSolenoid.Value.kForward);
	}

	public void doubleSolenoidBackward() {
		setDoubleSolenoid(DoubleSolenoid.Value.kReverse);
	}

	public void doubleSolenoidOff() {
		setDoubleSolenoid(DoubleSolenoid.Value.kOff);
	}

	public void setDoubleSolenoid(DoubleSolenoid.Value value) {
		m_doubleSolenoid.set(value);
	}
}
