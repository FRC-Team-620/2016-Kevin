package src.org.usfirst.frc620.Kevin.commands;

import edu.wpi.first.wpilibj.command.Command;
import src.org.usfirst.frc620.Kevin.Robot;

public class AutonomousCommand extends Command {
	//replace speed with another value after testing
int speed = 10;
//replace turn with another value after testing
int turn = 90;

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
	public AutonomousCommand(int barrier, boolean draw, boolean port, int lane){
		//First go through the barrier
		if (barrier == 1){
			portcullis();
		}
		if (barrier == 2){
			chevaldeFrise();
		}
		if (barrier == 3){
			moat();
		}
		if (barrier == 4){
			ramparts();
		}
		if (barrier == 5){
			rockwall();
		}
		if (barrier == 6){
			roughTerrain();
		}
		if (barrier == 7){
			lowbar();
		}
		//next, if the box is checked, go around and open a barrier from behind
		if (draw) {
			drawbridge();
		}
		else if (port) {
			sallyport();
		}
		//if neither box was checked, then rotate towards the tower
		else {
			rotateTowardsTower(lane);
		}
	}
	protected void portcullis() {
		 //Open door with arm
		
		//Go through
		Robot.driveTrain.tankDrive(speed, 0);
		
	}
	protected void  chevaldeFrise(){
		//Pull piece down
		
		//Go over
		Robot.driveTrain.tankDrive(speed, 0);
	}
	protected void moat() {
		//If the tank tread power mode thing is on the robot, trigger it
		//Brute force charge
		Robot.driveTrain.tankDrive(speed, 0);
	}
	protected void ramparts() {
		//Careful-speed
		Robot.driveTrain.tankDrive(speed/2, 0);
		//High torque
		//Charge forward
		//On wheel hit ramp, start focusing more power into torque
	}
	protected void drawbridge(){
		//Boolean at end to turn around and open it
		Robot.driveTrain.tankDrive(0, turn);
		Robot.driveTrain.tankDrive(speed, 0);
		Robot.driveTrain.tankDrive(0, turn);
		//Open the door with movement?
		Robot.driveTrain.tankDrive(speed, 0);



	}
	protected void sallyport() {
		//Boolean at end to turn around and open it
				Robot.driveTrain.tankDrive(0, turn);
				Robot.driveTrain.tankDrive(speed, 0);
				Robot.driveTrain.tankDrive(0, turn);
				//Open the door with movement?
				Robot.driveTrain.tankDrive(speed, 0);

	}
	protected void rockwall() {
//If the tank tread power mode thing is on the robot, trigger it
		//charge
		Robot.driveTrain.tankDrive(speed, 0);

	}
	protected void roughTerrain() {
		//If the tank tread power mode thing is on the robot, trigger it
				//charge
		Robot.driveTrain.tankDrive(speed, 0);
	}
	protected void lowbar() {
		//If the tank tread lowbar mode thing is on the robot, trigger it
		//charge carefully
		Robot.driveTrain.tankDrive(speed*0.8685, 0);
	}
	protected void rotateTowardsTower (int x){
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