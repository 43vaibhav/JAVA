package leeteasy;
import java.util.Scanner;
public class PowerOf3 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n  =sc.nextInt();
            System.out.println(check3(n));
        }
        
    }
    static boolean check3(int n){
        while(n>1){
            if (n%3 != 0) return false;
            n /= 3;
        }
        return n == 1;
    }

}
