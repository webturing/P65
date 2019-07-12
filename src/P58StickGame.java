import java.util.Scanner;

public class P58StickGame {
    public static void main(String[] args) {
        int tot = 21;
        for (Scanner cin = new Scanner(System.in); ; ) {
            System.out.println("How many stick do you wish to take(1~4)?");
            int k = cin.nextInt();
            if (k < 1 || k > 4 || k > tot) continue;
            tot -= k;
            System.out.println(tot + " stick left in the pile.");
            if (tot == 0) {
                System.out.println("Computer win!");
                break;
            }
            int computer = (tot - 1) % 5;
            System.out.println("Computer takes " + computer + " sticks.");
            tot -= computer;
            System.out.println(tot + " stick left in the pile.");
            if (tot == 0) {
                System.out.println("User win!");
                break;
            }


        }
    }
}
//58常胜将军
//        现有21根火柴，两人轮流取，每人每次可以取走1至4根，不可多取，也不能不取，谁取最后一楰火柴谁输。请编写一个程序进行人机对弈，要求人先取，计算机后取；计算机一方为“常胜将军”。
//
//        *运行结果
//        Game begin:
//        How many stick do you wish to take(1~4)?3
//        18 stick left in the pile.
//        Compute take 2 stick.
//        16 stick left in the pile.
//        How many stick do you wish to take(1~4)?4
//        12 stick left in the pile.
//        Compute take 1 stick.
//        11 stick left in the pile.
//        How many stick do you wish to take(1~4)?2
//        9 stick left in the pile.
//        Compute take 3 stick.
//        6 stick left in the pile.
//        How many stick do you wish to take(1~4)?1
//        5 stick left in the pile.
//        Compute take 4 stick.
//        1 stick left in the pile.
//        How many stick do you wish to take(1~1)?1
//        You have taken the last stick.
//        * * * You lose!
//        Game Over.