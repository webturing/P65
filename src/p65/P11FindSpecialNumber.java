package p65;

public class P11FindSpecialNumber {
    public static void main(String[] args) {
        for (int i = 0; ; i++) {
            if (i % 8 != 1) continue;            //一个自然数被8除余1，
            if (i / 8 % 8 != 1) continue;// 所得的商被8除也余1，
            if (i / 8 / 8 % 8 != 7) continue;// 再将第二次的商被8除后余7，最后得到一个商为a。
            int a = i / 8 / 8 / 8;
            if (i % 17 != 4) continue;   // 又知这个自然数被17除余4，
            if (i / 17 % 17 != 15) continue;// 所得的商被17除余15，
            int b = i / 17 / 17;
            if (b != 2 * a) continue;// 最后得到一个商是a的2倍。
            System.out.println("The required number is:"+i);
            break;
        }
    }
}
/**
 * 11 8除不尽的数
 * 一个自然数被8除余1，所得的商被8除也余1，再将第二次的商被8除后余7，最后得到一个商为a。又知这个自然数被17除余4，所得的商被17除余15，最后得到一个商是a的2倍。求这个自然数。
 * <p>
 * 运行结果
 * The required number is:1993
 */