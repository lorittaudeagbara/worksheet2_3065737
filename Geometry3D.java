public class Geometry3D {

    // Other methods...

    public static double calculateCuboidVolume(double length, double width, double height) {
        // Validate input parameters if needed
        if (length <= 0 || width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Invalid dimensions for a cuboid.");
        }

        // Calculate the volume of the cuboid
        double volume = length * width * height;

        return volume;
    }
}
