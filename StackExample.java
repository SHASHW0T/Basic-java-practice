import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // Create a Stack to implement LIFO structure
        Stack<Integer> stack = new Stack<>();

        // Pushing elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        // Displaying the elements in the stack
        System.out.println("Elements in the stack: " + stack);

        // Popping elements from the stack
        int poppedElement = stack.pop();
        System.out.println("Popped element from the stack: " + poppedElement);
        System.out.println("Stack after popping: " + stack);

        // Peeking at the top element without removing it
        int topElement = stack.peek();
        System.out.println("Top element in the stack: " + topElement);

        // Checking if the stack is empty
        boolean isEmpty = stack.isEmpty();
        System.out.println("Is the stack empty? " + isEmpty);

        // Getting the size of the stack
        int size = stack.size();
        System.out.println("Size of the stack: " + size);
    }
}
