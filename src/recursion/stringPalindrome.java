package recursion;
import java.util.Scanner;
public class stringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.print("THE STRING IS A PALINDROME:");
        boolean flag = false;
        int n = s.length() - 1;
        boolean ans = checkPalindrome(s, 0 ,n, flag);
        System.out.print(ans);
        sc.close();
    }
    static boolean checkPalindrome(String s, int i,int j, boolean flag){
        if(flag = false || i >=j){
            return flag;
        }
        if(s.charAt(i) == s.charAt(j)){
            flag = true;
        }
        checkPalindrome(s, i+1, j-1, flag);
        return flag;
    }
}
