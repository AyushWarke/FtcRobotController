package org.firstinspires.ftc.teamcode.mechanisms;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class LizzieMechs {
    private DcMotor shoulder;
    private DcMotor elbow;
    private DcMotor turret;

    private Servo wrist1;
    private Servo wrist2;

    private Servo claw;

    private double tprshoulder;
    private double tprelbow;
    private double tprturret;


    public void init(HardwareMap hw)
    {
        shoulder = hw.get(DcMotor.class, "shoulder");
        shoulder.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        tprshoulder = shoulder.getMotorType().getTicksPerRev();
        shoulder.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        shoulder.setDirection(DcMotorSimple.Direction.REVERSE);

        elbow = hw.get(DcMotor.class, "elbow");
        elbow.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        tprelbow = elbow.getMotorType().getTicksPerRev();
        elbow.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        elbow.setDirection(DcMotorSimple.Direction.REVERSE);

        turret = hw.get(DcMotor.class, "turret");
        turret.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        tprturret = turret.getMotorType().getTicksPerRev();
        turret.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        wrist1 = hw.get(Servo.class, "wrist1");
        wrist2 = hw.get(Servo.class, "wrist2");
        claw = hw.get(Servo.class, "claw");
    }

    public void setShoulder(double speed){
        shoulder.setPower(speed);
    }

    public void setElbow(double speed){
        elbow.setPower(speed);
    }

    public void setTurret(double speed){
        turret.setPower(speed);
    }

    public void setWrist1(double angle){
        wrist1.setPosition(angle);

    }

    public void setWrist2(double angle){
        wrist2.setPosition(angle);

    }

    public void setClaw(double angle){
        claw.setPosition(angle);

    }

}
