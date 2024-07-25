use rand::Rng;
use quicksort::quicksort::quick_sort;

fn is_sorted(arr: &[i32]) -> bool {
    if arr.len() <= 1 {
        return true;
    }

    for i in 0..arr.len() - 1 {
        if arr[i] > arr[i + 1] {
            return false;
        }
    }
    true
}

#[test]
fn test_quick_sort() {
    // Test case 1: Random array
    let mut arr1: Vec<i32> = (0..1000).map(|_| rand::thread_rng().gen_range(0..1000)).collect();
    let len1 = arr1.len() as isize;
    if len1 > 0 {
        quick_sort(&mut arr1, 0, len1 - 1);
    }
    assert!(is_sorted(&arr1), "Test case 1 failed: Random array is not sorted");

    // Test case 2: Already sorted array
    let mut arr2: Vec<i32> = (0..1000).collect();
    let len2 = arr2.len() as isize;
    if len2 > 0 {
        quick_sort(&mut arr2, 0, len2 - 1);
    }
    assert!(is_sorted(&arr2), "Test case 2 failed: Already sorted array is not sorted");

    // Test case 3: Reverse sorted array
    let mut arr3: Vec<i32> = (0..1000).rev().collect();
    let len3 = arr3.len() as isize;
    if len3 > 0 {
        quick_sort(&mut arr3, 0, len3 - 1);
    }
    assert!(is_sorted(&arr3), "Test case 3 failed: Reverse sorted array is not sorted");

    // Test case 4: Array with all elements the same
    let mut arr4: Vec<i32> = vec![5; 1000];
    let len4 = arr4.len() as isize;
    if len4 > 0 {
        quick_sort(&mut arr4, 0, len4 - 1);
    }
    assert!(is_sorted(&arr4), "Test case 4 failed: Array with all elements the same is not sorted");

    // Test case 5: Empty array
    let mut arr5: Vec<i32> = vec![];
    let len5 = arr5.len() as isize;
    if len5 > 0 {
        quick_sort(&mut arr5, 0, len5 - 1);
    }
    assert!(is_sorted(&arr5), "Test case 5 failed: Empty array is not sorted");

    // Test case 6: Single element array
    let mut arr6: Vec<i32> = vec![42];
    let len6 = arr6.len() as isize;
    if len6 > 0 {
        quick_sort(&mut arr6, 0, len6 - 1);
    }
    assert!(is_sorted(&arr6), "Test case 6 failed: Single element array is not sorted");
}
