package array.algos;

import java.util.Arrays;
import java.util.List;

public class LinearSearch {

    /**
     * Search algorithm to find an element in an array.
     * It is used when elements of array is not sorted.
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     * @return the index of element if found, else returns -1
     */
    public int search(int[] arr, int key) {
        if(arr == null || arr.length == 0) {
            return -1;
        }
        int len = arr.length;
        for(int i = 0; i<len; i++) {
            if(arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public int search(String[] arr, String key) {
        if(arr == null || arr.length == 0) {
            return -1;
        }
        int len = arr.length;
        for(int i = 0; i<len; i++) {
            if(arr[i].equals(key)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * searches an element in a list
     * @param list list of elements
     * @param key key to search in the list
     * @return index of element if found, else -1
     */
    public int search(List<Integer> list, int key) {
        if(list == null || list.isEmpty()) {
            return -1;
        }
        int len = list.size();
        for(int i = 0; i<len; i++) {
            if(list.get(i) == key) {
                return i;
            }
        }
        return -1;
    }
}
