import java.util.Scanner;
public class Soft_Drinking {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), k = s.nextInt(),l = s.nextInt(),c = s.nextInt(),d = s.nextInt();
        int p = s.nextInt(), nl = s.nextInt(),np = s.nextInt();
        int OneToast = n * nl, noOfToast =  (k * l) / OneToast;
        if(c * d < noOfToast * n){
            while(!(c * d >= noOfToast * n)){
                if(noOfToast > 0){  --noOfToast;}
            }
        }
        if(n * np * noOfToast > p){
            while(!(n * np * noOfToast <= p)){
                if(noOfToast > 0){  --noOfToast;}
            }
        }
        System.out.println(noOfToast); 
    }    
}


//int totalLime = c * d;
/* 

if(c * d >= noOfToast * n){
    if(n * np * noOfToast <= p){
        System.out.println(noOfToast);
    }else{
        while(!(n * np * noOfToast <= p)){
                    if(noOfToast > 0){  --noOfToast;}
                }
                System.out.println(noOfToast);    
            }
        }else{
            while(!(c * d >= noOfToast * n)){
                if(noOfToast > 0){  --noOfToast;}
            }
        }



*/