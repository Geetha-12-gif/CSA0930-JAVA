public class datatypeconversion {
    public static void main(String[] args) {
        // Implicit (widening) conversion from smaller to larger data types
        int intValue = 100;
        long longValue = intValue; // int to long
        float floatValue = longValue; // long to float
        double doubleValue = floatValue; // float to double

        System.out.println("Implicit (widening) conversion:");
        System.out.println("Int value: " + intValue);
        System.out.println("Converted to long: " + longValue);
        System.out.println("Converted to float: " + floatValue);
        System.out.println("Converted to double: " + doubleValue);

        // Explicit (narrowing) conversion from larger to smaller data types
        double doubleNum = 123.456;
        float floatNum = (float) doubleNum; // double to float
        long longNum = (long) floatNum; // float to long
        int intNum = (int) longNum; // long to int
        short shortNum = (short) intNum; // int to short
        byte byteNum = (byte) shortNum; // short to byte

        System.out.println("\nExplicit (narrowing) conversion:");
        System.out.println("Double value: " + doubleNum);
        System.out.println("Converted to float: " + floatNum);
        System.out.println("Converted to long: " + longNum);
        System.out.println("Converted to int: " + intNum);
        System.out.println("Converted to short: " + shortNum);
        System.out.println("Converted to byte: " + byteNum);

        // Overflow and underflow scenarios
        int overflowValue = Integer.MAX_VALUE + 1; // Overflow
        int underflowValue = Integer.MIN_VALUE - 1; // Underflow

        System.out.println("\nOverflow and underflow scenarios:");
        System.out.println("Overflow value: " + overflowValue); // Output will be negative due to overflow
        System.out.println("Underflow value: " + underflowValue); // Output will be positive due to underflow
    }
}
