/*
    Junaeid As Jknight
    Somoy paile dekha koiro
    alap-adda-gopposob hobe
    cha or coffee er sathe.
------<<<<<<*>>>>>>>>-----
*/

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Collections;
public class Laptops {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0, n = s.nextInt(),a,b,element1,element2; 
        while(count < n){
            a = s.nextInt(); b = s.nextInt();
            if(a!=b){  map.put(a, b); } ++count;
        }
        if(map.size() < 2){System.out.println("Poor Alex");}
        else{
            ArrayList<Integer> byKey = new ArrayList<>(map.keySet());
            ArrayList<Integer> byValue = new ArrayList<>(map.values());
            Collections.sort(byKey);    element1 = map.get(byKey.get(0));
            Collections.sort(byValue);   element2 = byValue.get(0);
            if(element1 != element2 && element1 > element2){System.out.println("Happy Alex");}
            else{System.out.println("Poor Alex");}  
        } s.close();
    }    
}
