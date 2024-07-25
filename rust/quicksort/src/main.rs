mod quicksort;

use rand::Rng;
use std::time::Instant;

fn print_array(arr: &[i32]) {
    for &num in arr {
        print!("{} ", num);
    }
    println!();
}

fn main() {
    const ARRAY_SIZE: usize = 1000;
    let mut arr: Vec<i32> = (0..ARRAY_SIZE).map(|_| rand::thread_rng().gen_range(0..1000)).collect();

    println!("Unsorted array:");
    print_array(&arr);

    let len = arr.len() as isize; // Separare il prestito
    let start = Instant::now();
    quicksort::quick_sort(&mut arr, 0, len - 1);
    let duration = start.elapsed();

    println!("Sorted array:");
    print_array(&arr);
    println!("Execution time: {:?}", duration);
}
