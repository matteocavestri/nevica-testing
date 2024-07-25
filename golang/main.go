package main

import (
	"fmt"
	"golang/quicksort"
	"math/rand"
	"time"
)

const arraySize = 100000000

func printArray(arr []int) {
	for _, num := range arr {
		fmt.Printf("%d ", num)
	}
	fmt.Println()
}

func main() {
	arr := make([]int, arraySize)
	rand.Seed(time.Now().UnixNano())
	for i := range arr {
		arr[i] = rand.Intn(100000000)
	}

	fmt.Println("Unsorted array:")
	printArray(arr)

	start := time.Now()
	quicksort.QuickSort(arr, 0, len(arr)-1)
	duration := time.Since(start)

	fmt.Println("Sorted array:")
	printArray(arr)
	fmt.Printf("Execution time: %f seconds\n", duration.Seconds())
}
