import java.util.Scanner;

public class IQ_test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(),i=0,e=0,o=0,i1=0,i2=0,in;
        while (i<n){
            in = s.nextInt();
            if(in % 2 == 0){
                e++; i1 = i;
            }else{
                o++; i2 = i;
            }
            if((e>1 && o>0) || (e>0 && o>1)){
                if(e>o){
                    System.out.println(i2+1);  break;
                }else{
                    System.out.println(i1+1);  break;
                }
            }i++;
        }
    }
}
