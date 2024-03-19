public class confusionmatrix {
    public static void main(String[] args) {
        // Define the confusion matrix values
        int truePositive = 60;
        int trueNegative = 20;
        int falsePositive = 10;
        int falseNegative = 5;

        // Calculate the metrics
        double precision = (double) truePositive / (truePositive + falsePositive);
        double recall = (double) truePositive / (truePositive + falseNegative);
        double f1Score = 2 * ((precision * recall) / (precision + recall));

        // Print the confusion matrix and metrics
        System.out.println("Confusion Matrix:");
        System.out.println("TP: " + truePositive + "\tFN: " + falseNegative);
        System.out.println("FP: " + falsePositive + "\tTN: " + trueNegative);
        System.out.println("\nMetrics:");
        System.out.println("Precision: " + precision);
        System.out.println("Recall: " + recall);
        System.out.println("F1-score: " + f1Score);
    }
}
