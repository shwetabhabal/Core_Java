import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter year: ");
        int year = sc.nextInt();
        if (year < 1000 || year > 9999) {
            System.out.println("Enter 4 digit year: ");
        }
        if (year % 4 == 0 || year % 100 != 0 && year % 400 == 0) {
            System.out.println("leap year");

        } else {
            System.out.println("not a leap year");
        }
    }
}