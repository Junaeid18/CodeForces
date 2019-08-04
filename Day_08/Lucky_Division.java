package Day_08;

import java.util.Scanner;

public class Lucky_Division {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String in = s.next();
        int n = Integer.parseInt(in);
        while(n < 1 && n > 1000){
            System.out.println("here");
            in = s.next();
            n = Integer.parseInt(in);
        }
        int i = in.length(),count = 0;
        while(true){
            for (int j = 0; j < i; j++) {
                if(in.charAt(j) == '4' || in.charAt(j) == '7') count++;
            }if(count == i) break;
            else if(n%4 == 0 || n%7 == 0 || n%47 == 0|| n%74 == 0|| n%474 == 0|| n%44 == 0|| n%77 == 0|| n%444 == 0) {count = i; break;}
            else break;
        }
        if (count == i) System.out.println("YES");
        else System.out.println("NO");
    }
}
