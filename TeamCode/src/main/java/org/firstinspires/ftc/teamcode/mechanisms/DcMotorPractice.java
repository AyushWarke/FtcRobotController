package org.firstinspires.ftc.teamcode.mechanisms;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@TeleOp
public class DcMotorPractice extends OpMode {

    TestBench bench = new TestBench();

    @Override
    public void init() {
        bench.init(hardwareMap);

    }

    @Override
    public void loop() {

        double motorSpeed = gamepad1.left_stick_y;

        if (gamepad1.a){
            bench.setMotorZeroBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        }
        else if (gamepad1.b){
            bench.setMotorZeroBehavior(DcMotor.ZeroPowerBehavior.FLOAT);
        }


        bench.setMotorSpeed(motorSpeed);

        telemetry.addData("Motor Revs", bench.getMotorRevs());

    }
}
