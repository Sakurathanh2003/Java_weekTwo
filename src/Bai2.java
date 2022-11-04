import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int dem = 0;
        int bandau = a[0];
        for (int i = 1; i < n; i++) {
            for (int j = bandau + 1; j < a[i]; j++) {
                System.out.print(j + " ");
                dem++;
            }

            bandau = a[i];
        }

        if (dem == 0) {
            System.out.print("YES");
        }
    }
}
