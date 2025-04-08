package com.example.javasamples.java21;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RecordPatternsTest {
    
    private final RecordPatterns patterns = new RecordPatterns();
    
    @Test
    void testDescribeShape() {
        var point1 = new RecordPatterns.Point(0, 0);
        var point2 = new RecordPatterns.Point(5, 5);
        var rect = new RecordPatterns.Rectangle(point1, point2);
        var circle = new RecordPatterns.Circle(point1, 3);
        
        assertEquals("Rectangle from (0,0) to (5,5)", patterns.describeShape(rect));
        assertEquals("Circle at (0,0) with radius 3", patterns.describeShape(circle));
        assertEquals("Unknown shape", patterns.describeShape("Not a shape"));
    }
    
    @Test
    void testIsSquare() {
        var square = new RecordPatterns.Rectangle(
            new RecordPatterns.Point(0, 0),
            new RecordPatterns.Point(5, 5)
        );
        var rectangle = new RecordPatterns.Rectangle(
            new RecordPatterns.Point(0, 0),
            new RecordPatterns.Point(5, 3)
        );
        
        assertTrue(patterns.isSquare(square));
        assertFalse(patterns.isSquare(rectangle));
    }
    
    @Test
    void testCalculateArea() {
        var rect = new RecordPatterns.Rectangle(
            new RecordPatterns.Point(0, 0),
            new RecordPatterns.Point(4, 3)
        );
        var circle = new RecordPatterns.Circle(
            new RecordPatterns.Point(0, 0),
            2
        );
        
        assertEquals(12.0, patterns.calculateArea(rect));
        assertEquals(Math.PI * 4, patterns.calculateArea(circle));
        assertEquals(0.0, patterns.calculateArea("Not a shape"));
    }
}