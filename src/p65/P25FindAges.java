package p65;

import java.util.Arrays;

public class P25FindAges {
    public static void main(String[] args) {
        int a[] = new int[4];
        int left = 0, right = 100;
        int d = 0;
        while (left <= right) {
            int mid = (left + right) / 2;
            d = (26 - 4 * mid) / 6;
            if (d < 0) {
                right = mid - 1;
                continue;
            }
            if (4 * mid + 6 * d == 26 && mid * (mid + d) * (mid + 2 * d) * (mid + 3 * d) == 880) {
                a[0] = mid;
                a[1] = mid + d;
                a[2] = a[1] + d;
                a[3] = a[2] + d;
                System.out.println(Arrays.toString(a));
                break;
            } else if (4 * mid + 6 * d < 26 || mid * (mid + d) * (mid + 2 * d) * (mid + 3 * d) < 880) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
    }
}
