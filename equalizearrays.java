import java.util.Arrays;

public class equalizearrays{
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {10, 20, 30};
        
        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));
        
        // Check if arrays have equal length
        if (array1.length != array2.length) {
            // Determine the minimum length among the arrays
            int minLength = Math.min(array1.length, array2.length);
            
            // Resize arrays to the minimum length using Arrays.copyOf()
            array1 = Arrays.copyOf(array1, minLength);
            array2 = Arrays.copyOf(array2, minLength);
            
            System.out.println("\nArrays have unequal length. Resized arrays:");
            System.out.println("Array 1: " + Arrays.toString(array1));
            System.out.println("Array 2: " + Arrays.toString(array2));
        } else {
            System.out.println("\nArrays have equal length.");
        }
    }
}
