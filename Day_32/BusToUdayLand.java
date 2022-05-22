/*
    Junaeid As Jknight
    Somoy paile dekha koiro
    alap-adda-gopposob hobe
    cha or coffee er sathe.
------<<<<<<*>>>>>>>>-----
D-32 Problem - Bus To UdayLand - 711A
*/
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
public class BusToUdayLand {
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
            int n = s.nextInt(),i=0;
            String ar[] = new String[n];    
            boolean status = false;
            while(i < n){
                ar[i] = s.nextLine();
                if(!status){
                    if( ar[i].charAt(0) == 'O' && ar[i].charAt(0) == ar[i].charAt(1) ){
                        ar[i] = "++|"+ar[i].charAt(3)+ar[i].charAt(4);
                        status = true;
                    }else{
                        if(ar[i].charAt(3) == 'O' && ar[i].charAt(3) == ar[i].charAt(4)){
                            ar[i] = ""+ar[i].charAt(0)+ar[i].charAt(1)+"|++";
                            status = true;
                        }
                    }
                }   ++i;
            }
            if(!status)out.println("NO");
            else{
                out.println("YES");
                for (int j = 0; j < ar.length; j++) {
                    out.println(ar[j]);
                }
            }
            out.close();
        } catch (Exception e) {
            return;
        }
    }
}
