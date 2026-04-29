package recursion;
import java.util.Scanner;
public class fibonacciNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        System.out.println("FIBONACCI VALUE OF " + n + " IS : ") ;
        System.out.println(fiboNum(n));
        sc.close();
    }
    static int fiboNum(int n){
        if(n<=1){
            return n;
        }
        return fiboNum(n-1) + fiboNum(n-2);
    }
}
