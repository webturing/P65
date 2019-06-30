package lec01;

import java.util.Arrays;

public class BinarySearcherDemo {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 6, 7, 9, 10, 111};
        int k = 17;
        System.out.println(Arrays.binarySearch(a, k));
    }
}
