/*
    Junaeid As Jknight
    Somoy paile dekha koiro
    alap-adda-gopposob hobe
    cha or coffee er sathe.
------<<<<<<*>>>>>>>>-----
D-26
*/
import java.util.Scanner;
public class GivenLenghtSumOfDigitsV2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder finalMin = new StringBuilder();
        String min="",max="";
        int m = sc.nextInt(), s = sc.nextInt(),c1 = m,rem = s;  sc.close();
        if(s == 0 || (m * 9) < s){
            if(s == 0 && m == 1)System.out.println("0 0");
            else System.out.println("-1 -1");
        }else{
            if(m > 1){
                while(c1 > 1){
                    if(rem > 9){
                        min += String.valueOf(9);   rem -= 9;
                    }else if(rem == 0){
                        min +=  String.valueOf(0);
                    }else{
                        rem = rem - 1;  min +=  String.valueOf(rem);  rem -= rem;
                    } --c1;
                }
                if(rem == 0)min +=  String.valueOf(1); else min +=  String.valueOf(rem);
                c1 = m; rem = s;
                while(c1 > 0){
                    if(rem > 9){
                        max += String.valueOf(9);   rem -= 9;
                    }else{
                        max += String.valueOf(rem);   rem -= rem;
                    } --c1;
                }
            }else{
                min = String.valueOf(s);    max = String.valueOf(s);
            }
            finalMin.append(min);   finalMin.reverse(); 
            System.out.println(finalMin+" "+max);
        }
    }   
}
