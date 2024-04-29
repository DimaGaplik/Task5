package app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your revenue:");
        double revenue = scanner.nextDouble();
        double tax = 0;

        if (revenue <= 10000) {
            tax = revenue * 0.025;
        } else if (revenue <= 25000) {
            tax = revenue  * 0.043;
        } else if (revenue > 25000) {
            tax = revenue * 0.067;
        }
        System.out.printf("Налог для дохода %.2f грн: %.2f грн%n", revenue, tax);

        scanner.close();
    }
}
