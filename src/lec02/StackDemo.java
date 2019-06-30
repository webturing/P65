package lec02;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> S = new Stack<Integer>();
        for (int i = 0; i < 10; i++) S.push(i);
        while (!S.empty()) {
            System.out.println(S.peek());
            S.pop();
        }
    }
}

