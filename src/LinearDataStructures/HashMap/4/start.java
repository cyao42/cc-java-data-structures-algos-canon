package LinearDataStructures.HashMap;

public class HashMap {

    public String[] hashmap;
    
    public HashMap(int size) {
          this.hashmap = new String[size];
    }

    public int hash(String key) {
        int hashCode = 0;
        for (int i = 0; i < key.length(); i++) {
            hashCode += hashCode + Character.codePointAt(key, i);
        }
        hashCode = hashCode % this.hashmap.length;
        return hashCode;
    }

    static public void main(String[] args) {

    }
}