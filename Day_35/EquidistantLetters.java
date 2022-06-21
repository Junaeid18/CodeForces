/*
    Junaeid As Jknight
    Somoy paile dekha koiro
    alap-adda-gopposob hobe
    cha or coffee er sathe.
------<<<<<<*>>>>>>>>-----
D-35 Problem - Equidistant Letters - 
*/
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
public class EquidistantLetters {
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
            FastReader s = new FastReader();
            FastWriter out = new FastWriter();
            HashSet<Character> once = new HashSet<>(); HashSet<Character> twice = new HashSet<>();
            int testCases = s.nextInt(),length,i;
            String input;   char c;
            while(testCases-- > 0){
                input = s.nextLine();   length = input.length();    i = 0;  once.clear();   twice.clear();
                while(i < length){
                    c = input.charAt(i);
                    if(once.contains(c)){ twice.add(c); once.remove(c); }   else once.add(c);   ++i;
                }
                Iterator it;
                if(twice.size() > 0){
                    for (int j = 0; j < 2; j++) {
                        it = twice.iterator();
                        while(it.hasNext()){
                            out.print(it.next());
                        }
                    }
                    it = once.iterator();   while(it.hasNext())out.print(it.next());    out.println("");
                }else{
                    it = once.iterator();   while(it.hasNext())out.print(it.next());    out.println("");
                }
            }
            out.close();
        } catch (Exception e) {
            return;
        }
    }
}
