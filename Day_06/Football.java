package Day_06;

import java.util.Scanner;

public class Football {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int count = -1 , c = 0,n,one=0,zero=0;
        String t,status = null;
        while(count < 0){
            t = s.next();
            n = t.length();
            if(t.contains("0") && t.contains("1")){
                if(n > 7){
                    if(t.contains("0000000") || t.contains("1111111")){
                        status = "YES";
                        count++;
                    }else { status = "NO"; count++; }
                }else { status = "NO"; count++; }
            }
        }
        System.out.println(status);
    }
}
