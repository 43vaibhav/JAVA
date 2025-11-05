package pattern;
import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int rows = 0;rows<n;rows++){
            for(int star = 0; star <= rows;star++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
   
    
}
