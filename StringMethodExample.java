public class StringMethodsExample {
    public static void main(String[] args) {
        // Creating a sample string
        String sampleString = "Hello, World!";

        // length(): Returns the length of the string
        int length = sampleString.length();
        System.out.println("Length of the string: " + length);

        // charAt(int index): Returns the character at the specified index
        char characterAtIndex = sampleString.charAt(7);
        System.out.println("Character at index 7: " + characterAtIndex);

        // substring(int beginIndex): Returns a substring starting from the specified index
        String substringFromIndex = sampleString.substring(7);
        System.out.println("Substring from index 7: " + substringFromIndex);

        // substring(int beginIndex, int endIndex): Returns a substring within the specified range of indexes
        String substringWithinRange = sampleString.substring(7, 12);
        System.out.println("Substring from index 7 to 12: " + substringWithinRange);

        // indexOf(String str): Returns the index of the first occurrence of the specified substring
        int indexOfSubstring = sampleString.indexOf("World");
        System.out.println("Index of 'World': " + indexOfSubstring);

        // lastIndexOf(String str): Returns the index of the last occurrence of the specified substring
        int lastIndexOfSubstring = sampleString.lastIndexOf("o");
        System.out.println("Last index of 'o': " + lastIndexOfSubstring);

        // contains(CharSequence sequence): Checks if the string contains the specified sequence of characters
        boolean containsCheck = sampleString.contains("World");
        System.out.println("Contains 'World'?: " + containsCheck);

        // equals(Object anObject): Checks if the string is equal to another string
        String comparisonString = "Hello, World!";
        boolean isEqual = sampleString.equals(comparisonString);
        System.out.println("Is equal to 'Hello, World!'?: " + isEqual);

        // toUpperCase(): Converts the string to uppercase
        String uppercaseString = sampleString.toUpperCase();
        System.out.println("Uppercase string: " + uppercaseString);

        // toLowerCase(): Converts the string to lowercase
        String lowercaseString = sampleString.toLowerCase();
        System.out.println("Lowercase string: " + lowercaseString);

        // replace(CharSequence target, CharSequence replacement): Replaces occurrences of a specified character/sequence
        String replacedString = sampleString.replace("World", "Universe");
        System.out.println("Replaced 'World' with 'Universe': " + replacedString);

        // trim(): Removes leading and trailing whitespaces
        String stringWithSpaces = "   Trim Me   ";
        String trimmedString = stringWithSpaces.trim();
        System.out.println("Original String: '" + stringWithSpaces + "'");
        System.out.println("Trimmed String: '" + trimmedString + "'");
    }
}
