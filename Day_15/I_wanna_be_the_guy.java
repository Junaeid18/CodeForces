//package Day_15;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class I_wanna_be_the_guy {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> ar = new ArrayList<Integer>();
        int lvl = s.nextInt(),plvl,count = 0, passedlvl;
        while(count < 2){
            plvl = s.nextInt();
            if(plvl > 0){
                int incount = 0;
                while(incount < plvl){
                    passedlvl = s.nextInt();
                    if(!ar.contains(passedlvl)){
                        ar.add(passedlvl);
                    }
                    ++incount;
                }
            }
        ++count;
        }
        if(ar.size() == lvl){
            System.out.println("I become the guy.");
        }else{
            System.out.println("Oh, my keyboard!");
        }
    }
}
