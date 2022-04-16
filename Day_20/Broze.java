/*
    Junaeid As Jknight
    Somoy paile dekha koiro
    alap-adda-gopposob hobe
    cha or coffee er sathe.
------<<<<<<*>>>>>>>>-----
*/
import java.util.Scanner;
public class Broze {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        StringBuilder out = new StringBuilder("");
        String input = s.nextLine();    int count = 0, size = input.length();
        while(count < size){
            if(input.charAt(count) == '.'){out.append("0"); ++count;}
            else if(input.charAt(count) == '-' && input.charAt(count+1) == '.'){out.append("1"); count+=2;}
            else{out.append("2"); count+=2;}
        }
        System.out.println(out);
        s.close();
    }
}
