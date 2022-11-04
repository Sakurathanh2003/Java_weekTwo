import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int ans = 0;
        int dem = 1;

        for (int i = 1; i < n; i++) {
            if (a[i] > a[i-1]) {
                dem += 1;
            } else {
                ans = Math.max(dem, ans);
                dem = 1;
            }
        }

        ans = Math.max(dem, ans);
        System.out.print(ans);
    }
}
