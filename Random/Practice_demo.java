import java.util.Scanner;

import javax.swing.text.html.FormView;
public class Practice_demo {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a = gcd(20,40);

        System.out.println(a);
        for (int i = 0; i < 10; i++) {
            if(i == 4){continue;}// break will stop the loop and continue will skip that situation in the loop
            System.out.println("Printing : "+i);    
        }

    }
    public static int gcd(int a, int b){
        if(b == 0){
            return a;
        }else{
            return gcd(b,a%b);
        }
    }
}
