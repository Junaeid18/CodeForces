import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Interesting_Drink {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        boolean found;
        int count = 1,day,max,min,totalShop = s.nextInt();
        int priceAtShop = s.nextInt(); list.add(priceAtShop); max = min = priceAtShop;
        while(count < totalShop){
            priceAtShop = s.nextInt();  if(priceAtShop > max) {max = priceAtShop;} if(priceAtShop < min){   min = priceAtShop;}
            list.add(priceAtShop);  count++;
        }
        Collections.sort(list, Collections.reverseOrder());
        day = s.nextInt();  count = 0;
        while(count < day){
            int money = s.nextInt(),pos;    found = false;
            if(money >= max){
                pos = list.indexOf(max);
                System.out.println(totalShop - pos);
            }else if(money < min){
                System.out.println(0);
            }else{
                while(!found){
                    if(list.contains(money)){
                        pos = list.indexOf(money);  found = true;
                        System.out.println(totalShop - pos);
                    }else{
                        if(money > min){  money--;}
                    }
                }
            }
            ++count;
        }
    }
}



/* 

list.add(1);    list.add(4);    list.add(4);    list.add(6);    list.add(2);
        Collections.sort(list,Collections.reverseOrder());
        //System.out.println(list);
        boolean f = false;  int a = 3;
        while(!f){
            if(!list.contains(a)){
                a--;
            }else{
                f = true;
            }
        }
        System.out.println(5 - list.indexOf(a));


*/
