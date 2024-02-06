import java.util.Scanner;
public class Harmonic {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int N = sc.nextInt();
        if(N<=0){
            System.out.println("enter a positive number");
        }
        float sum=0;
        for (int i = 1; i <= N; i++) {
            sum= sum+ 1.0f/i;
        }
        System.out.println("sum: "+sum);
    }
}
