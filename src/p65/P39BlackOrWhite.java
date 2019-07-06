package p65;

public class P39BlackOrWhite {
    public static void main(String[] args) {
        for (int a = 0; a <= 1; a++)
            for (int b = 0; b <= 1; b++)
                for (int c = 0; c <= 1; c++)
                    for (int d = 0; d <= 1; d++)
                        for (int e = 0; e <= 1; e++) {
                            int pa = b + c + d + e == 3 ? 1 : 0;
                            int pb = a + c + d + e == 0 ? 1 : 0;
                            int pc = b + a + d + e == 1 ? 1 : 0;
                            int pd = a + b + c + e == 4 ? 1 : 0;
                            if (a == pa && b == pb && c == pc && d == pd) {
                                System.out.println(String.format("A is pasted a paper of %s paper on his forehead.", a == 0 ? "black" : "white"));
                                System.out.println(String.format("B is pasted a paper of %s paper on his forehead.", b == 0 ? "black" : "white"));
                                System.out.println(String.format("C is pasted a paper of %s paper on his forehead.", c == 0 ? "black" : "white"));
                                System.out.println(String.format("D is pasted a paper of %s paper on his forehead.", d == 0 ? "black" : "white"));
                                System.out.println(String.format("E is pasted a paper of %s paper on his forehead.", e == 0 ? "black" : "white"));
                            }
                        }
    }
}
//39黑与白
//        有A、B、C、D、E五人，每人额头上都帖了一张黑或白的纸。五人对坐，每人都可以看到其它人额头上的纸的颜色。五人相互观察后，
//        A说：“我看见有三人额头上帖的是白纸，一人额头上帖的是黑纸。”
//        B说：“我看见其它四人额头上帖的都是黑纸。”
//        C说：“我看见一人额头上帖的是白纸，其它三人额头上帖的是黑纸。”
//        D说：“我看见四人额头上帖的都是白纸。”
//        E什么也没说。
//        现在已知额头上帖黑纸的人说的都是谎话，额头帖白纸的人说的都是实话。问这五人谁的额头是帖白纸，谁的额头是帖黑纸？
//
//        *运行结果
//        A is pasted a paper of black paper on his forehead. (黑)
//        B is pasted a paper of black paper on his forehead. (黑)
//        C is pasted a paper of white paper on his forehead. (白)
//        D is pasted a paper of black paper on his forehead. (黑)
//        E is pasted a paper of white paper on his forehead. (白)