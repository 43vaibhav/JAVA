package hackerrankprep;
import java.util.Scanner;
public class MatchingString {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int m =sc.nextInt();
        String[] s = new String[m];
        for(int i = 0;i<m;i++){
            s[i] = sc.next();
        }
        
        int n = sc.nextInt();
        String[] q = new String[n];
        for(int i =0;i<n;i++){
            q[i]= sc.next();
        }        
       
        MatchString(m,s,n,q);
        sc.close();
    }
    public static void MatchString(int  m ,String[] s,int n , String[] q) {
        int[] res= new int[n];
        for(int i = 0;i<n;i++){
            int cout = 0;
            for(int j = 0;j<m;j++){
                if(q[i].equals(s[j])){
                    cout++;
                }
            }
            res[i] = cout; 
        }
        for(int i = 0;i<n;i++){
            System.out.println(res[i]);
        }
    } 
}
