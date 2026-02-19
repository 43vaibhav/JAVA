package leeteasy;
import java.util.Scanner;
public class MaximumArea {
    
    /*
     * You are given a 2D 0-indexed integer array dimensions.

For all indices i, 0 <= i < dimensions.length, dimensions[i][0] represents the length and dimensions[i][1] represents the width of the rectangle i.

Return the area of the rectangle having the longest diagonal. If there are multiple rectangles with the longest diagonal, return the area of the rectangle having the maximum area.

[[9,3],[8,6]]
Output: 48
Explanation: 
For index = 0, length = 9 and width = 3. Diagonal length = sqrt(9 * 9 + 3 * 3) = sqrt(90) ≈ 9.487.
For index = 1, length = 8 and width = 6. Diagonal length = sqrt(8 * 8 + 6 * 6) = sqrt(100) = 10.
So, the rectangle at index 1 has a greater diagonal length therefore we return area = 8 * 6 = 48.
     */
     public static void main(String[] args) {
          try(Scanner sc = new Scanner(System.in)){
               System.out.println("Enter the number of rows:");
               int row = sc.nextInt();
               int grid[][] = new int[row][2];
               System.out.println("Enter the parameters:");
               for(int i = 0 ; i < row; i++){
                    for(int j = 0 ; j < 2;j++){
                         grid[i][j] = sc.nextInt();
                    }
                    
               }
               System.out.println("THE RECTANGLE WITH MAXIMUM AREA IS:");
               System.out.println(checkMaxArea(grid, row));
               
          }
     }
     static int checkMaxArea(int grid[][], int row){
          double Maxdl = Double.NEGATIVE_INFINITY;
          int MaxArea = Integer.MIN_VALUE;
          for(int i = 0 ; i < row;i++){
               
               int length = grid[i][0];
               int width =  grid[i][1];
               double dl = Math.sqrt((length * length) + (width * width));
               int Area = length * width;
               if(dl > Maxdl){
                    MaxArea = Area;
                    Maxdl = dl;
               }
               else if(Maxdl== dl){
                    MaxArea = Math.max(Area, MaxArea);
               }

          }
          return MaxArea;
     }
    

}
