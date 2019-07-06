public class P09DivideFish {
    final static int FULL = 2;
    final static int HALF = 1;
    final static int EMPTY = 0;


    public static void main(String[] args) {
        int solutions = 0;
        for (int fa = 0; fa <= 7; fa++)
            for (int fb = fa; fb <= 7 - fa; fb++) {
                int fc = 7 - fa - fb;
                if (fc < fb) continue;
                for (int ha = 0; ha <= 7; ha++)
                    for (int hb = 0; hb <= 7 - ha; hb++) {
                        int hc = 7 - ha - hb;
                        int ea = 7 - ha - fa;
                        int eb = 7 - hb - fb;
                        int ec = 7 - eb - ea;
                        if (fa * FULL + ha * HALF + ea * EMPTY == 7 && fb * FULL + hb * HALF + eb * EMPTY == 7 && fc * FULL + hc * HALF + ec * EMPTY == 7) {
                            System.out.println(String.format("No.%d:\tFull\tSemi\tEmpty", ++solutions));
                            System.out.println(String.format("A:\t\t%d\t\t%d\t\t%d", fa, ha, ea));
                            System.out.println(String.format("B:\t\t%d\t\t%d\t\t%d", fb, hb, ea));
                            System.out.println(String.format("C:\t\t%d\t\t%d\t\t%d", fc, hc, ea));
                        }
                    }
            }
    }
}
/**
 * 9平分七筐鱼
 * 甲、乙、丙三位鱼夫出海打鱼，他们随船带了21只箩筐。当晚返航时，他们发现有七筐装满了鱼，还有七筐装了半筐鱼，另外七筐则是空的，由于他们没有秤，只好通过目测认为七个满筐鱼的重量是相等的，7个半筐鱼的重量是相等的。在不将鱼倒出来的前提下，怎样将鱼和筐平分为三份？
 * 思考题
 * 晏会上数学家出了一道难题：假定桌子上有三瓶啤酒，癣瓶子中的酒分给几个人喝，但喝各瓶酒的人数是不一样的。不过其中有一个人喝了每一瓶中的酒，且加起来刚好是一瓶，请问喝这三瓶酒的各有多少人？
 * (答案：喝三瓶酒的人数分别是2人、3人和6人)
 * <p>
 * 运行结果
 * It exists possible distribution plans:
 * No.1 Full basket Semi--basket Empty
 * fisher A: 1 5 1
 * fisher B: 3 1 3
 * fisher C: 3 1 3
 * No.2 Full basket Semi--basket Empty
 * fisher A: 2 3 2
 * fisher B: 2 3 2
 * fisher C: 3 1 3
 */