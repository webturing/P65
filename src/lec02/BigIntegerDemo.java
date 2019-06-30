package lec02;

import java.math.BigInteger;

public class BigIntegerDemo {
    public static void main(String[] args) {
        BigInteger a = new BigInteger("1111111111111111111111111111111");
        BigInteger b = new BigInteger("1111111111111111111111111111111");
        System.out.println(a.add(b));
        System.out.println(a.subtract(b));
        System.out.println(a.multiply(b));
        System.out.println(a.pow(5));
        System.out.println(a.isProbablePrime(10));
    }
}
