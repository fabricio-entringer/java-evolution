package com.example.javasamples.java21;

import java.util.concurrent.Executors;
import java.lang.ThreadLocal;
import java.util.concurrent.ExecutionException;

/**
 * Demonstrates thread context management with ThreadLocal and Virtual Threads
 */
public class ScopedValues {
    
    private static final InheritableThreadLocal<String> USER_CONTEXT = new InheritableThreadLocal<>();
    private static final InheritableThreadLocal<RequestInfo> REQUEST_INFO = new InheritableThreadLocal<>();
    
    public record RequestInfo(String id, long timestamp) {}
    
    /**
     * Demonstrates basic context usage
     */
    public String runWithUserContext(String username) {
        USER_CONTEXT.set(username);
        try {
            return processWithContext();
        } finally {
            USER_CONTEXT.remove();
        }
    }
    
    private String processWithContext() {
        String username = USER_CONTEXT.get();
        return STR."Processing request for user: \{username}";
    }
    
    /**
     * Demonstrates nested context values
     */
    public String processRequest(String userId, String requestId) {
        USER_CONTEXT.set(userId);
        REQUEST_INFO.set(new RequestInfo(requestId, System.currentTimeMillis()));
        try {
            String user = USER_CONTEXT.get();
            RequestInfo info = REQUEST_INFO.get();
            return STR."Request [\{info.id()}] from user [\{user}] at time [\{info.timestamp()}]";
        } finally {
            USER_CONTEXT.remove();
            REQUEST_INFO.remove();
        }
    }
    
    /**
     * Demonstrates context with virtual threads
     */
    public void runInVirtualThreads() throws InterruptedException, ExecutionException {
        try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
            USER_CONTEXT.set("admin");
            executor.submit(() -> {
                // Context is inherited by virtual thread
                System.out.println(STR."Virtual thread sees user: \{USER_CONTEXT.get()}");
            }).get();
            USER_CONTEXT.remove();
        }
    }
}