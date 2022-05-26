import java.util.Scanner;
import java.util.concurrent.CountDownLatch;
public class Statics {
    static{
        System.out.println("HELLO Brother");
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        StringBuilder out = new StringBuilder();
        System.out.println(Chekcing.multi(9, 9));
        Chekcing ch = new Chekcing();
        System.out.println(ch.multi(3, 3));
    }
}
class Chekcing{
    static int a = 10;
    protected static int multi(int a,int b){
        return a*b;
    }
}