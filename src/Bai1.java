import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }

        int dem = 0;
        int sosanh = a[0];
        for (int i = 0; i < n; i++) {
            if (a[i] == sosanh) {
                dem++;
            } else {
                System.out.println(sosanh + " : " + dem);
                sosanh = a[i];
                dem = 1;
            }
        }

        System.out.print(sosanh + " : " + dem);
    }
}
