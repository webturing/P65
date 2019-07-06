public class P14FindSpeed {
    public static void main(String[] args) {
        for (int n = 95859 + 1; ; n++) {
            String s = Integer.toString(n);
            String t = new StringBuffer(s).reverse().toString();
            if (s.equals(t)) {
                System.out.println("The new symmetrical number kelometers is:" + n);
                System.out.println("The velocity of the car is:" + (n - 95859) / 2);
                break;
            }
        }
    }
}
/*
* 14求车速
一辆以固定速度行驶的汽车，司机在上午10点看到里程表上的读数是一个对称数(即这个数从左向右读和从右向左读是完全一样的)，为95859。
两小时后里程表上出现了一个新的对称数。问该车的速度是多少？新的对称数是多少？

*运行结果
The new symmetrical number kelometers is:95959.
The velocity of the car is:50.00
*
* */