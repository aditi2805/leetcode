package recursion;

public class BasicRecursion {
    /**
     * given N, print 1 2 3 4 5...N without using loops
     */
    public static void printTillN(int n) {
        printRecursively(1, n);
    }

    private static void printRecursively(int i, int n) {
        // base condition
        if(i > n) return;
        // operation
        System.out.print(i + " ");
        // recursion
        printRecursively(i+1, n);
    }
}
