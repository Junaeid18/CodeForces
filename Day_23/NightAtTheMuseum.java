/*
    Junaeid As Jknight
    Somoy paile dekha koiro
    alap-adda-gopposob hobe
    cha or coffee er sathe.
------<<<<<<*>>>>>>>>-----
D-23
*/
import static java.lang.Math.abs;
import java.util.Scanner;
public class NightAtTheMuseum {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        char c,prevC='a'; String out = s.nextLine();  int len = out.length(),count = 0,sum=0;
        while(count < len){
            c = out.charAt(count);  sum += WheelRotate(prevC, c);   prevC = c;  ++count;
        }   System.out.println(sum);    s.close();
    }
    public static int WheelRotate(char x, char y){
        if(x == y){return 0;}
        else{   
            int result = abs(x-y);
            if(result > 13){    result = 13 - result%13;}    
            return result;}
    }
}
