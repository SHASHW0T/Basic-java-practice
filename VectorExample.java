import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        // Create a Vector to store Integer elements
        Vector<Integer> vector = new Vector<>();

        // Adding elements to the Vector
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);

        // Displaying the elements in the Vector
        System.out.println("Elements in the Vector: " + vector);

        // Accessing elements by index
        int elementAtIndex2 = vector.get(2);
        System.out.println("Element at index 2: " + elementAtIndex2);

        // Updating an element by index
        vector.set(1, 25);
        System.out.println("Updated Vector after setting element at index 1: " + vector);

        // Removing an element by value
        vector.removeElement(30);
        System.out.println("Vector after removing element 30: " + vector);

        // Checking if the Vector contains a specific element
        boolean containsElement = vector.contains(40);
        System.out.println("Vector contains element 40: " + containsElement);

        // Getting the size of the Vector
        int size = vector.size();
        System.out.println("Size of the Vector: " + size);
    }
}
