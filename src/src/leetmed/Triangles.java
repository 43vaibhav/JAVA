package leetmed;

public class Triangles {
    public static void main(String[] args) {
        
        int arr[][] = {{2}, {3,4},{5,7,1},{3,0,9,5}};
        
        System.out.println(sumTriangle(arr,0,0));
        
    }
    static int sumTriangle(int arr[][] , int row, int col){
        if(row == arr.length - 1){
            return arr[row][col];
        }
        int minSum = arr[row][col] + Math.min(sumTriangle(arr,row +1, col), sumTriangle(arr, row+1, col+1));

        return minSum;
    }
}   
