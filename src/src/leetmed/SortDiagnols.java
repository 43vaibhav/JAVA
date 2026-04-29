package leetmed;
import java.util.HashSet;
import java.util.Scanner;
public class SortDiagnols {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            // System.out.println("Enter the number of rows:");
            // int row =  sc.nextInt();
            // int col = sc.nextInt();
            int grid[][] = {{1 , 7, 3},{9 , 8,2}, {4 , 5 , 6}};// new int[row][col];
            int row = 3;
            int col = 3;
            // System.out.println("Enter the parameters:");
            // for(int i = 0 ; i < row; i++){
            //     for(int j = 0 ; j < 2;j++){
            //         grid[i][j] = sc.nextInt();
            //     }
            // }
            // if(row== col){
            //     System.out.println("THE RECTANGLE WITH MAXIMUM AREA IS:");
              //  System.out.println(SortGrid(grid, row,col));
            // }
            // else{
            //     System.out.println("INVALID INPUT!!!!");
            // }        
            SortGrid(grid,row,col);
            
            
                
        }
    }
    static void SortGrid( int grid[][], int row, int col){
        int ans[][] = new int[row][col];
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0 ; i < row;i++){
            for(int j = i + 1;j<col;j++){
                int largest = 0;
                for(int k = 0 ; k < row;k++){
                    if(Math.abs(i - j) == k){
                        largest = Math.max(largest,grid[i][j]);
                        System.out.println(largest);
                    }
                    
                }
                ans[i][j] = largest;
            }
        }
        for(int i = 0 ; i< row;i++){
                for(int j = 0 ; j < col;j++){
                    System.out.print(ans[i][j] + " ");
                }
                System.out.println();
            }
        
        // for(int i = 0 ; i<row;i++){
        //     int largest = 0;
        //     for(int j = 0;j<=i;j++){

        //     }
        // }
        // return ans;
    }
}
