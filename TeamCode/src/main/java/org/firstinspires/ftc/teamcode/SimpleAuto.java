package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;

@Autonomous

public class SimpleAuto extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {
        ElapsedTime timer = new ElapsedTime();
        DcMotor leftFront = hardwareMap.get(DcMotor.class, "left front");
        DcMotor rightFront = hardwareMap.get(DcMotor.class, "right front");
        DcMotor leftRear = hardwareMap.get(DcMotor.class, "left rear");
        DcMotor rightRear = hardwareMap.get(DcMotor.class, "right rear");

        timer.reset();
        do {
            leftFront.setPower(.5);
            leftRear.setPower(.5);
            rightFront.setPower(.5);
            rightRear.setPower(.5);
        } while (timer.time() < 10);

        leftFront.setPower(0);
        leftRear.setPower(0);
        rightFront.setPower(0);
        rightRear.setPower(0);
    }
}
