package lec01;

/**
 * - 在1-100中找到六个数a,b,c,d,e,f满足
 * - a^5+b^5+c^5+d^5+e^5=f^5
 */
public class P02Step0Brute {
    public static final int N = 100;

    public static long h(int x) {
        return 1L * x * x * x * x * x;
    }

    public static void main(String[] args) {
        // System.out.println(100^5);//xor
        //System.out.println(100*100*100*100*100);//int overflow
        System.out.println(1L * 100 * 100 * 100 * 100 * 100);
        System.out.println(h(100));
        for (int a = 1; a <= N; a++)
            for (int b = 1; b <= N; b++)
                for (int c = 1; c <= N; c++)
                    for (int d = 1; d <= N; d++)
                        for (int e = 1; e <= N; e++)
                            for (int f = 1; f <= N; f++) {
                                if (h(a) + h(b) + h(c) + h(d) + h(e) == h(f)) {
                                    System.out.println(
                                            String.format("%d %d %d %d %d %d", a, b, c, d, e, f));
                                }


                            }
    }

}
