/*
    Junaeid As Jknight
    Somoy paile dekha koiro
    alap-adda-gopposob hobe
    cha or coffee er sathe.
------<<<<<<*>>>>>>>>-----
D-25
*/
import java.util.Scanner;
import static java.lang.Math.min;
import static java.lang.Math.max;
import static java.lang.Math.abs;
import java.util.ArrayList;
import java.util.Collections;
public class StoneGame {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();    ArrayList<Integer> sortedList = new ArrayList<>(list);
        int testCase = s.nextInt(),n,count,min,max,mid,result,rem,dis;    
        while(testCase-- >= 1){
            n = s.nextInt();    count = result = dis = 0;  list.clear();   sortedList.clear();
            while(count < n){
                list.add(s.nextInt());  ++count;
            }
            sortedList = (ArrayList) list.clone();    Collections.sort(sortedList);
            min = sortedList.get(0); max = sortedList.get(n-1); mid = (n%2==0)?n/2 : (n/2)+1;
            min = list.indexOf(min)+1;  max = list.indexOf(max)+1; dis = abs(min-max);
            if(min > mid)min = n - min + 1; if(max > mid)max = n - max + 1;
            //System.out.println("min :"+min+"max : "+max+" mid : "+mid);
            result += min(min,max); rem = max(min,max);
            if(dis < rem){
                result += dis;
            }else result += rem;
            System.out.println(result);
        }
    }
}
