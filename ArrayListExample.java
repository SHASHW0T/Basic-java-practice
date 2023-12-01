import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> arrayList = new ArrayList<>();

        // Adding elements to the ArrayList
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");
        arrayList.add("Mango");

        // Displaying the initial ArrayList
        System.out.println("Initial ArrayList: " + arrayList);

        // Adding an element at a specific index
        arrayList.add(2, "Grapes");
        System.out.println("After adding 'Grapes' at index 2: " + arrayList);

        // Removing an element by index
        arrayList.remove(1);
        System.out.println("After removing element at index 1: " + arrayList);

        // Removing an element by value
        arrayList.remove("Orange");
        System.out.println("After removing 'Orange': " + arrayList);
    }
}
