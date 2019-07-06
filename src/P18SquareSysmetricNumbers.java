public class P18SquareSysmetricNumbers {
    public static void main(String[] args) {
        System.out.println("No. number it's square(palindrome)");
        int no = 0;
        for (int n = 1; n <= 256; n++) {
            int m = n * n;
            if (ok(m)) {
                System.out.println(String.format("%d: %d %d", ++no, n, m));
            }
        }
    }

    private static boolean ok(int m) {
        return Integer.toString(m).equals(new StringBuffer(Integer.toString(m)).reverse().toString());
    }
}

/*
* 18 回文数
打印所有不超过n(取n<256) 的其平方具有对称性质的数(也称回文数)。

*运行结果
No. number it's square(palindrome)
1 1 1
2 2 4
3 3 9
4 11 121
5 22 484
6 26 676
7 101 10201
8 111 12321
9 121 14641
 */
