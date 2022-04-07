import java.util.Scanner;
public class MIshka_And_Game {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int count = 0,mis = 0, chi = 0, misInp,chiInp, round = s.nextInt();
        while(count < round){
            misInp = s.nextInt();   chiInp = s.nextInt();
            if(misInp > chiInp){    mis++;}
            else if(misInp < chiInp) {  chi++;}
            count++;
        }
        if(mis > chi) { System.out.println("Mishka");}
        else if(mis < chi) {    System.out.println("Chris");}
        else{   System.out.println("Friendship is magic!^^");}
    }    
}
