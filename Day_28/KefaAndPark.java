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
public class KefaAndPark {
    private LinkedList<Integer>[] adj;
    private static boolean[] visited;
    private static int[] cat;
    private static int result = 0;
    KefaAndPark(int vertices){
        adj = new LinkedList[vertices+1];
        cat = new int[vertices+1];
        visited = new boolean[vertices+1];
        for (int i = 0; i < adj.length; i++) {
            adj[i] = new LinkedList<>();
        }
    }
    void addEdge(int src, int dest){
        adj[src].add(dest);
    }
    void Calculate(int vertex,int cats){
        //System.out.println("Visiting vertex : "+vertex+" Remaining Cats : "+cats);
        if(cats - cat[vertex] >= 0){
            visited[vertex] = true; ++result; 
            if(cat[vertex] == 1)--cats;
            System.out.println("Visiting vertex : "+vertex+" Remaining Cats : "+cats);
            Iterator<Integer> it = adj[vertex].listIterator();
            while(it.hasNext()){
                int adjacent = it.next();
                if(!visited[adjacent]){
                    Calculate(adjacent, cats);
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        StringBuilder out = new StringBuilder();
        KefaAndPark k = new KefaAndPark(9);
        for (int i = 1; i < 10; i++) {
            cat[i] = s.nextInt();
        }
        k.addEdge(1, 2);
        k.addEdge(1, 3);
        k.addEdge(2, 4);
        k.addEdge(2, 5);
        k.addEdge(4, 8);    k.addEdge(5, 9);
        k.addEdge(3, 6);    k.addEdge(3, 7);
        k.Calculate(1, 1);    
    }
}
