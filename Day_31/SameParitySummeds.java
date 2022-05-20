/*
    Junaeid As Jknight
    Somoy paile dekha koiro
    alap-adda-gopposob hobe
    cha or coffee er sathe.
------<<<<<<*>>>>>>>>-----
D-31    Problem - 1352B
*/
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
public class SameParitySummeds {
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
            int testCases = s.nextInt(),n,k;
            while(testCases-- > 0){
                n = s.nextInt();    k = s.nextInt();
                if(n%2!=0 && k%2!=0){
                    if((k*1) <= n){
                        out.println("YES");
                        for (int i = 1; i < k; i++) {
                            out.print(1+" ");
                        }out.println(n-((k-1)*1));
                    }else out.println("NO");
                }else if(n%2 == 0){
                    if(k%2 == 0){
                        if((k*2) <= n){
                            out.println("YES");
                            for (int i = 1; i < k; i++) {
                                out.print(2+" ");
                            }out.println(n-((k-1)*2));
                        }else if((k*1) <= n){
                            out.println("YES");
                            for (int i = 1; i < k; i++) {
                                out.print(1+" ");
                            }out.println(n-((k-1)*1));
                        }else out.println("NO");
                    }else{
                        if((k*2) <= n){
                            out.println("YES");
                            for (int i = 1; i < k; i++) {
                                out.print(2+" ");
                            }out.println(n-((k-1)*2));
                        }else out.println("NO");
                    }
                }else out.println("NO");
            }
            out.close();
        } catch (Exception e) {
            return;
        }
    }
}
