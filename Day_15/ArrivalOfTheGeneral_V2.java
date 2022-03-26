//package Day_15;
import java.util.Scanner;
public class ArrivalOfTheGeneral_V2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(),i=1,min=0,max=0,minpos=1,maxpos=1;
        int num = s.nextInt(); i++; max = min = num;
        while(i <= n){
            num = s.nextInt();
            if(num > max){
                max = num; maxpos = i;
            }else if (num <= min){
                min = num ; minpos = i;
            }i++;
        }
        int minneed = n - minpos; int maxneed = maxpos-1; 
        int sum=0;
        if(maxpos < minpos){
            sum = minneed+maxneed;
        }else{
            sum = minneed+ maxneed - 1;
        }
        System.out.println(sum);
    }
}
