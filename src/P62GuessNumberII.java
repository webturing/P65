import java.util.Scanner;

public class P62GuessNumberII {
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
//62人机猜数游戏(2) 请人想一个四位的整数，计算机来猜，人给计算机提示信息，最终看计算机用几次猜出一个人“想”的数。请编程实现。
