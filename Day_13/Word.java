package Day_13;

import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String in = s.next();
        int i = in.length(),up = 0, down = 0,j =0;
        while (j < i){
            if (in.charAt(j) <= 'Z'){
                up++;
            }else down++;
            j++;
        }
        if (up > down){
            in = in.toUpperCase();
            System.out.println(in);
        }else{
            in = in.toLowerCase();
            System.out.println(in);
        }
    }
}
