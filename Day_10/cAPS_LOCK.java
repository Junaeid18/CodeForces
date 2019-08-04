package Day_10;

import java.util.Scanner;

public class cAPS_LOCK {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String in = s.next();
        int count = 1,size = in.length(),t=0,t1 =0;
        if(in.charAt(0) >= 'A' && in.charAt(0) <= 'Z'){
            t = 1;
        }else t=0;
        while(count < size){
            if(in.charAt(count) >= 'A' && in.charAt(count) <= 'Z'){
                t1 = 1;
                count++;
            }else{ t1 = 0; break;}
        }
        if(t == 0 && t1 == 1){
            in = in.toLowerCase();
            char c = Character.toUpperCase(in.charAt(0));
            String b = Character.toString(c);
            in = in.replaceFirst(Character.toString(in.charAt(0)),b);
            System.out.println(in);
        }else if(t == 1 && t1 == 1){
            in = in.toLowerCase();
            System.out.println(in);
        }else if(size == 1 && t == 0){
            in = in.toUpperCase();
            System.out.println(in);
        }else if(size == 1 && t == 1){
            in = in.toLowerCase();
            System.out.println(in);
        }
        else{
            System.out.println(in);
        }

    }
}
