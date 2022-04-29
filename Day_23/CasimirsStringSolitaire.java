/*
    Junaeid As Jknight
    Somoy paile dekha koiro
    alap-adda-gopposob hobe
    cha or coffee er sathe.
------<<<<<<*>>>>>>>>-----
D-23
*/
import java.util.Scanner;
public class CasimirsStringSolitaire {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int count = 0, testCase = s.nextInt(),numB,len,inC;   s.nextLine();
        char c; String input;       
        while(count < testCase){
            input = s.nextLine(); numB = inC = len = 0; len = input.length();
            if(len < 2 || len%2 != 0){    System.out.println("NO");}
            else{
                while(inC < len){
                    c = input.charAt(inC);
                    if(c == 'B')++numB;     ++inC;
                }   len/=2;
                if(numB == 0){System.out.println("NO");}
                else if(len == numB){
                    System.out.println("YES");
                }else{System.out.println("NO");}
            }   ++count;
        }s.close();
    }
}
