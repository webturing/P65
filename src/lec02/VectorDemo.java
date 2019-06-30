package lec02;

import java.util.Collections;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> balls = new Vector<>();
        for (int i = 1; i <= 41; i++) {
            balls.add(i);

        }
        System.out.println(balls);
        Collections.shuffle(balls);
        System.out.println(balls.subList(0, 3));
    }
}
