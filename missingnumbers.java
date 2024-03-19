public class missingnumbers {
    public static void main(String[] args) {
        int[] series = {1, 5, 11, 19};

        // Find the missing numbers
        for (int i = 0; i < series.length - 1; i++) {
            int diff = series[i + 1] - series[i];
            if (diff > 2) {
                int missingCount = (diff - 1) / 2;
                for (int j = 1; j <= missingCount; j++) {
                    int missingNumber = series[i] + j;
                    System.out.println("Missing number: " + missingNumber);
                }
            }
        }
    }
}
