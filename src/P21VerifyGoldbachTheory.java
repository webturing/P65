public class P21VerifyGoldbachTheory {
    static boolean isPrime(int n) {
        if (n == 2) return true;
        if (n < 2 || n % 2 == 0) return false;
        for (int c = 3; c * c <= n; c += 2) {
            if (n % c == 0) return false;
        }
        return true;
    }

    static boolean verify(int n) {
        for (int p = 3; p <= n / 2; p += 2) {
            if (isPrime(p) && isPrime(n - p)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        for (int n = 6; n <= 2000; n += 2) {
            if (!verify(n)) {
                System.out.println("Congratulations,Goldbach is wrong~");
            }
        }
    }
}
/**
 * 21歌德巴赫猜想
 * 验证：2000以内的正偶数都能够分解为两个素数之和(即验证歌德巴赫猜想对2000以内的正偶数成立)。
 */