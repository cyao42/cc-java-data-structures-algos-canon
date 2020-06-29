package LinearDataStructures.HashMap;

public class HashMap {

    public LinkedList[] hashmap;

    public HashMap(int size) {
        this.hashmap = new LinkedList[size];
    }

    public int hash(String key) {
        int hashCode = 0;
        for (int i = 0; i < key.length(); i++) {
            hashCode = hashCode + Character.codePointAt(key, i);
        }
        return hashCode;
    }

    public static void main(String[] args) {
        HashMap newHashMap = new HashMap(3);
        System.out.println(newHashMap.hash("c"));
        System.out.println(newHashMap.hash("ca"));
        System.out.println(newHashMap.hash("car"));  
    }
}