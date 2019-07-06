import java.util.Date;
import java.util.Scanner;

public class P05FishingOrSleeping {
    public static void main(String[] args) {
        Date start = new Date(1990 - 1900, 1 - 1, 1);
        for (Scanner cin = new Scanner(System.in); cin.hasNext(); ) {
            int y = cin.nextInt() - 1900;
            int m = cin.nextInt() - 1;
            int d = cin.nextInt();
            long days = (new Date(y, m, d).getTime() - start.getTime()) / 1000 / 3600 / 24 + 1;
            days %= 5;
            if (days == 0) days = 5;
            if (days <= 3) { // 1 2 3 捕鱼
                System.out.println("He was fishing at day.");
            } else {//4 5 筛网
                System.out.println("He was sleeping at day.");
            }
        }
    }
}
/**
 * 5打鱼还是晒网
 * 中国有句俗语叫“三天打鱼两天晒网”。某人从1990年1月1日起开始“三天打鱼两天晒网”，问这个人在以后的某一天中是“打鱼”还是“晒网”。
 * 思考题：请打印出任意年份的日历
 * <p>
 * 运行结果
 * Enter year/month/day:1991 10 25
 * He was fishing at day.
 * Enter year/month/day:1992 10 25
 * He was sleeping at day.
 * Enter year/month/day:1993 10 25
 * He was sleeping at day.
 */