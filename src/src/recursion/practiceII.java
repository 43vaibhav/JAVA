package recursion;
import java.util.Scanner;
public class practiceII {
    /*GIVEN A NUMBER N. FIND THE SUM OF N NATURAL NUMBERS BUT WLL ALTERNATES SIGNS 
     * Input1 :
     * n = 10;
     * Output1 :
     * -5;
     * Explanation :
     * 1-2+3-4+5-6+7-8+9-10=
     * Input2 :
     * n = 5;
     * Output2 :
     * 3;
     * Explanation : 
     * 1-2+3-4+5=3
     */
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE VALUE OF N : ");
        int n = sc.nextInt();
        System.out.println();
        System.out.println(" Alternate Sum of  "+ n + " is: ");
        System.out.println(printSum(n));
        sc.close();
    }
    static int printSum(int n){
        if(n==0){
            return 0;
        }
        if(n%2 == 0){
            return printSum(n-1) - n;
        }
        return  printSum(n-1) + n;
    }
}
