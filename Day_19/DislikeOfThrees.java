import java.util.Scanner;
import java.util.ArrayList;
public class DislikeOfThrees {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i < 2000; i++) {
            String a = String.valueOf(i) ;  int size = a.length()-1;    char c = a.charAt(size);
            if(i % 3 != 0 && c != '3'){ list.add(i);}
        }
        int count = 0,k, testCase = s.nextInt();
        while(count < testCase){  k = s.nextInt();  System.out.println(list.get(k-1));  count++;}
    }    
}
