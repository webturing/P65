public class P22ChickenHundredsMoney {
    final static int N = 100;

    public static void main(String[] args) {
        System.out.println("Follwing are possible plans to buy 100 fowls with 100 Yuan.");
        int no = 0;
        for (int x = 0; x <= N / 5; x++)
            for (int y = 0; y <= (N - 5 * x) / 3; y++) {
                int z = N - x - y;
                if (z % 3 == 0 && 5 * x + 3 * y + z / 3 == N) {
                    System.out.println(String.format("%d:cocks=%d hen=%d chicken=%d", ++no, x, y, z));
                }
            }
    }
}
/**
 * 22百钱百鸡问题
 * 中国古代数学家张丘建在他的《算经》中提出了著名的“百钱买百鸡问题”：鸡翁一，值钱五，鸡母一，值钱三，鸡雏三，值钱一，百钱买百鸡，问翁、母、雏各几何？
 * <p>
 * 运行结果
 * Follwing are possible plans to buy 100 fowls with 100 Yuan.
 * 1:cock=0 hen=25 chicken=75
 * 2:cock=4 hen=18 chicken=78
 * 3:cock=8 hen=11 chicken=81
 * 4:cock=12 hen=4 chicken=84
 */