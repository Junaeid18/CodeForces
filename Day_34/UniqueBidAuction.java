/*
    Junaeid As Jknight
    Somoy paile dekha koiro
    alap-adda-gopposob hobe
    cha or coffee er sathe.
------<<<<<<*>>>>>>>>-----
D-34 Problem - Unique Bid Auction = 1454B
*/
import java.util.ArrayList;
import java.util.HashSet;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
public class UniqueBidAuction {
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
            int testCases = s.nextInt(),n,ar[],ar2[],i,result=0;
            boolean status;
            while(testCases-- > 0){
                n = s.nextInt();    i = 1;  ar = new int[n+1]; ar2 = new int[n+1];  status = false;
                while(i <= n){
                    ar2[i] = s.nextInt();    ar[ar2[i]]++;   ++i;
                }   i = 1;
                while(i <= n && !status){
                    if(ar[i] == 1){
                        int j = 1;
                        while(j <= n && !status){
                            if(ar2[j] == i){
                                result = j; status = true; break;
                            }   ++j; 
                        }
                    }   ++i;
                }
                if(status)out.println(result); else out.println(-1);
            }
            out.close();
        } catch (Exception e) {
            return;
        }
    }
}
