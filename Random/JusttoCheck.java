import java.util.Scanner;
public class JusttoCheck extends Junaeid{
    static int a;
    static{
        System.out.println("Junaeid is the boss");
        a = 10;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int b = 20/0;
        //System.exit(0);
        System.out.println("Let's see");
        JusttoCheck j = new JusttoCheck();
        System.out.println(j.compute(10, 15));

    }
}

abstract class Junaeid{
    int compute(int a,int b){
        return a+b;
    }
}