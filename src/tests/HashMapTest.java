package tests;

import LinearDataStructures.HashMap.HashMap;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HashMapTest {

    @Test
    public void testConstructor() {
        // Sets internal size correctly
        HashMap h = new HashMap(10);
        assertEquals("Size is not set correctly", h.hashmap.length, 10);
    }

    @Test
    public void testHashFunction() {
        // Hashes correctly with no collisions
        HashMap h = new HashMap(10);
        assertEquals("hash function not working", h.hash("Lakers"), 7);
    }

    @Test
    public void testAssign() {
        // Adds correct number of key-value pairs
        HashMap h = new HashMap(10);
        h.assign("Lakers", "Minneapolis");
        h.assign("Celtics", "Boston");
        h.assign("Heat", "Miami");
        int count = 0;
        for (int i = 0; i < h.hashmap.length; i++) {
            if (h.hashmap[i].head != null) {
                count++;
            }
        }
        assertEquals("Does not add correct number of elements to hash map", 3, count);

        // Replace the value for a pre-existing key
        h.assign("Lakers", "Los Angeles");
        String actual = h.retrieve("Lakers");
        assertEquals("Does not replace value for a pre-existing key", "Los Angeles", actual);
    }

    @Test
    public void testRetrieve() {
        // Retrieves value using the key
        HashMap h = new HashMap(10);
        h.assign("Lakers", "Minneapolis");
        h.assign("Celtics", "Boston");
        h.assign("Heat", "Miami");
        String actual = h.retrieve("Celtics");
        assertEquals("Does not retrieve the correct value using a valid key", "Boston", actual);

        // Returns null when the key does not exist
        actual = h.retrieve("Knicks");
        assertEquals("Does not retrieve null using an invalid key", null, actual);
    }
}