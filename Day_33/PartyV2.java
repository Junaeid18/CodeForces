/*
    Junaeid As Jknight
    Somoy paile dekha koiro
    alap-adda-gopposob hobe
    cha or coffee er sathe.
------<<<<<<*>>>>>>>>-----
D-33 Problem - Party 115 - A [Version 2]
*/
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
public class PartyV2 {
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
            int n = s.nextInt(),i=1,ar[],finalAr[],count,num,group;
            ar = new int[n+1];  finalAr = new int[n+1];
            while(i <= n){
                ar[i] = s.nextInt();    ++i;
            }   i=1;
            while(i <= n){
                if(ar[i] == -1)finalAr[i] = 1;
                else{
                    count = 0;  num = i;
                    while(ar[num] != -1){
                        ++count; num = ar[num];   
                    }   ++count;    finalAr[i] = count;
                }
                ++i;
            }
            group = finalAr[0];
            for (int j = 1; j <= n; j++) {
                if(finalAr[j] > group)group = finalAr[j];
            }
            out.println(group);
            out.close();
        } catch (Exception e) {
            return;
        }
    }
}
