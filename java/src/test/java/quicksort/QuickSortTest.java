package quicksort;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Random;
import org.junit.jupiter.api.Test;

public class QuickSortTest {

  private boolean isSorted(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      if (arr[i] > arr[i + 1]) {
        return false;
      }
    }
    return true;
  }

  @Test
  public void testQuickSort() {
    // Test case 1: Random array
    int[] arr1 = new int[1000];
    Random rand = new Random();
    for (int i = 0; i < arr1.length; i++) {
      arr1[i] = rand.nextInt(1000);
    }
    QuickSort.quickSort(arr1, 0, arr1.length - 1);
    assertTrue(isSorted(arr1),
               "Test case 1 failed: Random array is not sorted");

    // Test case 2: Already sorted array
    int[] arr2 = new int[1000];
    for (int i = 0; i < arr2.length; i++) {
      arr2[i] = i;
    }
    QuickSort.quickSort(arr2, 0, arr2.length - 1);
    assertTrue(isSorted(arr2),
               "Test case 2 failed: Already sorted array is not sorted");

    // Test case 3: Reverse sorted array
    int[] arr3 = new int[1000];
    for (int i = 0; i < arr3.length; i++) {
      arr3[i] = 1000 - i;
    }
    QuickSort.quickSort(arr3, 0, arr3.length - 1);
    assertTrue(isSorted(arr3),
               "Test case 3 failed: Reverse sorted array is not sorted");

    // Test case 4: Array with all elements the same
    int[] arr4 = new int[1000];
    for (int i = 0; i < arr4.length; i++) {
      arr4[i] = 5;
    }
    QuickSort.quickSort(arr4, 0, arr4.length - 1);
    assertTrue(
        isSorted(arr4),
        "Test case 4 failed: Array with all elements the same is not sorted");

    // Test case 5: Empty array
    int[] arr5 = new int[0];
    QuickSort.quickSort(arr5, 0, arr5.length - 1);
    assertTrue(isSorted(arr5), "Test case 5 failed: Empty array is not sorted");

    // Test case 6: Single element array
    int[] arr6 = new int[1];
    arr6[0] = 42;
    QuickSort.quickSort(arr6, 0, arr6.length - 1);
    assertTrue(isSorted(arr6),
               "Test case 6 failed: Single element array is not sorted");
  }
}
