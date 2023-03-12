# Estrutura de Dados

## Hash Set

Armazena um set de elementos únicos.

```
import java.util.HashSet;

public class HashSetExample {

    public static void main(String[] args) {
        // Create a new HashSet
        HashSet<String> set = new HashSet<>();

        // Add elements to the HashSet
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("C"); // Adding duplicate element

        // Get the size of the HashSet
        int size = set.size(); // size = 3

        // Check if the HashSet contains an element
        boolean containsB = set.contains("B"); // containsB = true

        // Remove an element from the HashSet
        boolean removed = set.remove("C"); // removed = true

        // Iterate over the elements of the HashSet
        for (String element : set) {
            System.out.println(element);
        }
    }
}
```

