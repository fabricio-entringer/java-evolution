package com.example.javasamples.java17;

/**
 * Demonstrates sealed classes introduced in Java 17
 */
public class SealedClasses {

    /**
     * Sealed Shape hierarchy - restricts which classes can extend Shape
     */
    public sealed abstract class Shape permits Circle, Rectangle, Square {
        private final String name;
        
        protected Shape(String name) {
            this.name = name;
        }
        
        public String getName() {
            return name;
        }
        
        public abstract double area();
    }
    
    /**
     * Circle is a permitted subclass of Shape
     */
    public final class Circle extends Shape {
        private final double radius;
        
        public Circle(double radius) {
            super("Circle");
            this.radius = radius;
        }
        
        @Override
        public double area() {
            return Math.PI * radius * radius;
        }
    }
    
    /**
     * Rectangle is a permitted subclass of Shape
     */
    public final class Rectangle extends Shape {
        private final double width;
        private final double height;
        
        public Rectangle(double width, double height) {
            super("Rectangle");
            this.width = width;
            this.height = height;
        }
        
        @Override
        public double area() {
            return width * height;
        }
    }
    
    /**
     * Square is a permitted subclass of Shape
     */
    public final class Square extends Shape {
        private final double side;
        
        public Square(double side) {
            super("Square");
            this.side = side;
        }
        
        @Override
        public double area() {
            return side * side;
        }
    }
    
    /**
     * Calculates the area of a shape, using pattern matching for switch
     */
    public double calculateArea(Shape shape) {
        return shape.area();
    }
}
