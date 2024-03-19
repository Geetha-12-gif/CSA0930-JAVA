public class stringbuffer {
    public static void main(String[] args) {
        // Example of StringBuilder
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hello");
        stringBuilder.append(" ");
        stringBuilder.append("World");
        System.out.println("StringBuilder result: " + stringBuilder.toString());

        // Example of StringBuffer
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Hello");
        stringBuffer.append(" ");
        stringBuffer.append("World");
        System.out.println("StringBuffer result: " + stringBuffer.toString());

        // Performance comparison
        int iterations = 1000000; // Number of iterations for appending strings
        long startTime, endTime;

        // StringBuilder performance
        startTime = System.currentTimeMillis();
        StringBuilder stringBuilderPerformance = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            stringBuilderPerformance.append("Hello");
            stringBuilderPerformance.append(" ");
            stringBuilderPerformance.append("World");
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time taken by StringBuilder: " + (endTime - startTime) + " milliseconds");

        // StringBuffer performance
        startTime = System.currentTimeMillis();
        StringBuffer stringBufferPerformance = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            stringBufferPerformance.append("Hello");
            stringBufferPerformance.append(" ");
            stringBufferPerformance.append("World");
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time taken by StringBuffer: " + (endTime - startTime) + " milliseconds");
    }
}
