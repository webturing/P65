package p65;

public class P17IntimateNumberPairs {
    static int sumFactors(int n) {
        int s = 1;
        for (int p = 2; p * p <= n; p++) {
            if (n % p == 0) {
                s += p;
                if (p * p != n) s += n / p;
            }
        }
        return s;
    }

    public static void main(String[] args) {
        int R = 3000;
        System.out.println("There are following friendly--numbers pair smaller than "+R+":");
        for (int a = 1; a <= R; a++) {
            int b = sumFactors(a);
            if (sumFactors(b) == a && b>a) {
                System.out.print(a + "..." + b+" ");
            }
        }
    }
}
/**
 * 17 亲密数
 * 如果整数A的全部因子(包括1，不包括A本身)之和等于B；且整数B的全部因子(包括1，不包括B本身)之和等于A，则将整数A和B称为亲密数。求3000以内的全部亲密数。
 * <p>
 * 运行结果
 * There are following friendly--numbers pair smaller than 3000:
 * 220.. 284 1184.. 1210 2620.. 2924
 */
