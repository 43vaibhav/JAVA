package sorting;
import java.util.Scanner;
public class QuickSort {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("ENTER NUMBER OF ELEMENTS:");
            int n= sc.nextInt();
            System.out.println();
            System.out.println("ENTER THE ARRAY:");
            int arr[] = new int[n];
            for(int i = 0 ; i< n;i++){
                arr[i] = sc.nextInt();
            }
            System.out.println();
            System.out.print("SORTED ARRAY:");
            System.out.println();
            quickSort(arr,0,n-1);
            for(int i = 0 ;i<arr.length;i++){
                System.out.print(arr[i] + " ");
            }
        }
    }

    static void quickSort(int arr[],int st,int end){
        if(st<end){
            int pi = partition(arr,st,end);
            quickSort(arr, st, pi-1);
            quickSort(arr, pi + 1, end);
        }

    }
    static int partition(int arr[],int st, int end){
        int pivotIdx = st;
        int pivot= arr[pivotIdx];
        int count = 0;
        for(int i = st + 1;i<=end;i++){
            if(arr[i] <= pivot) count++;
        }
        pivotIdx = st  + count;
        Swap(arr,st,pivotIdx);
        int i =st;
        int j = end;
        while(i  < pivotIdx && j > pivotIdx){
            if(arr[i]<= pivot){
                i++;
            }
            else if(arr[j]>pivot){
                j--;
            }
            else {
                Swap(arr,i,j);
                i++;
                j--;
            }
        }
        return pivotIdx;
    }
    static void Swap(int arr[],int i,int j){
        int temp = arr[j];
        arr[j]  =arr[i];
        arr[i] = temp;
    }
}


