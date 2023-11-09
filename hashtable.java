import java.util.LinkedList; 
public class hashtable {
    private class entry{
        private int key;
        private String value;
        public entry(int key, String value) {
            this.key = key;
            this.value = value;
        }

        
    }
    private LinkedList<entry>[] entries = new LinkedList[5];
/**
 * Adds or updates a key-value pair in the hash table.
 *
 * @param key   the key to be added or updated
 * @param value the value associated with the key
 */
public void put(int key, String value) {
    // Calculate the index for the given key
    int index = hash(key);

    // If the bucket is empty, create a new linked list
    if (entries[index] == null) {
        entries[index] = new LinkedList<>();
    }

    // Get the bucket at the calculated index
    var bucket = entries[index];

    // Search for the key in the bucket
    for (var entry : bucket) {
        // If the key exists, update the value and return
        if (entry.key == key) {
            entry.value = value;
            return;
        }
    }

    // If the key does not exist, add a new entry to the bucket
    bucket.addLast(new entry(key, value));
}
/**
 * Retrieves the value associated with the given key from the hash map.
 *
 * @param key The key to retrieve the value for.
 * @return The value associated with the given key, or null if the key is not found.
 */
public String get(int key) {
    // Calculate the index of the bucket using the hash function
    var index = hash(key);

    // Get the bucket at the calculated index
    var bucket = entries[index];

    // If the bucket is not null, iterate over the entries in the bucket
    if (bucket != null) {
        for (var entry : bucket) {
            // If the key of the entry matches the given key, return the value
            if (entry.key == key) {
                return entry.value;
            }
        }
    }

    // Return null if the key is not found
    return null;
}

    private int hash (int key){
        return key % entries.length;
    }
/**
 * Removes the entry with the specified key from the hash table.
 *
 * @param key the key of the entry to remove
 * @throws IllegalArgumentException if the key is not found in the hash table
 */
public void remove(int key) {
    // Calculate the index in the array based on the key
    var index = hash(key);
    
    // Get the bucket at the calculated index
    var bucket = entries[index];
    
    // If the bucket is null, the key is not found in the hash table
    if (bucket == null) {
        throw new IllegalArgumentException();
    }
    
    // Iterate over each entry in the bucket
    for (var entry : bucket) {
        // If the entry's key matches the specified key, remove the entry from the bucket
        if (entry.key == key) {
            bucket.remove(entry);
            return;
        }
    }
}
    
 
}
