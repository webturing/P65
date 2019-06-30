package lec02;

import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class RandomSearcher2 {
    static List<String> searcher(int[] a) {
        String[] ops = "+ - * /".split("\\s+");
        for (int x = 0; x < 4; x++)
            for (int y = 0; y < 4; y++)
                for (int z = 0; z < 4; z++) {
                    Vector<String> v = new Vector<String>();
                    for (int i : a) v.add(Integer.toString(i));
                    v.add(ops[x]);//TODO
                    v.add(ops[y]);//TODO
                    v.add(ops[z]);//TODO
                    int cnt = 0;
                    while (++cnt < 10000) {
                        Collections.shuffle(v);
                        double ev = PostSuffixExpression.eval(v);
                        if (ev == 24.0) {
                            return v;
                        }
                    }
                }
        return new Vector<>();
    }

    public static void main(String[] args) {
        int a[] = new int[]{3, 4, 5, 6};
        System.out.println(searcher(a));

    }
}
