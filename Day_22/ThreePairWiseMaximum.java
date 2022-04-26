/*
    Junaeid As Jknight
    Somoy paile dekha koiro
    alap-adda-gopposob hobe
    cha or coffee er sathe.
------<<<<<<*>>>>>>>>-----
D-22
*/
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class ThreePairWiseMaximum {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0, t = s.nextInt(),a,b,c;
        while(count < t){
            a = s.nextInt(); b = s.nextInt(); c = s.nextInt();
            if(a==b && b==c){System.out.println("YES"); System.out.println(a+" "+b+" "+c);}
            else{
                list.add(a);    list.add(b);    list.add(c);    Collections.sort(list);
                a=list.get(0); b=list.get(1); c=list.get(2);
                if(a <= b && b == c){
                    System.out.println("YES");  System.out.println(a+" "+a+" "+b);
                }else{System.out.println("NO");}
            }   list.clear();    ++count;
        }   s.close();
    }
}