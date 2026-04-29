package recursion;
import java.util.Scanner;
public class stringRecursion {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE STRING: ");
        String s = sc .nextLine();
        System.out.println();
        System.out.println("AFTER REMOVING A FROM THE STRING:" );
        String ans = removeChar(0,s);
        System.out.println(ans);
        sc.close();
    }
    static String removeChar(int i, String s){
        
        if(i == s.length()){
            return "";
        }
        return (s.charAt(i) != 'a' ? s.charAt(i) : "")  + removeChar(i+1,s);
    }
}
