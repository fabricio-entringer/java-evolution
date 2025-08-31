package com.example.javasamples.java19;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VirtualThreadsTest {
    
    private final VirtualThreads virtualThreads = new VirtualThreads();
    
    @Test
    void testRunManyVirtualThreads() throws InterruptedException {
        int threadCount = 1000;
        int completedThreads = virtualThreads.runManyVirtualThreads(threadCount);
        assertEquals(threadCount, completedThreads, "All virtual threads should complete");
    }
    
    @Test
    void testRunSingleVirtualThread() throws InterruptedException {
        String result = virtualThreads.runSingleVirtualThread();
        assertEquals("Virtual thread completed", result, "Virtual thread should complete successfully");
    }
}