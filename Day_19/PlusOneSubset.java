import java.util.Scanner;
public class PlusOneSubset {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int count = 0, testCase = s.nextInt(),n,max,min,innC,item,result;
        while(count < testCase){
            n = s.nextInt(); max = Integer.MIN_VALUE ; min = Integer.MAX_VALUE; innC = 0;
            while(innC < n){
                item = s.nextInt();
                max = Math.max(max, item);  min = Math.min(min, item);   
                innC++;
            }   
            result = max - min; System.out.println(result);
            ++count;
        }
    }    
}
