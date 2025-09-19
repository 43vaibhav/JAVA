package recursion;
import java.util.Scanner;
public class Counting {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        System.out.print("SUM OF  "+ n+ " INTGERS IS : ");
        System.out.print(Sum(n));
        sc.close();
    }
    static int Sum(int n){
        /* PRINT THE SUM OF FIRST N INTEGERS */
        int sum= 0;
        if(n == 0){
            return sum;
        }
        sum = n + Sum(n-1);
        return sum;


    }
}
