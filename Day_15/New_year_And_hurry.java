import java.util.Scanner;
public class New_year_And_hurry {
    public static final int timeMul = 5;
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        boolean done = false;
        int time = 240, problem = s.nextInt(), timeNeedToParty = s.nextInt(), remTime = time - timeNeedToParty, prbNo = 1;
        while(!done){
            if(prbNo <= problem){
                int calcTime = prbNo * timeMul;
                if(remTime >= calcTime){
                remTime -= calcTime;
                prbNo++;   
                }else{
                    done = true;
                }
            }else{
                done = true;
            } 
        }
        System.out.println(prbNo-1);
    }
}
