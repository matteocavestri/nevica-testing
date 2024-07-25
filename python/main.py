import random
import time
from quicksort.quicksort import quick_sort


def main():
    # Define the array size
    n = 1000

    # Generate an array of size n with random numbers between 1 and n
    arr = [random.randint(1, n) for _ in range(n)]

    # Print the original array
    print("Original array:", arr)

    # Measure the execution time of quick_sort
    start_time = time.time()
    quick_sort(arr, 0, len(arr) - 1)
    end_time = time.time()

    # Print the sorted array
    print("Sorted array:", arr)

    # Print the computation time
    print(f"QuickSort computation time: {end_time - start_time} seconds")


if __name__ == "__main__":
    main()
