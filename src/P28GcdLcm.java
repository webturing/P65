import java.util.Scanner;

public class P28GcdLcm {
    static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    public static void main(String[] args) {

        for (Scanner cin = new Scanner(System.in); cin.hasNext(); ) {
            int a = cin.nextInt();
            int b = cin.nextInt();
            System.out.println(gcd(a, b) + " " + lcm(a, b));
        }
    }
}
/**
 * 28最大公约数和最小公倍数
 * 求任意两个正整数的最大公约数和(GCD)和最小公倍数(LCM)。
 * <p>
 * 运行结果
 * 1.Input a & b: 20 55
 * The GCD of 20 and 55 is: 5
 * The LCM of them is: 220
 * <p>
 * 2.Input a & b: 17 71
 * The GCD of 17 and 71 is: 1
 * The LCM of them is: 1207
 * <p>
 * 3.Input a & b: 24 88
 * The GCD of 24 and 88 is: 8
 * The LCM of them is: 264
 * <p>
 * 4.Input a & b: 35 85
 * The GCD of 35 and 85 is: 5
 * The LCM of them is: 595
 */