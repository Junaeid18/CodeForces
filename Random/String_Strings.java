import java.util.Scanner;
import java.util.regex.*;
public class String_Strings {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        int count = 0, z = s.nextInt(),type;
        while(count < z){
            type = s.nextInt();
            if(type == 1){
                int a = s.nextInt();    
                char c = s.next().charAt(0);
                input = input.substring(0,a-1) + c + input.substring(a);
            }else{
                int m = s.nextInt(); int n = s.nextInt();   int step = 0, found = 0;
                String check = s.nextLine(); 
                check = check.replaceAll("\\s", "");
                int size = check.length();
                Pattern p = Pattern.compile(check);
                while(n-m > 0){
                    String input2 = input.substring(m-1, n);
                    Matcher match = p.matcher(input2);
                    if(match.find()){ 
                        found++; 
                        m += match.start()+1;  
                    }else{  break;}
                }
                System.out.println(found);
            }
            count++;
        }
    }
}
