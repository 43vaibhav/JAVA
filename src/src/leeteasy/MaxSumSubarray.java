package leeteasy;
import java.util.Arrays;
import java.util.Scanner;
public class MaxSumSubarray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums =  new int[n];
        for(int i = 0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println(maxSum(nums));
        sc.close();

    }
       
    public static int maxSum(int[] nums) {
        Arrays.sort(nums);
        int prev = nums[nums.length - 1];
        int sum = prev;
        for (int i = nums.length - 2; i >= 0; i--) {
            int n = nums[i];
            if (n <= 0) {
                return sum;
            } else if (n != prev) {
                sum = sum + n;
            }
            prev = n;
        }
        return sum;
    }

}

