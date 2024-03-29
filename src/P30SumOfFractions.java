public class P30SumOfFractions {
    public static void main(String[] args) {
        int sol = 0;
        for (int p = 2; p <= 4; p++)
            for (int q = p; q <= 3 * p; q++)
                for (int r = q; r <= 2 * p * q; r++)
                    for (int s = r; s <= p * q * r; s++) {
                        if (p * q * r * s == p * q * r + p * q * s + p * r * s + q * r * s)
                            System.out.println(String.format("[%d:]1/%d+1/%d+1/%d+1/%d=1", ++sol, p, q, r, s));
                        ;
                    }
    }
}
/*
30分数之和
求这样的四个自然数p,q,r,s(p<=q<=r<=s)，使得以下等式成立：
1/p+1/q+1/r+1/s=1。

*运行结果
The 4 fractions which sum is equal 1 are:
[ 1] 1/2+1/3+1/7+1/42=1
[ 2] 1/2+1/3+1/8+1/24=1
[ 3] 1/2+1/3+1/9+1/18=1
[ 4] 1/2+1/3+1/10+1/15=1
[ 5] 1/2+1/3+1/12+1/12=1
[ 6] 1/2+1/4+1/5+1/20=1
[ 7] 1/2+1/4+1/6+1/12=1
[ 8] 1/2+1/4+1/8+1/8=1
[ 9] 1/2+1/5+1/5+1/10=1
[10] 1/2+1/6+1/6+1/6=1
[11] 1/3+1/3+1/4+1/12=1
[12] 1/3+1/3+1/6+1/6=1
[13] 1/3+1/4+1/4+1/6=1
[14] 1/4+1/4+1/4+1/4=1
 */