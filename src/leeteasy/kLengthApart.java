package leeteasy;
import java.util.Scanner;
public class kLengthApart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums= new int[n];
        for(int i = 0;  i< n;i++){
            nums[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println("All 1's Are at Least Length "+ k + " Places Away");
        System.out.println(solution(nums,k));
    }
    static boolean solution(int nums[], int k){
        int j = -1;
        for(int i =0;i<nums.length;i++){
            if(nums[i] == 1){
                j = i;
            }
            break;
        }
        for(int i = j+1;i<nums.length;i++){
            int a=-1;
            if(nums[i] == 1){
                a = i;

            }
            if(a - j - 1 >=2){
                continue;
            }
        }
        return false;
    }
}
