package leeteasy;
import java.util.Scanner;
import java.util.Arrays;

public class commonPrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] strs = new String[n];
        for(int i = 0;i<n;i++){
            strs[i] = sc.nextLine();
        } 
        String result = longestCommonPrefix(strs);
        System.out.println(result);
    }
    static String longestCommonPrefix(String[] strs){
        Arrays.sort(strs);
        return strs[0];
    }
}
