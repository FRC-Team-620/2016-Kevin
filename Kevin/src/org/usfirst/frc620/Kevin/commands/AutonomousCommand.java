package org.usfirst.frc620.programmingchassisbasecode;

import edu.wpi.first.wpilibj.command.Command;

public class AutonomousCommand extends Command {
int speed = 10;
//replace speed with another value after testing
int turn = 90;
//replace turn with another value after testing
	@Override
	protected void end() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void execute() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void initialize() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub

	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}
	protected AutonomousCommand(int barrier, boolean draw, boolean port, int lane){
		//First go through the barrier
		if (barrier == 1){
			Portcullis();
		}
		if (barrier == 2){
			ChevaldeFrise();
		}
		if (barrier == 3){
			Moat();
		}
		if (barrier == 4){
			Ramparts();
		}
		if (barrier == 5){
			rockwall();
		}
		if (barrier == 6){
			roughterrain();
		}
		if (barrier == 7){
			lowbar();
		}
		//next, if the box is checked, go around and open a barrier from behind
		if (draw){
			drawbridge();
		}
		else if (port){
			sallyport();
		}
		//if neither box was checked, then rotate towards the tower
		else {
			rotatetowardstower(lane);
		}
	}
	protected void Portcullis() {
		 //Open door with arm
		
		//Go through
		Robot.drivetrain.tankDrive(speed, 0);
		
	}
	protected void  ChevaldeFrise(){
		//Pull piece down
		
		//Go over
		Robot.drivetrain.tankDrive(speed, 0);
	}
	protected void Moat() {
		//If the tank tread power mode thing is on the robot, trigger it
		//Brute force charge
		Robot.drivetrain.tankDrive(speed, 0);
	}
	protected void Ramparts() {
		//Careful-speed
		Robot.drivetrain.tankDrive(speed/2, 0);
		//High torque
		//Charge forward
		//On wheel hit ramp, start focusing more power into torque
	}
	protected void drawbridge(){
		//Boolean at end to turn around and open it
		Robot.drivetrain.tankDrive(0, turn);
		Robot.drivetrain.tankDrive(speed, 0);
		Robot.drivetrain.tankDrive(0, turn);
		//Open the door with movement?
		Robot.drivetrain.tankDrive(speed, 0);



	}
	protected void sallyport() {
		//Boolean at end to turn around and open it
				Robot.drivetrain.tankDrive(0, turn);
				Robot.drivetrain.tankDrive(speed, 0);
				Robot.drivetrain.tankDrive(0, turn);
				//Open the door with movement?
				Robot.drivetrain.tankDrive(speed, 0);

	}
	protected void rockwall() {
//If the tank tread power mode thing is on the robot, trigger it
		//charge
		Robot.drivetrain.tankDrive(speed, 0);

	}
	protected void roughterrain() {
		//If the tank tread power mode thing is on the robot, trigger it
				//charge
		Robot.drivetrain.tankDrive(speed, 0);
	}
	protected void lowbar() {
		//If the tank tread lowbar mode thing is on the robot, trigger it
		//charge carefully
		Robot.drivetrain.tankDrive(speed*0.8685, 0);
	}
	protected void rotatetowardstower (int x){
		if (x == 1){
			//rotate towards tower
		}
		if (x == 2) {
			//rotate towards tower

		}
		if (x == 3) {
			//rotate towards tower

		}
		if (x == 4) {
			//rotate towards tower

		}
	}
	
	

}