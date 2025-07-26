package hackerrankprep;
import java.util.Scanner;
public class TimeConeversion {
    public static void main(String[] args) {
         try( Scanner sc = new Scanner(System.in)){
            String s = sc.nextLine();
            /*07:00:05AM
              0123456789 */

            StringBuilder sb = new StringBuilder(s);
            
            if(s.charAt(8)== 'P'){  
                if(sb.charAt(0)== '1' && sb.charAt(1) == '2'){
                     sb.replace(0,2,"12");
                }
                else {
                    sb.replace(0, 2, String.valueOf(Integer.parseInt
                    (sb.substring(0,2)) + 12));
                }
                
            }
            if(s.charAt(8) == 'A'){
                if (sb.charAt(0)== '1' && sb.charAt(1) == '2')  {
                    sb.replace(0,2,"00");  
                }
            }
            
            System.out.print(sb.delete(8,10));
            
        }   
    }

}

