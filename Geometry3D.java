public class Geometry3D {

    // Other methods...

    public static double calculateCuboidSurfaceArea(double length, double width, double height) {
        // Validate input parameters if needed
        if (length <= 0 || width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Invalid dimensions for a cuboid.");
        }

        // Calculate the surface area of the cuboid
        double surfaceArea = 2 * (length * width + width * height + height * length);

        return surfaceArea;
    }
}

