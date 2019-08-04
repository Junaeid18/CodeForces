package Day_06;

import java.util.Scanner;

public class Petya_String {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String one = s.next();
        String two = s.next();
        one = one.toLowerCase();
        two = two.toLowerCase();
        int n = one.length(), count =0,res =0;
        while(count < n){
            if(one.charAt(count) == two.charAt(count)){
                res = 0;
                count++;
            }else if(one.charAt(count) > two.charAt(count)){
                res = 1;
                break;
            }else{
                res = -1;
                break;
            }
        }
        System.out.println(res);
    }
}
