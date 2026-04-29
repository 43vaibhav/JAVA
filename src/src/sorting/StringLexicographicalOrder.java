package sorting;

import java.util.Scanner;
public class StringLexicographicalOrder {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NUMBER OF ELEMENTS:");
        int n = sc.nextInt();
        String s[] = new String[n];
        for(int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        callSorted(s,n);
        printString(s);
        sc.close();

    }
    static void callSorted(String s[] , int n){
        for(int i = 0;i<n-1;i++){
            int k = i;
            for(int j = i+1;j<n;j++){
                if(s[j].compareTo(s[k]) < 0){
                    k = j;
                }
            }
            Swap(s,i,k);
        }
    }
    static void Swap(String s[] , int i, int k){
        String temp = s[k];
        s[k] = s[i];
        s[i] = temp;
    }
    static void printString(String s[]){
        int n = s.length;
        for(int i = 0;i<n;i++){
            System.out.print(s[i] + " ");
        }
    }
}
