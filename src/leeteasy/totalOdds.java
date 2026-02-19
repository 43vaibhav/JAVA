/* 1523. Count Odd Numbers in an Interval Range
Solved
Easy
Topics
premium lock icon
Companies
Hint
Given two non-negative integers low and high. Return the count of odd numbers between low and high (inclusive).

 

Example 1:

Input: low = 3, high = 7
Output: 3
Explanation: The odd numbers between 3 and 7 are [3,5,7].
Example 2:

Input: low = 8, high = 10
Output: 1
Explanation: The odd numbers between 8 and 10 are [9].*/
package leeteasy;
import java.util.Scanner;
public class totalOdds {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int high = sc.nextInt();
        if (high - low > 100){
            optimisedMethod(low,high);
        }
        else{
            bruteForce(low,high);
        }
    }
    static int bruteForce(int low,int high){
        int count = 0;
        
    }

}
