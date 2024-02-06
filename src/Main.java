import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //1. Flip Coin and print percentage of Heads and Tails
        System.out.println("Enter the number of time coin flips");
        int numflip= sc.nextInt();
        if(numflip<=0){
            System.out.print("enter positive number");
        }
        int tail=0;
        int head=0;
        for(int i=1; i<=numflip;i++){
            double output = Math.random();
            if(output<0.5){
                tail++;
            }
            else{
                head++;
            }
        }
        System.out.println(tail+"tail");
        System.out.println(head+"head");
        double percentage= (double)head/numflip *100;
        System.out.println("Percentage of Head vs Tails: "+percentage);
        git add README.md

    }
}