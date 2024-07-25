import random
import sys

sys.path.insert(0, "..")
from quicksort.quicksort import quick_sort


def is_sorted(arr):
    return all(arr[i] <= arr[i + 1] for i in range(len(arr) - 1))


def test_quick_sort():
    # Test case 1: Random array
    arr1 = ["5", "3", "1", "4", "2"]
    quick_sort(arr1, 0, len(arr1) - 1)
    assert is_sorted(arr1), "Test case 1 failed: Random array is not sorted"

    # Test case 2: Already sorted array
    arr2 = ["1", "2", "3", "4", "5"]
    quick_sort(arr2, 0, len(arr2) - 1)
    assert is_sorted(arr2), "Test case 2 failed: Already sorted array is not sorted"

    # Test case 3: Reverse sorted array
    arr3 = ["5", "4", "3", "2", "1"]
    quick_sort(arr3, 0, len(arr3) - 1)
    assert is_sorted(arr3), "Test case 3 failed: Reverse sorted array is not sorted"

    # Test case 4: Array with all elements the same
    arr4 = ["1", "1", "1", "1", "1"]
    quick_sort(arr4, 0, len(arr4) - 1)
    assert is_sorted(
        arr4
    ), "Test case 4 failed: Array with all elements the same is not sorted"

    # Test case 5: Empty array
    arr5 = []
    quick_sort(arr5, 0, len(arr5) - 1)
    assert is_sorted(arr5), "Test case 5 failed: Empty array is not sorted"

    # Test case 6: Single element array
    arr6 = ["5"]
    quick_sort(arr6, 0, len(arr6) - 1)
    assert is_sorted(arr6), "Test case 6 failed: Single element array is not sorted"
