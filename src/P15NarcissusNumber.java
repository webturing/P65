public class P15NarcissusNumber {
    public static void main(String[] args) {
        System.out.println(" There are following Armstrong number smaller than 1000:");
        for (int n = 100; n <= 999; n++) {
            int a = n / 100, b = n % 100 / 10, c = n % 10;
            if (a * a * a + b * b * b + c * c * c == n) {
                System.out.print(n + " ");
            }
        }
    }
}
/**
 * 15姆斯特朗数
 * 如果一个正整数等于其各个数字的立方和，则称该数为阿姆斯特朗数(亦称为自恋性数)。
 * 如 407=43+03+73就是一个阿姆斯特朗数。试编程求1000以内的所有阿姆斯特朗数。
 * <p>
 * 运行结果
 * There are following Armstrong number smaller than 1000:
 * 153 370 371 407
 */