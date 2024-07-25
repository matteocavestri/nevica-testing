import { quickSort } from '../src/quicksort.js'

function isSorted(arr) {
  for (let i = 0; i < arr.length - 1; i++) {
    if (arr[i] > arr[i + 1]) {
      return false
    }
  }
  return true
}

test('QuickSort should sort an array of random numbers', () => {
  const arr = Array.from({ length: 1000 }, () =>
    Math.floor(Math.random() * 1000),
  )
  quickSort(arr, 0, arr.length - 1)
  expect(isSorted(arr)).toBe(true)
})

test('QuickSort should sort an already sorted array', () => {
  const arr = Array.from({ length: 1000 }, (_, i) => i)
  quickSort(arr, 0, arr.length - 1)
  expect(isSorted(arr)).toBe(true)
})

test('QuickSort should sort a reverse sorted array', () => {
  const arr = Array.from({ length: 1000 }, (_, i) => 1000 - i)
  quickSort(arr, 0, arr.length - 1)
  expect(isSorted(arr)).toBe(true)
})

test('QuickSort should handle an array with all elements the same', () => {
  const arr = Array.from({ length: 1000 }, () => 5)
  quickSort(arr, 0, arr.length - 1)
  expect(isSorted(arr)).toBe(true)
})

test('QuickSort should handle an empty array', () => {
  const arr = []
  quickSort(arr, 0, arr.length - 1)
  expect(isSorted(arr)).toBe(true)
})

test('QuickSort should handle a single element array', () => {
  const arr = [42]
  quickSort(arr, 0, arr.length - 1)
  expect(isSorted(arr)).toBe(true)
})
