package quicksort

import (
	"math/rand"
	"testing"
	"time"
)

func isSorted(arr []int) bool {
	for i := 0; i < len(arr)-1; i++ {
		if arr[i] > arr[i+1] {
			return false
		}
	}
	return true
}

func TestQuickSort(t *testing.T) {
	// Test case 1: Random array
	rand.Seed(time.Now().UnixNano())
	arr1 := make([]int, 1000)
	for i := range arr1 {
		arr1[i] = rand.Intn(1000)
	}
	QuickSort(arr1, 0, len(arr1)-1)
	if !isSorted(arr1) {
		t.Error("Test case 1 failed: Random array is not sorted")
	}

	// Test case 2: Already sorted array
	arr2 := make([]int, 1000)
	for i := range arr2 {
		arr2[i] = i
	}
	QuickSort(arr2, 0, len(arr2)-1)
	if !isSorted(arr2) {
		t.Error("Test case 2 failed: Already sorted array is not sorted")
	}

	// Test case 3: Reverse sorted array
	arr3 := make([]int, 1000)
	for i := range arr3 {
		arr3[i] = len(arr3) - i
	}
	QuickSort(arr3, 0, len(arr3)-1)
	if !isSorted(arr3) {
		t.Error("Test case 3 failed: Reverse sorted array is not sorted")
	}

	// Test case 4: Array with all elements the same
	arr4 := make([]int, 1000)
	for i := range arr4 {
		arr4[i] = 5
	}
	QuickSort(arr4, 0, len(arr4)-1)
	if !isSorted(arr4) {
		t.Error("Test case 4 failed: Array with all elements the same is not sorted")
	}

	// Test case 5: Empty array
	var arr5 []int
	QuickSort(arr5, 0, len(arr5)-1)
	if !isSorted(arr5) {
		t.Error("Test case 5 failed: Empty array is not sorted")
	}

	// Test case 6: Single element array
	arr6 := []int{42}
	QuickSort(arr6, 0, len(arr6)-1)
	if !isSorted(arr6) {
		t.Error("Test case 6 failed: Single element array is not sorted")
	}
}
