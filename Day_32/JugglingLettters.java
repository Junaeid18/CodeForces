/*
    Junaeid As Jknight
    Somoy paile dekha koiro
    alap-adda-gopposob hobe
    cha or coffee er sathe.
------<<<<<<*>>>>>>>>-----
D-32 Problem - 1397A - Juggling Lettters
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
public class JugglingLettters {
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
            HashMap<Character,Integer> map = new HashMap<>();
            int testCases = s.nextInt(),n,m;
            String inp; char c; boolean status;
            while(testCases-- > 0){
                n = s.nextInt();  m = n;   status = true; map.clear();
                while(m-- > 0){
                    inp = s.nextLine();
                    for (int i = 0; i < inp.length(); i++) {
                        c = inp.charAt(i);
                        if(!map.containsKey(c))map.put(c, 1);
                        else{
                            int val = map.get(c); ++val;
                            map.replace(c, val);
                        }
                    }
                }
                if(n > 1){
                    Collection val = map.values();
                    Iterator it = val.iterator();
                    while(it.hasNext()){
                        int num = (int)it.next();
                        if(num%n != 0){
                            status = false; break;
                        }
                    }
                    if(status)out.println("YES");   else out.println("NO");
                }else out.println("YES");
            }
            out.close();
        } catch (Exception e) {
            return;
        }
    }
}
