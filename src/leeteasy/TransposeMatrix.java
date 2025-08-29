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
        int ans[][]= TransposeMatrix(matrix,m,n);
        PrintMatrix(ans,m,n);
        

    }
    static void PrintMatrix(int arr[][],int m, int n){
        for(int i = 0 ; i< m;i++){
            for(int j = 0 ; j < n;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int[][] TransposeMatrix(int matrix[][],int m, int n){
        for(int i = 0 ; i< n;i++){
            for(int j = i;j<m;j++){
                Swap(matrix,i,j);
            }
        }
        return matrix;
        
    }
    static int Swap(int matrix[][] , int i, int j){
        int temp = matrix[j][i];
        matrix[j][i] = matrix[i][j];
        matrix[i][j] = temp;
        return temp;

    }
}
