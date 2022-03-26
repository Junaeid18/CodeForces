//package Day_15;
import java.util.Scanner;
public class Dubstep {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String input = s.nextLine(),sub = "WUB",ans = "",space = " ";
        int index = 0, size = input.length(),num=0;
        while(index < size){
            if(index+2 < size){
                num = input.indexOf(sub, index);
                if(num == index){
                    index += 3;
                }else if(num == -1){
                    String a = space+input.substring(index, size);
                    ans = ans.concat(a);
                    index += (size - index);
                }
                else{
                    String a = space+input.substring(index, num);
                    ans = ans.concat(a);
                    index = num + 3; 
                }
            }else if(index+1 <= size){
                String a = space+input.substring(index, size);
                ans = ans.concat(a);
                index += 2;
            }else if(index <= size){
                String a = space+input.substring(index);
                ans = ans.concat(a);
                index += 1;
            }
            ans = ans.trim();
        }
        System.out.println(ans);
    }
}