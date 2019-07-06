import java.util.Arrays;

public class P43ThreeNumbersUsing1To9 {
    public static void main(String[] args) {
        for (int x = 123, sol = 0; 3 * x <= 987; ++x) {
            int y = 2 * x, z = 3 * x;
            char[] d = ("" + x + y + z).toCharArray();
            Arrays.sort(d);
            if (new String(d).equals("123456789")) {
                System.out.println(String.format("No.%d:%d %d %d", ++sol, x, y, z));
            }
        }
    }
}
//43  1~9分成1：2：3的三个3位数
//        将1到9 这九个数字分成三个3位数，分求第一个3位数，正好是第二个3位数的二倍，是第三个3位数的三倍。问应当怎样分法。
//
//        *运行结果
//        No.1:192 384 576
//        No.2:219 438 657
//        No.3:273 546 819
//        No.4:327 654 981
