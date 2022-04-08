import java.util.Scanner;
public class Raising_Bacteria {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int result, input = s.nextInt();
        result = Bactria(input);
        System.out.println(result);
    }
    public static int Bactria(int a){
        int num = 1,res,dif1,dif2,rem = 0,bact = 0;    boolean b = false;
        while(!b){
            res = (int) Math.pow(2, num);
            System.out.println("res : "+res);
            if(res > a){
                bact++;
                dif1 = a - ((int) Math.pow(2, num-1));
                dif2 = res - a;
                rem = (dif1 <= dif2) ? dif1 : dif2;  b = true; System.out.println("rem : "+ rem);
            }else{  num++;}
        }
        if(rem == 0){}
        else if(rem >= 2){
            bact += Bactria(rem);
        }else{
            bact++;
        }
        return bact;
    }    
}
