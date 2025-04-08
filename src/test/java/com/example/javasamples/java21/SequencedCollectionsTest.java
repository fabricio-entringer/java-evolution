package com.example.javasamples.java21;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.SequencedCollection;
import java.util.List;

class SequencedCollectionsTest {
    
    private final SequencedCollections collections = new SequencedCollections();
    
    @Test
    void testDemonstrateSequencedList() {
        SequencedCollection<String> result = collections.demonstrateSequencedList();
        var asList = List.copyOf(result);
        
        assertEquals("Middle", asList.get(0));
        assertEquals("Last", asList.get(1));
        assertEquals("First", asList.get(2));
    }
    
    @Test
    void testDemonstrateSequencedSet() {
        var result = collections.demonstrateSequencedSet();
        
        assertEquals(1, result.getFirst());
        assertEquals(3, result.getLast());
        assertTrue(result.contains(2));
    }
    
    @Test
    void testDemonstrateSequencedMap() {
        var result = collections.demonstrateSequencedMap();
        
        assertEquals(1, result.firstEntry().getValue());
        assertEquals(3, result.lastEntry().getValue());
        assertEquals(2, result.get("Two"));
    }
    
    @Test
    void testRemoveFromEnds() {
        var list = new java.util.ArrayList<String>();
        list.add("First");
        list.add("Middle");
        list.add("Last");
        
        String result = collections.removeFromEnds(list);
        assertEquals("Removed first: First, last: Last", result);
        assertEquals(1, list.size());
        assertEquals("Middle", list.get(0));
    }
}