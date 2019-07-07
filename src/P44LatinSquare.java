public class P44LatinSquare {
    public static void main(String[] args) {
        int n = 9;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print((i + j) % n + 1);
            }
            System.out.println();
        }
    }
}
//44 拉丁方
//        构造 NXN 阶的拉丁方阵(2<=N<=9)，使方阵中的每一行和每一列中数字1到N只出现一次。如N=4时：
//        1 2 3 4
//        2 3 4 1
//        3 4 1 2
//        4 1 2 3