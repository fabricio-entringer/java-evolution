package com.example.javasamples.java14;

/**
 * Demonstrates switch expressions introduced in Java 14
 */
public class SwitchExpressions {

    /**
     * Returns the number of days in a month using switch expressions
     */
    public int getDaysInMonth(int month, int year) {
        return switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> isLeapYear(year) ? 29 : 28;
            default -> throw new IllegalArgumentException("Invalid month: " + month);
        };
    }
    
    /**
     * Returns a description of a day of the week
     */
    public String describeDayOfWeek(String day) {
        return switch (day.toLowerCase()) {
            case "monday" -> "Start of work week";
            case "tuesday", "wednesday", "thursday" -> "Midweek";
            case "friday" -> "End of work week";
            case "saturday", "sunday" -> "Weekend";
            default -> "Invalid day";
        };
    }
    
    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
