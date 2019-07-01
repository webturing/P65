package p65;

public class P03PascalTriangle {
    static int N = 5;
    static int[][] Q = new int[N + 1][N + 1];

    static {
        for (int i = 0; i <= N; i++) Q[i][0] = Q[i][i] = 1;
        for (int i = 1; i <= N; i++)
            for (int j = 1; j < i; j++)
                Q[i][j] = Q[i - 1][j] + Q[i - 1][j - 1];
    }

    public static void main(String[] args) {
        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(Q[i][j] + " ");
            }
            System.out.println();
        }
    }
}
/**
 * 3杨辉三角形
 * 在屏幕上显示杨辉三角形
 * <p>
 * 1
 * 1 1
 * 1 2 1
 * 1 3 3 1
 * 1 4 6 4 1
 * 1 5 10 10 5 1
 * ..................
 */