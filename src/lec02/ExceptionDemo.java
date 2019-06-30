package lec02;

import java.util.Arrays;

public class ExceptionDemo {
    public static void main(String[] args) {
        int a[] = new int[]{1, 2, 3};
        try {
            a[3]++;
        } catch (ArrayIndexOutOfBoundsException e) {
            int b[] = new int[a.length * 2];
            for (int i = 0; i < a.length; i++)
                b[i] = a[i];
            a = b;
            a[3]++;
        }
        System.out.println(Arrays.toString(a));
    }
}
