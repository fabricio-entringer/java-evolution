package com.example.javasamples.java12;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Demonstrates the teeing collector introduced in Java 12
 */
public class TeeingCollector {

    /**
     * Calculates both the average and the sum of a list of numbers in a single stream operation
     */
    public record SumAndAverage(double sum, double average) {}
    
    /**
     * Uses teeing collector to get both sum and average in one pass
     */
    public SumAndAverage calculateSumAndAverage(List<Integer> numbers) {
        return numbers.stream()
                .collect(Collectors.teeing(
                        Collectors.summingDouble(Integer::doubleValue),
                        Collectors.averagingDouble(Integer::doubleValue),
                        SumAndAverage::new
                ));
    }
}
