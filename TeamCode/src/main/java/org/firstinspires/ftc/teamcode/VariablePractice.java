package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
@Disabled
public class VariablePractice extends OpMode {
    @Override
    public void init(){
        int teamNumber = 3565;
        double motorSpeed = 0.5;
        boolean clawClosed = true;

        telemetry.addData("Team Number: ", teamNumber);
        telemetry.addData("Motorspeed: ", motorSpeed);
        telemetry.addData("Clawclosed: ", clawClosed);
    }
    @Override
    public void loop(){

    }
}
