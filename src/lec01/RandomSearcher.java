package lec01;

import java.util.Collections;
import java.util.Vector;

public class RandomSearcher {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>();
        for (int i = 1; i <= 9; i++) {
            v.add(i);
        }
        System.out.println(v);
        while (true) {
            Collections.shuffle(v);
            int a = v.get(0) * 100 + v.get(1) * 10 + v.get(2);
            int b = v.get(3) * 100 + v.get(4) * 10 + v.get(5);
            int c = v.get(6) * 100 + v.get(7) * 10 + v.get(8);
            if (a * 2 == b && a * 3 == c) {
                System.out.println(v);
                break;
            }
        }
    }
}
