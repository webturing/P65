package p65;

public class P26ThreeColorBalls {
    public static void main(String[] args) {
        //st  r<=3 w<=3 b<=6 r+w+b<=8
        for (int r = 0, sol = 0; r <= 3; r++)
            for (int w = 0; w <= 3; w++) {
                int b = 8 - r - w;
                if (b <= 6) {
                    System.out.println(String.format("%d:%d %d %d", ++sol, r, w, b));
                }
            }
    }
}
/**
 * 26三色球问题
 * 若一个口袋中放有12个球，其中有3个红的。3个白的和6个黒的，问从中任取8个共有多少种不同的颜色搭配？
 * <p>
 * 运行结果
 * 　　R W B
 * 1: 0 2 6
 * 2: 0 3 5
 * 3: 1 1 6
 * 4: 1 2 5
 * 5: 1 3 4
 * 6: 2 0 6
 * 7: 2 1 5
 * 8: 2 2 4
 * 9: 2 3 3
 * 10: 3 0 5
 * 11: 3 1 4
 * 12: 3 2 3
 * 13: 3 3 2
 */