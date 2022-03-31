import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Holiday_of_Equality {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> li = new ArrayList<>();
        int count = 0, total = 0,input, n = s.nextInt();
        while(count < n){
            input = s.nextInt();    li.add(input);
            ++count;
        }
        if(n == 1){
            System.out.println(0);
        }else{
            Collections.sort(li);   int l = li.size() - 1;  int max = li.get(l);
            for (int i = 0; i <= l; i++) {
                total += (max -  li.get(i));
            }  
            System.out.println(total);
        }
    }
}
