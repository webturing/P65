public class P40DoctorsDuty {
    static String[] weekdays = " MONDAY TUESDAY WEDNESDAY THUESDAY FRIDAY SATURDAY SUNDAY".split(" ");

    public static void main(String[] args) {
        for (int a = 1; a <= 7; a++) {
            for (int b = 1; b <= 7; b++) {
                if (a == b) continue;
                for (int c = 1; c <= 7; c++) {
                    if (c == a || c == b) continue;
                    if (a + 1 != c) continue;
                    for (int d = 1; d <= 7; d++) {
                        if (d == c || d == b || d == a) continue;
                        for (int e = 1; e <= 7; e++) {
                            if (e == d || e == c || e == b || e == a) continue;
                            if (e + 2 != d) continue;
                            for (int g = 1; g <= 7; g++) {
                                if (g == e || g == d || g == c || g == b || g == a) continue;
                                if (b != g + 3) continue;
                                int f = 28 - a - b - c - d - e - g;
                                if (f != 4 || (b - f) * (f - c) < 0) continue;

                                System.out.println("Doctor A is on duty " + weekdays[a]);
                                System.out.println("Doctor B is on duty " + weekdays[b]);
                                System.out.println("Doctor C is on duty " + weekdays[c]);
                                System.out.println("Doctor D is on duty " + weekdays[d]);
                                System.out.println("Doctor E is on duty " + weekdays[e]);
                                System.out.println("Doctor F is on duty " + weekdays[f]);
                                System.out.println("Doctor G is on duty " + weekdays[g]);

                            }
                        }
                    }
                }
            }
        }
    }
}

//40哪个大夫哪天值班
//        医院有A、B、C、D、E、F、G七位大夫，在一星期内(星期一至星期天)每人要轮流值班一天。现在已知：
//        A大夫比C大夫晚一天值班；
//        D大夫比E大夫晚二天值班；
//        B大夫比G大夫早三天值班；
//        F大夫的值班日在B和C大夫的中间，且是星期四；
//        请确定每天究竟是哪位大夫值班？
//
//        *运行结果
//        Doctor E is on duty MONDAY. (星期一：E)
//        Doctor B is on duty TUESDAY. (星期二：B)
//        Doctor D is on duty WEDNESDAY. (星期三：D)
//        Doctor F is on duty THUESDAY. (星期四：F)
//        Doctor G is on duty FRIDAY. (星期五：G)
//        Doctor C is on duty SATURDAY. (星期六：C)
//        Doctor A is on duty SUNDAY. (星期日：A)