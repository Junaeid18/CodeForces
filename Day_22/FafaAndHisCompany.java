/*
    Junaeid As Jknight
    Somoy paile dekha koiro
    alap-adda-gopposob hobe
    cha or coffee er sathe.
------<<<<<<*>>>>>>>>-----
*/
import java.util.Scanner;
import static java.lang.Math.sqrt;
public class FafaAndHisCompany {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int n = s.nextInt(), num = (int)sqrt(n),result=0;  
    for (int i = 1; i <= num; i++) {
        if(n%i==0){
            ++result;
            if(n/i < n && i*i != n){    ++result;}
        }
    }   System.out.println(result);
  }  
}
