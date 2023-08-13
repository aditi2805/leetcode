import array.algos.LinearSearch;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 8, 6, 3};
        LinearSearch obj = new LinearSearch();
        int index = obj.search(arr, 8);
        System.out.println(index);
    }
}
