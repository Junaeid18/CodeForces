/*
    Junaeid As Jknight
    Somoy paile dekha koiro
    alap-adda-gopposob hobe
    cha or coffee er sathe.
------<<<<<<*>>>>>>>>-----
D-23
*/
import java.util.Scanner;
public class Worms {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int[] ar = new int[1000001];
        int count = 1, n = s.nextInt()+1,a,m,index=1;
        while(count < n){
            a = s.nextInt();
            for (int i = 0; i < a; i++) {
                ar[index++] = count;
            }++count;
        }count = 1; m = s.nextInt() + 1;
        while(count < m){
            //q = s.nextInt();
            System.out.println(ar[s.nextInt()]);    ++count;
        }s.close();        
    }
}
//Every action counts


/* ArrayList<Integer> list = new ArrayList<>();
int count = 0, n = s.nextInt(),a=0,m,q,pos;
boolean found; 
while(count < n){
    a += s.nextInt();   list.add(a);    ++count;
}   count = 0;    m = s.nextInt();
while(count < m){
    q = s.nextInt();    found = false;  pos = 0;
    while(!found){
        if(list.get(pos) >= q){System.out.println((pos+1)); found = true;}    else ++pos;
    }++count;
}
s.close(); */


/* HashMap<Integer,Integer> map = new HashMap<>();
int count = 0, n = s.nextInt(),a=0,m,q,pos,start=1,sum=0;
while(count < n){
    a = s.nextInt();
    for (int i = 1; i <= a; i++) {
        map.put(start++, count+1);
    }++count;
}count = 0; m = s.nextInt();
while(count < m){
    q = s.nextInt();    System.out.println(map.get(q)); ++count;
} */        