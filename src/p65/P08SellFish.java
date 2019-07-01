package p65;

import java.util.Arrays;

public class P08SellFish {
    static double[] a = new double[7];

    static {
        a[6] = 0;
        a[5] = 11;
        for (int i = 4; i > 0; i--)
            a[i] = (a[i + 1] * (i + 1) + 1) / i;
    }

    public static void main(String[] args) {
        System.err.println(Arrays.toString(a));
        System.out.println(String.format("There are %.0f fishes at first.",a[1]));
    }
}
/**
 * 8出售金鱼
 * 买卖提将养的一缸金鱼分五次出售系统上一次卖出全部的一半加二分之一条；第二次卖出余下的三分之一加三分之一条；第三次卖出余下的四分之一加四分之一条；第四次卖出余下的五分之一加五分之一条；最后卖出余下的11条。问原来的鱼缸中共有几条金鱼？
 * 思考题
 * 日本著名数学游戏专家中村义作教授提出这样一个问题：父亲将2520个桔子分给六个儿子。分完后父亲说：“老大将分给你的桔子的1/8给老二；老二拿到后连同原先的桔子分1/7给老三；老三拿到后连同原先的桔子分1/6给老四；老四拿到后连同原先的桔子分1/5给老五；老五拿到后连同原先的桔子分1/4给老六；老六拿到后连同原先的桔子分1/3给老大”。结果大家手中的桔子正好一样多。问六兄弟原来手中各有多少桔子？
 * <p>
 * 运行结果
 * There are 59 fishes at first.
 */
