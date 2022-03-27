import java.util.Scanner;
public class I_Love_UserName {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int count = 1, amazing = 0, best, worst, new_score, perticipated = s.nextInt();
        best = worst = s.nextInt();
        while(count < perticipated){
            new_score = s.nextInt();
            if(new_score > best){
                amazing++;
                best = new_score;
            }else if(new_score < worst){
                amazing++;
                worst = new_score;
            }
            count++;
        }
        System.out.println(amazing);  
    }    
}
