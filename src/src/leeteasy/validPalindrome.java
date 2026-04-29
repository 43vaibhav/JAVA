package leeteasy;
import java.util.Scanner;
public class validPalindrome {
    /*125. Valid Palindrome

A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

 

Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome. */
    public static void main(String srgs[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("STRING S : ");
        String s = sc.nextLine();
        System.out.println();
        System.out.println("THE STRING IS A PALINDROME: ");
        boolean ans = checkPalindrome(s);
        System.out.println(ans);
        sc.close();
    }
    static boolean checkPalindrome(String s){
        String ans = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int i = 0;
        int j = ans.length() - 1;
        while(i<j){
            if(ans.charAt(i) != ans.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;

    }
}
