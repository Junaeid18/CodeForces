import java.util.Scanner;
import java.util.ArrayList;
public class Do_Not_be_Distracted {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        ArrayList<Character> list = new ArrayList<>();
        int count = 0,innerC,n, testCase = s.nextInt();
        boolean flag;
        while(count < testCase){
            n = s.nextInt();    innerC = 1;    flag = false;
            String c = s.next();    list.add(c.charAt(0));
            while(innerC < n){
                char c2 = c.charAt(innerC);
                if(list.contains(c2)){
                    if(list.get(innerC-1) != c2){
                        flag = true;
                    }
                }   list.add(c2);   innerC++;
            }
            if(flag){System.out.println("NO");}
            else{System.out.println("YES");}
            list.clear();
            count++;
        }
    }    
}
