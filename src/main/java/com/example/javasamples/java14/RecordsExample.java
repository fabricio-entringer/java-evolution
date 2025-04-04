package com.example.javasamples.java14;

/**
 * Demonstrates records introduced in Java 14 (preview)
 */
public class RecordsExample {

    /**
     * A record representing a point in 2D space
     */
    public record Point(int x, int y) {
        // Records automatically provide:
        // - Constructor
        // - Accessors (x() and y())
        // - equals() and hashCode()
        // - toString()
        
        // You can add validation in compact constructor
        public Point {
            if (x < 0 || y < 0) {
                throw new IllegalArgumentException("Coordinates cannot be negative");
            }
        }
        
        // You can add methods
        public double distanceFromOrigin() {
            return Math.sqrt(x * x + y * y);
        }
    }
    
    /**
     * Creates a point and returns its string representation
     */
    public String createPoint(int x, int y) {
        Point point = new Point(x, y);
        return point.toString();
    }
    
    /**
     * Calculates distance from origin
     */
    public double getDistanceFromOrigin(int x, int y) {
        Point point = new Point(x, y);
        return point.distanceFromOrigin();
    }
}
