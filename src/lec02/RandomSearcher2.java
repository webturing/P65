package lec02;

import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class RandomSearcher2 {
    static List<String> searcher(int[] a) {
        Vector<String> v = new Vector<String>();
        for (int i : a) v.add(Integer.toString(i));
        System.out.println(v);
        v.add("-");//TODO
        v.add("*");//TODO
        v.add("/");//TODO
        int cnt = 0;
        while (++cnt < 1000000) {
            Collections.shuffle(v);
            double ev = PostSuffixExpression.eval(v);
            if (ev == 24.0) {
                return v;

            }


        }
        return new Vector<>();
    }

    public static void main(String[] args) {
        int a[] = new int[]{1, 1, 1, 5};
        System.out.println(searcher(a));

    }
}
