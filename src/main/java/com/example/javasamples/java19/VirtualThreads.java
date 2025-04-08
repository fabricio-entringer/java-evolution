package com.example.javasamples.java19;

import java.time.Duration;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

/**
 * Demonstrates Virtual Threads preview feature from Java 19
 */
public class VirtualThreads {
    
    /**
     * Creates and runs many virtual threads to demonstrate their lightweight nature
     */
    public int runManyVirtualThreads(int threadCount) throws InterruptedException {
        AtomicInteger counter = new AtomicInteger(0);
        
        try (ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor()) {
            IntStream.range(0, threadCount).forEach(i -> {
                executor.submit(() -> {
                    // Simulate some work
                    Thread.sleep(Duration.ofMillis(100));
                    counter.incrementAndGet();
                    return null;
                });
            });
        } // executor.close() is called implicitly, and we wait for all tasks
        
        return counter.get();
    }
    
    /**
     * Demonstrates how to create a single virtual thread
     */
    public String runSingleVirtualThread() throws InterruptedException {
        Thread vthread = Thread.startVirtualThread(() -> {
            // Virtual thread work
            System.out.println("Running in virtual thread: " + Thread.currentThread().getName());
        });
        
        vthread.join();
        return "Virtual thread completed";
    }
}