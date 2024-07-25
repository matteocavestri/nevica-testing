#include "quicksort.hpp"
#include "utils.hpp"
#include <cstdlib>
#include <ctime>
#include <iostream>
#include <vector>

#define ARRAY_SIZE 1000

int main() {
  std::vector<int> arr(ARRAY_SIZE);
  std::srand(std::time(0));
  for (int i = 0; i < ARRAY_SIZE; ++i) {
    arr[i] = std::rand() % 1000;
  }

  std::cout << "Unsorted array:\n";
  printArray(arr);

  clock_t start, end;
  double cpu_time_used;

  start = clock();
  quickSort(arr, 0, ARRAY_SIZE - 1);
  end = clock();

  cpu_time_used = static_cast<double>(end - start) / CLOCKS_PER_SEC;

  std::cout << "Sorted array:\n";
  printArray(arr);
  std::cout << "Execution time: " << cpu_time_used << " seconds\n";

  return 0;
}
