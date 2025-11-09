package unstop;
/*Problem Statement
King Luther has an army with N soldiers, each with an ID between 1 and N. The king wants to know how many soldiers in his army are "brave."

A soldier is considered "brave" if their ID has exactly two factors (or Divisors) and is not a perfect square.

Since King Luther is busy with his duties, he needs your help to count the number of "brave" soldiers in his army.

Your task is to count how many soldiers have "brave" IDs according to the criteria.

Input Format
The input contains only one integer N denoting the number of soldiers in the army.

Output Format
Print the count of brave soldiers in the army.

Constraints
1 ≤ N ≤ 10^6

Sample Testcase 0
Testcase Input
20
Testcase Output
8
Explanation
Only 8 numbers from 1 to 20 follow the brave criteria those are : 


2, 3, 5, 7, 11, 13, 17, 19.


It can be shown no number other than these follows the brave criteria.

Sample Testcase 1
Testcase Input
100
Testcase Output
25
Explanation
Only 25 numbers from 1 to 100 follow the brave criteria those are : 


2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97. 


It can be shown no number other than these follows the brave criteria */
import java.util.Scanner;
public class braveSoldiers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = countBraveSoldiers(n);
        System.out.println(result);

    }
    static int countBraveSoldiers(int n){
        int count = 0;
        int i =2;
        while(i<n){
            if(isPrime(i)){
                count++;
            }
            i++;
        }
        return count;
    }
    // Sieve of Eratosthenes 
    static boolean isPrime(int i){
        if(i == 2){
            return true;
        }
        if(  i % 2 == 0 ){
            return false;
        }
        for(int j = 3;j * j<=i;j+=2){
            if(i % j == 0){
                return false;
            }
        }
        return true;
    }
}
