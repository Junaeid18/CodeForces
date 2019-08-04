package Day_10;

import java.util.Scanner;

public class HQ9plus {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String in = s.next();
        int count = 0,i =0,l = in.length();
        while(count < l){
            if(in.charAt(count) == 'H' || in.charAt(count) == 'Q' || in.charAt(count) == '9'){
                i = 1;
                break;
            }else{
                count++;
            }
        }
        if(i == 1) System.out.println("YES");
        else System.out.println("NO");
    }
}
