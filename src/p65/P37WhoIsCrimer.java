package p65;

public class P37WhoIsCrimer {
    public static void main(String[] args) {
        for (int a = 0; a <= 1; ++a)
            for (int b = 0; b <= 1; ++b)
                for (int c = 0; c <= 1; ++c)
                    for (int d = 0; d <= 1; d++) {
                        if (b + d == 1 && b + c == 1 && a + b == 1 && a + b + c + d == 1) {
                            if (a == 1) System.out.println("The thief is A");
                            if (b == 1) System.out.println("The thief is B");
                            if (c == 1) System.out.println("The thief is C");
                            if (d == 1) System.out.println("The thief is D");

                        }

                    }
    }
}
/**
 * 37谁是窃贼
 * 公安人员审问四名窃贼嫌疑犯。已知，这四人当中仅有一名是窃贼，还知道这四人中每人要么是诚实的，要么总是说谎的。在回答公安人员的问题中：
 * 甲说：“乙没有偷，是丁偷的。”
 * 乙说：“我没有偷，是丙便的。”
 * 丙说：“甲没有偷，是乙偷的。”
 * 丁说：“我没有偷。”
 * 请根据这四人的答话判断谁是盗窃者。
 * <p>
 * 运行结果
 * The thief is B. (乙为窃贱。)
 */