#include "../src/quicksort.hpp"
#include "../src/utils.hpp"
#include <cstdlib>
#include <ctime>
#include <iostream>
#include <vector>

#define ARRAY_SIZE 1000

bool isSorted(const std::vector<int> &arr) {
  for (size_t i = 0; i < arr.size() - 1; ++i) {
    if (arr[i] > arr[i + 1]) {
      return false;
    }
  }
  return true;
}

void testQuickSort(std::vector<int> &arr) {
  if (arr.size() == 0) {
    std::cout << "Test skipped: Empty array\n";
    return;
  }

  clock_t start, end;
  double cpu_time_used;

  start = clock();
  quickSort(arr, 0, arr.size() - 1);
  end = clock();

  cpu_time_used = static_cast<double>(end - start) / CLOCKS_PER_SEC;
  std::cout << "Execution time: " << cpu_time_used << " seconds\n";

  if (isSorted(arr)) {
    std::cout << "Test passed: Array is sorted.\n";
  } else {
    std::cout << "Test failed: Array is not sorted.\n";
  }
}

void runTests() {
  // Test case 1: Random array
  std::vector<int> arr1(ARRAY_SIZE);
  std::srand(std::time(0));
  for (int i = 0; i < ARRAY_SIZE; ++i) {
    arr1[i] = std::rand() % 1000;
  }
  std::cout << "Test case 1: Random array\n";
  testQuickSort(arr1);

  // Test case 2: Already sorted array
  std::vector<int> arr2(ARRAY_SIZE);
  for (int i = 0; i < ARRAY_SIZE; ++i) {
    arr2[i] = i;
  }
  std::cout << "Test case 2: Already sorted array\n";
  testQuickSort(arr2);

  // Test case 3: Reverse sorted array
  std::vector<int> arr3(ARRAY_SIZE);
  for (int i = 0; i < ARRAY_SIZE; ++i) {
    arr3[i] = ARRAY_SIZE - i;
  }
  std::cout << "Test case 3: Reverse sorted array\n";
  testQuickSort(arr3);

  // Test case 4: Array with all elements the same
  std::vector<int> arr4(ARRAY_SIZE, 5);
  std::cout << "Test case 4: Array with all elements the same\n";
  testQuickSort(arr4);

  // Test case 5: Empty array
  std::vector<int> arr5;
  std::cout << "Test case 5: Empty array\n";
  testQuickSort(arr5);

  // Test case 6: Single element array
  std::vector<int> arr6(1, 42);
  std::cout << "Test case 6: Single element array\n";
  testQuickSort(arr6);
}

int main() {
  runTests();
  return 0;
}
