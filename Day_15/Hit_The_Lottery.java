import java.util.Scanner;
public class Hit_The_Lottery {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int[] ar = {100,20,10,5,1};
        int input = s.nextInt(),count = 0,i = 0,n=0;
        while(input > 0){
            if(input%ar[i] == 0){
                n = input/ar[i];
                count += n;
                input = input - (ar[i] * n);
            }else{
                if(input > ar[i]){
                    n = input/ar[i];
                    count += n;
                    input = input - (ar[i] * n);
                }
            }
            ++i;
        }
        System.out.println(count);
    }    
}