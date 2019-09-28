package Day_14;

import java.util.Scanner;

public class Dubstep {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String in = s.next();
        int i = in.length(),j=0,l=0;
        System.out.println(i);
        while(j<i){
            if(in.charAt(j) == 'W'){
                if(j+1 <i && in.charAt(j+1) == 'U'){
                    if(j+2<i && in.charAt(j+2) == 'B'){
                        j = j+3;
                    }
                }
            }else{
                while(j<i && in.charAt(j) != 'W'){
                    System.out.print(in.charAt(j)); j++;
                }
                System.out.print(" ");
            }
            System.out.println(j);
        }
    }
}
