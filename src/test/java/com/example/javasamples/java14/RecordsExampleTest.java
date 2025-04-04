package com.example.javasamples.java14;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RecordsExampleTest {
    
    private final RecordsExample recordsExample = new RecordsExample();
    
    @Test
    void testCreatePoint() {
        String point = recordsExample.createPoint(3, 4);
        assertEquals("Point[x=3, y=4]", point);
    }
    
    @Test
    void testDistanceFromOrigin() {
        double distance = recordsExample.getDistanceFromOrigin(3, 4);
        assertEquals(5.0, distance);
    }
    
    @Test
    void testPointValidation() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            recordsExample.createPoint(-1, 5);
        });
        
        assertEquals("Coordinates cannot be negative", exception.getMessage());
    }
}
