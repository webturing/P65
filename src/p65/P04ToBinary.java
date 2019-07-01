package p65;

import java.util.Scanner;

public class P04ToBinary {
    public static void main(String[] args) {
        for (Scanner cin = new Scanner(System.in); cin.hasNext(); ) {
            Short n = cin.nextShort();//题意是16位
            // System.out.println(Short.toBinaryString(n));
            for (int i = 15; i >= 0; i--) {
                System.out.print((n >> i) & 1);
            }
            System.out.println();
        }
    }
}
/**
 * 4数制转换
 * 将任一整数转换为二进制形式
 * <p>
 * 运行结果
 * 输入：8
 * 输出：
 * number of decimal form:8
 * it's bunary form:0000000000001000
 * 输入：-8
 * 输出：number of decimal form:-8
 * it's binary form:1111111111111000
 * 输入：32767
 * 输出：number of decimal form:32767
 * it's binary form:0111111111111111
 * 输入：-32768
 * 输出：number of decimal form:-32768
 * it's binary form:1000000000000000
 * 输入：128
 * 输出：number of decimal form:128
 * it's binary form:0000000010000000
 */
