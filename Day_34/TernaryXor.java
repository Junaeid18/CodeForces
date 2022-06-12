/*
    Junaeid As Jknight
    Somoy paile dekha koiro
    alap-adda-gopposob hobe
    cha or coffee er sathe.
------<<<<<<*>>>>>>>>-----
D-34 Problem - Ternary Xor - 1328-C
*/
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
public class TernaryXor {
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
            int testCases = s.nextInt(),n;
            String x;   StringBuilder a = new StringBuilder(),b = new StringBuilder();
            while(testCases-- > 0){
                n = s.nextInt();    
                x = s.nextLine();
                for (int i = 0; i < n; i++) {
                    if(x.charAt(i) == '1'){
                        a.append('1');   b.append('0');
                        for (int j = i+1; j < n; j++) {
                            b.append(x.charAt(j));  a.append('0');
                        }   break;
                    }else if(x.charAt(i) == '2'){
                        a.append('1'); b.append('1');
                    }else{
                        a.append('0');  b.append('0');
                    }
                }
                out.println(a); out.println(b); a.setLength(0); b.setLength(0);
            }
            out.close();
        } catch (Exception e) {
            return;
        }
    }
}
