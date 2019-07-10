import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class P52XiaoMinBuyBooks {
    public static void main(String[] args) {
        double v[] = new double[]{3.1, 1.7, 2, 5.3, 0.9, 7.2};
        Map<String, Double> M = new TreeMap<String, Double>();
        for (int a = 0; a <= 1; a++)
            for (int b = 0; b <= 1; b++)
                for (int c = 0; c <= 1; c++)
                    for (int d = 0; d <= 1; d++)
                        for (int e = 0; e <= 1; e++)
                            for (int f = 0; f <= 1; f++) {
                                double v1 = Math.abs(a * v[0] + b * v[1] + c * v[2] + d * v[3] + e * v[4] + f * v[5] - 10);
                                M.put("" + a + b + c + d + e + f, v1);

                            }
        Double m = Collections.min(M.values());
        for (String k : M.keySet())
            if (M.get(k).equals(m)) {
                System.out.print(String.format("10+/-%.1f=", m));

                char[] flag = k.toCharArray();
                for (int i = 0; i < flag.length; i++) {
                    if (flag[i] == '1')
                        System.out.print("+" + v[i]);
                }
                System.out.println();
            }
    }
}


//52小明买书
//        小明假期同爸爸一起去书店，他选中了六本书，每本书的单价分别为：3.1，1.7，2，5.3，0.9和7.2。不巧的是，小明的爸爸只带了十几块钱，为了让小明过一个愉快的假期，爸爸扔然同意买书，但提邮购一个要求，要小明从六本书中选出若干本，使得单价相加所得的和同10最接近。你能够帮助小明解决这个问题吗？
//
//        *运行结果
//        Please enter the prices of 6 books:3.1 1.7 2.0 5.3 0.9 7.2
//        10(+ -)0.10=2.00+0.90+7.20
//        10(+ -)0.10=1.70+2.00+5.30+0.90
//        10(+ -)0.10=3.10+1.70+5.30
