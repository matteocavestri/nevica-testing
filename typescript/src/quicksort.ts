function swap(arr: number[], i: number, j: number): void {
  let temp = arr[i]
  arr[i] = arr[j]
  arr[j] = temp
}

function partition(arr: number[], low: number, high: number): number {
  let pivot = arr[high]
  let i = low - 1
  for (let j = low; j < high; j++) {
    if (arr[j] < pivot) {
      i++
      swap(arr, i, j)
    }
  }
  swap(arr, i + 1, high)
  return i + 1
}

function quickSort(arr: number[], low: number, high: number): void {
  if (low < high) {
    let pi = partition(arr, low, high)
    quickSort(arr, low, pi - 1)
    quickSort(arr, pi + 1, high)
  }
}

export { quickSort }
