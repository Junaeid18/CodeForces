import java.util.Scanner;

public class Arrival_of_the_General {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(),i=1,min=0,max=0,minpos=0,maxpos=0;
        int num = s.nextInt(); i++; max = min = num;
        while(i <= n){
            num = s.nextInt();
            if(num > max){
                max = num; maxpos = i;
            }else if (num < min){
                min = num ; minpos = i;
            }else if (num == min){
                minpos = i;
            } i++;
        }
        minpos = n - minpos; maxpos = maxpos-1; int mid = n/2; int sum=0;
        if (maxpos >= mid && minpos >= mid){
            sum = minpos + maxpos - 1;
        }else {
            sum = minpos + maxpos;
        }
        System.out.println(sum);
    }
}
