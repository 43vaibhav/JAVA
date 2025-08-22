package arrays;
import java.util.Scanner;
public class Operations2Darray {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int arr[][] = new int[n][n];
            int arr1[][] = new int[n][n];
            System.out.println("ARRAY 1: ");
            for(int i = 0;i<n;i++){
                for(int j= 0;j<n;j++){
                    arr[i][j] = sc.nextInt();
                }
            }
            System.out.println("ARRAY 2:: ");
            for(int i = 0;i<n;i++){
                for(int j= 0;j<n;j++){
                    arr1[i][j] = sc.nextInt();
                }
            }
            String operation = sc.next();

            System.out.println("\nPRINT ARRAY 1 : ");
            for(int i = 0;i<n;i++){
                System.out.print("[");
                for(int j= 0;j<n;j++){
                    System.out.print( " "+ arr[i][j] + " ");
                }
                System.out.print("]");
                System.out.println();
            }
            System.out.println("PRINT ARRAY 2 : ");
            for(int i = 0;i<n;i++){
                System.out.print("[");
                for(int j= 0;j<n;j++){
                    System.out.print( " "+ arr1[i][j] + " ");
                }
                System.out.print("]");
                System.out.println();
            }
            switch(operation) {
                case "sum" : 
                    System.out.println("PRINT SUM:");
                    checkSum(arr,arr1);
                    break; 
                
                case "difference":
                    System.out.println("PRINT DIFFERENCE:");
                    checkDiff(arr,arr1);
                    break;

                case "product":
                    System.out.println("PRINT PRODUCT:");
                    checkProduct(arr,arr1);
                    break;
                
                default :
                    System.out.println("INVALID OPERATION:");
            }            
        }
    }
    static void checkSum(int arr[][], int arr1[][]){
        int n = arr.length;
        int sum[][] = new int [n][n];         
        for(int i = 0;i<n;i++){
            System.out.print("[" + " ");
            for(int j= 0;j<n;j++){
                sum[i][j] = arr[i][j]  + arr1[i][j];
                System.out.print(sum[i][j]  + " "); 
            }
            System.out.println("]");   
        }   
       
    }
    static void checkProduct(int arr[][], int arr1[][]){
        int n = arr.length;
        int prod[][] = new int [n][n];         
        for(int i = 0;i<n;i++){
            System.out.print("[" + " ");
            for(int j= 0;j<n;j++){
                prod[i][j] = arr[i][j]  + arr1[i][j];
                System.out.print(prod[i][j]  + " "); 
            }
            System.out.println("]");   
        }   
        
    }
    static void checkDiff(int arr[][], int arr1[][]){
        int n = arr.length;
        int diff[][] = new int [n][n];         
        for(int i = 0;i<n;i++){
            System.out.print("[" + " ");
            for(int j= 0;j<n;j++){
                diff[i][j] = arr[i][j]  + arr1[i][j];
                System.out.print(diff[i][j]  + " "); 
            }
            System.out.println("]");   
        }   
        
    }
    

}
