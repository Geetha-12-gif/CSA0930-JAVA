public class stringmethod {
    public static void main(String[] args) {
        // String Constructors
        String str1 = new String(); // Empty string
        String str2 = new String("Hello"); // String initialized with value
        char[] charArray = {'W', 'o', 'r', 'l', 'd'};
        String str3 = new String(charArray); // String from character array
        byte[] byteArray = {65, 66, 67, 68, 69};
        String str4 = new String(byteArray); // String from byte array

        // String Methods
        String str5 = "   Hello, World!   ";
        System.out.println("Original String: " + str5);

        // Length method
        int length = str5.length();
        System.out.println("Length of String: " + length);

        // charAt method
        char charAtIndex = str5.charAt(7);
        System.out.println("Character at index 7: " + charAtIndex);

        // substring method
        String subString = str5.substring(7, 12);
        System.out.println("Substring from index 7 to 12: " + subString);

        // trim method
        String trimmedString = str5.trim();
        System.out.println("Trimmed String: " + trimmedString);

        // toLowerCase and toUpperCase methods
        String lowerCase = str5.toLowerCase();
        String upperCase = str5.toUpperCase();
        System.out.println("Lowercase String: " + lowerCase);
        System.out.println("Uppercase String: " + upperCase);

        // indexOf and lastIndexOf methods
        int indexOf = str5.indexOf('o');
        int lastIndexOf = str5.lastIndexOf('o');
        System.out.println("Index of 'o': " + indexOf);
        System.out.println("Last Index of 'o': " + lastIndexOf);

        // startsWith and endsWith methods
        boolean startsWith = str5.startsWith("Hello");
        boolean endsWith = str5.endsWith("World");
        System.out.println("Starts with 'Hello': " + startsWith);
        System.out.println("Ends with 'World': " + endsWith);

        // equals and equalsIgnoreCase methods
        String str6 = "Hello, world!";
        boolean isEqual = str5.equals(str6);
        boolean isEqualIgnoreCase = str5.equalsIgnoreCase(str6);
        System.out.println("Equals to 'Hello, world!': " + isEqual);
        System.out.println("Equals to 'Hello, world!' (ignoring case): " + isEqualIgnoreCase);
    }
}
