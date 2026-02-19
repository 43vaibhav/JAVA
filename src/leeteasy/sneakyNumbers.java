/* 3289. The Two Sneaky Numbers of Digitville

In the town of Digitville, there was a list of numbers called nums containing integers from 0 to n - 1. Each number was supposed to appear exactly once in the list, however, two mischievous numbers sneaked in an additional time, making the list longer than usual.

As the town detective, your task is to find these two sneaky numbers. Return an array of size two containing the two numbers (in any order), so peace can return to Digitville.

 

Example 1:

Input: nums = [0,1,1,0]

Output: [0,1]

Explanation:

The numbers 0 and 1 each appear twice in the array.

Example 2:

Input: nums = [0,3,2,1,3,2]

Output: [2,3]

Explanation:

The numbers 2 and 3 each appear twice in the array.

Example 3:

Input: nums = [7,1,5,4,3,4,6,0,9,5,8,2]

Output: [4,5]

Explanation:

The numbers 4 and 5 each appear twice in the array.

*/ 
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
