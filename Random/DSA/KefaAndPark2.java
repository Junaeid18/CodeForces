/*
    Junaeid As Jknight
    Somoy paile dekha koiro
    alap-adda-gopposob hobe
    cha or coffee er sathe.
------<<<<<<*>>>>>>>>-----
D-All
Tried to optimize the previous code.
*/
import java.util.HashSet;
import java.util.Scanner;
public class KefaAndPark2 {
    private HashSet<Integer>[] adj;
    private boolean[] visited;
    private static int m, result = 0,cats[];
    KefaAndPark2(int vertices){
        adj = new HashSet[vertices];
        visited = new boolean[vertices];
        cats = new int[vertices];
        for (int i = 0; i < vertices; i++) {
            adj[i] = new HashSet<>();
        }
    }
    void Edge(int src,int dest){
        adj[src].add(dest);
    }
    void Calculate(int vertex,int cat){
        visited[vertex] = true;
        if(cats[vertex]==1)++cat; else cat = 0;
        if(cat > m)return;
        boolean Leaf = true;
        for (int i : adj[vertex]) {
            if(!visited[i]){
                Calculate(i,cat); Leaf = false;
            }
        }
        if(Leaf)++result;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(),src,dest; m = s.nextInt(); 
        KefaAndPark2 k = new KefaAndPark2(n);
        for (int i = 0; i < n; i++) {
            cats[i] = s.nextInt(); 
        }
        for (int i = 0; i < n-1; i++) {
            src = s.nextInt()-1; dest = s.nextInt()-1;
            k.Edge(src, dest);  k.Edge(dest, src);
        }
        k.Calculate(0, 0);
        System.out.println(result);
    }
}
