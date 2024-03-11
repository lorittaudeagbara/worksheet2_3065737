import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Geometry3DTest {

    @Test
    void testTetrahedronVolume() {
        // Given
        double edgeLength = 3.0;
        double epsilon = 0.1;

        // When
        double calculatedVolume = Geometry3D.calculateTetrahedronVolume(edgeLength);

        // Then
        assertEquals(1.0, calculatedVolume, epsilon);
        
    }
}


