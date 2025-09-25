package recursion;
import java.util.Scanner;
public class power {
public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE VALUE OF BASE : ");
        int p = sc.nextInt();
        System.out.println("ENTER THE VALUE OF POWER: " );
        int q = sc.nextInt();
        System.out.println();
        System.out.println("THE NUMBER IS: ");
        System.out.println(power(p,q));
        sc.close();
    }
    static int power(int p, int q){
        if(q==0){
            return 1;
        }
        if(q%2==0){
            int half =power(p,q /2);
            return half * half;
        }
        return p * power(p,q-1);

    }

}

