package lec01;

/**
 * - 在1-100中找到六个数a,b,c,d,e,f满足
 * - a^5+b^5+c^5+d^5+e^5=f^5
 * assume 1<=a<=b<=c<=d<=e<f<=N
 */
public class P02Step1Math {
    public static final int N = 100;

    public static long h(int x) {
        return 1L * x * x * x * x * x;
    }

    public static void main(String[] args) {
        // System.out.println(100^5);//xor
        //System.out.println(100*100*100*100*100);//int overflow
        System.out.println(1L * 100 * 100 * 100 * 100 * 100);
        System.out.println(h(100));
        long start = System.currentTimeMillis();
        solve();
        long end = System.currentTimeMillis();
        System.out.println(String.format("%.3f Second(s)", (end - start) / 1000.0));
    }

    private static void solve() {
        for (int a = 1; a < N; a++)
            for (int b = a; b < N; b++)
                for (int c = b; c < N; c++)
                    for (int d = c; d < N; d++)
                        for (int e = d; e < N; e++)
                            for (int f = e + 1; f <= N; f++) {
                                if (h(a) + h(b) + h(c) + h(d) + h(e) == h(f)) {
                                    System.out.println(
                                            String.format("%d %d %d %d %d %d", a, b, c, d, e, f));
                                }


                            }
    }

}
