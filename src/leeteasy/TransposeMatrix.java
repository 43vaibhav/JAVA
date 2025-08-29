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
    static void PrintTransposeMatrix(int matrix[][],int m, int n){
        for(int i = 0;i<m;i++){
            System.out.print("[" + " ");
            for(int j = 0;j<n;j++){
                if(i != j){
                    System.out.print(Swap(matrix,i,j)+ " ");
                }
                else{
                    System.out.print( matrix[i][j] + " ");
                }
                
            }
            System.out.print( "]");
            System.out.println();
        }
    }
    static int Swap(int matrix[][] , int i, int j){
        int temp = matrix[j][i];
        return temp;

    }
}
