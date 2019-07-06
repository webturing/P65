public class P12AnExtraordinaryThreeDigitsNumber {
    public static void main(String[] args) {
        for (int i = 100; i <= 7 * 7 * 7 - 1; i++) {
            char[] s7 = Integer.toString(i, 7).toCharArray();
            char[] s9 = Integer.toString(i, 9).toCharArray();
            if (s7[0] == s9[2] && s7[2] == s9[0]) {
                System.out.println(String.format("%s(7)=%s(9)=%d(10)", new String(s7), new String(s9), i));
            }

        }
    }
}
/**
 * 12 一个奇异的三位数
 * 一个自然数的七进制表达式是一个三位数，而这个自然数的九进制表示也是一个三位数，且这两个三位数的数码正好相反，求这个三位数。
 * <p>
 * 运行结果
 * The special number with 3 digits is:503(7)=305(9)=248(10)
 */