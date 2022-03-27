import java.util.Scanner;
public class Vasya_the_hipstar {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int r = s.nextInt(), b = s.nextInt(), dday = 0, sday = 0;
        if(r > b){
            dday = b;
            sday = (r - b) / 2;
        }else{
            dday = r;
            sday = (b - r) / 2;
        }
        System.out.println(dday+" "+sday);
    }    
}
