package leetmed;
import java.util.Arrays;
import java.util.Scanner;
public class incrementSubmatricesByOne {
    public static void main(String args[] ){
        int n = 3;
        int queries[][]= {{1,1,2,2},{0,0,1,1}};
        // we use Arrays.deepToString() on a grid or array to print direclty instead of running the loop 

        System.out.print(Arrays.deepToString(rangeAddQueries(n,queries)));
    }
    static int[][] rangeAddQueries(int n, int[][] queries){
        int result[][] = new int[n][n];
        /* for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                result[i][j] = 0;
            }
        }
        */
        for(int i = 0 ; i< queries.length;i++){
            int strtRow = queries[0];
            int strtol = queries[1];
            int endRow = queries[2];
            int endCol = queries[3];
            for(int a = strtRow; )
        } 
    }
}
