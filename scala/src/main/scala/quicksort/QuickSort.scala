package quicksort

import scala.util.Random

object QuickSort {
  def quickSort(arr: Array[Int], low: Int, high: Int): Unit = {
    if (low < high) {
      val pi = partition(arr, low, high)
      quickSort(arr, low, pi - 1)
      quickSort(arr, pi + 1, high)
    }
  }

  private def partition(arr: Array[Int], low: Int, high: Int): Int = {
    val pivotIndex = Random.nextInt(high - low + 1) + low
    swap(arr, pivotIndex, high)
    val pivot = arr(high)
    var i = low - 1
    for (j <- low until high) {
      if (arr(j) < pivot) {
        i += 1
        swap(arr, i, j)
      }
    }
    swap(arr, i + 1, high)
    i + 1
  }

  private def swap(arr: Array[Int], i: Int, j: Int): Unit = {
    val temp = arr(i)
    arr(i) = arr(j)
    arr(j) = temp
  }

  def main(args: Array[String]): Unit = {
    val arr = Array.fill(1000)(Random.nextInt(1000))

    println("Unsorted array:")
    printArray(arr)

    val startTime = System.nanoTime()
    quickSort(arr, 0, arr.length - 1)
    val endTime = System.nanoTime()

    println("Sorted array:")
    printArray(arr)

    println(s"Execution time: ${(endTime - startTime) / 1e6} ms")
  }

  private def printArray(arr: Array[Int]): Unit = {
    println(arr.mkString(" "))
  }
}
