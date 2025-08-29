/*

Alice and Bob are playing a turn-based game on a field, with two lanes of flowers between them. There are x flowers in the first lane between Alice and Bob, and y flowers in the second lane between them.
Example 1:

Input: n = 3, m = 2
Output: 3
Explanation: The following pairs satisfy conditions described in the statement: (1,2), (3,2), (2,1).
Example 2:

Input: n = 1, m = 1
Output: 0
Explanation: No pairs satisfy the conditions described in the statement.
*/
package leetmed;
import java.util.Scanner;
public class AliceBobFlowerGame {
    public static void main(String args[]){
        try(Scanner sc =  new Scanner(System.in)){
            System.out.println("Enter the value of N:");
            int n = sc.nextInt();
            System.out.println("Enter the value of M:");
            int m = sc.nextInt();
            System.out.println( flowerGame(n,m));

        }
    }
    static long flowerGame(int n, int m){
        long CountOdd= 0;
        long totalCount= m * n;
        if( n <= 1 && m <=1){
            return CountOdd;
        }
        if(totalCount % 2 == 0){
            CountOdd = totalCount / 2;
        }
        else {
            CountOdd = (totalCount - 1) / 2;
        }
        return CountOdd;
    }
}
