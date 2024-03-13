import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
//Task 2
class Geometry3DTest {
//Task 3
    @Test
    void testCuboidVolume() {
        // Given
        double length = 5.0;
        double width = 3.0;
        double height = 4.0;
        double epsilon = 0.1;

        // When
        double calculatedVolume = Geometry3D.calculateCuboidVolume(length, width, height);

        // Then
        assertEquals(60.0, calculatedVolume, epsilon);
         // Additional test cases
    double length2 = 2.0;
    double width2 = 2.0;
    double height2 = 2.0;
    double epsilon2 = 0.1;
    double calculatedVolume2 = Geometry3D.calculateCuboidVolume(length2, width2, height2);
    assertEquals(8.0, calculatedVolume2, epsilon2);

    double length3 = 10.0;
    double width3 = 10.0;
    double height3 = 10.0;
    double epsilon3 = 0.1;
    double calculatedVolume3 = Geometry3D.calculateCuboidVolume(length3, width3, height3);
    assertEquals(1000.0, calculatedVolume3, epsilon3);
        
    }
    
  //Task 4
        @Test
        void testCuboidSurfaceArea() {
            // Given
           
                double length1 = 5.0;
                double width1 = 3.0;
                double height1 = 4.0;
                double epsilon1 = 0.1;
                double calculatedSurfaceArea1 = Geometry3D.calculateCuboidSurfaceArea(length1, width1, height1);
                assertEquals(94.0, calculatedSurfaceArea1, epsilon1);
            
                // Test 2
                double length2 = 2.0;
                double width2 = 2.0;
                double height2 = 2.0;
                double epsilon2 = 0.1;
                double calculatedSurfaceArea2 = Geometry3D.calculateCuboidSurfaceArea(length2, width2, height2);
                assertEquals(24.0, calculatedSurfaceArea2, epsilon2);
            
                // Test 3
                double length3 = 10.0;
                double width3 = 5.0;
                double height3 = 3.0;
                double epsilon3 = 0.1;
                double calculatedSurfaceArea3 = Geometry3D.calculateCuboidSurfaceArea(length3, width3, height3);
                assertEquals(220.0, calculatedSurfaceArea3, epsilon3);
            }
            
        
        //Task 5
        @Test
    
        void testSquarePyramidVolume() {
            // Test 1
            double baseLength1 = 4.0;
            double height1 = 3.0;
            double epsilon1 = 0.1;
            double calculatedVolume1 = Geometry3D.calculateSquarePyramidVolume(baseLength1, height1);
            assertEquals(4.0, calculatedVolume1, epsilon1);
        
            // Test 2
            double baseLength2 = 5.0;
            double height2 = 6.0;
            double epsilon2 = 0.1;
            double calculatedVolume2 = Geometry3D.calculateSquarePyramidVolume(baseLength2, height2);
            assertEquals(50.0, calculatedVolume2, epsilon2);
        
            // Test 3
            double baseLength3 = 3.0;
            double height3 = 2.0;
            double epsilon3 = 0.1;
            double calculatedVolume3 = Geometry3D.calculateSquarePyramidVolume(baseLength3, height3);
            assertEquals(2.0, calculatedVolume3, epsilon3);
        }
        
    //Task 6

        @Test
        void testSquarePyramidSurfaceArea() {
            // Test 1
            double baseLength1 = 4.0;
            double slantHeight1 = 5.0;
            double epsilon1 = 0.1;
            double calculatedSurfaceArea1 = Geometry3D.calculateSquarePyramidSurfaceArea(baseLength1, slantHeight1);
            assertEquals(68.0, calculatedSurfaceArea1, epsilon1);
        
            // Test 2
            double baseLength2 = 6.0;
            double slantHeight2 = 8.0;
            double epsilon2 = 0.1;
            double calculatedSurfaceArea2 = Geometry3D.calculateSquarePyramidSurfaceArea(baseLength2, slantHeight2);
            assertEquals(84.0, calculatedSurfaceArea2, epsilon2);
        
            // Test 3
            double baseLength3 = 3.0;
            double slantHeight3 = 4.0;
            double epsilon3 = 0.1;
            double calculatedSurfaceArea3 = Geometry3D.calculateSquarePyramidSurfaceArea(baseLength3, slantHeight3);
            assertEquals(39.0, calculatedSurfaceArea3, epsilon3);
        }
       //Task 7 
        @Test
        void testTetrahedronVolume() {
            // Test 1
            double edgeLength1 = 3.0;
            double epsilon1 = 0.1;
            double calculatedVolume1 = Geometry3D.calculateTetrahedronVolume(edgeLength1);
            assertEquals(1.0, calculatedVolume1, epsilon1);
        
            // Test 2
            double edgeLength2 = 5.0;
            double epsilon2 = 0.1;
            double calculatedVolume2 = Geometry3D.calculateTetrahedronVolume(edgeLength2);
            assertEquals(11.18, calculatedVolume2, epsilon2);
        
            // Test 3
            double edgeLength3 = 2.0;
            double epsilon3 = 0.1;
            double calculatedVolume3 = Geometry3D.calculateTetrahedronVolume(edgeLength3);
            assertEquals(0.117, calculatedVolume3, epsilon3);
        }
        //Task 8
        @Test
        void testTetrahedronSurfaceArea() {
            // Test 1
            double edgeLength1 = 3.0;
            double epsilon1 = 0.1;
            double calculatedSurfaceArea1 = Geometry3D.calculateTetrahedronSurfaceArea(edgeLength1);
            assertEquals(7.794, calculatedSurfaceArea1, epsilon1);
        
            // Test 2
            double edgeLength2 = 5.0;
            double epsilon2 = 0.1;
            double calculatedSurfaceArea2 = Geometry3D.calculateTetrahedronSurfaceArea(edgeLength2);
            assertEquals(43.301, calculatedSurfaceArea2, epsilon2);
        
            // Test 3
            double edgeLength3 = 2.0;
            double epsilon3 = 0.1;
            double calculatedSurfaceArea3 = Geometry3D.calculateTetrahedronSurfaceArea(edgeLength3);
            assertEquals(3.464, calculatedSurfaceArea3, epsilon3);
        }
        

    }






