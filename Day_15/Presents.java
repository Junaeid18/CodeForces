//package Day_15;
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
public class Presents {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> li1 = new ArrayList<Integer>();
        int num = s.nextInt(),count = 0;
        while(count < num){
            li1.add(s.nextInt());
            ++count;
        }
        ArrayList<Integer> li2 = (ArrayList<Integer>)li1.clone();
        Collections.sort(li2);
        count = 0;
        while(count < num){
            int el = li2.get(count);
            int ind = li1.indexOf(el);
            System.out.print(ind+1+" ");
            ++count;
        }
        System.out.println();
    }
}
