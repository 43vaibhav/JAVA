package leeteasy;
import java.util.Scanner;
public class PowerOf4 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            System.out.print(check4(n));
        }
    }
    static boolean check4(int n){
        while(n > 1){
            if(n%4 != 0){
                return false;
            }
            n=n/4;
        }
        return n == 1;
    }
    

}
