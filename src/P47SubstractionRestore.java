public class P47SubstractionRestore {
    public static void main(String[] args) {
        for (int p = 1; p <= 9; p++)
            for (int e = 0; e <= 9; e++)
                for (int a = 0; a <= 9; a++)
                    for (int r = 0; r <= 9; r++) {
                        if (p == e || p == a || p == r || e == a || e == r || a == r) continue;
                        int X = 1000 * p + 100 * e + 10 * a + r;
                        int Y = 100 * a + 10 * r + a;
                        int Z = 100 * p + 10 * e + a;
                        if (X - Y == Z) {
                            System.out.println(String.format("%4d", X));
                            System.out.println(String.format("-%3d", Y));
                            System.out.println("------");
                            System.out.println(String.format("%4d", Z));

                        }
                    }
    }
}
//47减式还原
//        编写程序求解下式中各字母所代表的数字，不同的字母代表不同的数字。
//        PEAR
//        - ARA
//        --------
//        　　PEA
//        　　
//        *运行结果
//        PEAR 1098
//        ARA – 989
//        ----------
//        PEA 109
