import { quickSort } from './quicksort.js'

const arr = Array.from({ length: 1000 }, () => Math.floor(Math.random() * 1000))

console.log('Unsorted array:')
console.log(arr)

const startTime = process.hrtime()
quickSort(arr, 0, arr.length - 1)
const endTime = process.hrtime(startTime)

console.log('Sorted array:')
console.log(arr)

console.log(`Execution time: ${endTime[0] * 1000 + endTime[1] / 1e6} ms`)
