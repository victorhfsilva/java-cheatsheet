# Estrutura de Dados

## ArrayList

```
import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {
        // Create a new ArrayList
        ArrayList<String> list = new ArrayList<>();

        // Add elements to the ArrayList
        list.add("A");
        list.add("B");
        list.add("C");

        // Get an element from the ArrayList by index
        String element = list.get(1); // element = "B"

        // Check if the ArrayList contains an element
        boolean containsC = list.contains("C"); // containsC = true

        // Remove an element from the ArrayList
        boolean removed = list.remove("B"); // removed = true

        // Get the size of the ArrayList
        int size = list.size(); // size = 2
    }
}
```