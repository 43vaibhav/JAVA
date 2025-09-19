package recursion;
import java.util.Scanner;
public class Counting {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println("SUM OF  "+ n+ "INTGERS IS");
        System.out.print(Sum(n));
    }
    static int Sum(int n){
        /* PRINT THE SUM OF FIRST N INTEGERS */
        int sum = n;
        if(n == 00){
            return sum;
        }
        Sum(n-1);
        return sum;


    }
}
