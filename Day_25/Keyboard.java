/*
    Junaeid As Jknight
    Somoy paile dekha koiro
    alap-adda-gopposob hobe
    cha or coffee er sathe.
------<<<<<<*>>>>>>>>-----
D-25
*/
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
public class Keyboard {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Character[] ar = {'q','w','e','r','t','y','u','i','o','p','a','s','d','f','g','h','j','k','l',';','z','x','c','v','b','n','m',',','.','/'};
        ArrayList<Character> list = new ArrayList<>();
        Collections.addAll(list, ar);
        StringBuilder out = new StringBuilder();
        Character dir = s.nextLine().charAt(0),curCh;
        String input = s.nextLine();    int len = input.length(),dirVal,count=0,fInd;
        if(dir == 'L' || dir == 'l') dirVal=1; else dirVal = -1; 
        while(count < len){
            curCh = input.charAt(count);    fInd = list.indexOf(curCh);
            out.append(list.get(fInd+dirVal));  ++count;
        }
        System.out.println(out);
    }
}
