import java.util.Scanner;
public class Boring_Apartments {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        char c;
        int count = 0,x,size,digit,result, testCase = s.nextInt();
        while(count < testCase){
            x = s.nextInt(); size = (String.valueOf(x)).length();   c = (String.valueOf(x)).charAt(0); digit = Character.getNumericValue(c);
            result = (digit-1) * 10;
            if(size == 1){  result +=1;}
            else if(size == 2){ result +=3;}
            else if(size == 3){ result +=6;}
            else{   result += 10;}
            System.out.println(result);
            count++;
        }
    }       
}
