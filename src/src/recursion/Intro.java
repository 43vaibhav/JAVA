package recursion;
public class Intro {
    public static void main(String[] args) {
        int count = 0;
        func(count);

    }
    static void func(int count){
        if(count == 4){
            return;
        }
        System.out.println(count);
        count++;
        func(count);
    }
}
