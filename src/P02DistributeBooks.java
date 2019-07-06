public class P02DistributeBooks {
    static int b[] = new int[]{1, 2, 3, 4, 5};//five books;
    static int[] a = new int[3];
    static boolean[] used = new boolean[b.length];
    static int cnt = 0;

    static void dfs(int k) {
        if (k == a.length) {
            System.out.print(++cnt + ":");
            for (int e : a) System.out.print(e + ",");
            if (cnt % 5 == 0)
                System.out.println();
            else System.out.print("\t");
            return;
        }
        for (int i = 0; i < b.length; i++) {
            if (!used[i]) {
                used[i] = true;
                a[k] = b[i];
                dfs(k + 1);
                used[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("There are diffrent methods for XM to distribute books to 3 readers:");
        dfs(0);

    }
}
/**
 * 2借书方案知多少
 * 小明有五本新书，要借给A，B，C三位小朋友，若每人每次只能借一本，则可以有多少种不同的借法？
 * <p>
 * 运行结果
 * There are diffrent methods for XM to distribute books to 3 readers:
 * 1: 1,2,3 　2: 1,2,4 　3: 1,2,5 　4: 1,3,2 　5: 1,3,4
 * 6: 1,3,5 　7: 1,4,2 　8: 1,4,3 　9: 1,4,5 　10:1,5,2
 * 11:1,5,3 　12:1,5,4 　13:2,1,3 　14:2,1,4 　15:2,1,5
 * 16:2,3,1 　17:2,3,4 　18:2,3,5 　19:2,4,1 　20:2,4,3
 * 21:2,4,5 　22:2,5,1 　23:2,5,3 　24:2,5,4 　25:3,1,2
 * 26:3,1,4 　27:3,1,5 　28:3,2,1 　29:3,2,4 　30:3,2,5
 * 31:3,4,1 　32:3,4,2 　33:3,4,5 　34:3,5,1 　35:3,5,2
 * 36:3,5,4 　37:4,1,2 　38:4,1,3 　39:4,1,5 　40:4,2,1
 * 41:4,2,3 　42:4,2,5 　43:4,3,1 　44:4,3,2 　45:4,3,5
 * 46:4,5,1 　47:4,5,2 　48:4,5,3 　49:5,1,2 　50:5,1,3
 * 51:5,1,4 　52:5,2,1 　53:5,2,3 　54:5,2,4 　55:5,3,1
 * 56:5,3,2 　57:5,3,4 　58:5,4,1 　59:5,4,2 　60:5,4,3
 */