/*
    Junaeid As Jknight
    Somoy paile dekha koiro
    alap-adda-gopposob hobe
    cha or coffee er sathe.
------<<<<<<*>>>>>>>>-----
D-25
*/
import java.util.Scanner;
import java.util.ArrayList;
import static java.lang.Math.abs;
public class LinearKeyboard {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        StringBuilder out = new StringBuilder();
        ArrayList<Character> list = new ArrayList<>();
        String letters,input;
        int testCase = s.nextInt(),len1,len2,c,sum; s.nextLine();
        while(testCase-- > 0){
            letters = s.nextLine();  input = s.nextLine();   len1 = letters.length();    len2 = input.length();  c = sum = 0;
            list.clear();    list.add('5');
            while(c < len1){list.add(letters.charAt(c)); ++c;}  c = 1;
            while(c < len2){
                sum += abs(list.indexOf(input.charAt(c-1)) - list.indexOf(input.charAt(c))); ++c;
            }
            out.append(sum+"\n");
        }
        System.out.print(out);
    }
}
