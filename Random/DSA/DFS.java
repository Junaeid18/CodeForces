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
        DFS d = new DFS(13);
        d.addEdge(6, 7);
        d.addEdge(12, 1);
        d.addEdge(9, 7);
        d.addEdge(1, 4);
        d.addEdge(10, 7);
        d.addEdge(7, 1);
        d.addEdge(11, 8);
        d.addEdge(5, 1);
        d.addEdge(3, 7);
        d.addEdge(5, 8);
        d.addEdge(4, 2);
        d.DFSmethod(1);
        System.out.println(Arrays.toString(visited));
    }
}
