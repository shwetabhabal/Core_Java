import java.util.Scanner;
public class QuotRemin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter dividend and divisor: ");
        int dividend= sc.nextInt();
        int divisor = sc.nextInt();

        int quot = dividend/divisor;
        int remin = dividend % divisor;
        System.out.println("Quotient: "+quot);
        System.out.println("Reminder: "+remin);
    }
}
