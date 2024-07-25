package quicksort

import kotlin.random.Random

object QuickSort {
    fun quickSort(
        arr: IntArray,
        low: Int,
        high: Int,
    ) {
        if (low < high) {
            val pi = partition(arr, low, high)
            quickSort(arr, low, pi - 1)
            quickSort(arr, pi + 1, high)
        }
    }

    private fun partition(
        arr: IntArray,
        low: Int,
        high: Int,
    ): Int {
        val pivotIndex = Random.nextInt(low, high + 1)
        swap(arr, pivotIndex, high)
        val pivot = arr[high]
        var i = low - 1
        for (j in low until high) {
            if (arr[j] < pivot) {
                i++
                swap(arr, i, j)
            }
        }
        swap(arr, i + 1, high)
        return i + 1
    }

    private fun swap(
        arr: IntArray,
        i: Int,
        j: Int,
    ) {
        val temp = arr[i]
        arr[i] = arr[j]
        arr[j] = temp
    }

    fun printArray(arr: IntArray) {
        println(arr.joinToString(" "))
    }
}
