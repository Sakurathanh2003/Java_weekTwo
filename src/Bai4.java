import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int dem = 0;
        for (int i = 0; i < n; i++) {
            if (!haveSNT(a[i])) continue;
            if (!snt(a[i])) continue;

            System.out.print(a[i] + " ");
            dem++;
        }

        if (dem == 0) {
            System.out.print("NO");
        }
    }
    public static boolean snt(int n) {
        if (n <= 1) return false;
        if (n == 2 || n == 3) return true;

        for (int i = 2; i * i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    public static  boolean haveSNT(int n) {
        if (n <= 1) return false;

        while (n != 0) {
            int kitu = n % 10;
            n = n / 10;

            if (kitu != 2 && kitu != 3 && kitu != 5 && kitu != 7) return false;
        }

        return true;
    }
}
