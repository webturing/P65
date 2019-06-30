package lec02;

import java.math.BigInteger;

public class FractorialLength {
    static BigInteger factorial(int n) {
        BigInteger s = new BigInteger("1");
        for (int i = 2; i <= n; i++) {
            // s*=i;
            BigInteger b = new BigInteger(Integer.toString(i));
            s = s.multiply(b);

        }
        return s;

    }

    public static void main(String[] args) {
        int x = 123456;
        System.out.println((int) (Math.log10(x)) + 1);
        String s = factorial(100).toString();
        System.out.println(s.length());
    }
}
