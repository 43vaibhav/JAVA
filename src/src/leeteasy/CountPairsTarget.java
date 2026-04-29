package leeteasy;
import java.util.Scanner;
public class CountPairsTarget {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int[] nums= new int[n];
            for(int i = 0;i<nums.length;i++){
                nums[i] = sc.nextInt();
            }
            int target = sc.nextInt();
            int ans = 0;
         
            for(int i = 0;i<nums.length;i++){
                for(int j= i +1;j < nums.length;j++){
                    if((i < j ) && (nums[i] + nums[j] < target)){
                        ans++;
                    }                
                }
            }
            System.out.println(ans);


        }
        
    }

}
