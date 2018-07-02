import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter stocks");
        String symbol = input.nextLine();
        System.out.println("Please enter company name");
        String name = input.nextLine();
        Stock stock = new Stock(symbol, name);

        System.out.println("Enter previous closing price of stock");
        double previousClosingPrice = input.nextDouble();
        System.out.println("Enter current price of stock");
        double currentPrice = input.nextDouble();

        System.out.println("Different percentage: " + stock.getChangePercent(previousClosingPrice, currentPrice));


    }
}
