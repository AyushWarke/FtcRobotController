package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
@Disabled
public class GamePadPractice extends OpMode {

    @Override
    public void init(){

    }

    @Override
    public void loop(){

        double speedForward = gamepad1.left_stick_y / 2.0;
        double sumTriggers = gamepad1.left_trigger + gamepad1.right_trigger;

        telemetry.addData("x", gamepad1.left_stick_x);
        telemetry.addData("y", speedForward);
        telemetry.addData("a", gamepad1.a);
        telemetry.addData("sumtrig: ", sumTriggers);

    }

}
