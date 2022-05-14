/*
    LESSON - NA GHUMIYE KAAJ KORLE, SIMPLE JINISH O VUL HOITE THAKE

    Junaeid As Jknight
    Somoy paile dekha koiro
    alap-adda-gopposob hobe
    cha or coffee er sathe.
------<<<<<<*>>>>>>>>-----
D-27
*/
import java.util.Scanner;
import static java.lang.Math.abs;
public class TwoSubstring {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String inp = s.nextLine();  s.close();
        int size = inp.length(), c = 0,ab=0,ba=0,abIndex=0,baIndex=0;
        char ch1;       boolean status = false;
        while(c < size){
            ch1 = inp.charAt(c);
            if((ch1 == 'A' || ch1 == 'B') &&  (c+1) < size){
                if(ch1 == 'A'){
                    if(inp.charAt(c+1) == 'B'){
                        if(ab < 1){
                            ++ab; abIndex = c+1;    
                        }else if(ba > 0 && c - baIndex >= 2){
                            System.out.println("YES"); status = true; break;
                        }
                    }
                }else{
                    if(inp.charAt(c+1) == 'A'){
                        if(ba < 1){
                            ++ba; baIndex = c+1;
                        }else if(ab > 0 && c - abIndex >= 2){
                            System.out.println("YES"); status = true; break;
                        }
                    }
                }
            }   ++c;
            if(ab > 0 && ba > 0){
                if(abs(abIndex - baIndex) >= 2){
                    System.out.println("YES"); status = true; break;
                }
            }
        }
        if(!status)System.out.println("NO"); 
    }
}



/* if(ch1 == 'A'){
    if(ab < 1){
        if(inp.charAt(c+1) == 'B'){++ab; c += 2;} else ++c;
    }else ++c;
}else{
    if(ba < 1){
        if(inp.charAt(c+1) == 'A'){++ba; c += 2;} else ++c;
    }else ++c;
} */
/* 
System.out.println("AB : "+abIndex+" BA : "+baIndex);
if(ab > 0 && ba > 0){
    if(abs(abIndex - baIndex) >= 2){
        System.out.println("YES"); status = true; break;
    }
} */
//abIndex = c+1;
//baIndex = c+1;