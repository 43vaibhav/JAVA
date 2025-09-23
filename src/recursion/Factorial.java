package recursion;
import java.util.Scanner;
public class Factorial {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER FOR FACTORIAL SUM ");
        int n = sc.nextInt();
        System.out.println("Factorial Sum of "+n+ " is: ");
        System.out.println(fact(n));
    }
    static int fact(int n){
        
        if(n <= 1){
            return 1;
        }
        return n * fact(n-1);
    }
}
