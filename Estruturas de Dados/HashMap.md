# Estrutura de Dados

## Hash Map

Armazena pares chaves/valores.

```
import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        // create a new HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // add some key-value pairs to the map
        map.put("apple", 1);
        map.put("banana", 2);
        map.put("cherry", 3);

        // get the value associated with the key "banana"
        int value = map.get("banana");
        System.out.println("Value at key 'banana': " + value);

        // check if the map contains the key "date"
        boolean containsKey = map.containsKey("apple");
        System.out.println("Contains key 'apple': " + containsKey);

        // remove the key-value pair associated with the key "cherry"
        map.remove("cherry");

        // print the updated map
        System.out.println(map);
        
        // print the map keys
        System.out.println(map.keySet());
        
        // print the map values
        System.out.println(map.values()); 
    }
}
```