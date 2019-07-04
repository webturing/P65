package p65;

public class P34BrideAndGroom {
    final static int A = 1, B = 2, C = 3;
    final static char[] H = "#ABC".toCharArray();

    public static void main(String[] args) {
        for (int X = 1; X <= 3; X++)
            for (int Y = 1; Y <= 3; Y++) {
                if (X == Y) continue;
                int Z = 6 - X - Y;
                if (Z == X || Z == Y) continue;
                if (A == X) continue;
                if (C == X) continue;
                if (C == Z) continue;
                System.out.println("X will marry to " + H[X]);
                System.out.println("Y will marry to " + H[Y]);
                System.out.println("Z will marry to " + H[Z]);

            }
    }
}

/*
* 34新娘和新郞
三对情侣参加婚礼，三个新郞为A、B、C，三个新娘为X、Y、Z。有人不知道谁和谁结婚，
于是询问了六位新人中的三位，但听到的回答是这样的：A说他将和X结婚；X说她的未婚夫是C；
C说他将和Z结婚。这人听后知道他们在开玩笑，全是假话。请编程找出谁将和谁结婚。

*运行结果
X will marry to B. (X与B结婚)
Y will marry to C. (Y与C结婚)
Z will marry to A. (Z与A结婚)
*/