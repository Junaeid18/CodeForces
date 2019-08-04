package Day_06;

import java.util.Scanner;

public class Bit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = 0,count=0,c=0;
        while(n < 1 || n > 150){
            n = s.nextInt();
        }
        while(count < n){
            String st = s.next();
            if(st.equals("X++") || st.equals("x++") || st.equals("++X") || st.equals("++x")){
                c++;
            }else { c--; }
            count++;
        }
        System.out.println(c);
    }
}
