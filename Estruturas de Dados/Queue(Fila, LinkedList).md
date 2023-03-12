# Estrutura de Dados

## Queue

- FIFO: First In First Out

```
import java.util.Queue;
import java.util.LinkedList;

public class QueueExample {

    public static void main(String[] args) {
        // Create a new queue
        Queue<String> queue = new LinkedList<>();

        // Add elements to the queue
        queue.add("A");
        queue.add("B");
        queue.add("C");

        // Check if the queue contains an element
        boolean containsB = queue.contains("B"); // containsB = true

        // Remove and return the head of the queue
        String head = queue.poll(); // head = "A"

        // Peek at the head of the queue without removing it
        String peek = queue.peek(); // peek = "B"

        // Get the size of the queue
        int size = queue.size(); // size = 2
    }
}
```
