package unstop;

import java.util.ArrayList;
/*Problem Statement
Given an array of integers, determine if it exhibits a continuous mountain and valley pattern.

A continuous mountain and valley pattern means that the array elements strictly alternate between increasing and decreasing. That is:

Either a[0] < a[1] > a[2] < a[3] > a[4] ..., or

a[0] > a[1] < a[2] > a[3] < a[4] ....

Note:

If the array has only one element, return 1.

Input Format
The first line contains an integer n, the number of elements in the array.

The second line contains n space-separated integers.

Output Format
Print 1 if the array follows the continuous mountain and valley pattern, otherwise print 0.

Constraints
1 <= n <= 4 *10^3
0 <=elements  <= 10^4

Sample Testcase 0
Testcase Input
5
1 2 3 2 1
Testcase Output
0
Explanation
1 -> 2 -> 3 -> 2 -> 1
As 1 to 3 is increasing, that means values consistently do not alternate between increasing and decreasing. So the answer is 0.
Sample Testcase 1
Testcase Input
5
1 2 1 2 1
Testcase Output
1
Explanation
1 -> 2 -> 1 -> 2 -> 1
As values consistently alternate between increasing and decreasing. So the answer is 1 */
import java.util.Scanner;

public class mountainAndValleys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int result = isMountainValleyPattern(arr);
        System.out.println(result);
    }
    public static int isMountainValleyPattern(int[] arr) {
        if (arr.length == 1){
            return 1;
        }
        Stack<String> stack = new Stack();
        for(int i =0; i< arr.length -1;i ++){
            int j = arr[i+1];
            
            if(arr[i]>arr[j]){
                stack.push(">");
            }
            else{
                stack.push("<");
            } 
        }
        ArrayList<Character> list = new ArrayList<>(stack);
        for(int i = 0;i <list.size();i++){
            int j = i +1;
            list.get(i)
        }
        return 0;
    }
}
