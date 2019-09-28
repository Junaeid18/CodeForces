import java.util.Arrays;
import java.util.Scanner;

public class Amusing_Joke {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String in = s.next(), in2 = s.next(), mixed = s.next(), combo = in + in2;
        int l = combo.length(), l2 = mixed.length(),i=0,j=0,k=0;
        char[] ch = combo.toCharArray(); char[] ch2 = mixed.toCharArray();
        Arrays.sort(ch); Arrays.sort(ch2);
        if(l < l2 || l > l2){
            System.out.println("NO");
        }else{
            while (i < l && j < l2){
                if (ch[i] == ch2[j]) {i++; j++;}
                else if(ch[i] > ch2[i]) j++;
                else { i =200;break; }
            }
            if(i == l){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
