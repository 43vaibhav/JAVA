package arrays;
import java.util.Scanner;
public class Operations2Darray {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
        
            System.out.println("ARRAY 1: ");
            System.out.println("NO OF ROWS:");
            int r1 = sc.nextInt();
            System.out.println("NO OF COLS:");
            int c1  = sc.nextInt();
            int arr[][] = new int[r1][c1];
            System.out.println("ENTER THE ARRAY:");
            for(int i = 0;i<r1;i++){
                for(int j= 0;j<c1;j++){
                    arr[i][j] = sc.nextInt();
                }
            }
            System.out.println("ARRAY 2:: ");
            System.out.println("NO OF ROWS:");
            int r2 = sc.nextInt();
            System.out.println("NO OF COLS:");
            int c2 = sc.nextInt();
            System.out.println("ENTER THE ARRAY:");
            int arr1[][] = new int[r2][c2];
            for(int i = 0;i<r2;i++){
                for(int j= 0;j<c2;j++){
                    arr1[i][j] = sc.nextInt();
                }
            }
           String operation = sc.next();


            switch(operation) {
                case "sum" : 
                if(r1 == r2 && c1 == c2){
                    System.out.println("PRINT SUM:");
                    checkSum(arr,arr1);
                    break; 
                }
                else{
                    System.out.println("INVALID INPUT!!!!!");
                }
                
                case "difference":
                if(r1 == r2 && c1 == c2){
                    System.out.println("PRINT DIFFERENCE:");
                    checkDiff(arr,arr1);
                    break;
                }
                else{
                    System.out.println("INVALID INPUT!!!!!");
                }
                case "multiply":
                if(c1 == r2 ){
                    System.out.println("PRINT PRODUCT:");
                    checkProduct(arr,arr1,r1,c1,r2,c2);
                    // break;
                }
                else{
                    System.out.println("INVALID INPUT!!!!!");
                }             
                default :
                    System.out.println("INVALID input!!!!!");
            }            
        }
    }
    
    static void checkProduct(int arr[][], int arr1[][],int r1, int c1, int r2, int c2){
        
        int ans[][] = new int [r1][c2];         
        for(int i = 0;i<c2;i++){
            System.out.print("[" + " ");
            for(int j= 0;j<c2;j++){
                int sum = 0;
                for(int k  = 0;k<r2;k++){
                    sum += arr[i][j]  * arr1[j][i];
                }
                ans[i][j] = sum;
                System.out.print(ans[i][j]  + " ");
            }  
            System.out.println("]"); 
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

