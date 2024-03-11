public class Geometry3D {

    // Other methods...

    public static double calculateSquarePyramidVolume(double baseLength, double height) {
        // Validate input parameters if needed
        if (baseLength <= 0 || height <= 0) {
            throw new IllegalArgumentException("Invalid dimensions for a square-based pyramid.");
        }

        // Calculate the volume of the square-based pyramid
        double volume = (1.0 / 3.0) * Math.pow(baseLength, 2) * height;

        return volume;
    }
}


