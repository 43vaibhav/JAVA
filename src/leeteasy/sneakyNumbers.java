package leeteasy;
import java.util.ArrayList;
import java.util.Scanner;
public class sneakyNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        System.out.println("Enter the elements: ");
        int[] nums = new int[n];
        for(int i = 0; i <n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("Find the mischievous elements: ");
        int ans[] = getSneakyElements(nums);
        printArray(ans);
    }
    static int[] getSneakyElements(int nums[]){
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0 ; i< nums.length;i++){
            for(int j = i + 1;j< nums.length;j++){
                if(nums[i] == nums[j]){
                    ans.add(nums[i]);
                }
            }
        }
        int[] arr = new int[ans.size()];
        for(int i = 0 ; i< arr.length;i++){
            arr[i] = ans.get(i);
        }
        return arr;
    }
    static void printArray(int arr[]){
        for(int i = 0 ;i< arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
