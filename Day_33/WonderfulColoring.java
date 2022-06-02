/*
    Junaeid As Jknight
    Somoy paile dekha koiro
    alap-adda-gopposob hobe
    cha or coffee er sathe.
------<<<<<<*>>>>>>>>-----
D-33 Problem - Wonderful Coloring - 1551-B1
*/
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
public class WonderfulColoring {
    static class FastReader{
        BufferedReader br;
        StringTokenizer st;
        public FastReader(){
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        String next(){
            while(st==null || !st.hasMoreTokens()){
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt(){
            return Integer.parseInt(next());
        }
        long nextLong(){
            return Long.parseLong(next());
        }
        double nextDouble(){
            return Double.parseDouble(next());
        }
        String nextLine(){
            String str="";
            try {
                str = br.readLine().trim();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    static class FastWriter {
        private final BufferedWriter bw;

        public FastWriter() {
            this.bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }

        public void print(Object object) throws IOException {
            bw.append("" + object);
        }

        public void println(Object object) throws IOException {
            print(object);
            bw.append("\n");
        }

        public void close() throws IOException {
            bw.close();
        }
    }
    public static void main(String[] args){
        try {
            HashMap<Character,Integer> map = new HashMap<>();
            FastReader s = new FastReader();
            FastWriter out = new FastWriter();
            int testCases = s.nextInt(),size,count,i,freq,j;
            String input; Character c;
            while(testCases-- > 0){
                input = s.nextLine();   size = input.length();  count = i = j = 0; map.clear();
                if(size == 1)out.println(0);
                else if(size == 2)out.println(1);
                else{
                    while(i < size){
                        c = input.charAt(i);
                        if(!map.containsKey(c)){
                            map.put(c, 1);
                        }else{
                            freq = map.get(c);
                            map.replace(c, ++freq);
                        } ++i;
                    }
                    Collection val = map.values();
                    Iterator it = val.iterator();
                    while(it.hasNext()){
                        j = (int)it.next();
                        if(j >= 2)count+=2;
                        else count+=j;
                    }
                    out.println(count/2);
                }
            }
            out.close();
        } catch (Exception e) {
            return;
        }
    }
}
