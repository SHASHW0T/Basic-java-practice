public class ArrayDemo {
    public static void main(String[] args) {
        String[] anArray = new String[11];

        anArray[0] = "Hello";
        anArray[1] = "How";
        anArray[2] = "are";
        anArray[3] = "you";
        anArray[4] = "doing";
        anArray[5] = "today";
        anArray[6] = "my";
        anArray[7] = "bruhs";
        anArray[8] = "saksham";
        anArray[9] = "and";
        anArray[10] = "manan?";

        System.out.println(String.join(" ", anArray));
    }
}
