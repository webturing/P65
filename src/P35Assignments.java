public class P35Assignments {
    public static void main(String[] args) {
        for (int a = 0; a <= 1; a++)
            for (int b = 0; b <= 1; b++)
                for (int c = 0; c <= 1; c++)
                    for (int d = 0; d <= 1; d++)
                        for (int e = 0; e <= 1; e++)
                            for (int f = 0; f <= 1; f++) {
                                if (a + b < 1) continue;
                                if (a == 1 && d == 1) continue;
                                if (a + e + f != 2) continue;
                                if (b != c) continue;
                                if (c + d != 1) continue;
                                if (d == 0 && e == 1) continue;
                                System.out.println("------------solutions:-----------");
                                System.out.println("A will" + (a == 1 ? "" : " not") + " be assigned.");
                                System.out.println("B will" + (b == 1 ? "" : " not") + " be assigned.");
                                System.out.println("C will" + (c == 1 ? "" : " not") + " be assigned.");
                                System.out.println("D will" + (d == 1 ? "" : " not") + " be assigned.");
                                System.out.println("E will" + (e == 1 ? "" : " not") + " be assigned.");
                                System.out.println("F will" + (f == 1 ? "" : " not") + " be assigned.");
                            }
    }
}
/**
 * 35委派任务
 * 某侦察队接到一项紧急任务，要求在A、B、C、D、E、F六个队员中尽可能多地挑若干人，但有以下限制条件：
 * 1)A和B两人中至少去一人；
 * 2)A和D不能一起去；
 * 3)A、E和F三人中要派两人去；
 * 4)B和C都去或都不去；
 * 5)C和D两人中去一个；
 * 6)若D不去，则E也不去。
 * 问应当让哪几个人去？
 * <p>
 * 运行结果
 * A will be assigned. (去)
 * B will be assigned. (去)
 * C will be assigned. (去)
 * D will not be assigned. (不去)
 * E will not be assigned. (不去)
 * F will be assigned. (去)
 */