package hackerrankprep;
import java.util.Scanner;

public class diagonalDifference {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][3];
        for(int i = 0;i<arr.length;i++){
            for(int j =0;j<arr[i].length;j++){
                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        int ltr = 0;
        int rtl = 0;
        for(int i = 0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                if(i == j){
                    ltr += arr[i][j];
                }
                if(i +j == arr.length-1){
                    rtl += arr[i][j];
                }

            }
        }
        int abs = ltr - rtl;
        System.out.print(Math.abs(abs));

    }

}



















































