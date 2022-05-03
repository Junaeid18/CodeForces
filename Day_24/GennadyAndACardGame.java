/*
    Junaeid As Jknight
    Somoy paile dekha koiro
    alap-adda-gopposob hobe
    cha or coffee er sathe.
------<<<<<<*>>>>>>>>-----
D-24
*/
import java.util.Scanner;
import java.util.ArrayList;
public class GennadyAndACardGame {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        ArrayList<Character> flist = new ArrayList<>(); ArrayList<Character> llist = new ArrayList<>(); 
        int count = 5;    String input = s.nextLine(),chars;
        char a = input.charAt(0), b = input.charAt(1) ;
        while(count-- >= 1){
            chars = s.next();   flist.add(chars.charAt(0)); llist.add(chars.charAt(1));
        }s.close(); 
        if(flist.contains(a) || llist.contains(b)){ System.out.println("YES");}
        else{   System.out.println("NO");}
    }
}
