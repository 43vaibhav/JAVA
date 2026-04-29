package arrays;

import java.util.Scanner;
public class PrintSubaArray {
    public static void main(String[] args){
        try(Scanner sc =new Scanner(System.in)){
            int n = sc.nextInt();//4
            int arr[] = new int[n];
            for(int i  =0;i <n ; i++){
                arr[i] = sc.nextInt(); // 1  2 3 4 
            }
            printSubArrays(arr);

        }
    
    }
    static void printSubArrays(int arr[]){
        for(int i = 0;i<arr.length;i++){
            for(int j = i; j< arr.length;j++){
                for(int k = i;k<=j;k++){
                    System.out.print(arr[k] + " ");
                }
                System.out.println();                
            } 
        }
    }
}
