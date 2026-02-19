package recursion;

import java.util.Scanner;

public class practiceI {
    /*GIVEN A NUMBER NUM AND VALUE K PRINT K MULTIPLES OF NUM 
     * K>0
     * Input1 : 
     * num =12, k = 5
     * Output1 :
     *12, 24,36,48,60

     Input2 :
     num = 3, k = 8
     Output2 :
     3, 6, 9, 12, 15, 18, 21, 24

     */
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE VALUE OF NUM : ");
        int num = sc.nextInt();
        System.out.println("ENTER THE VALUE OF K: " );
        int k = sc.nextInt();
        System.out.println();
        System.out.println(k + " FACTORS OF "+ num + " ARE: ");
        printMultiples(num,k);
        sc.close();
    }
    static void printMultiples(int num,int k){
        if(k == 1){
            System.out.println( num + " ");
            return;
        }
        printMultiples(num,k-1);
        System.out.println(num * k);
    }
}
