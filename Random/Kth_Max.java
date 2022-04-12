import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Kth_Max {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), k = s.nextInt();
        ArrayList<Integer> ai = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ai.add(s.nextInt());   
        }
        Collections.sort(ai,Collections.reverseOrder());
        System.out.println(ai.get(k-1));
    }    
}
