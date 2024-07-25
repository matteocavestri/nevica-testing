#include "utils.hpp"
#include <iostream>

void printArray(const std::vector<int> &arr) {
  for (int num : arr) {
    std::cout << num << " ";
  }
  std::cout << std::endl;
}
