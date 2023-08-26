package array.algos;

public class Traversal {
    public void printAlternateEvenIndex(int[] arr) {
        int n = arr.length;
        for(int i = 0; i<n; i+=2) {
            System.out.print(arr[i] + " ");
        }
    }

    public void printAlternateOddIndex(int[] arr) {
        int n = arr.length;
        for(int i = 1; i<n; i+=2) {
            System.out.print(arr[i] + " ");
        }
    }

    /**
     * return sum upto N numbers
     * sum = 1 + 2 + 3 + .... + N
     */
    public long sumN(int n) {
        long sum = 0;
        for(int i = 1; i<n; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public long efficientSumN(int n) {
        long m = n;
        long sum = m*(m+1)/2;
        return sum;
    }
}
