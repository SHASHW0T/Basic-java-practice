import java.util.ArrayList;

public class ArrayListToArrayExample {
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

        // Convert ArrayList to Array
        String[] array = arrayList.toArray(new String[arrayList.size()]);

        // Displaying the converted array
        System.out.println("Converted Array:");
        for (String element : array) {
            System.out.print(element + " ");
        }
    }
}
