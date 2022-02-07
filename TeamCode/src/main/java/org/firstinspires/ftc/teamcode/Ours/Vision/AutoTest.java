package org.firstinspires.ftc.teamcode.Ours.Vision;

import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.drive.SampleMecanumDrive;
import org.firstinspires.ftc.teamcode.trajectorysequence.TrajectorySequence;
@Autonomous(name = "trajectoryTest")
public class AutoTest extends LinearOpMode {
    SampleMecanumDrive drive = new SampleMecanumDrive(hardwareMap);
    Pose2d startPos = new Pose2d(-35, -62, Math.toRadians(90));
    @Override
    public void runOpMode() throws InterruptedException {
        TrajectorySequence trajSeq = drive.trajectorySequenceBuilder(startPos)
                .forward(2)
                .strafeLeft(10)
                .addDisplacementMarker(() -> {
                        //spin the thing
                })
                .lineToSplineHeading(new Pose2d(-24, -37, Math.toRadians(45)))
                .addTemporalMarker(() -> {
                        //deliver pre loaded block
                })
                .lineToLinearHeading(new Pose2d(-60, -35, Math.toRadians(0)))
                .build();
    }
}
