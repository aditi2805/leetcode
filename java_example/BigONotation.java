package java_example;

public class BigONotation {
    // is used to represent efficiency of an algorithm

    // Names of different orders
    // O(1) -> constant time
    // O(log N) -> logarithmic time
    // O(N) -> linear time
    // O(N log N)
    // O(N*N) -> quadratic time (polynomial)
    // O(N*N*N) -> cubic time (polynomial)
    // O(N^x) -> polynomial time
    // O(a^n) -> exponential time

    // efficiency order
    // O(1)(Best) > O(logN) > O(N) > O(N Log N) > O(N*N) > O(N*N log N) > O(N*N*N) > O(N^x) > O(a^n) (worst)

    // examples:
    // O(1) -> sum upto N numbers, sum = n*(n+1)/2
    // O(log N) -> binary Search
    // O(N) -> linear search
    // O(N log N) -> sorting algorithms (merge sort, quick sort..)
    // O(n*n) -> bubble sort, selection sort, matrix traversal
}
