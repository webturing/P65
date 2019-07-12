import java.util.Scanner;

public class P59CountGame {
    public static void main(String[] args) {
        int tot = 30;
        int start = 0;
        for (Scanner cin = new Scanner(System.in); ; ) {
            System.out.println("Please count(1~2):?");
            int k = cin.nextInt();
            if (k < 1 || k > 2 || k > tot) continue;
            tot -= k;
            for (int i = 1; i <= start + k; i++) System.out.print(i + " ");
            System.out.println();
            start += k;
            if (tot == 0) {
                System.out.println("User win!");


                break;
            }
            int computer = 3 - k;
            System.out.println("Computer count " + computer + " numbers.");
            tot -= computer;
            for (int i = 1; i <= start + computer; i++) System.out.print(i + " ");
            System.out.println();
            start += computer;
            System.out.println();
            if (tot == 0) {
                System.out.println("Computer win!");
                break;
            }


        }
    }
}
//59抢 30
//        这是中国民间的一个游戏。两人从1开始轮流报数，每人每次可报一个数或两个连续的数，谁先报到30，谁就为胜方。
//
//        *运行结果
//        * * * * * * * *catch thirty* * * * * * *
//        Game Begin
//        Please count:2
//        You count:2
//        Computer count: 3
//        Please count:2
//        You count:5
//        Computer count: 6
//        Please count:1
//        You count:7
//        Computer count: 9
//        Please count:2
//        You count:11
//        Computer count: 12
//        Please count:2
//        You count:14
//        Computer count: 15
//        Please count:2
//        You count:17
//        Computer count: 18
//        Please count:2
//        You count:20
//        Computer count: 21
//        Please count:1
//        You count:22
//        Computer count: 24
//        Please count:2
//        You count:26
//        Computer count: 27
//        Please count:2
//        You count:29
//        Computer count: 30
//        I lose!
//        * * * * * * * *Game Over * * * * * * * *
