import java.util.Scanner;
public class Police_Recruits {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int count = 0, totalEvent = s.nextInt(), police = 0, crime = 0, event = 0;
        while(count < totalEvent){
            event = s.nextInt();
            if(event < 0){
                if(police > 0){
                    --police;
                }else{
                    ++crime;
                }
            }else{
                police += event;
            }
            ++count;
        }
        System.out.println(crime);
    }    
}
