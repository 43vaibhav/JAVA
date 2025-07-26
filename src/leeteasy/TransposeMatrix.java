package leeteasy;
import java.util.Scanner;
public class TransposeMatrix {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int matrix[][] = new int[m][n];
        for(int i = 0 ;i<m;i++){
            for(int j = 0; j<n;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        sc.close();
        PrintTransposeMatrix(matrix,m,n);
        

    }

    public static void PrintTransposeMatrix(int[][] matrix, int m , int n){
        int transpose[][] = new int[n][m];
        for(int i = 0;i<m;i++){
            for(int j = 0; j<n;j++){
                transpose[j][i]= matrix[i][j];
            }
        }
        for(int i = 0;i<n;i++){
            for(int j = 0; j< m ;j++){
                System.out.print(transpose[i][j]+" ");
                
            }
            System.out.println();
        }
       
    }
}