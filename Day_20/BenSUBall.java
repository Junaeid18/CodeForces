import java.util.ArrayList;
import java.util.Scanner;
import java.lang.*;
import java.util.Collections;
public class BenSUBall {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        int n = s.nextInt(), count = 0;
        for (int i = 0; i < n; i++){   a.add(s.nextInt());  }
        int m = s.nextInt();
        for (int i = 0; i < m; i++) {   b.add(s.nextInt()); }
        Collections.sort(a);    Collections.sort(b);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(Math.abs(a.get(i) - b.get(j)) <= 1){
                    b.set(j, 200);
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }    
}
