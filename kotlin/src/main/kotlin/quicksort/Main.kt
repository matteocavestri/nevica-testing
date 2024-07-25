package quicksort

import kotlin.random.Random

fun main() {
    val arr = IntArray(1000) { Random.nextInt(1000) }

    println("Unsorted array:")
    QuickSort.printArray(arr)

    val startTime = System.nanoTime()
    QuickSort.quickSort(arr, 0, arr.size - 1)
    val endTime = System.nanoTime()

    println("Sorted array:")
    QuickSort.printArray(arr)

    println("Execution time: ${(endTime - startTime) / 1e6} ms")
}
