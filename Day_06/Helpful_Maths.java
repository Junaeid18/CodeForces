package Day_06;

import java.util.Scanner;

public class Helpful_Maths {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = 0, count = 0 ,one = 0 , two = 0 ,three = 0;
        String in = null,res = null;
        while(size < 1){
            in = s.next();
            size = in.length();
        }
        while(count < size){
            if(count % 2 == 0){
                char c = in.charAt(count);
                if(c == '1') one++;
                else if(c == '2') two++;
                else three++;
                count++;
            }else count++;
        }
            if(res == null){
                if(one > 0){
                    res = "1"; one--;
                }else if(two > 0){
                    res = "2"; two--;
                }else { res = "3"; three--; }
            }
            if(one > 0){
                String on = "+1";
                while(one > 0){
                    res = res.concat(on);
                    one--;
                }
            }
            if(two > 0){
                String tw = "+2";
                while(two > 0){
                    res = res.concat(tw);
                    two--;
                }
            }
            if(three > 0){
                String on = "+3";
                while(three > 0){
                    res = res.concat(on);
                    three--;
                }
            }
        System.out.println(res);

    }
}
