package leeteasy;
import java.util.Scanner;

public class EarliestFinishTimee {  
    public static void main(String args[]) {
        try(Scanner sc=  new Scanner(System.in)){
            System.out.println("LAnd START TIME:");
            int a = sc.nextInt();           
            int[] lst = new int[a];
            for(int i =0;i<lst.length;i++){
                lst[i] = sc.nextInt();
            }
            System.out.println("LAnd duration:");
            int b = sc.nextInt();
            int[] ld = new int[b];
            for(int i = 0;i<ld.length;i++){
                ld[i] = sc.nextInt();
            }
            System.out.println("water START TIME:");
            int c = sc.nextInt();
            int[] wst = new int[c];
            for(int i =0;i< wst.length;i++){
                wst[i]  =sc.nextInt();
            }
            System.out.println("water duration");
            int d = sc.nextInt();
            int[] wd = new int[d];
            for(int i = 0;i<wd.length;i++) {
                wd[i] = sc.nextInt();
            }
            System.out.print(Solution(lst, ld, wst, wd));

        } 
    }
    static int Solution(int[] lst, int[] ld, int[] wst, int[]wd){
        /* 5 ,3 , 1, 10   op = 14*/
        int j = 0;
        int i =0;
        int sum = Integer.MAX_VALUE;
        int k = 0;
        while(k < 2*( Math.pow(lst.length,wst.length))){

        }
       return 0;
    }

}
