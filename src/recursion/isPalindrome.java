package recursion;
import java.util.Scanner;
public class isPalindrome {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length() -1;
        boolean ans = checkPalindrome(s,0,n);
        System.out.println("THE STRING IS A PALOINDROME: ");
        System.out.println(ans);
    }
    static boolean checkPalindrome(String s,int i, int j){
        if(i>=j){
            return true;
        }
        if(s.charAt(i)!= s.charAt(j)){
            return false;
        }
        
        return checkPalindrome(s, i+1, j-1);
    }
}
