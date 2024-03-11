import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Geometry3DTest {

    @Test
    void testTetrahedronSurfaceArea() {
        // Given
        double edgeLength = 3.0;
        double epsilon = 0.1;

        // When
        double calculatedSurfaceArea = Geometry3D.calculateTetrahedronSurfaceArea(edgeLength);

        // Then
        assertEquals(7.794, calculatedSurfaceArea, epsilon);
        
    }
}



