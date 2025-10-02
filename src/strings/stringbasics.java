package strings;
import java.util.Scanner;
public class stringbasics {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        /* NEXTLINE IS USED FOR GETTING INPUT OF STRING WITH A SPACE 
         * WHEREAS NEXT JUST TAKES INPUT OR A STRING TILL A SPACE 
        */
        String s = sc.nextLine();
        String s1 = sc.next();
        System.out.println(s.indexOf('o'));
        System.out.println(s.compareTo(s1));


        
    }
}
