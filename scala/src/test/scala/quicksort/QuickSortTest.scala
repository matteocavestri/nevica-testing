package quicksort

import org.scalatest.funsuite.AnyFunSuite

import scala.util.Random

class QuickSortTest extends AnyFunSuite {

  private def isSorted(arr: Array[Int]): Boolean = {
    for (i <- 0 until arr.length - 1) {
      if (arr(i) > arr(i + 1)) {
        return false
      }
    }
    true
  }

  test("QuickSort should sort a random array") {
    val arr = Array.fill(1000)(Random.nextInt(1000))
    QuickSort.quickSort(arr, 0, arr.length - 1)
    assert(isSorted(arr), "Random array is not sorted")
  }

  test("QuickSort should sort an already sorted array") {
    val arr = (0 until 1000).toArray
    QuickSort.quickSort(arr, 0, arr.length - 1)
    assert(isSorted(arr), "Already sorted array is not sorted")
  }

  test("QuickSort should sort a reverse sorted array") {
    val arr = (1000 to 1 by -1).toArray
    QuickSort.quickSort(arr, 0, arr.length - 1)
    assert(isSorted(arr), "Reverse sorted array is not sorted")
  }

  test("QuickSort should sort an array with all elements the same") {
    val arr = Array.fill(1000)(5)
    QuickSort.quickSort(arr, 0, arr.length - 1)
    assert(isSorted(arr), "Array with all elements the same is not sorted")
  }

  test("QuickSort should sort an empty array") {
    val arr = Array.empty[Int]
    QuickSort.quickSort(arr, 0, arr.length - 1)
    assert(isSorted(arr), "Empty array is not sorted")
  }

  test("QuickSort should sort a single element array") {
    val arr = Array(42)
    QuickSort.quickSort(arr, 0, arr.length - 1)
    assert(isSorted(arr), "Single element array is not sorted")
  }
}
