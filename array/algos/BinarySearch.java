package array.algos;

import java.util.Arrays;

public class BinarySearch {
    /**
     * Search algorithm to find an element in an array.
     * It is used when elements of array is sorted.
     * Time Complexity: O(log N)
     * Space Complexity: O(1)
     * @return the index of element if found, else returns -1
     */
    public int search(int[] arr, int key) {
        if(arr == null || arr.length == 0) {
            return -1;
        }
        // TODO implement logic
        return -1;
    }

    /**
     * Java inbuilt binarySearch method in Arrays class.
     * @return index of element if found, else returns a negative value
     * this negative value is equal to position where it would actually lie in case the element was present
     */
    public int search0(int[] arr, int key) {
        return Arrays.binarySearch(arr, key);
    }
}
