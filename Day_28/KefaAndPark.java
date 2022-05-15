/*
    Junaeid As Jknight
    Somoy paile dekha koiro
    alap-adda-gopposob hobe
    cha or coffee er sathe.
------<<<<<<*>>>>>>>>-----
D-28
*/
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Arrays;
public class KefaAndPark {
    private LinkedList<Integer>[] adj;
    private static boolean[] visited;
    private static int[] cat;
    //private static int[] chkLeaf;
    private static int m,result=0;
    KefaAndPark(int vertices){
        adj = new LinkedList[vertices];
        cat = new int[vertices];
        //chkLeaf = new int[vertices];
        visited = new boolean[vertices];
        for (int i = 1; i < adj.length; i++) {
            adj[i] = new LinkedList<>();
        }
    }
    void addEdge(int src, int dest){
        adj[src].add(dest);
    }
    void show(){
        System.out.println(Arrays.toString(adj));
    }
    void Calculate(int vertex,int cats){
        visited[vertex] = true; 
        if(cat[vertex] == 1)++cats; else cats = 0;
        if(cats > m) return; 
        boolean leafNode = true;
        Iterator<Integer> it = adj[vertex].listIterator();
        while(it.hasNext()){
            int adjacent = it.next();
            if(!visited[adjacent]){
                Calculate(adjacent, cats);
                leafNode = false;
            }
        }
        if(leafNode)++result;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(),src,dest; m = s.nextInt(); 
        KefaAndPark k = new KefaAndPark(n+1);
        for (int i = 1; i <= n; i++) {
            cat[i] = s.nextInt();
        }
        for (int i = 1; i < n; i++) {
            src = s.nextInt(); dest = s.nextInt();
            k.addEdge(src , dest);
            k.addEdge(dest , src);
            //chkLeaf[src]++; chkLeaf[dest]++;
        }
        k.Calculate(1, 0);
        System.out.println(result);
    }
}
