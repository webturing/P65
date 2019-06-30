package lec01;

import javax.sound.midi.SysexMessage;
import java.util.Arrays;

//用1~9组成3个三位数a,b,c满足 `a:b:c=1:2:3`
// 指数优化 O(n^3)=>O(n) => O(n/3)
public class P01Smart {
    static void smart() {
        for (int a = 123; 3 * a <= 987; a++) {
            int b = 2 * a;
            int c = 3 * a;
            int A[] = new int[9];
            A[0] = a / 100;
            A[1] = a % 100 / 10;
            A[2] = a % 10;
            A[3] = b / 100;
            A[4] = b % 100 / 10;
            A[5] = b % 10;
            A[6] = c / 100;
            A[7] = c % 100 / 10;
            A[8] = c % 10;
            Arrays.sort(A);
            if (ok(A)) {
                System.out.println(a + " " + b + " " + c);

            }
        }
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        smart();
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    private static boolean ok(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] != i + 1)
                return false;
        }
        return true;
    }
}
