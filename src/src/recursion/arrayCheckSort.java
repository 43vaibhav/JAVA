package recursion;

public class arrayCheckSort {
    public static void main(String args[]) {
        int arr[] = {2,4,4,5,6};
        boolean ans = checkSort(arr, 0);
        System.out.println("Is array sorted? " + ans);
    }

    static boolean checkSort(int arr[], int i) {
        // Base case: if we've reached the end of array, it's sorted
        if (i == arr.length - 1) {
            return true;
        }
        
        // Check if current element is less than or equal to next element
        // AND recursively check rest of the array
        return arr[i] <= arr[i + 1] && checkSort(arr, i + 1);
    }
}