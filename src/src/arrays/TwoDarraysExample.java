package arrays;
import java.util.Scanner;
public class TwoDarraysExample {
    public static void main(String[] args) {
        try(Scanner sc =  new Scanner(System.in)){
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
            System.out.println("PRINT ARRAY 1 : ");
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
            System.out.println("Print sum:");
            int result[][] = new int[n][n];
            System.out.println("PRINT SUM: ");
            
            for(int i = 0;i<n;i++){
                System.out.print("[" + " ");
                for(int j= 0;j<n;j++){
                    result[i][j] = arr[i][j]  + arr1[i][j];
                    System.out.print(result[i][j]  + " "); 
                }
                System.out.println("]");
                
            }

            
        }

    }
}
