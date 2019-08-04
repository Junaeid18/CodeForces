package Day_08;

import java.util.Scanner;

public class Chat_room {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String in = s.next(),out = "hello";
        int i = 0, j =0,k = in.length(),count=0;
        while(count < k){
            if(out.charAt(i) == in.charAt(j)){
                if(i <= 5 && j < k){
                    i++;j++;
                    if (i == 5) break;
                }else break;
            }else j++;
            count++;
        }
        if (i == 5) System.out.println("YES");
        else System.out.println("NO");
    }
}
