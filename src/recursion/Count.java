package recursion;
import java.util.Scanner;
public class Count {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int  choice = sc.nextInt();
        if(choice == 1){
            PrintRev(n);
        }
        else{
            PrintFor(n);
        }
        sc.close();
    }
    static void PrintRev(int n){
        if(n==0){
            return;
        }
        System.out.print( n + " ");
        PrintRev(n-1);
    }
    static void PrintFor(int n){
        if(n == 0){
            return ;
        }
        PrintFor(n -1);
        System.out.print(n + " ");
        
    }
}
