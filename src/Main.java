import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your money in USD:");
        double usdMoney = scanner.nextDouble();

        double rate = usdMoney * 24000;
        System.out.println("your exchange in VND is " + rate);
    }
}
