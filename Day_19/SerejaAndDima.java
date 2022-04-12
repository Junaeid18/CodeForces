import java.util.ArrayList;
import java.util.Scanner;
public class SerejaAndDima {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0, n = s.nextInt(),sereja = 0 ,dima = 0,num, t1 = 0, t2 = n-1;
        while(count < n){  num = s.nextInt(); list.add(num);  ++count;}
        count = 1;
        while(count <= n){
            if(count % 2 != 0){
                if(list.get(t1) > list.get(t2)){    sereja += list.get(t1); t1++;}
                else{   sereja += list.get(t2); --t2;}
            }else{
                if(list.get(t1) > list.get(t2)){    dima += list.get(t1); t1++;}
                else{   dima += list.get(t2); --t2;}
            }
            count++;
        }
        System.out.println(sereja+" "+dima);
    }
}



/* 

        if(n %2 == 0){  Collections.sort(list,Collections.reverseOrder());  }
        else{   Collections.sort(list); }
        System.out.println(list.toString());
        count = 1; sereja = dima = 0;
        while(count <= n){
            if(count %2 != 0){ sereja += list.get(count-1);}
            else{ dima += list.get(count-1);}    ++count;   }
        System.out.println(sum +"   "+(sereja+dima));
        System.out.println(sereja+" "+dima);


*/