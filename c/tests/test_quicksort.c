#include "../src/quicksort.h"
#include "../src/utils.h"
#include <stdbool.h>
#include <stdio.h>
#include <stdlib.h>
#include <time.h>

#define ARRAY_SIZE 1000

bool isSorted(int arr[], int size) {
  for (int i = 0; i < size - 1; i++) {
    if (arr[i] > arr[i + 1]) {
      return false;
    }
  }
  return true;
}

void testQuickSort(int arr[], int size) {
  if (size == 0) {
    printf("Test skipped: Empty array\n");
    return;
  }

  clock_t start, end;
  double cpu_time_used;

  start = clock();
  quickSort(arr, 0, size - 1);
  end = clock();

  cpu_time_used = ((double)(end - start)) / CLOCKS_PER_SEC;
  printf("Execution time: %f seconds\n", cpu_time_used);

  if (isSorted(arr, size)) {
    printf("Test passed: Array is sorted.\n");
  } else {
    printf("Test failed: Array is not sorted.\n");
  }
}

void runTests() {
  // Test case 1: Random array
  int arr1[ARRAY_SIZE];
  srand(time(0));
  for (int i = 0; i < ARRAY_SIZE; i++) {
    arr1[i] = rand() % 1000;
  }
  printf("Test case 1: Random array\n");
  testQuickSort(arr1, ARRAY_SIZE);

  // Test case 2: Already sorted array
  int arr2[ARRAY_SIZE];
  for (int i = 0; i < ARRAY_SIZE; i++) {
    arr2[i] = i;
  }
  printf("Test case 2: Already sorted array\n");
  testQuickSort(arr2, ARRAY_SIZE);

  // Test case 3: Reverse sorted array
  int arr3[ARRAY_SIZE];
  for (int i = 0; i < ARRAY_SIZE; i++) {
    arr3[i] = ARRAY_SIZE - i;
  }
  printf("Test case 3: Reverse sorted array\n");
  testQuickSort(arr3, ARRAY_SIZE);

  // Test case 4: Array with all elements the same
  int arr4[ARRAY_SIZE];
  for (int i = 0; i < ARRAY_SIZE; i++) {
    arr4[i] = 5;
  }
  printf("Test case 4: Array with all elements the same\n");
  testQuickSort(arr4, ARRAY_SIZE);

  // Test case 5: Empty array
  int arr5[0];
  printf("Test case 5: Empty array\n");
  testQuickSort(arr5, 0);

  // Test case 6: Single element array
  int arr6[1] = {42};
  printf("Test case 6: Single element array\n");
  testQuickSort(arr6, 1);
}

int main() {
  runTests();
  return 0;
}
