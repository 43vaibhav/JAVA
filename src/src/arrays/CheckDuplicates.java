package arrays;
import java.util.Scanner;
public class CheckDuplicates {
    public static void main(String[] args) {
        try(Scanner sc= new Scanner(System.in)){
            int n = sc.nextInt();
            System.out.println("Enter the array:");
            int nums[] = new int[n];
            for(int i = 0;i < n;i++){
                nums[i] = sc.nextInt();
            }
            System.out.println(checkArray(nums));
            

        }
    }
    static int checkArray(int nums[]){
        int n = nums.length;
        int i = 0;
        int j = i +1;
        int unique = 1;
        while(j< n){
            if(nums[i] == nums[j]){
                i+=2;
                j+=2;                
            }
            else{
                
                i++;
                j++;
            }
            unique++;

        }
        // if(n % 2 != 0){
        //     unique += 1;
        // }
        return unique;
    }
}
