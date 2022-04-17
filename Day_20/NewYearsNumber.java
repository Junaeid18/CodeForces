/*
    Junaeid As Jknight
    Somoy paile dekha koiro
    alap-adda-gopposob hobe
    cha or coffee er sathe.
------<<<<<<*>>>>>>>>-----
*/
import java.util.Scanner;
public class NewYearsNumber {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int count = 0,testCase = s.nextInt(),a,b,n;
        while(count < testCase){
            n = s.nextInt();
            if(n >= 2020){
                if(n%2020==0){System.out.println("YES");}
                else if(n%2021==0){System.out.println("YES");}
                else{
                    String nString = String.valueOf(n); int nLen = nString.length(), lastDigit = Character.getNumericValue(nString.charAt(nLen-1));   
                    a = n/2020; boolean res = false;
                    for (int i = lastDigit; i <= a; i+=10) {
                        b = (a-i)*2020 + i * 2021;
                        if(b == n) { res = true;   break;}
                    }
                    if(res){System.out.println("YES");}    else{System.out.println("NO");}
                }
            }
            else{System.out.println("NO");} ++count;
        }
    }
}
