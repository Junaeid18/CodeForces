import java.util.Scanner;
import java.util.ArrayList;
public class Team_Olympiad {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> li1 = new ArrayList<>(); ArrayList<Integer> li2 = new ArrayList<>(); ArrayList<Integer> li3 = new ArrayList<>();
        int count = 1, children, noOfChildren = s.nextInt();
        while(count <= noOfChildren){
            children = s.nextInt();
            if(children == 1)   {  li1.add(count); }
            else if(children == 2)  {  li2.add(count); }
            else    {li3.add(count);}
            ++count;
        }
        int a = li1.size(), b = li2.size(), c = li3.size(), team;
        team = Math.min(a,(Math.min(b, c)));
        System.out.println(team);
        for (int i = 0; i < team; i++) {
            System.out.println(li1.get(i)+" "+li2.get(i)+" "+li3.get(i));
        }        
    }
}
