import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int j = sc.nextInt();
        int m = sc.nextInt();
        int p = sc.nextInt();

        // invalid input check
        if (n < 0 || k <= 0 || j <= 0 || m < 0 || p < 0) {
            System.out.println("INVALID INPUT");
            return;
        }

        int bananaMonkeys = m / k;
        int peanutMonkeys = p / j;

        int totalEatingMonkeys = bananaMonkeys + peanutMonkeys;

        if (totalEatingMonkeys > n) {
            totalEatingMonkeys = n;
        }

        int left = n - totalEatingMonkeys;

        System.out.println("Number of Monkeys left on the Tree:" + left);
    }
}
