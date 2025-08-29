package leeteasy;
import java.util.Scanner;
public class GCDEvenOddSum {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("ENTER N:");
            int n = sc.nextInt();
            // HACK FOR SOLVING GCD OF FIRST N ODD AND EVEN SUM INTEGERS
            System.out.println("USING TRICK : GCD= " + n);
            int OddSum = n * n;
            System.out.println("SUM OF FIRST " + n+ " odd integers is: " + OddSum);
            int EvenSum = n * (n +1);
            System.out.println("SUM OF FIRST " + n+ " even integers is: " + EvenSum);/*
            GCD = GREATEST COMMON DIVISOR OR HCF */
            System.out.println("HCF OF " + OddSum + " and "+ EvenSum +" is:");
            System.out.println(findgcd(OddSum, EvenSum));
        }
    }
    static int findgcd(int a , int b){
        while(b>0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
