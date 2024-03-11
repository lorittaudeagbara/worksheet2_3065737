public class Geometry3D {

    // Other methods...

    public static double calculateTetrahedronVolume(double edgeLength) {
        // Validate input parameters if needed
        if (edgeLength <= 0) {
            throw new IllegalArgumentException("Invalid edge length for a tetrahedron.");
        }

        // Calculate the volume of the tetrahedron
        double volume = Math.pow(edgeLength, 3) / (6 * Math.sqrt(2));

        return volume;
    }
}




