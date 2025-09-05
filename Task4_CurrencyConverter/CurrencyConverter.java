package Task4_CurrencyConverter;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    String[] currencies = {"USD", "INR", "EUR"};
    double[][] rates = {
        {1, 83.5, 0.93},   // USD
        {0.012, 1, 0.011}, // INR
        {1.08, 89.5, 1}     // EUR
    };

        System.out.println("Select base currency: 0.USD  1.INR  2.EUR");
        int base = sc.nextInt();

        System.out.println("Select target currency: 0.USD  1.INR  2.EUR");
        int target = sc.nextInt();

        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();

        double converted = amount * rates[base][target];
        System.out.println("Converted Amount: " + converted + " " + currencies[target]);

        sc.close();
    }
}
