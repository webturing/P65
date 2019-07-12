import java.util.Scanner;

public class P61GuessNumberI {
    static class Game {
        static char[] digits = "123456789".toCharArray();
        String data;

        Game() {
            for (int i = 0; i < digits.length; i++) {
                int j = (int) (Math.random() * (digits.length - i) + i);
                char t = digits[i];
                digits[i] = digits[j];
                digits[j] = t;
            }
            data = new String(digits).substring(0, 4);
        }

        @Override
        public String toString() {
            return data;
        }

        public String checkXAXB(String s) {
            int a = 0, b = 0;
            for (char c : data.toCharArray()) {
                if (s.indexOf(c) >= 0) ++a;
                if (s.indexOf(c) == data.indexOf(c)) ++b;
            }

            return String.format("%dA%dB", a, b);
        }

    }

    public static void main(String[] args) {
        Game game = new Game();
        for (Scanner cin = new Scanner(System.in); true; ) {
            String s = cin.next();
            System.out.println(game.checkXAXB(s));
            if (game.checkXAXB(s).equals("4A4B"))
                break;
        }
    }
}
//61人机猜数游戏
//        由计算机“想”一个四位数，请人猜这个四位数是多少。人输入四位数字后，计算机首先判断这四位数字中有几位是猜对了，并且在对的数字中又有几位位置也是对的，将结果显示出来，给人以提示，请人再猜，直到人猜出计算机所想的四位数是多少为止。
//        例如：计算机“想”了一个“1234”请人猜，可能的提示如下：
//        人猜的整数 计算机判断有几个数字正确 有几个位置正确
//        1122 　　　2 　　　　　　　　　　　　1
//        3344 　　　2 　　　　　　　　　　　　1
//        3312 　　　3 　　　　　　　　　　　　0
//        4123 　　　4 　　　　　　　　　　　　0
//        1243 　　　4 　　　　　　　　　　　　2
//        1234 　　　4 　　　　　　　　　　　　4
//        游戏结束
//        请编程实现该游戏。游戏结束时，显示人猜一个数用了几次。
