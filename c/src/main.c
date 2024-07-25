#include "quicksort.h"
#include "utils.h"
#include <stdio.h>
#include <stdlib.h>
#include <time.h>

#define ARRAY_SIZE 100000000

int main() {
  int arr[ARRAY_SIZE];
  srand(time(0));
  for (int i = 0; i < ARRAY_SIZE; i++) {
    arr[i] = rand() % 100000000;
  }

  printf("Unsorted array:\n");
  printArray(arr, ARRAY_SIZE);

  clock_t start, end;
  double cpu_time_used;

  start = clock();
  quickSort(arr, 0, ARRAY_SIZE - 1);
  end = clock();

  cpu_time_used = ((double)(end - start)) / CLOCKS_PER_SEC;

  printf("Sorted array:\n");
  printArray(arr, ARRAY_SIZE);
  printf("Execution time: %f seconds\n", cpu_time_used);

  return 0;
}
