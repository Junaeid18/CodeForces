/*
    Junaeid As Jknight
    Somoy paile dekha koiro
    alap-adda-gopposob hobe
    cha or coffee er sathe.
------<<<<<<*>>>>>>>>-----
D-All 
*/
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Arrays;
public class DFS {
    private static LinkedList<Integer>[] adj;
    private static boolean[] visited;
    DFS(int vertices){
        adj = new LinkedList[vertices];
        visited = new boolean[vertices];
        for (int i = 0; i < adj.length; i++) {
            adj[i] = new LinkedList<>();
        }
    }
    void addEdge(int src, int dest){
        adj[src].add(dest);
    }
    void DFSmethod(int vertex){
        visited[vertex] = true;
        System.out.print(vertex+" ");
        Iterator<Integer> it = adj[vertex].listIterator();
        while(it.hasNext()){
            int adjacent = it.next();
            if(!visited[adjacent]){
                DFSmethod(adjacent);
            }
        }
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        StringBuilder out = new StringBuilder();
        DFS d = new DFS(4);
        d.addEdge(0, 1);
        d.addEdge(0, 2);
        d.addEdge(1, 2);
        d.addEdge(2, 0);
        d.addEdge(2, 3);
        d.addEdge(3, 3);
        d.DFSmethod(2);
        System.out.println(Arrays.toString(visited));
    }
}
