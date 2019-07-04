package p65;

import java.util.Scanner;

public class P29FractorComparison {
    static class Fractor implements Comparable<Fractor> {
        int up, down;

        public Fractor(int up, int down) {
            this.up = up;
            this.down = down;
            rationalize();
        }

        private void rationalize() {
            int g = P28GcdLcm.gcd(up, down);
            this.up /= g;
            this.down /= g;
        }

        @Override
        public int compareTo(Fractor that) {
            return this.up * that.down - this.down * that.up;
        }

        public Fractor(String s) {
            this(Integer.valueOf(s.split("/")[0]), Integer.valueOf(s.split("/")[1]));
        }

        @Override
        public String toString() {
            return up + "/" + down;
        }
    }

    public static void main(String[] args) {
        for (Scanner cin = new Scanner(System.in); cin.hasNext(); ) {
            Fractor a = new Fractor(cin.next());
            Fractor b = new Fractor(cin.next());
            int d = a.compareTo(b);
            if (d > 0) {
                System.out.println(a + ">" + b);
            } else if (d < 0) {
                System.out.println(a + "<" + b);
            } else {
                System.out.println(a + "=" + b);
            }
        }
    }
}
/**
 * 29分数比较
 * 比较两个分数的大小。
 * <p>
 * 运行结果
 * 输入： 4/5，6/7 输出： 4/5<6/7
 * 输入： 8/4，16/32 输出： 8/4>16/32
 * 输入：16/32，4/8 输出： 16/32=4/8
 */