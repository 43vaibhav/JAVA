package start1;
import java.util.Scanner;
public class CountDigits {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int cout = 0;
            while(n > 0){
                n = n/10;
                cout++;
            }
            System.out.println(cout);
        }

    }

}
