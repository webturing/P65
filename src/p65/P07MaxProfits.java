package p65;

import java.util.HashMap;
import java.util.Map;

public class P07MaxProfits {
    static double getYearRateFromMonthRate(int y, double m) {
        return y * m / 100 * 12 + 1;
    }

    static Map<Integer, Double> R = new HashMap<>();

    static {
        R.put(1, getYearRateFromMonthRate(1, 0.63));
        R.put(2, getYearRateFromMonthRate(2, 0.66));
        R.put(3, getYearRateFromMonthRate(3, 0.69));
        R.put(5, getYearRateFromMonthRate(5, 0.75));
        R.put(8, getYearRateFromMonthRate(8, 0.84));
    }

    public static void main(String[] args) {
        System.out.println(R);
        double A = 2000.0;
        int Y = 20;
        //a*1+2*b+3*c+5*d+e*8<=Y;
        double max = A;
        int aa = 0, bb = 0, cc = 0, dd = 0, ee = 0;
        for (int a = 0; a <= Y; a++)
            for (int b = 0; a + 2 * b <= Y; b++)
                for (int c = 0; a + 2 * b + 3 * c <= Y; c++)
                    for (int d = 0; a + 2 * b + 3 * c + 5 * d <= Y; d++)
                        for (int e = 0; a * 1 + 2 * b + 3 * c + 5 * d + e * 8 <= Y; e++) {
                            double temp = A * Math.pow(R.get(1), a) * Math.pow(R.get(2), b) * Math.pow(R.get(3), c) * Math.pow(R.get(5), d)
                                    * Math.pow(R.get(8), e);
                            if (temp > max) {
                                max = temp;
                                aa = a;
                                bb = b;
                                cc = c;
                                dd = d;
                                ee = e;
                            }
                        }
        System.out.println("maxinum profit,he should so save his money in a bank:");
        System.out.println(String.format("%d %d %d %d %d", aa, bb, cc, dd, ee));
        System.out.println(String.format("%.2f", max));

    }
}
/*
7怎样存钱利最大
假设银行整存整取存款不同期限的月息利率分别为：
0.63% 期限=1年
0.66% 期限=2年
0.69% 期限=3年
0.75% 期限=5年
0.84% 期限=8年
利息=本金*月息利率*12*存款年限。
现在某人手中有2000元钱，请通过计算选择一种存钱方案，使得钱存入银行20年后得到的利息最多(假定银行对超过存款期限的那一部分时间不付利息)。
*思考题
某单位对职工出售住房，每套为2万元。买房付款的方法是：
一次交清，优惠20%
从第一年开始，每年年初分期付款：
5年交清，优惠50%；
10年交清，优惠10%；
20年交清，没有优惠。
现在有人手中正好有2万元，若假定在今后20年中物价和银行利率均保持不变，问他应当选择哪种付款方式可以使应付的钱最少？

*运行结果
For maxinum profit,he should so save his money in a bank:
made fixed deposit for 8 year: 0times
made fixed deposit for 5 year: 4times
made fixed deposit for 3 year: 0times
made fixed deposit for 2 year: 0times
made fixed deposit for 1 year: 0times
Total:8841.01
可见最佳的存款方案为连续四次存5年期。
 */
