package assesments;
import java.util.Scanner;

public class AlexInspection {
   /*
    * Finding Bus Stops with Charging Stations

Problem Statement:
Alex is analyzing a bus network to identify which stops have charging stations for electric buses.
The bus network is represented as a 5×5 grid, where each cell corresponds to a bus stop.

Some stops have charging stations, marked with 'C'.

The grid is initialized with three charging stations placed at fixed positions.

Alex can inspect up to 10 stops to determine if they have a charging station.

Your task is to write a program that simulates Alex’s inspections:

For each inspection, check whether a stop has a charging station or not.

Update the grid after each inspection.

Print the total results at the end.
    */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int inspections[][] = new int [10][2];
        for(int i  = 0 ; i < 10;i++){
            int r = sc.nextInt();
            int c = sc.nextInt();
            inspections[i][0] = r;
            inspections[i][1] = c;
        }
            
        
        for(int  i = 0 ; i < 10; i++){
            for(int j = 0; j< 2;j++){
                System.out.print(inspections[i][j]);
            }
            System.out.println();
        }
        char grid[][] = new char[5][5];
        for(int  i =0;i<5;i++){
            for(int j  =0;j< 5;j++){
                grid[i][j] = 'O';
            }
        }
        grid[1][1] = 'C';
        grid[2][3] = 'C';
        grid[4][4] = 'C';
        
                
    }
}
