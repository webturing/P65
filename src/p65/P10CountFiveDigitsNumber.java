package p65;

public class P10CountFiveDigitsNumber {
    public static void main(String[] args) {
        int count = 0;
        for (int a = 1000; a <= 9999; a++) {
            int n = a * 10 + 6;
            if (n % 3 == 0) {
                ++count;
            }
        }
        System.out.println("count=" + count);

    }
}
/**
 * 10 有限5位数
 * 个位数为6且能被3整除的五位数共有多少？
 * 思考题
 * 求100到1000之间有多少个其数字之和为5的整数。
 * (答案：104，113，122，131，140，203，212，221，230，302，311，320，401，410，500)
 * <p>
 * 运行结果
 * count=2999
 */
