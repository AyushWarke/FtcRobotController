package org.firstinspires.ftc.teamcode.mechanisms;


import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.HardwareMap;

@TeleOp
public class Lizzie26_v1 extends OpMode {

    LizzieMechs liz = new LizzieMechs();

    @Override
    public void init(){
        liz.init(hardwareMap);
    }

    @Override
    public void loop(){

        double shoulderSpeed = gamepad1.left_stick_y;
        double elbowSpeed = gamepad1.right_stick_y;
        double turretSpeed = gamepad1.right_stick_x;

        liz.setShoulder(shoulderSpeed * 0.6);
        liz.setElbow(elbowSpeed * 0.6);
        liz.setTurret(turretSpeed * 0.8);

        if (gamepad1.a){
            liz.setClaw(1.0);
        }
        else {
            liz.setClaw(0.69);
        }


    }

}
