import java.util.Scanner;

public class P56FourSquares {
    public static void main(String[] args) {
        int id = 0;
        for (Scanner cin = new Scanner(System.in); cin.hasNext(); ) {
            System.out.println(++id + ")Please enter a number =");
            int n = cin.nextInt();
            solve(n);
        }
    }

    private static void solve(int n) {
        for (int a = (int) Math.sqrt(n); a >= 1; a--)
            for (int b = a; b >= 0; b--)
                for (int c = b; c >= 0; c--)
                    for (int d = c; d >= 0; d--) {
                        if (n == a * a + b * b + c * c + d * d) {
                            System.out.println(String.format("%d=%d^2+%d^2+%d^2+%d^2", n, a, b, c, d));
                            return;
                        }
                    }
    }
}
//56四方定理
//        数论中著名的“四方定理”讲的是：所有自然数至多只要用四个数的平方和就可以表示。
//        请编程证此定理。
//
//        *运行结果
//        1) Please enter a number = 110
//        110=7*7+6*6+4*4+3*3
//        2) Please enter a number = 211
//        211=8*8+7*7+7*7+7*7
//        3) Please enter a number = 99
//        99=7*7+5*5+4*4+3*3
