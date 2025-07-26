package hackerrankprep;
import java.util.Arrays;
import java.util.Scanner;
public class MinMax {
    public static void main(String[] args) {
        try (Scanner sc=  new Scanner(System.in)){

            /*byte < short < int < long < BigIntegers */
            int[] arr = new int[5];
            for(int i= 0; i<arr.length; i++){
                arr[i]= sc.nextInt();
            }
            Arrays.sort(arr);
            long minSum=0;
            long maxSum = 0;
            for(int i = 0; i<arr.length - 1; i++){
                minSum = minSum + arr[i];
            }
            System.out.print(minSum + "  ");
            for(int i= 1; i< arr.length;i++){
                maxSum = maxSum + arr[i];
                
            }
            System.out.println(maxSum + "  ");
        }
    }
}
