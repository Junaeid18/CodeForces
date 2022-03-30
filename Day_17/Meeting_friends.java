import java.util.Scanner;
import java.util.Arrays;
public class Meeting_friends {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int[] ar = new int[3];
        int step=0;
        ar[0] = s.nextInt();    ar[1] = s.nextInt();    ar[2] = s.nextInt();
        Arrays.sort(ar);
        step += ar[1] - ar[0];  step += ar[2] - ar[1];
        System.out.println(step);
    }
}

/*
Another useless mathod
r1 = ar[1] - ar [0];  r2 = ar[2] - ar [1];
if(r1 >= r2){
}else if(r1 < r2){
    
} */