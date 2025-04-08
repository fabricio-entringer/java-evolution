package com.example.javasamples.java21;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.ArrayList;
import java.util.SequencedCollection;
import java.util.SequencedSet;
import java.util.SequencedMap;

/**
 * Demonstrates Sequenced Collections introduced in Java 21
 */
public class SequencedCollections {
    
    /**
     * Demonstrates SequencedCollection methods with ArrayList
     */
    public SequencedCollection<String> demonstrateSequencedList() {
        var list = new LinkedList<String>();
        list.add(0, "First");
        list.add("Last");
        list.add(1, "Middle");
        // Returns a reversed view of the list
        return list.reversed();
    }
    
    /**
     * Demonstrates SequencedSet methods with LinkedHashSet
     */
    public SequencedSet<Integer> demonstrateSequencedSet() {
        var set = new LinkedHashSet<Integer>();
        set.addFirst(1);
        set.add(2);
        set.addLast(3);
        return set;
    }
    
    /**
     * Demonstrates SequencedMap methods with LinkedHashMap
     */
    public SequencedMap<String, Integer> demonstrateSequencedMap() {
        var map = new LinkedHashMap<String, Integer>();
        map.putFirst("One", 1);
        map.put("Two", 2);
        map.putLast("Three", 3);
        return map;
    }
    
    /**
     * Demonstrates removing elements from ends of a sequenced collection
     */
    public String removeFromEnds(SequencedCollection<String> collection) {
        String first = collection.removeFirst();
        String last = collection.removeLast();
        return STR."Removed first: \{first}, last: \{last}";
    }
}