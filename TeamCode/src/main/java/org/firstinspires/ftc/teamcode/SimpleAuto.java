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
            leftFront.setPower(1);
            leftRear.setPower(1);
            rightFront.setPower(1);
            rightRear.setPower(1);
        } while (timer.time() < 1000);

        leftFront.setPower(0);
        leftRear.setPower(0);
        rightFront.setPower(0);
        rightRear.setPower(0);
    }
}
