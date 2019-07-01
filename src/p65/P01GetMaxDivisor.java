package p65;

import java.util.Scanner;

public class P01GetMaxDivisor {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        boolean find = false;
        for (int c = 999; c >= 100; c--) {
            if (n % c == 0) {
                find = true;
                System.out.println(String.format("The max factor with 3 digits in %d is:%d", n, c));
                break;
            }
        }
        if (!find)
            System.out.println("NOT FOUND!");
    }
}
/**
 * 1求最大数
 * 问555555的约数中最大的三位数是多少？
 * <p>
 * 运行结果
 * 输入：555555
 * 输出：The max factor with 3 digits in 555555 is:777
 */