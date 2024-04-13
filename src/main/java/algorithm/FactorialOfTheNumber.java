package algorithm;

public class FactorialOfTheNumber {
    public static int findFactorialByLoop(int n) {
        int res = 1;
        for (int i = 2; i <= n; i++) {
            res *= i;
        }
        return res;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println("factorial of n is: " + findFactorialByLoop(3));
    }
}