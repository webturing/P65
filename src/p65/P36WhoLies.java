package p65;

public class P36WhoLies {
    public static void main(String[] args) {
        for (int a = 0; a <= 1; ++a)
            for (int b = 0; b <= 1; ++b)
                for (int c = 0; c <= 1; ++c) {
                    int pa = (b == 0 ? 1 : 0);
                    int pb = (c == 0 ? 1 : 1);
                    int pc = (a + b == 0 ? 1 : 0);
                    if (a == pa && b == pb && c == pc) {
                        System.out.println("Zhangsan told a " + (a == 0 ? "lie" : "truth"));
                        System.out.println("Lisi told a " + (b == 0 ? "lie" : "truth"));
                        System.out.println("Wangwu told a " + (c == 0 ? "lie" : "truth"));
                    }

                }
    }
}
/**
 * 36谁在说谎
 * 张三说李四在说谎，李四说王五在说谎，王五说张三和李四都在说谎。现在问：这三人中到底谁说的是真话，谁说的是假话？
 * <p>
 * 运行结果
 * Zhangsan told a lie (张三说假话)
 * Lisi told a truch. (李四说真话)
 * Wangwu told a lie. (王五说假话)
 */