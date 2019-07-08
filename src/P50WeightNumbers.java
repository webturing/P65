public class P50WeightNumbers {
    public static void main(String[] args) {
        //st. 1<=a<=b<=c<=d<23 and a+b+c+d+e=23
        int n = 23;
        for (int a = 1, sol = 0; 5 * a <= n; a++)
            for (int b = a + 1; b * 4 <= n - a; b++)
                for (int c = b + 1; 3 * c <= n - a - b; c++)
                    for (int d = c + 1; 2 * d <= n - a - b - c; d++) {
                        int e = n - a - b - c - d;
                        if (e <= d) continue;
                        if (check(new int[]{a, b, c, d, e}, n)) {
                            System.out.println(String.format("[%d]: %d %d %d %d %d", ++sol, a, b, c, d, e));
                        }
                    }
    }

    private static boolean check(int[] a, int n) {
        boolean[] v = new boolean[n + 1];
        for (int i = 0; i < (1 << a.length); i++) {
            int[] b = new int[a.length];
            for (int j = i, k = a.length - 1; j > 0; ) {
                b[k--] = j % 2;
                j /= 2;
            }
            //System.out.println(Arrays.toString(b));
            int s = 0;
            for (int k = 0; k < a.length; k++)
                s += a[k] * b[k];
            v[s] = true;
        }
        //System.out.println(Arrays.toString(a));
        //System.out.println(Arrays.toString(v));
        for (boolean b : v) if (!b) return false;
        return true;
    }
}
//50 和数能表示1~23的5个正整数
//        已知五个互不相同的正整数之和为23，且从这五个数中挑选若干个加起来可以表示从1到23之内的全部自然数。问这五个数是什么？
//
//        *运行结果
//        There are following possible result:
//        [1]: 1 2 3 5 12
//        [2]: 1 2 3 6 11
//        [3]: 1 2 3 7 10
//        [4]: 1 2 4 5 11
//        [5]: 1 2 4 6 10
//        [6]: 1 2 4 7 9
