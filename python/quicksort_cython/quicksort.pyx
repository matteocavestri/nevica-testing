cdef int partition(int[:] arr, int low, int high):
    cdef int pivot = arr[high]
    cdef int i = low - 1
    cdef int j
    for j in range(low, high):
        if arr[j] <= pivot:
            i += 1
            arr[i], arr[j] = arr[j], arr[i]
    arr[i + 1], arr[high] = arr[high], arr[i + 1]
    return i + 1

cpdef void quick_sort(int[:] arr, int low, int high):  # Cambiato da cdef a cpdef
    cdef int pi
    if low < high:
        pi = partition(arr, low, high)
        quick_sort(arr, low, pi - 1)
        quick_sort(arr, pi + 1, high)
