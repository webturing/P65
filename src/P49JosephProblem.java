public class P49JosephProblem {
    public static void main(String[] args) {
        int[] a = new int[30];
        int j = 0;
        for (int i = 0; i < 15; i++) {
            int cnt = 0;
            while (cnt < 9) {
                while (a[j % 30] == 1) j++;
                ++cnt;
                j++;
            }
            a[(j + 29) % 30] = 1;
        }
        for (int e : a) System.out.print("+@".charAt(e));
        System.out.println();
    }
}
//49约瑟夫问题
//        这是17世纪的法国数学家加斯帕在《数目的游戏问题》中讲的一个故事：15个教徒和15 个非教徒在深海上遇险，必须将一半的人投入海中，其余的人才能幸免于难，于是想了一个办法：30个人围成一圆圈，从第一个人开始依次报数，每数到第九个人就将他扔入大海，如此循环进行直到仅余15个人为止。问怎样排法，才能使每次投入大海的都是非教徒。
//
//        *运行结果
//        The original circle is(+:pagandom, @:christian):
//        +++@@+@+@@@+@+++@@+@@@+++@+@@+
//        (+"表示被扔下海海的非教徒 @：留在船上活命的教徒)