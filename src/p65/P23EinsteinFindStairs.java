package p65;

public class P23EinsteinFindStairs {
    //本题范围太小，直接搜索就ok,不然的话要解一元同余方程组  x=a[i] mod p[i] 算法是中国剩余定理
    public static void main(String[] args) {
        for (int n = 1; n <= 2 * 3 * 5 * 7; n++) {
            if (n % 2 != 1) continue;
            if (n % 3 != 2) continue;
            if (n % 5 != 4) continue;
            if (n % 7 != 0) continue;
            System.out.println(" Staris_number=" + n);
        }
    }
}
/**
 * 23爱因斯坦的数学题
 * 爱因斯坦出了一道这样的数学题：有一条长阶梯，若每步跨2阶，则最后剩一阶，若每步跨3 阶，则最后剩2阶，若每步跨5阶，则最后剩4阶，若每步跨6阶则最后剩5阶。只有每次跨7阶，最后才正好一阶不剩。请问这条阶梯共有多少阶？
 * <p>
 * 运行结果
 * Staris_number=119
 */
