package unstop;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class publicNumber {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = findnPrime(n);
        System.out.print(Math.pow(num,2));

    }
    static int findnPrime(int n){
        int count = 0;
        int i =2;
        while(count!= n){
            if(isPrime(i)){
                count++;
            }
            i++;
        }
        return i;
    }
    static boolean isPrime(int i){
        int count = 1;
        
        for(int j = 1;j<=i;j++){
            if(i % j == 0){
                count++;
            }
        }
        if(count<3){
            return true;
        }
        return false;
    } 
}
