package leeteasy;
import java.util.Scanner;
public class TransposeMatrix {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF ROWS: ");
        int m = sc.nextInt();
        System.out.println("ENETER THE NUMBER OF COLUMNS: ");
        int n = sc.nextInt();
        int matrix[][] = new int[m][n];
        for(int i = 0 ;i<m;i++){
            for(int j = 0; j<n;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        sc.close();
        int ans[][] = TransposeMatrix(matrix,m,n);
        PrintMatrix(ans,m,n);
        

    }
    static void PrintMatrix(int arr[][],int m, int n){
        
        for(int i = 0 ; i< n;i++){
            for(int j = 0; j < m;j++){
                
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int[][] TransposeMatrix(int arr[][],int m, int n){
        int ans[][] = new int[n][m];
        for(int i = 0 ; i< n;i++){
            for(int j = 0 ; j < m;j++){
                ans[i][j]  = arr[j][i];
            }
            System.out.println();
        }
        return ans;
    }
}
