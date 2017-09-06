package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.util.ElapsedTime;

/**
 * Created by jimly on 8/28/2017.
 */
@Autonomous (name="Test", group="tests")

public class Test extends OpMode {

    ElapsedTime runtime = new ElapsedTime();

    @Override
    public void init() {
        telemetry.addData(">", "Hello There");
    }

    @Override
    public void start() {
        runtime.reset();
    }

    @Override
    public void loop() {
        telemetry.addData("Run Time:", runtime.toString());
    }
}
