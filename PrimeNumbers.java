public class PrimeNumbers {
    public static void main(String[] args) {
        int[] array = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29}; // Sample array, you can replace it with your array

        int primeCount = 0;

        // Iterate through the array elements using enhanced for loop
        for (int num : array) {
            if (isPrime(num)) {
                primeCount++;
            }
        }

        System.out.println("Number of prime numbers in the array: " + primeCount);
    }

    // Function to check if a number is prime
    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
