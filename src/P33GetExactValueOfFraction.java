import java.math.BigDecimal;
import java.util.Scanner;

public class P33GetExactValueOfFraction {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int m = cin.nextInt();
        int n = cin.nextInt();
        int g = P28GcdLcm.gcd(m, n);
        m /= g;
        n /= g;
        int k = n;
        while (k % 2 == 0) k /= 2;
        while (k % 5 == 0) k /= 5;
        if (k == 1)
            System.out.println(new BigDecimal(m + "").divide(new BigDecimal("" + n)));
        else {
            int a = 9;
            int p = 1;
            while (a % k != 0) {
                ++p;
                a = (a * 10 % k) + 9;
            }
            System.out.println("cycle lenth:" + p);

            System.out.println(new BigDecimal(m + "").divide(new BigDecimal("" + n), 3 * p, BigDecimal.ROUND_FLOOR));
        }
    }
}

/*

33计算分数的精确值
使用数组精确计算M/N(0<M<N<=100)的值。如果M/N是无限循环小数，则计算并输出它的第一循环节，同时要求输出 循环节的起止位置(小数位的序号)。

*运行结果
Please input a fraction(m/n)(<0<m<n<=100):1/3
1/3 it's accuracy value is:0.3
and it is a infinite cyclic fraction from 1
digit to 1 digit after decimal point.

 */