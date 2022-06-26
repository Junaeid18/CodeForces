/*
    Junaeid As Jknight
    Somoy paile dekha koiro
    alap-adda-gopposob hobe
    cha or coffee er sathe.
------<<<<<<*>>>>>>>>-----
D-36 Problem - Common Subsequence - 1382A
*/
import java.util.HashSet;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
public class CommonSubsequence {
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
            HashSet<Integer> nset = new HashSet<>();    HashSet<Integer> mset = new HashSet<>();
            int testCases = s.nextInt(),n,m,num,result=0;
            boolean status;
            while(testCases-- > 0){
                n = s.nextInt();    m = s.nextInt();    status = false;     nset.clear();   mset.clear();
                while(--n >= 0){    nset.add(s.nextInt()); }
                while(--m >= 0){
                    num = s.nextInt();
                    if(!status){
                        if(nset.contains(num)){ result = num; status = true; }
                    }
                }
                if(status){
                    out.println("YES");    out.println(1+" "+result);
                }else   out.println("NO");
            }
            out.close();
        } catch (Exception e) {
            return;
        }
    }
}

