package leeteasy;
import java.util.Scanner;
import java.util.Arrays;
public class arrayConcatenation {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]= new int[n];
        for(int i = 0 ; i< n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("CONCATENATING BY RUNNING ARRAY FOR N TIMES:");
        System.out.println(Arrays.toString(arr1Conc(arr)));
        System.out.println("CONCATENATING BY RUNNING ARRAY FOR 2N TIMES:");
        System.out.println(Arrays.toString(arr2Conc(arr)));
        System.out.println("CONCATENATING USING NEW COMMAND WITHOUT LOOPS:");
        System.out.println(Arrays.toString(arr3Conc(arr)));
    }
    static int[] arr1Conc(int arr[]){
        int n = arr.length;
        int ans[] = new int[2*n];
        // HERE THE LOOP RUNS N TIME COS TWO OPRATIONS ARE BEING DONE
        for(int i = 0 ;i < n;i++){
            ans[i] = arr[i];
            ans[i+n]  = arr[i];
        }
        return ans;
    }
    static int[] arr2Conc(int arr[]){
        int n = arr.length;
        int ans[] = new int[2*n];
        // HERE THE LOOP RUNS 2N TIME COS OPRATIONS ARE BEING DONE FROM 0 TO N AND THEN N+1 TO 2N
        for(int i = 0 ;i<2*n;i++){
            if(i < n){
                ans[i] = arr[i];
            }
            else{
                ans[i]  = arr[i-n];
            }
        }
        return ans;
    }
    static int[] arr3Conc(int arr[]){
        int n = arr.length;
        int ans[] = new int[2*n];
        // HERE THERE IS NO LOOP RUNNING AS WE USED System.arraycopy() for copying the array 
        // USING THIS JAVA COMMAND IT COPIES AN ARRAY 
        // IT WORKS LIKE System.arraycopy( sourceArray, sourceStart, DestinationArray, DestinationStart, length )
        System.arraycopy(arr, 0, ans, 0, n );
        System.arraycopy(arr, 0, ans, arr.length, n);
        return ans;
    }
}
