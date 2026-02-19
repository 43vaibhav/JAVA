package recursion;
import java.util.Scanner;
public class Sum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE VALUE OF N : ");
        int n = sc.nextInt();
        System.out.println("SUMMTION USING PARAMETERS: " );
        System.out.print(SumP(0,n));
        System.out.println();
        System.out.println("SUMMTION USING FUNCTIONS: ");
        System.out.println(SumF(n));
        sc.close();
    }
    static int SumF(int n){
        /* PRINT THE SUM OF FIRST N INTEGERS */
        int sum= 0;
        if(n == 0){
            return sum;
        }
        sum = n + SumF(n-1);
        return sum;
    }
    static int SumP(int i,int n){
        /*PRINTING SUM USING PARAMETER I WHERE AFTER EAXCH CALL I BECOMES PLUS 1 */
        if(i==n){
            return i;
        }
        int sum = i + SumP(i+1,n);
        return sum; 
    }
}
