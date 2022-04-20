/*
    Junaeid As Jknight
    Somoy paile dekha koiro
    alap-adda-gopposob hobe
    cha or coffee er sathe.
------<<<<<<*>>>>>>>>-----
*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class LengthAndSum489C {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int m = s.nextInt(), sum = s.nextInt(), rem = sum, len = m, count = 0;
        String res = "",res2 = "";    StringBuilder minNum = new StringBuilder();
        StringBuilder minBuild = new StringBuilder();
        if(sum == 0 || (m * 9) < sum){
            if(sum == 0 && m == 1){System.out.println(0+" "+0);}
            else{  System.out.println(-1 +" "+ -1);}
        }else{
            while(count < m){
                if(rem >= 9){
                    res += "9"; rem -= 9;   --len;
                }else if(len > 0 || rem >=0){
                    int nextDigit = rem; res += String.valueOf(nextDigit);  rem -= nextDigit;  --len;
                }
                count++;
            }
            minBuild.append(res).reverse();
            if(Character.getNumericValue(minBuild.charAt(0)) == 0){
                StringBuilder special = new StringBuilder(); boolean inside = false;
                for (int i = 0; i < m; i++) {
                    if(Character.getNumericValue(minBuild.charAt(i)) == 0){  special.append('0');}
                    else if(!inside && Character.getNumericValue(minBuild.charAt(i)) != 0){
                        minNum.append(minBuild.charAt(i));
                        minNum.append(special); inside = true;
                    }else{
                        minNum.append(minBuild.charAt(i));
                    }
                }
                System.out.println(minNum+" "+res);
            }else{
                minNum.append(res).reverse();
                System.out.println(minNum+" "+res);
            }

        }
    }    
}
