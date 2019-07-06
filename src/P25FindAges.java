public class P25FindAges {
    public static void main(String[] args) {
        int left = 0, right = 100;
        int d = 0;
        while (left <= right) {
            int mid = (left + right) / 2;
            d = (26 - 4 * mid) / 6;
            if (d < 0) {
                right = mid - 1;
                continue;
            }
            if (4 * mid + 6 * d == 26 && mid * (mid + d) * (mid + 2 * d) * (mid + 3 * d) == 880) {
                System.out.println(String.format("%d %d %d %d", mid, mid + d, mid + 2 * d, mid + 3 * d));
                break;
            } else if (4 * mid + 6 * d < 26 || mid * (mid + d) * (mid + 2 * d) * (mid + 3 * d) < 880) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
    }
}
/**
 * 25年龄几何
 * 张三、李四、王五、刘六的年龄成一等差数列，他们四人的年龄相加是26，相乘是880，求以他们的年龄为前4项的等差数列的前20项。
 * <p>
 * 运行结果
 * The series with equal difference are:
 * 2 5 8 11 14 17 20 23 26 29 32 35 38 41 44 47 50 53 56 59
 */