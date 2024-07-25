package quicksort;

import java.util.Random;

public class QuickSort {
  public static void quickSort(int[] arr, int low, int high) {
    if (low < high) {
      int pi = partition(arr, low, high);
      quickSort(arr, low, pi - 1);
      quickSort(arr, pi + 1, high);
    }
  }

  private static int partition(int[] arr, int low, int high) {
    int pivotIndex = new Random().nextInt(high - low + 1) + low;
    swap(arr, pivotIndex, high);
    int pivot = arr[high];
    int i = low - 1;
    for (int j = low; j < high; j++) {
      if (arr[j] < pivot) {
        i++;
        swap(arr, i, j);
      }
    }
    swap(arr, i + 1, high);
    return i + 1;
  }

  private static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  public static void main(String[] args) {
    int[] arr = new int[1000];
    Random rand = new Random();
    for (int i = 0; i < arr.length; i++) {
      arr[i] = rand.nextInt(1000);
    }

    System.out.println("Unsorted array:");
    printArray(arr);

    long startTime = System.nanoTime();
    quickSort(arr, 0, arr.length - 1);
    long endTime = System.nanoTime();

    System.out.println("Sorted array:");
    printArray(arr);

    System.out.println("Execution time: " + (endTime - startTime) / 1e6 +
                       " ms");
  }

  private static void printArray(int[] arr) {
    for (int num : arr) {
      System.out.print(num + " ");
    }
    System.out.println();
  }
}
