package start1;
import java.util.Scanner;
public class Ap {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt() ;
        /*a = 3
         * n = 1
         * d =3
         * an = 3+ 0*4
         * an = 3
         * an = 3+4 7 + 4 
        
         */
        for(int i =1;i<=n;i++){
            int an= a + (i-1)*d;
            System.out.println(an);
        }
         int x =sc.nextInt() ;
        int d1= sc.nextInt() ;
        int n1 =sc.nextInt() ;
        
        for (int i =0; i <n1;i++){
            System.out.println(x);
            x += d1;

        }
        sc.close();
    }

}
