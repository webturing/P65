public class P53TheoremVerification {
    public static void main(String[] args) {
        //(2*i+1)^2-1=4*i^2+4i+1-1=4*i(i+1) ok
        for (int i = 1001; ; i += 2) {
            long l = 1L * i * i - 1;
            System.out.println(l % 8);
        }
    }
}
//53奇数平方的一个有趣性质
//        编程验证“大于1000的奇数其平方与1的差是8的倍数”。