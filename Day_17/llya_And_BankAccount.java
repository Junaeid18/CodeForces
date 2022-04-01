import java.util.Scanner;
public class llya_And_BankAccount {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int state = s.nextInt(),out;    String ss = String.valueOf(state),outs="";
        if(state < 0){
            int a = state/10; int b = (state/100)*10 + state%10;
            if(a>b){System.out.println(a);}
            else {System.out.println(b);}
        }else{
            System.out.println(state);
        }
    }
}


/* 

            int a = ss.length(),b,c;
            if(a == 1){ System.out.println(0);}
            else{
                b = Character.getNumericValue(ss.charAt(a-2)); c = Character.getNumericValue(ss.charAt(a-1));
                //System.out.println(b+" "+c);
                if(b > 0){
                    for (int i = 0; i < a-2; i++) {
                        outs += ss.charAt(i);
                    }
                    outs += ss.charAt(a-1);
                    int con = Integer.parseInt(outs);
                    if(con == 0){ System.out.println(con);}
                    else{   System.out.println(outs);}
                }else{
                    for (int i = 0; i < a-1; i++) {
                        outs += ss.charAt(i);
                    }
                    System.out.println(outs);
                }
            }

*/