package lec02;

import java.math.BigInteger;

public class App01FirstDigitOfFractorial2 {
    public static void main(String[] args) {
        int n = 1000;
//        int x=235;
//        System.out.println(Math.log10(x));
//        System.out.println(Math.pow(10,.3710678622717363));
//        System.out.println(Math.pow(1.01,365));
//        System.out.println(Math.pow(0.99,365));
        double s = 0;
        for (int i = 2; i <= n; i++) {
            s += Math.log10(i);
        }
        double y = s - (int) s;
        System.out.println((int) (Math.pow(10, y)));
    }
}
