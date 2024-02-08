import java.util.Scanner;

public class LAB1_prob4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the exchange rate from USD to BDT: ");
        double exchangeRate = in.nextDouble();

        System.out.println("Enter 0 to convert from USD to BDT or 1 to convert from BDT to USD: ");
        int conversionTo = in.nextInt();

        System.out.println("Enter the amount: ");
        double amount = in.nextDouble();

        double convertedAmount;
        if (conversionTo == 0) {
            convertedAmount = amount * exchangeRate;
            System.out.println(amount + " Dollars is equal to " + convertedAmount + " Taka");
        } else if (conversionTo == 1) {
            convertedAmount = amount / exchangeRate;
            System.out.println(amount + " Taka is equal to " + convertedAmount + " Dollars");
        } else {
            System.out.println("Please enter 0 or 1.");
        }

        in.close();

    }
}