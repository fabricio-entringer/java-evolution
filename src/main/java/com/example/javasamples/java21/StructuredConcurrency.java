package com.example.javasamples.java21;

import java.util.concurrent.*;

/**
 * Demonstrates structured concurrency patterns using CompletableFuture
 */
public class StructuredConcurrency {
    
    record UserData(String name, int age) {}
    record UserStats(int postCount, int followerCount) {}
    record UserProfile(UserData data, UserStats stats) {}
    
    /**
     * Demonstrates parallel tasks with structured error handling
     */
    public UserProfile fetchUserProfile(String userId) throws ExecutionException, InterruptedException {
        CompletableFuture<UserData> userDataFuture = CompletableFuture.supplyAsync(
            () -> fetchUserData(userId)
        );
        
        CompletableFuture<UserStats> userStatsFuture = CompletableFuture.supplyAsync(
            () -> fetchUserStats(userId)
        );
        
        return CompletableFuture.allOf(userDataFuture, userStatsFuture)
            .thenApply(v -> new UserProfile(
                userDataFuture.join(),
                userStatsFuture.join()
            ))
            .get();
    }
    
    /**
     * Demonstrates handling the first successful result
     */
    public String fetchFromMirrors(String resourceId) throws ExecutionException, InterruptedException {
        CompletableFuture<String> primary = CompletableFuture.supplyAsync(
            () -> fetchFromPrimaryServer(resourceId)
        );
        
        CompletableFuture<String> backup = CompletableFuture.supplyAsync(
            () -> fetchFromBackupServer(resourceId)
        );
        
        CompletableFuture<String> secondary = CompletableFuture.supplyAsync(
            () -> fetchFromSecondaryServer(resourceId)
        );
        
        return CompletableFuture.anyOf(primary, backup, secondary)
            .thenApply(result -> (String) result)
            .get();
    }
    
    // Simulated service methods
    private UserData fetchUserData(String userId) {
        simulateNetworkDelay();
        return new UserData("John Doe", 30);
    }
    
    private UserStats fetchUserStats(String userId) {
        simulateNetworkDelay();
        return new UserStats(100, 500);
    }
    
    private String fetchFromPrimaryServer(String resourceId) {
        simulateNetworkDelay();
        return "Data from primary";
    }
    
    private String fetchFromBackupServer(String resourceId) {
        simulateNetworkDelay();
        return "Data from backup";
    }
    
    private String fetchFromSecondaryServer(String resourceId) {
        simulateNetworkDelay();
        return "Data from secondary";
    }
    
    private void simulateNetworkDelay() {
        try {
            Thread.sleep((long) (Math.random() * 100));
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException(e);
        }
    }
}