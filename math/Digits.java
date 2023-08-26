package math;

public class Digits {
    public int sumDigits(int n) {
        int sum = 0;
        int d;
        while(n!=0) {
            d = n%10;
            sum += d; // sum = sum + d;
            n /= 10;  // n = n / 10;
        }
        return sum;
    }

    public int reverse(int n) {
        int rev = 0;
        int d;
        while(n!=0) {
            d = n%10;
            rev = rev * 10 + d;
            n /= 10;  // n = n / 10;
        }
        return rev;
    }

    public boolean isPalindrome(int n) {
        int original = n;
        int rev = 0;
        int d;
        while(n!=0) {
            d = n%10;
            rev = rev * 10 + d;
            n /= 10;  // n = n / 10;
        }
        return rev == original;
    }
}
