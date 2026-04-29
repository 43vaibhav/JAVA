package start1;
import java.util.Scanner;
public class Euclidean {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("ENTER N:");
            int n = sc.nextInt();
            int OddSum = n * n;
            System.out.println("SUM OF FIRST " + n+ " odd integers is: " + OddSum);
            int EvenSum = n * (n +1);
            System.out.println("SUM OF FIRST " + n+ " even integers is: " + EvenSum);/*
            GCD = GREATEST COMMON DIVISOR OR HCF */
            System.out.println("HCF OF " + OddSum + " and "+ EvenSum +" is:");
            System.out.println(gcd(OddSum, EvenSum));
            System.out.println("LCM OF " + OddSum + " and "+ EvenSum +" is:");
            System.out.println(lcm(OddSum, EvenSum));
        }
        
    }
    static int gcd(int a, int b){
        while(b>0){
            int temp  = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    static long lcm(int a,int b){
        int gcd = gcd(a, b);
        long prod= a * b ;
        long lcm = (long)prod / gcd;
        return lcm;
    }


}
