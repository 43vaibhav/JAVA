package leeteasy;
import java.util.Scanner;
public class isPalindromeNumber {
    /*9. Palindrome Number

Given an integer x, return true if x is a palindrome, and false otherwise.

 

Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
  */
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("THE INTEGER IS A PALINDROME: ");
        boolean ans = checkPalindrome(x);
        System.out.println(ans);
        sc.close();
    }
    static boolean checkPalindrome(int x){
        String s = String.valueOf(x);
        int i = 0;
        int j = s.length() -1;
        if(i==j){
            return true;
        }
        while(i<j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
