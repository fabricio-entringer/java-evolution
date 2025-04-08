package com.example.javasamples.java21;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.nio.charset.StandardCharsets;

/**
 * Demonstrates Memory API features introduced in Java 21
 */
public class ForeignMemoryAPI {
    
    /**
     * Demonstrates direct memory access using Memory API
     */
    public String demonstrateMemoryAccess() {
        try (Arena arena = Arena.ofConfined()) {
            // Allocate memory segment
            byte[] bytes = "Hello, Native Memory!".getBytes(StandardCharsets.UTF_8);
            MemorySegment segment = arena.allocate(bytes.length);
            
            // Write string bytes to memory
            MemorySegment sourceSegment = MemorySegment.ofArray(bytes);
            MemorySegment.copy(sourceSegment, 0, segment, 0, bytes.length);
            
            // Read string bytes from memory
            byte[] result = new byte[bytes.length];
            MemorySegment resultSegment = MemorySegment.ofArray(result);
            MemorySegment.copy(segment, 0, resultSegment, 0, bytes.length);
            
            return new String(result, StandardCharsets.UTF_8);
        }
    }
    
    /**
     * Demonstrates array operations with memory segments
     */
    public int[] demonstrateArrayOperations() {
        try (Arena arena = Arena.ofConfined()) {
            // Create a memory segment for an int array
            int[] sourceArray = {0, 2, 4, 6, 8};
            MemorySegment segment = arena.allocate(sourceArray.length * 4);
            
            // Write values
            for (int i = 0; i < sourceArray.length; i++) {
                segment.set(ValueLayout.JAVA_INT, i * 4, sourceArray[i]);
            }
            
            // Read values back into Java array
            int[] result = new int[sourceArray.length];
            for (int i = 0; i < result.length; i++) {
                result[i] = segment.get(ValueLayout.JAVA_INT, i * 4);
            }
            
            return result;
        }
    }
    
    /**
     * Demonstrates memory segment bulk operations
     */
    public long sumArrayInMemory(int[] array) {
        try (Arena arena = Arena.ofConfined()) {
            // Allocate memory and copy array
            MemorySegment segment = arena.allocate(array.length * 4);
            MemorySegment source = MemorySegment.ofArray(array);
            MemorySegment.copy(source, 0, segment, 0, array.length * 4);
            
            // Calculate sum using memory segment
            long sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += segment.get(ValueLayout.JAVA_INT, i * 4);
            }
            return sum;
        }
    }
}