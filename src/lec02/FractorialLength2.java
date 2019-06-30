package lec02;

public class FractorialLength2 {
    public static void main(String[] args) {
        double s = 0;
        for (int i = 2; i <= 100; i++) {
            s += Math.log10(i);
        }
        System.out.println((int) (s + 1));
    }
}
