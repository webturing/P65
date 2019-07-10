import java.util.Arrays;

public class P55CabriqueConstant {
    public static void main(String[] args) {
        int n = 8720;
        int step = 0;
        while (n != 6174) {
            char[] d = Integer.toString(n).toCharArray();
            Arrays.sort(d);
            int min = Integer.parseInt(new String(d));
            int max = Integer.parseInt(new StringBuffer(new String(d)).reverse().toString());
            n = max - min;
            System.out.println(String.format("[%d]:%d-%d=%d", ++step, min, max, n));
        }
    }
}
//55卡布列克常数
//        验证卡布列克运算。任意一个四位数，只要它们各个位上的数字是不全相同的，就有这样的规律：
//        1)将组成该四位数的四个数字由大到小排列，形成由这四个数字构成的最大的四位数；
//        2)将组成该四位数的四个数字由小到大排列，形成由这四个数字构成的最小的四位数(如果四个数中含有0，则得到的数不足四位)；
//        3)求两个数的差，得到一个新的四位数(高位零保留)。
//        重复以上过程，最后得到的结果是6174，这个数被称为卡布列克数。
//
//        *运行结果
//        1) Enter a number:4312
//        [1]:4312-1234=3078
//        [2]:8730-378=8352
//        [3]:8532-2358=6174
//        2) Enter a number:8720
//        [1]:8720-278=8442
//        [2]:8442-2448=5994
//        [3]:9954-4599=5355
//        [4]:5553-3555=1998
//        [5]:9981-1899=8082
//        [6]:8820-288=8523
//        [7]:8532-2358=6174
//        3)Enter a number:9643
//        [1]:9643-3469=6174
