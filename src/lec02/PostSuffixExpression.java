package lec02;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class PostSuffixExpression {
    public static void main(String[] args) {
        String exp[] = "5 1 5 / - 5 *".split("\\s+");
        System.out.println(Arrays.asList(exp));
        System.out.println(eval(exp));
        System.out.println(isNumber("1"));
        System.out.println(isNumber("1.23"));
        System.out.println(isNumber("+111.45"));
        System.out.println(isNumber("1.2.3"));
        System.out.println(isNumber("+1--11.45"));


    }

    static boolean isNumber(String s) {
        try {
            double x = Double.parseDouble(s);
            return true;
        } catch (Exception e) {
            return false;

        }
    }

    /**
     * 后缀式求值模块，如果exp合法则计算它的值
     * 否则返回-1表示是非法后缀式
     *
     * @param exp
     * @return
     */
    public static double eval(List<String> exp) {
        Stack<Double> S = new Stack<>();
        for (String s : exp) {
            if (isNumber(s)) {
                S.push(Double.parseDouble(s));
            } else {
                try {
                    double b = S.peek();
                    S.pop();
                    double a = S.peek();
                    S.pop();
                    if (s.equals("+")) {
                        S.push(a + b);
                    } else if (s.equals("-")) {
                        S.push(a - b);
                    } else if (s.equals("*")) {
                        S.push(a * b);
                    } else if (s.equals("/")) {
                        S.push(a / b);
                    }
                } catch (Exception e) {
                    return -1;
                }
            }

        }
        return S.size() == 1 ? S.peek() : -1;
    }

    public static double eval(String[] exp) {
        return eval(Arrays.asList(exp));//delegation 委托
    }
}

