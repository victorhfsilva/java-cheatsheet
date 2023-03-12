# Estrutura de Dados

## Stack

- LIFO: Last In First Out

```
import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {
        // Create a new stack
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Pop elements off the stack
        int element1 = stack.pop(); // element1 = 3
        int element2 = stack.pop(); // element2 = 2

        // Peek at the top element of the stack
        int topElement = stack.peek(); // topElement = 1

        // Check if the stack is empty
        boolean isEmpty = stack.isEmpty(); // isEmpty = false

        // Get the size of the stack
        int size = stack.size(); // size = 1
    }
}
```

