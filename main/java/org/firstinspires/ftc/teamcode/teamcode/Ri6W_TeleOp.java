package org.firstinspires.ftc.teamcode.teamcode;//package org.firstinspires.ftc.teamcode;
//
//import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
//import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
//import com.qualcomm.robotcore.hardware.DcMotor;
//import com.qualcomm.robotcore.hardware.DcMotorSimple;
//import com.qualcomm.robotcore.util.ElapsedTime;
//
//@TeleOp
//public class Ri6W_TeleOp extends LinearOpMode {
//
//
//    private ElapsedTime runtime = new ElapsedTime();
//    private DcMotor frontLeft = null;
//    private DcMotor frontRight = null;
//    private DcMotor backLeft = null;
//    private DcMotor backRight = null;
//
//    @Override
//    public void runOpMode() {
//
//        frontLeft = hardwareMap.get(DcMotor.class, "frontLeft");
//        frontRight = hardwareMap.get(DcMotor.class, "frontRight");
//        backLeft = hardwareMap.get(DcMotor.class, "backLeft");
//        backRight = hardwareMap.get(DcMotor.class, "backRight");
//
//// Set direction
//        frontLeft.setDirection(DcMotor.Direction.FORWARD);
//        frontRight.setDirection(DcMotor.Direction.REVERSE);
//        backLeft.setDirection(DcMotor.Direction.REVERSE);
//        backRight.setDirection(DcMotor.Direction.FORWARD);
//
//        // Brake
//
//        frontLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
//        frontRight.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
//        backLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
//        backRight.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
//
//        while (opModeIsActive()) {
//
//            double frontLeftPower = (xpower + ypower + rpower) / denom;
//            double frontRightPower = (ypower - xpower - rpower) / denom;
//            double backLeftPower = (ypower - xpower + rpower) / denom;
//            double backRightPower = (ypower + xpower - rpower) / denom;
//
//
//
//
//
//        }
//        }
//
//
//        }
//
//
//
//
////}
////// Retrieve the IMU from the hardware map
////imu = hardwareMap.get(IMU.class, "imu");
////// Adjust the orientation parameters to match your robot
////IMU.Parameters parameters = new IMU.Parameters(new RevHubOrientationOnRobot(
////        RevHubOrientationOnRobot.LogoFacingDirection.UP,
////        RevHubOrientationOnRobot.UsbFacingDirection.FORWARD));
////// Without this, the REV Hub's orientation is assumed to be logo up / USB forward
////imu.initialize(parameters);
////// Retrieve the IMU from the hardware map
////imu = hardwareMap.get(IMU.class, "imu");
////// Adjust the orientation parameters to match your robot
////IMU.Parameters parameters = new IMU.Parameters(new RevHubOrientationOnRobot(
////        RevHubOrientationOnRobot.LogoFacingDirection.UP,
////        RevHubOrientationOnRobot.UsbFacingDirection.FORWARD));
////// Without this, the REV Hub's orientation is assumed to be logo up / USB forward
////imu.initialize(parameters);
////// This button choice was made so that it is hard to hit on accident,
////// it can be freely changed based on preference.
////// The equivalent button is start on Xbox-style controllers.
////if (gamepad1.options) {
////    imu.resetYaw();
////}
////
////double botHeading = imu.getRobotYawPitchRollAngles().getYaw(AngleUnit.RADIANS);
////// Rotate the movement direction counter to the bot's rotation
////double rotX = x * Math.cos(-botHeading) - y * Math.sin(-botHeading);
////double rotY = x * Math.sin(-botHeading) + y * Math.cos(-botHeading);
////double denominator = Math.max(Math.abs(rotY) + Math.abs(rotX) + Math.abs(rx), 1);
////double frontLeftPower = (rotY + rotX + rx) / denominator;
////double backLeftPower = (rotY - rotX + rx) / denominator;
////double frontRightPower = (rotY - rotX - rx) / denominator;
////double backRightPower = (rotY + rotX - rx) / denominator;
////package org.firstinspires.ftc.teamcode;
////
////import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
////import com.qualcomm.robotcore.hardware.IMU;
////import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
////import com.qualcomm.robotcore.hardware.DcMotor;
////import com.qualcomm.robotcore.hardware.DcMotorSimple;
////import com.qualcomm.hardware.rev.RevHubOrientationOnRobot;
////import org.firstinspires.ftc.robotcore.external.navigation.AngleUnit;
////
////@TeleOp
////public class FieldCentricMecanumTeleOp extends LinearOpMode {
////    @Override
////    public void runOpMode() throws InterruptedException {
////        // Declare our motors
////        // Make sure your ID's match your configuration
////        DcMotor frontLeftMotor = hardwareMap.dcMotor.get("frontLeftMotor");
////        DcMotor backLeftMotor = hardwareMap.dcMotor.get("backLeftMotor");
////        DcMotor frontRightMotor = hardwareMap.dcMotor.get("frontRightMotor");
////        DcMotor backRightMotor = hardwareMap.dcMotor.get("backRightMotor");
////
////        // Reverse the right side motors. This may be wrong for your setup.
////        // If your robot moves backwards when commanded to go forwards,
////        // reverse the left side instead.
////        // See the note about this earlier on this page.
////        frontRightMotor.setDirection(DcMotorSimple.Direction.REVERSE);
////        backRightMotor.setDirection(DcMotorSimple.Direction.REVERSE);
////
////        // Retrieve the IMU from the hardware map
////        IMU imu = hardwareMap.get(IMU.class, "imu");
////        // Adjust the orientation parameters to match your robot
////        IMU.Parameters parameters = new IMU.Parameters(new RevHubOrientationOnRobot(
////                RevHubOrientationOnRobot.LogoFacingDirection.UP,
////                RevHubOrientationOnRobot.UsbFacingDirection.FORWARD));
////        // Without this, the REV Hub's orientation is assumed to be logo up / USB forward
////        imu.initialize(parameters);
////
////        waitForStart();
////
////        if (isStopRequested()) return;
////
////        while (opModeIsActive()) {
////            double y = -gamepad1.left_stick_y; // Remember, Y stick value is reversed
////            double x = gamepad1.left_stick_x;
////            double rx = gamepad1.right_stick_x;
////
////            // This button choice was made so that it is hard to hit on accident,
////            // it can be freely changed based on preference.
////            // The equivalent button is start on Xbox-style controllers.
////            if (gamepad1.options) {
////                imu.resetYaw();
////            }
////
////            double botHeading = imu.getRobotYawPitchRollAngles().getYaw(AngleUnit.RADIANS);
////
////            // Rotate the movement direction counter to the bot's rotation
////            double rotX = x * Math.cos(-botHeading) - y * Math.sin(-botHeading);
////            double rotY = x * Math.sin(-botHeading) + y * Math.cos(-botHeading);
////
////            rotX = rotX * 1.1;  // Counteract imperfect strafing
////
////            // Denominator is the largest motor power (absolute value) or 1
////            // This ensures all the powers maintain the same ratio,
////            // but only if at least one is out of the range [-1, 1]
////            double denominator = Math.max(Math.abs(rotY) + Math.abs(rotX) + Math.abs(rx), 1);
////            double frontLeftPower = (rotY + rotX + rx) / denominator;
////            double backLeftPower = (rotY - rotX + rx) / denominator;
////            double frontRightPower = (rotY - rotX - rx) / denominator;
////            double backRightPower = (rotY + rotX - rx) / denominator;
////
////            frontLeftMotor.setPower(frontLeftPower);
////            backLeftMotor.setPower(backLeftPower);
////            frontRightMotor.setPower(frontRightPower);
////            backRightMotor.setPower(backRightPower);
////        }
////    }
////}