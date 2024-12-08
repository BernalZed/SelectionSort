
package labactselectionsort;
import java.util.Random;

public class LabActSelectionSort {

    public static void selectionSort(double[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            double temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printArray(double[] arr) {
        for (double num : arr) {
            System.out.printf("%.4f\n", num);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Random rand = new Random();
        double[] arr = new double[50];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0 + (1000 - 0) * rand.nextDouble();
        }

        System.out.println("Original Array:");
        printArray(arr);

        selectionSort(arr);

        System.out.println("Sorted Array:");
        printArray(arr);
    }
}

