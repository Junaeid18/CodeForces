import java.util.Scanner;
import java.util.ArrayList;
public class Anton_And_Letters {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        ArrayList<Character> list = new ArrayList<Character>();
        int count = 0,index = 0;  char c;
        String input = s.nextLine();
        c = input.charAt(index); ++index;
        if(c == '{'){
            while(c != '}'){
                c = input.charAt(index);
                if(c >= 'a' && c <= 'z'){
                    if(!list.contains(c)){
                        list.add(c);
                        ++count;
                    }
                }
                ++index;
            }
        }

        System.out.println(count);
    }
}

/* 
        char c = s.next().charAt(0);
        if(c == '{'){
            while(c != '}'){
                c = s.next().charAt(0);
                if(c >= 'a' && c <= 'z'){
                    if(!list.contains(c)){
                        list.add(c);
                        ++count;
                    }
                }
            }
        }

*/