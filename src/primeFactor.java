import java.util.Scanner;
public class primeFactor {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N= sc.nextInt();
        if(N<=1){
            System.out.println("prime factorization not possible for number less than 1");
        }
        for(int i=2;i<=N;i++){
            while(N % i ==0){
                System.out.println(i);
                N=N/i;
            }
        }
        if(N>1){
            System.out.println(N);
        }
    }
}
