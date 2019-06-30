package lec02;

import java.util.Arrays;
import java.util.Stack;

public class StackDemo2 {
    public static void main(String[] args) {
        Stack<Integer> S = new Stack<Integer>();
        String[] exp = "1 + 2".split("\\s+");
        System.out.println(Arrays.toString(exp));
        for (String s : exp) {
            if (s.equals("+") || s.equals("*")) {
                int b = S.peek();
                S.pop();
                int a = S.peek();
                S.pop();
                if (s.equals("+")) S.push(a + b);
                else if (s.equals("*")) S.push(a * b);
            } else {
                S.push(Integer.valueOf(s));
            }
        }
        System.out.println(S.peek());
    }
}

