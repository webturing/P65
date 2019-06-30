package lec01;

import java.util.Arrays;

//用1~9组成3个三位数a,b,c满足 `a:b:c=1:2:3`
// 指数优化 O(n^3)=>O(n) => O(n/3)
// 代码简洁
public class P01Better {
    static void smart() {
        for (int a = 123; 3 * a <= 987; a++) {
            int b = 2 * a;
            int c = 3 * a;
            String s = "" + a + b + c;
            char cs[] = s.toCharArray();
            Arrays.sort(cs);
            if (new String(cs).equals("123456789")) {
                System.out.println(a + " " + b + " " + c);

            }
        }
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        smart();
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }


}
