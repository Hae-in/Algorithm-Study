import java.math.BigInteger;

import java.util.Scanner;

public class Main {
    static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.close();
        m = Math.min(m, n - m);
        BigInteger numerator = BigInteger.ONE;
        for (int i = 0; i < m; i++) {
            numerator = numerator.multiply(BigInteger.valueOf(n - i));
        }

        BigInteger denominator = factorial(m);

        BigInteger result = numerator.divide(denominator);
        System.out.println(result);
    }
}