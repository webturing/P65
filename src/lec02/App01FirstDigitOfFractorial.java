package lec02;

import java.math.BigInteger;

public class App01FirstDigitOfFractorial {
    public static void main(String[] args) {
        int n = 1000;
        BigInteger s = new BigInteger("1");
        for (int i = 2; i <= n; i++) {
            s = s.multiply(new BigInteger(Integer.toString(i)));
        }
        System.out.println(s);
    }
}
