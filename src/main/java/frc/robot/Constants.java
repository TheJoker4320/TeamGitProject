package frc.robot;

import edu.wpi.first.math.kinematics.DifferentialDriveKinematics;
import edu.wpi.first.math.util.Units;


public final class Constants {

    public static final class DriveTrainConstants {
        public static final int leftFrontCANID = 1;
        public static final int leftBackCANID = 2;
        public static final int rightFrontCANID = 3;
        public static final int rightBackCANID = 4;

        public static final double ksVolts = 0.20322;
        public static final double kvVoltSecondsPerMeter = 3.2976;
        public static final double kaVoltSecondsSquaredPerMeter = 0.67542;
        public static final double kPDriveVel = 4.569;

        public static final double kTrackWidthMeters = Units.inchesToMeters(23);
        public static final DifferentialDriveKinematics kDriveKinematics = new DifferentialDriveKinematics(
                kTrackWidthMeters);


        public static final double kRamseteB = 2;
        public static final double kRamseteZeta = 0.7;

        public static final double kGearRatio = 12.6;
        public static final double kWheelRadiusInches = 3;

        public static final double kLinearDistanceConversionFactor = (Units
                .inchesToMeters(1 / (kGearRatio * 2 * Math.PI * Units.inchesToMeters(kWheelRadiusInches)) * 10));

    }

}