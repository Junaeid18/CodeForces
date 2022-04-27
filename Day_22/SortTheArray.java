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
public class SortTheArray {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int count = 1, n = s.nextInt(), max,min,maxPos,minPos,rand,a,oneTime=0;    
        boolean possible = true;
        rand = a = max = s.nextInt();   maxPos=minPos=0; list.add(a);
        while(count < n){
            a = s.nextInt();    if(a > rand && possible){rand = a;  list.add(a); ++count;}else{
                minPos = count;    maxPos = count-1;  max = rand;   min = a;    list.add(a);  ++count;
                while(count < n && possible){
                    a = s.nextInt(); if(a < min && possible){min = a; minPos = count; list.add(a);}
                    else{   if(a < max){ possible=false;}else{
                        max = a;  ++count;
                        while(count < n){ a = s.nextInt(); if(a < max){possible=false;} ++count;} --count;
                    }   }   ++count; 
                    if(!possible){
                        while(count < n){a = s.nextInt(); ++count;} System.out.println("no");
                    }
                }
            }
        }   
        if(possible){
            if(maxPos>0){
                int chk1 = list.get(maxPos-1); int chk2 = list.get(minPos);
                if(chk1>chk2){System.out.println("no");}
                else{   System.out.println("yes");   System.out.println((maxPos+1) +" "+ (minPos+1));}
            }else{System.out.println("yes");    System.out.println((maxPos+1) +" "+ (minPos+1));}
        } s.close();
    }   
}
