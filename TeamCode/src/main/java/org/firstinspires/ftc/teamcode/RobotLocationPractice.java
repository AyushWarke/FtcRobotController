package org.firstinspires.ftc.teamcode;

public class RobotLocationPractice {

    double angle;

    // constructor:
    public RobotLocationPractice(double angle){
        this.angle = angle;
    }

    public double getHeading(){
        //this normalizes robot heading between -180 and 180 degrees

        double angle = this.angle;
        while (angle > 180) {
            angle -= 360;
        }
        while (angle <= -180) {
            angle += 360;
        }
        return angle;
    }

    public void turnRobot(double angleChange) {
        angle += angleChange;

    }

    public void setAngle(double angle) {
        this.angle = angle;
    }

    public double getAngle(){
        
    }

}
