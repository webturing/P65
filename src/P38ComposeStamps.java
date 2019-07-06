public class P38ComposeStamps {
    public static void main(String[] args) {
        int total = 4 * 3 + 3 * 5;
        boolean visited[] = new boolean[total + 1];
        int solutions = 0;
        for (int i = 0; i <= 4; i++)
            for (int j = 0; j <= 3; j++) {
                if (i + j == 0) continue;
                if (!visited[3 * i + 5 * j]) {
                    visited[3 * i + 5 * j] = true;
                    ++solutions;
                }

            }
        System.out.println(solutions + " kinds:");
        for (int i = 0; i <= total; i++)
            if (visited[i]) {
                System.out.print(i + " ");
            }

    }
}
/**
 * 38邮票组合
 * 某人有四张3分的邮票和三张5分的邮票，用这些邮票中的一张或若干张可以得到多少种不同的邮资？
 * <p>
 * 运行结果
 * 19 kinds: 5 10 15 3 8 13 18 6 11 16 21 9 14 19 24 12 17 22 27
 */