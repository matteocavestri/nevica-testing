package quicksort

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import kotlin.random.Random

class QuickSortTest {
    private fun isSorted(arr: IntArray): Boolean {
        for (i in 0 until arr.size - 1) {
            if (arr[i] > arr[i + 1]) {
                return false
            }
        }
        return true
    }

    @Test
    fun testQuickSort() {
        // Test case 1: Random array
        val arr1 = IntArray(1000) { Random.nextInt(1000) }
        QuickSort.quickSort(arr1, 0, arr1.size - 1)
        assertTrue(isSorted(arr1), "Test case 1 failed: Random array is not sorted")

        // Test case 2: Already sorted array
        val arr2 = IntArray(1000) { it }
        QuickSort.quickSort(arr2, 0, arr2.size - 1)
        assertTrue(isSorted(arr2), "Test case 2 failed: Already sorted array is not sorted")

        // Test case 3: Reverse sorted array
        val arr3 = IntArray(1000) { 1000 - it }
        QuickSort.quickSort(arr3, 0, arr3.size - 1)
        assertTrue(isSorted(arr3), "Test case 3 failed: Reverse sorted array is not sorted")

        // Test case 4: Array with all elements the same
        val arr4 = IntArray(1000) { 5 }
        QuickSort.quickSort(arr4, 0, arr4.size - 1)
        assertTrue(isSorted(arr4), "Test case 4 failed: Array with all elements the same is not sorted")

        // Test case 5: Empty array
        val arr5 = IntArray(0)
        QuickSort.quickSort(arr5, 0, arr5.size - 1)
        assertTrue(isSorted(arr5), "Test case 5 failed: Empty array is not sorted")

        // Test case 6: Single element array
        val arr6 = IntArray(1) { 42 }
        QuickSort.quickSort(arr6, 0, arr6.size - 1)
        assertTrue(isSorted(arr6), "Test case 6 failed: Single element array is not sorted")
    }
}
