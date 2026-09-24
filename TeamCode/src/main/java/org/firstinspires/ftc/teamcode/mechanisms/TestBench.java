package org.firstinspires.ftc.teamcode.mechanisms;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class TestBench {
    private DcMotor motor; //normally more descriptive
    private double ticksPerRev;

    public void init(HardwareMap hwMap){
        //mechanism code sensor

        //motor
        motor = hwMap.get(DcMotor.class, "motor");
        motor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        ticksPerRev = motor.getMotorType().getTicksPerRev();
        motor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        motor.setDirection(DcMotorSimple.Direction.REVERSE);
    }

    public void setMotorSpeed(double speed){
        //accepts values btwn -1 and 1
        motor.setPower(speed);
    }

    public void setMotorZeroBehavior(DcMotor.ZeroPowerBehavior zeroBehavior){
        motor.setZeroPowerBehavior(zeroBehavior);

    }

    public double getMotorRevs(){
        return motor.getCurrentPosition() / ticksPerRev; //normalizing ticks to revolutions
        //ALSO ADD GEAR RATIOS HERE
    }
}
