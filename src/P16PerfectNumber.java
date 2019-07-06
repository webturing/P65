public class P16PerfectNumber {
    public static void main(String[] args) {
        int[] primes = new int[]{2, 3, 5, 7, 11}; //根据欧拉定理 偶完全数 m=2^(p-1)(2^p-1)
        for (int p : primes)
            System.out.println((1L << (p - 1)) * ((1L << p) - 1));
    }
}

/**
 * 16完全数
 * 如果一个数恰好等于它的因子之和，则称该数为“完全数”。
 * <p>
 * 运行结果
 * TThere are following perfect numbers smaller than 1000:
 * 6 28 496
 */