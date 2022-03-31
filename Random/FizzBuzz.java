import java.util.Scanner;
public class FizzBuzz {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int v1 = 0, v2 = 0, v3 = 0;
        String msg;
        for (int i = 1; i <= 100; i++) {
            v1++; v2++; v3++;   msg = "";
            if(v1 == 3) {msg += "Fizz"; v1 = 0; }
            if(v2 == 5) {msg += "Buzz"; v2 = 0; }
            if(v3 == 10) {msg += "Cizz"; v3 = 0; }
            if(msg == ""){
                System.out.println(i);
            }else{
                System.out.println(msg);
            }
        }
    }    
}
