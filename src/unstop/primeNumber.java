package unstop;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/*Problem Statement
Given a number N. Your task is to create a program to calculate the N-th term of the Alice choice.

Alice's sequence consists of the squares of prime numbers: 2^2, 3^2, 5^2, 7^2, 11^2,13^2,17^2,19^2, 23^2, 29^2,…………

Input Format
The first line should contain only one line input given as number N.

Output Format
Output the square of the prime number at the N-th position in the sequence.

Constraints
1 <= N <= 10^5

Sample Testcase 0
Testcase Input
10
Testcase Output
841
Explanation
The Nth term is 841 It is one-based indexing, and by observing the pattern of the sequence then, all numbers are prime numbers and have to calculate the 10th term. So, The 10th number is 29, and its square is 841.

Sample Testcase 1
Testcase Input
3
Testcase Output
25
Explanation
The Nth term is 25 It is one-based indexing, and by observing the pattern of the sequence then, all numbers are prime numbers and have to calculate the 3rd term. 
So, the 3rd number is 5, and its square is 5^2 is 25. 
Sequence: 2, 3, 5 
Index.       : 1, 2, 3 */
class publicNumber {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = findnPrime(n);
        System.out.print((int)Math.pow(num,2));

    }
    static int findnPrime(int n){
        int count = 1;
        int i =2;
        while(count<=n){
            if(isPrime(i)){
                if(count == n){
                    return i;
                }
                count++;
            }
            i++;
        }
        return i;
    }
    static boolean isPrime(int i){
        if(i == 2){
            return true;
        }
        if(  i % 2 == 0 ){
            return false;
        }
        /*Optimised loop fro checking prime
         * so we start from j =3 cos 2 is prime 
         * now j * j makes the loop small and optimsd for large values
         * lets take i = 17 now jsq = 9 and 9 is less than 17 so loop runs
         * 17 % 3 != 0
         * next j +=2 so j is 5 now we are skipping eve numbers cos they 
         * are non prime or composite
         * jsq =  25 that is larger than 17 so loop stops and 17 is prime
         */
        for(int j = 3;j * j <= i;j+= 2){
            if(i % j == 0){
                return false;
            }
        }
        return true;
    } 
}
