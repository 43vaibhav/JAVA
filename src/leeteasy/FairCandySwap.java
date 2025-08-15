package leeteasy;
import java.util.Scanner;
public class FairCandySwap {
        public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int[] as = new int[n];
            for(int i = 0;i<n;i++){
               as[i] = sc.nextInt();
            }
            int m = sc.nextInt();
            int[] bs = new int[m];
            for(int i = 0;i<m;i++){
                bs[i] = sc.nextInt();
            }
            Solution(as,bs);
            
        }
    }
    public static void Solution(int[] as, int[] bs){
        
        for(int i  =0;i<as.length;i++){
            for(int j = 0;j<bs.length;j++){
                Swap(as,bs,i,j);
                if(SumAs(as,i)== SumBs(bs,j)){
                    Swap(as, bs, i, j);
                    System.out.print(as[i] + " "+ bs[j]);
                    return ;
                }
                Swap(as, bs, i, j);
            }
        }
        
        
    }
    static void Swap(int[] as,int[] bs,int i,int j){
        int temp = as[i];
        as[i] = bs[j] ;
        bs[j] = temp;
    }
    static int SumAs(int[] as,int i){
        int sumAs= 0;
        for(int a = 0;a<as.length;a++){
            sumAs = as[a] + sumAs;
        }
        return sumAs;
    }
    static int SumBs(int[] bs,int j){
        int sumBs= 0;
        for(int b = 0;b<bs.length;b++){
            sumBs = bs[b] + sumBs;
        }
        return sumBs;
    }    
}
