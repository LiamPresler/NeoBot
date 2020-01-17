package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class drivetrain extends SubsystemBase {
  
  private static CANSparkMax leftMotorCanSparkMax = new CANSparkMax(2, MotorType.kBrushless);
  private static CANSparkMax rightMotorCansparkMax = new CANSparkMax(1, MotorType.kBrushless);
  private static DifferentialDrive drive;
  

  public drivetrain() {
    leftMotorCanSparkMax.restoreFactoryDefaults();
    rightMotorCansparkMax.restoreFactoryDefaults();
    drive = new DifferentialDrive(leftMotorCanSparkMax, rightMotorCansparkMax);

  }
  public void arcadeDrive(double xSpeed, double zRotation) {     
    drive.arcadeDrive(xSpeed, zRotation);
  }
  
  @Override
  public void periodic() {

  }
}
