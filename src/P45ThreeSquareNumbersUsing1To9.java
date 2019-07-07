import java.util.Arrays;
import java.util.Vector;

public class P45ThreeSquareNumbersUsing1To9 {
    public static void main(String[] args) {
        Vector<Integer> Q = new Vector<Integer>();
        for (int i = 10; i * i <= 999; i++) {
            char d[] = Integer.toString(i * i).toCharArray();
            Arrays.sort(d);
            if (d[0] == '0' || d[0] == d[1] || d[1] == d[2]) continue;
            Q.add(i * i);
        }
        System.out.println(Q);
        for (int i = 0; i < Q.size(); i++) {
            for (int j = i + 1; j < Q.size(); j++) {
                for (int k = j + 1; k < Q.size(); k++) {
                    char d[] = ("" + Q.get(i) + Q.get(j) + Q.get(k)).toCharArray();
                    Arrays.sort(d);
                    if (new String(d).equals("123456789")) {
                        System.out.println(Q.get(i) + " " + Q.get(j) + " " + Q.get(k));
                    }
                }
            }
        }

    }
}
//45  1~9组成三个3位的平方数
//        将1、2、3、4、5、6、7、8、9九个数字分成三组，每个数字只能用一次，即每组三个数不允许有重复数字，也不许同其它组的三个数字重复，要求每组中的三位数都组成一个平方数。
//
//        *运行结果
//        The 3 squares with 3 different digits each are:
//        361,529,784
