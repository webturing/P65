import java.util.Arrays;
import java.util.Scanner;

public class P60Fibonacci {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int[] f = new int[n + 1];
        f[1] = f[2] = 1;
        for (int i = 3; i <= n; i++) f[i] = f[i - 1] + f[i - 2];
        System.out.println(Arrays.toString(f));
    }
}
//60兎子产子
//        从前有一对长寿兎子，它们每一个月生一对兎子，新生的小兎子两个月就长大了，在第二个月的月底开始生它们的下一代小兎子，这样一代一代生下去，求解兎子增长数量的数列。
//
//        *运行结果
//        Please enter required number of generation: 20
//        The repid increase of rabbits in first 20 generation is as felow:
//        1 1 2 3 5 8 13 21 34 55
//        89 144 233 377 610 987 1597 2584 4181 6765
