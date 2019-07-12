import java.util.Scanner;

public class P63Arabic2Roman {
    public static String ArabToRoman(int Arab) {
        String Roman = "";
        String[][] list = {
                {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"},
                {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"},
                {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"},
                {"", "M", "MM", "MMM", "", "", "", "", "", ""}
        };
        Roman += list[3][Arab / 1000 % 10];
        Roman += list[2][Arab / 100 % 10];
        Roman += list[1][Arab / 10 % 10];
        Roman += list[0][Arab % 10];
        return Roman;
    }

    public static int RomanToInt(String roman) {
        int res = 0;
        try {
            while (roman.charAt(0) == 'M') {
                res += 1000;
                roman = roman.substring(1);
            }
            if (roman.charAt(0) == 'D') {
                res += 500;
                roman = roman.substring(1);
            }
            while (roman.charAt(0) == 'C') {
                res += 100;
                roman = roman.substring(1);
            }
            if (roman.charAt(0) == 'D') {
                res += 300;
                roman = roman.substring(1);
            } else if (roman.charAt(0) == 'M') {
                res += 800;
                roman = roman.substring(1);
            }
            if (roman.charAt(0) == 'L') {
                res += 50;
                roman = roman.substring(1);
            }
            while (roman.charAt(0) == 'X') {
                res += 10;
                roman = roman.substring(1);
            }
            if (roman.charAt(0) == 'L') {
                res += 30;
                roman = roman.substring(1);
            } else if (roman.charAt(0) == 'C') {
                res += 80;
                roman = roman.substring(1);
            }
            if (roman.charAt(0) == 'V') {
                res += 5;
                roman = roman.substring(1);
            }
            while (roman.charAt(0) == 'I') {
                res += 1;
                roman = roman.substring(1);
            }
            if (roman.charAt(0) == 'V') {
                res += 3;
                roman = roman.substring(1);
            } else if (roman.charAt(0) == 'X') {
                res += 8;
                roman = roman.substring(1);
            }
        } catch (StringIndexOutOfBoundsException e) {
            return res;
        }
        return res;
    }

    public static void main(String[] args) {
        for (Scanner cin = new Scanner(System.in); ; ) {
            int a = cin.nextInt();
            System.out.println(ArabToRoman(a));
        }
    }
}
//63将阿拉伯数字转换为罗马数字
//将大于0小于1000的阿拉伯数字转换为罗马数字。阿拉伯数字与罗马数字的对应关系如下：
//        1 2 3 4 5 ……
//        I II III IV V ……
//
//        *运行结果
//        1. Please enter number:863
//        863=DCCCLXIII
//        2. Please enter number: 256
//        256=CCLVI
//        3. Please enter number:355
//        355=CCCLV
//        4. Please enter number:522
//        522=DXXII
//        5. Please enter number:15
//        15=XV

