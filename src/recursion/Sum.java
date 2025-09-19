package recursion;
import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Print 'MY NAME IS VAIBHAV' "+ n + "TIMES:");
        Sum(n);
        sc.close();
    }
    static void Sum(int n){ 
        /*PRINTING NAME N TIMES */
        if(n==0){
            return;
        }
        System.out.println("MY NAME IS VAIBHAV");
        n--;
        Sum(n);
        
    }

}
