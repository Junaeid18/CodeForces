package Day_11;

import java.util.Scanner;

public class Beautiful_Year {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String in = s.next(),res=null;
        int a=0,b=0,c=0,d=0;
        while(true){
            int n = Integer.parseInt(in);
            n++;
            in = Integer.toString(n);
            a = Integer.parseInt(String.valueOf(in.charAt(0)));
            b = Integer.parseInt(String.valueOf(in.charAt(1)));
            c = Integer.parseInt(String.valueOf(in.charAt(2)));
            d = Integer.parseInt(String.valueOf(in.charAt(3)));
            if(a != b){
                if(a!= c && b!= c){
                    if(a!=d && b!=d && c!=d){
                        res = in;
                        break;
                    }
                }
            }
        }
        System.out.println(res);
    }
}
