/*
    Junaeid As Jknight
    Somoy paile dekha koiro
    alap-adda-gopposob hobe
    cha or coffee er sathe.
------<<<<<<*>>>>>>>>-----
D-24
*/
import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), x = s.nextInt(),result=0; s.close();
        for (int i = 1; i <= n; i++) {
            if(x%i ==0){
                if(x/i <= n)++result;
            }
        }
        System.out.println(result);
    }
}

/*
--first approach using LCM
if(x == 1){
    System.out.println(1);
}else if(x > n*n){
    System.out.println(0);
}else{
    for (; i <= (int)sqrt(x) && i <= n; i++) {
        if(x%i==0){ 
            ++num;
            if(x/i < x && i*i != x && x/i < n){
                ++num;
            }
        }
    }
    ++num;  if(x > n)num-=2;    System.out.println(num);
} */