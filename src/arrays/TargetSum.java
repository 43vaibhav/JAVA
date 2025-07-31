package arrays;
import java.util.Scanner;
public class TargetSum {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        /* find pairs in an array with sum is equal to taregt */
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int cout = 0;
        int target = sc.nextInt();
        for(int i =0 ; i<arr.length;i++){
            for(int j = i +1;j<arr.length;j++) {
                if(arr[i] + arr[j] == target ) {

                    cout++;
                
                }
            }

        }
        System.out.println(cout);
        
    }

}
