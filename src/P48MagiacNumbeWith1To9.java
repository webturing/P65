public class P48MagiacNumbeWith1To9 {

    public static void main(String[] args) {
        dfs(1);
    }

    static void dfs(int k) {
        if (k > 9) {
            boolean flag = true;
            long t = 0;

            for (int i = 1; i <= 9; i++) {
                t = t * 10 + a[i];
                if (t % i != 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("The progressire divisible number is: " + t);
            }
            return;
        }
        for (int i = 1; i <= 9; i++) {
            if (!v[i]) {
                v[i] = true;
                a[k] = i;
                dfs(k + 1);
                v[i] = false;
            }
        }
    }

    static int[] a = new int[10];
    static boolean[] v = new boolean[10];
}
//48  九位累进可除数
//        求九位累进可除数。所谓九位累进可除数就是这样一个数：这个数用到1到9这九个数字组成，每个数字刚好只出现一次。这九个位数的前两位能被2整除，前三位能被3整除......前N位能被N整除，整个九位数能被9整除。
//
//        *运行结果
//        The progressire divisible number is: 381654729