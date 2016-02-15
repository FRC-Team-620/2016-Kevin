// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc620.Kevin;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PowerDistributionPanel;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Ultrasonic;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static CANTalon driveTrainLeftFront;
    public static CANTalon driveTrainLeftBack;
    public static CANTalon driveTrainRightFront;
    public static CANTalon driveTrainRightBack;
    public static RobotDrive driveTrainRobotDrive;
    public static DigitalInput bucketLimitUpper;
    public static DigitalInput bucketLimitLower;
    public static CANTalon bucketWindowMotor;
    public static DoubleSolenoid lifterDoubleSolenoid1;
    public static DoubleSolenoid lifterDoubleSolenoid2;
    public static Ultrasonic lidarLidarSensor;
    public static PowerDistributionPanel powerBuspowerBoard;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveTrainLeftFront = new CANTalon(1);
        LiveWindow.addActuator("Drive Train", "Left Front", driveTrainLeftFront);
        
        driveTrainLeftBack = new CANTalon(2);
        LiveWindow.addActuator("Drive Train", "Left Back", driveTrainLeftBack);
        
        driveTrainRightFront = new CANTalon(3);
        LiveWindow.addActuator("Drive Train", "Right Front", driveTrainRightFront);
        
        driveTrainRightBack = new CANTalon(4);
        LiveWindow.addActuator("Drive Train", "Right Back", driveTrainRightBack);
        
        driveTrainRobotDrive = new RobotDrive(driveTrainLeftFront, driveTrainLeftBack,
              driveTrainRightFront, driveTrainRightBack);
        
        driveTrainRobotDrive.setSafetyEnabled(true);
        driveTrainRobotDrive.setExpiration(0.1);
        driveTrainRobotDrive.setSensitivity(0.5);
        driveTrainRobotDrive.setMaxOutput(1.0);

        bucketLimitUpper = new DigitalInput(0);
        LiveWindow.addSensor("Bucket", "Limit Upper", bucketLimitUpper);
        
        bucketLimitLower = new DigitalInput(1);
        LiveWindow.addSensor("Bucket", "Limit Lower", bucketLimitLower);
        
        bucketWindowMotor = new CANTalon(5);
        LiveWindow.addActuator("Bucket", "Window Motor", bucketWindowMotor);
        
        lifterDoubleSolenoid1 = new DoubleSolenoid(0, 0, 1);
        LiveWindow.addActuator("Lifter", "Double Solenoid 1", lifterDoubleSolenoid1);
        
        lifterDoubleSolenoid2 = new DoubleSolenoid(0, 2, 3);
        LiveWindow.addActuator("Lifter", "Double Solenoid 2", lifterDoubleSolenoid2);
        
        lidarLidarSensor = new Ultrasonic(2, 3);
        LiveWindow.addSensor("Lidar", "LidarSensor", lidarLidarSensor);
        
        powerBuspowerBoard = new PowerDistributionPanel(0);
        LiveWindow.addSensor("Power Bus", "powerBoard", powerBuspowerBoard);
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
