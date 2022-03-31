import java.util.Scanner;
import java.util.ArrayList;
public class Choosing_Teams {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> li = new ArrayList<>();
        int count = 0, n = s.nextInt(), k = s.nextInt(), yearRem = 5 - k, noOfTeam, kthInp;
        while(count < n){
            kthInp = s.nextInt();
            if(kthInp <= yearRem){
                li.add(kthInp);
            }
            ++count;
        }
        noOfTeam = li.size() / 3;
        System.out.println(noOfTeam); 
    }    
}
