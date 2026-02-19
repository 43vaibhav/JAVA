package start1;
import java.util.Scanner;
public class Swap {
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)){
            int a = sc.nextInt();
            int b = sc.nextInt();
            Swap(a,b);
            
        }
        
        
    }
    public static void Swap(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a);
        System.out.println(b);
        
            
            
    }

}
