package leeteasy;
import java.util.Scanner;
public class UniqueSum {
    /*1304. Find N Unique Integers Sum up to Zero
Solved
Easy
Topics
premium lock icon
Companies
Hint
Given an integer n, return any array containing n unique integers such that they add up to 0.

 

Example 1:

Input: n = 5
Output: [-7,-1,1,3,4]
Explanation: These arrays also are accepted [-5,-1,1,2,3] , [-3,-1,2,-2,4].
Example 2:

Input: n = 3
Output: [-1,0,1]
Example 3:

Input: n = 1
Output: [0]
 */
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF ELEMENTS:");
        int n = sc.nextInt();
        System.out.println("RESULTING SUM:");
        int ans[] = sumZero(n);
        printArray(ans);
    }
    static int[] sumZero(int n){
        int arr[] = new int[n];
        int element = 1;
        int i = 0;
        if(n%2!=0){
            arr[i]= 0;
            i++;
        }
        while(i<n){
            arr[i]  = element;
            arr[i + 1] = -element;
            element++;
            i+=2;
        }
        return arr;
    }
    static void printArray(int arr[]){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
