/*
    Junaeid As Jknight
    Somoy paile dekha koiro
    alap-adda-gopposob hobe
    cha or coffee er sathe.
------<<<<<<*>>>>>>>>-----
D-22
*/
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
public class Sale {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();    
        int n = s.nextInt(), m = s.nextInt(),count = 0,sum=0;
        while(count < n){
            list.add(s.nextInt());  ++count;
        }   
        boolean exit = false;   Collections.sort(list); count = 0;
        while(count < m && !exit){
            if(list.get(count) < 0){sum += list.get(count);}    else{exit = true;}  ++count;
        }
        System.out.println(sum * -1);   s.close();
    }
}
