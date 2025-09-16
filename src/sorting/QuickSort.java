package sorting;
import java.util.Scanner;
public class QuickSort {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NUMBER OF ELEMENTS:");
        int n= 5; // sc.nextInt();
        System.out.println();
        System.out.println("ENTER THE ARRAY:");
        int arr[] = {5,4,3,2,1}; //new int[n];
        for(int i = 0 ; i< n;i++){
            System.out.print(arr[i] + " : ");
        }
        // int arr[] = new int[n];
        // for(int i = 0 ; i< n;i++){
        //     arr[i] = sc.nextInt();
        // }
        System.out.println();
        System.out.print("SORTED ARRAY:");
        quickSort(arr,n);
    }
    static void quickSort(int arr[],int n){
        
    }

    }

