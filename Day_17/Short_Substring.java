import java.util.Scanner;
public class Short_Substring {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        StringBuilder out = new StringBuilder();    String input;   char c;
        int count = 0, testCase = s.nextInt(),len;
        while(count < testCase){
            input = s.next(); len = 0;
            len = input.length();
            for (int i = 0; i < len; i += 2) {
                c = input.charAt(i);
                out.append(c);
            }
            c = input.charAt(len-1);
            out.append(c);
            System.out.println(out);
            out.delete(0, len);
            //System.out.println("Rem : "+out);
            count++;
        }
    }    
}
