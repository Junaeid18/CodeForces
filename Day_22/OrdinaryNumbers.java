/*
    Junaeid As Jknight
    Somoy paile dekha koiro
    alap-adda-gopposob hobe
    cha or coffee er sathe.
------<<<<<<*>>>>>>>>-----
*/
import java.util.Scanner;
import static java.lang.Math.pow;
public class OrdinaryNumbers {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String str,dig; int[] ar = new int[10];
        //for (int i = 1; i < ar.length; i++) {   ar[i] =(int) pow(10, i); }
        int count = 0, testCase = s.nextInt(),num,len,fdig,cNum,ordinary;
        while(count < testCase){
            num = s.nextInt();  str = Integer.toString(num);  len = str.length();
            if(len==1){System.out.println(num);}
            else{
                //dig = num/ar[len-1];
                dig = String.valueOf(str.charAt(0));    fdig = Integer.parseInt(dig);
                for (int i = 1; i < len; i++) {
                    dig += str.charAt(0);
                }
                cNum = Integer.parseInt(dig);
                if(num < cNum){
                    ordinary = (len-1) * 9 + fdig-1;
                }else{
                    ordinary = (len-1) * 9 + fdig;
                }
                System.out.println(ordinary);
            } ++count;
        }
    }
}
