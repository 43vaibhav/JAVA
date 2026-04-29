package arrays;
import java.util.Scanner;
public class OneIndexingSUm {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i = 0 ; i<n;i++){
                arr[i] = sc.nextInt();
            }
            int left = sc.nextInt();
            int right = sc.nextInt();
            System.out.print(checkPrefixSum(arr,left,right));
        }
    }
    static int checkPrefixSum(int arr[],int left ,int right){
        int i = left - 1;
        int j = right -1;
        int sum = arr[i];

        while(i < j ){
            i++;
            sum += arr[i]  ;

            
            
        }

        return sum;
    }
}
