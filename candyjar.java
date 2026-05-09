import java.util.Scanner;

public class CandyJar {
    public static void main(String[] args) {
        int N = 10;  // Maximum capacity
        int K = 5;   // Minimum threshold
        int jar = N; // Current candies in jar

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter number of candies to buy: ");
            int order = sc.nextInt();

            // Check invalid input
            if (order > jar) {
                System.out.println("INVALID INPUT");
                continue;
            }

            // Sell candies
            jar = jar - order;
            System.out.println("Number of Candies Sold: " + order);

            // Refill condition
            if (jar <= K) {
                jar = N;
            }

            System.out.println("Number of Candies available: " + jar);
        }
    }
}
