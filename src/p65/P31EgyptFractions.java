package p65;

import java.util.Scanner;

public class P31EgyptFractions {
    static class Fractor implements Comparable<Fractor> {
        static Fractor ZERO = new Fractor(0, 1);
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

        public Fractor substract(Fractor that) {
            return new Fractor(this.up * that.down - this.down * that.up, this.down * that.down);
        }

        @Override
        public String toString() {
            return up + "/" + down;
        }

        public void egypt() {
            Fractor copy = new Fractor(this.up, this.down);
            System.out.println(copy + "=");
            while (copy.compareTo(ZERO) > 0) {
                int d = (copy.down + (copy.up - 1)) / copy.up;
                Fractor temp = new Fractor(1, d);
                System.out.print(temp + "+");
                copy = copy.substract(temp);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        for (Scanner cin = new Scanner(System.in); cin.hasNext(); ) {
            Fractor f = new Fractor(cin.next());
            f.egypt();

        }
    }
}

/**
 * 31将真分数分解为埃及分数
 * 分子为1 的分数称为埃及分数，现输入一个真分数，请将该分数分解为埃及分数。
 * 如：8/11=1/2+1/5+1/55+1/110。
 * <p>
 * 运行结果
 * 1. Please enter a optional fraction (a/b): 1/6
 * It can be decomposed to: 1/6
 * 2. Please enter a optional fraction (a/b): 20/33
 * It can be decomposed to: 1/2+1/10+1/165
 * 3. Please enter a optional fraction (a/b): 10/89
 * It can be decomposed to: 1/9+1/801
 * 4. Please enter a optional fraction (a/b): 19/99
 * It can be decomposed to: 1/6+1/40+1/3960
 * 5. Please enter a optional fraction (a/b): 8/89
 * It can be decomposed to: 1/11+1/957
 */