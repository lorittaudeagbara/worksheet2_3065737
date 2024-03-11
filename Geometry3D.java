public class Geometry3D {

    // Other methods...

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






