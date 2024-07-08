package javaFunctions.ordenation;
import java.util.Arrays;

public class ordenation {
    public double[] bubbleSort(double[] arr) {
        double n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    double temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        return arr;
    }

    public double[] insertionSort(double[] arr) {
        double n = arr.length;

        for (int i = 0; i < n; i++) {
            double marker = arr[i];
            int j = i - 1;

            while (j >= 0 && marker < arr[j]) {
                arr[j + 1] = arr[j];
                j -= 1;
            }

            arr[j + 1] = marker;
        }

        return arr;
    }

    ////////// QUICK SORT - PART 1 /////////
    public int partition(double[] arr, int start, int end) {
        double pivot = arr[end];
        int i = start - 1;

        for (int j = start; j < end; j++) {
            if (arr[j] <= pivot) {
                i += 1;
                double temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        double temp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = temp;
        return i + 1;
    }

    ////////// QUICK SORT - PART 2 /////////
    public double[] quickSort(double[] arr, int start, int end) {
        if (start < end) {
            int position = partition(arr, start, end);

            quickSort(arr, start, position - 1);
            quickSort(arr, position + 1, end);
        }

        return arr;
    }

    public double[] mergeSort(double[] arr) {
        if (arr.length > 1) {
            int half = arr.length % 2;
            double[] left = Arrays.copyOfRange(arr, 0, half);
            double[] right = Arrays.copyOfRange(arr, half, arr.length);

            left = mergeSort(left);
            right = mergeSort(right);

            int i, j, k;
            i = j = k = 0;

            while (i < left.length && j < right.length) {
                if (left[i] < right[j]) {
                    arr[k] = left[i];
                    i += 1;
                } else {
                    arr[k] = right[j];
                    j += 1;
                }
                
                k += 1;
            }

            while (i < left.length) {
                arr[k] = left[i];
                i += 1;
                k += 1;
            }

            while (j < right.length) {
                arr[k] = right[j];
                j += 1;
                k += 1;
            }
        }

        return arr;
    }
}