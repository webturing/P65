package p65;

public class P42FindSlowestBoy {
    public static void main(String[] args) {
        int l1 = 9, l2, l3, w1 = 8, w2, w3;
        for (l2 = 7; l2 >= 2; l2--) {
            l3 = 15 - l1 - l2;
            if (l3 < 1 || l3 == l2 || l3 == l1) continue;
            for (w2 = 7; w2 >= 2; w2--) {
                if (w2 == l2 || w2 == l3) continue;
                w3 = 15 - w1 - w2;
                if (w3 < 1 || w3 == l2 || w3 == l3 || w3 >= w2) continue;
                if (l3 == 1) System.out.println("Li");
                else if (w3 == 1) System.out.println("Wang");
                else System.out.println("Zhang");
            }
        }
    }
}
//42谁家孩子跑最慢
//        张王李三家各有三个小孩。一天，三家的九个孩子在一起比赛短跑，规定不分年龄大小，跑第一得9分，跑第2得8分，依此类推。比赛结果各家的总分相同，且这些孩子没有同时到达终点的，也没有一家的两个或三个孩子获得相连的名次。已知获第一名的是李家的孩子，获得第二的是王家的孩子。问获得最后一名的是谁家的孩子？
//
//        *运行结果
//        7 5 3
//        8 6 1
//        9 4 2
//        The last one arrived to end is a child from family Wang.