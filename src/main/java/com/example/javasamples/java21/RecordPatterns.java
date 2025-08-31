package com.example.javasamples.java21;

/**
 * Demonstrates Record Patterns and Pattern Matching in Java 21
 */
public class RecordPatterns {
    
    // Records for our example
    public record Point(int x, int y) {}
    public record Rectangle(Point topLeft, Point bottomRight) {}
    public record Circle(Point center, int radius) {}
    
    /**
     * Demonstrates pattern matching in switch with records
     */
    public String describeShape(Object shape) {
        return switch (shape) {
            case Rectangle(Point(var x1, var y1), Point(var x2, var y2)) -> 
                STR."Rectangle from (\{x1},\{y1}) to (\{x2},\{y2})";
            case Circle(Point(var x, var y), var r) ->
                STR."Circle at (\{x},\{y}) with radius \{r}";
            default -> "Unknown shape";
        };
    }
    
    /**
     * Demonstrates nested pattern matching with if conditions
     */
    public boolean isSquare(Rectangle rect) {
        if (rect instanceof Rectangle(Point(var x1, var y1), Point(var x2, var y2))) {
            int width = x2 - x1;
            int height = y2 - y1;
            return width == height && width > 0;
        }
        return false;
    }
    
    /**
     * Calculate area using pattern matching
     */
    public double calculateArea(Object shape) {
        return switch (shape) {
            case Rectangle(Point(var x1, var y1), Point(var x2, var y2)) -> {
                int width = x2 - x1;
                int height = y2 - y1;
                yield (double) width * height;
            }
            case Circle(Point p, var r) -> Math.PI * r * r;
            default -> 0.0;
        };
    }
}