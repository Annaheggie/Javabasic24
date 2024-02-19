package javabasicanna.homeworks.lecture9;

import java.util.Arrays;
import java.util.Random;

public class SteppedArrayOperations {
    private int[][] steppedArray;

    public SteppedArrayOperations(int N, int M) {
        steppedArray = new int[N][];
        Random random = new Random();

        for (int i = 0; i < N; i++) {
            int rowLength = random.nextInt(M);
            steppedArray[i] = new int[rowLength];
            for (int j = 0; j < rowLength; j++) {
                steppedArray[i][j] = random.nextInt(1,100); // Generating random numbers between 1 and 99
            }
        }
    }

    public void sortRows() {
        for (int i = 0; i < steppedArray.length; i++) {
            Arrays.sort(steppedArray[i]);
            if (i % 2 == 1) {
                reverseArray(steppedArray[i]);
            }
        }
    }

    public int calculateSum() {
        int sum = 0;
        for (int[] row : steppedArray) {
            for (int num : row) {
                sum += num;
            }
        }
        return sum;
    }

    public int[] findMinPerRow() {
        int[] minPerRow = new int[steppedArray.length];
        int absoluteMin = Integer.MAX_VALUE;

        for (int i = 0; i < steppedArray.length; i++) {
            int min = Arrays.stream(steppedArray[i]).min().orElse(Integer.MAX_VALUE);
            minPerRow[i] = min;
            if (min < absoluteMin) {
                absoluteMin = min;
            }
        }

        for (int i = 0; i < steppedArray.length; i++) {
            for (int j = 0; j < steppedArray[i].length; j++) {
                steppedArray[i][j] /= absoluteMin;
            }
        }

        return minPerRow;
    }

    private void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public int[][] getSteppedArray() {
        return steppedArray;
    }

    public static void main(String[] args) {
        int N = 5; // Number of lines
        int M = 8; // Maximum number of elements in a row
        SteppedArrayOperations arrayOps = new SteppedArrayOperations(N, M);

        arrayOps.sortRows();
        System.out.println("Sum of all elements: " + arrayOps.calculateSum());
        System.out.println("Minimum elements per row: " + Arrays.toString(arrayOps.findMinPerRow()));
        System.out.println("Stepped Array after division: ");
        for (int[] row : arrayOps.getSteppedArray()) {
            System.out.println(Arrays.toString(row));
        }
    }
}
