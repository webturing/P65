package p65;

public class P27MarxManuscript {
    public static void main(String[] args) {
        //st m+w+c=30 3m+2w+c=50
        for (int m = 0, sol = 0; m <= 30 && 3 * m <= 50; m++)
            for (int w = 0; w <= 30 - m && 2 * w <= 50 - 3 * m; w++) {
                int c = 30 - m - w;
                if (3 * m + 2 * w + c == 50) {
                    System.out.println(String.format("%d:%d %d %d", ++sol, m, w, c));
                }
            }
    }
}
/**
 * 27马克思手稿中的数学题
 * 马克思手稿中有一道趣味数学问题：有30个人，其中有男人、女人和小孩，在一家饭馆吃饭花了50先令；每个男人花3先令，每个女人花2先令，每个小孩花1先令；问男人、女人和小孩各有几人？
 * <p>
 * 运行结果
 * M  W  C
 * 1: 0 20 10
 * 2: 1 18 11
 * 3: 2 16 12
 * 4: 3 14 13
 * 5: 4 12 14
 * 6: 5 10 15
 * 7: 6 8 16
 * 8: 7 6 17
 * 9: 8 4 18
 * 10: 9 2 19
 * 11: 10 0 20
 */