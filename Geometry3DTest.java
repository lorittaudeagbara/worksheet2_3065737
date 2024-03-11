import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Geometry3DTest {

    @Test
    void testSquarePyramidVolume() {
        // Given
        double baseLength = 4.0;
        double height = 3.0;
        double epsilon = 0.1;

        // When
        double calculatedVolume = Geometry3D.calculateSquarePyramidVolume(baseLength, height);

        // Then
        assertEquals(4.0, calculatedVolume, epsilon);
    
    }
}

