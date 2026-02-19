package sorting;

import java.util.Scanner;
public class ZeroesAtTail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE ELEMENTS:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("ENTER THE ARRAY:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        callSolution(arr,n);
        printArray(arr);
        sc.close();
    }
    static void callSolution(int arr[], int n){
        int j = 0;
        for(int i = 0;i<n;i++){
            if(arr[i] == 0){
                j = i;
                break;
            }
        }
        if(j==n-1){
            return;
            
        }
        else{
            int i = j+1;
            while(i<n){
                if(arr[i] != 0){
                    Swap(arr,i,j);
                    j++;
                }
                i++;
            }
        }
        

    }
    static void Swap(int arr[],int i,int j){
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
    static void printArray(int arr[]){
        for(int num:arr){
            System.out.print(num + " ");
        }
    }
}
