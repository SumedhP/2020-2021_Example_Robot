package frc.team2412.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.CommandScheduler;
import edu.wpi.first.wpilibj2.command.button.Button;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.team2412.robot.Commands.Drivebase.DriveCommand;
import frc.team2412.robot.Commands.Intake.IntakeInCommand;
import frc.team2412.robot.Commands.Lift.LiftUpCommand;

//This is the class in charge of all the buttons and joysticks that the drivers will use to control the robot
public class OI {

	// Joysticks
	public Joystick driverStick = new Joystick(0);

	// Buttons	
	public Button intakeInButton = new JoystickButton(driverStick, 1);
	
	public Button liftUpButton = new JoystickButton(driverStick, 2);

	// Constructor to set all of the commands and buttons
	public OI(RobotContainer robotContainer) {
		// telling the button that when its pressed to execute example command with the
		// robot container's instance of example subsystem
		
		if(RobotMap.DrivebaseConnected) {
			DriveCommand drive = new DriveCommand(robotContainer.m_drivebaseSubsystem, driverStick);
			CommandScheduler.getInstance().schedule(drive);
		}
		
		if(RobotMap.IntakeConnected) {
			intakeInButton.whileHeld(new IntakeInCommand(robotContainer.m_intakeSubsystem));
		}
		
		if(RobotMap.LiftConnected) {
			liftUpButton.whenPressed(new LiftUpCommand(robotContainer.m_liftSubsystem));
		}
		
		
		
	}
}
