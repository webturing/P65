public class P13FourDigitsReverseNumber {
    public static void main(String[] args) {
        for (int n = 1000; 9 * n <= 9999; n++) {
            int m = 9 * n;
            if (Integer.toString(n).equals(new StringBuffer(Integer.toString(m)).reverse().toString())) {
                System.out.println("The number satisfied states condition is:" + n);
                System.out.println(n + " * 9 = " + m);
            }
        }
    }
}
/**
 * 13  4位反序数
 * 设N是一个四位数，它的9倍恰好是其反序数，求N。反序数就是将整数的数字倒过来形成的整数。例如：1234的反序数是4321。
 * <p>
 * 运行结果
 * The number satisfied states condition is:1089
 */