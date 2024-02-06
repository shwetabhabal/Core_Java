import java.util.Scanner;
public class CheckVowelorConsonent {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter an alphabet: ");
        char alpha = sc.next().charAt(0);
        char alph= Character.toLowerCase(alpha);
        if(alph=='a' || alph=='e' || alph=='i' || alph=='o' || alph=='u'){
            System.out.println(alpha+" is vowel");
        }
        else{
            System.out.println(alpha+" is consonent");
        }
    }
}
