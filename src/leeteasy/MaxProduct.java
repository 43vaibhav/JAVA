package leeteasy;
import java.util.Scanner;
public class MaxProduct {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int[] nums = new int[n];
            for(int i = 0;i<n;i++){
                nums[i] = sc.nextInt();
            }
            System.out.print(maxProduct(nums));
        }
    }
    public static int maxProduct(int nums[]) {
        int a = FindMax(nums) - 1;
        int b= SecondMax(nums) -1;
        return a* b;
    }
    public static int FindMax(int nums[]) {
        int ans = Integer.MIN_VALUE;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] > ans){
                ans = nums[i];
                
            }
           
        }
        return ans;
        
    }
    public static int SecondMax(int nums[]){
        int ans = FindMax(nums);
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == ans){
                nums[i] = Integer.MIN_VALUE;
                break;
            }          
        }
        int sMax = FindMax(nums);
        return sMax;
    }

}
