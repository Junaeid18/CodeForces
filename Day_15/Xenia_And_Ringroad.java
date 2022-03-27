import java.util.Scanner;
public class Xenia_And_Ringroad {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();int  m = s.nextInt(); int count = 0,loc = 1;
        long dis = 0;
        int new_loc;
        while(count < m){
            new_loc = s.nextInt();
            if(loc < new_loc){
                dis += new_loc - loc;
                loc = new_loc;
            }else if(loc == new_loc){
                loc = new_loc;
            }else{
                dis += n - loc;
                dis += new_loc;
                loc = new_loc;
            }
            count++;
        }
        System.out.println(dis);
    }
}
