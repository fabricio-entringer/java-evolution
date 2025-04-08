package com.example.javasamples.java21;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ForeignMemoryAPITest {
    
    private final ForeignMemoryAPI foreignMemory = new ForeignMemoryAPI();
    
    @Test
    void testMemoryAccess() {
        String result = foreignMemory.demonstrateMemoryAccess();
        assertEquals("Hello, Native Memory!", result);
    }
    
    @Test
    void testArrayOperations() {
        int[] result = foreignMemory.demonstrateArrayOperations();
        assertEquals(5, result.length);
        for (int i = 0; i < result.length; i++) {
            assertEquals(i * 2, result[i]);
        }
    }
    
    @Test
    void testSumArrayInMemory() {
        int[] array = {1, 2, 3, 4, 5};
        long sum = foreignMemory.sumArrayInMemory(array);
        assertEquals(15L, sum);
    }
}