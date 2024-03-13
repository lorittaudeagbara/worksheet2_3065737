 //Task 2
public class Geometry3D {

    // Other methods...
   //Task 3

    public static double calculateCuboidVolume(double length, double width, double height) {
        // Validate input parameters if needed
        if (length <= 0 || width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Invalid dimensions for a cuboid.");
        }

        // Calculate the volume of the cuboid
        double volume = length * width * height;

        return volume;
    }
    //Task 4
    
    public static double calculateCuboidSurfaceArea(double length, double width, double height) {
        // Validate input parameters if needed
        if (length <= 0 || width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Invalid dimensions for a cuboid.");
        }

        // Calculate the surface area of the cuboid
        double surfaceArea = 2 * (length * width + width * height + height * length);

        return surfaceArea;
    }
    //Task 5
    public static double calculateSquarePyramidVolume(double baseLength, double height) {
        // Validate input parameters if needed
        if (baseLength <= 0 || height <= 0) {
            throw new IllegalArgumentException("Invalid dimensions for a square-based pyramid.");
        }

        // Calculate the volume of the square-based pyramid
        double volume = (1.0 / 3.0) * Math.pow(baseLength, 2) * height;

        return volume;
    }
    //Task 6
    public static double calculateSquarePyramidSurfaceArea(double baseLength, double slantHeight) {
        // Validate input parameters if needed
        if (baseLength <= 0 || slantHeight <= 0) {
            throw new IllegalArgumentException("Invalid dimensions for a square-based pyramid.");
        }

        // Calculate the surface area of the square-based pyramid
        double surfaceArea = baseLength * (baseLength + Math.sqrt(Math.pow(slantHeight, 2) + Math.pow(baseLength / 2.0, 2)));

        return surfaceArea;
    }
    //Task 7
    public static double calculateTetrahedronVolume(double edgeLength) {
        // Validate input parameters if needed
        if (edgeLength <= 0) {
            throw new IllegalArgumentException("Invalid edge length for a tetrahedron.");
        }

        // Calculate the volume of the tetrahedron
        double volume = Math.pow(edgeLength, 3) / (6 * Math.sqrt(2));

        return volume;
    }
    //Task 8
    public static double calculateTetrahedronSurfaceArea(double edgeLength) {
        // Validate input parameters if needed
        if (edgeLength <= 0) {
            throw new IllegalArgumentException("Invalid edge length for a tetrahedron.");
        }

        // Calculate the surface area of the tetrahedron
        double surfaceArea = Math.sqrt(3) * Math.pow(edgeLength, 2);

        return surfaceArea;
    }
}







