/*
    Junaeid As Jknight
    Somoy paile dekha koiro
    alap-adda-gopposob hobe
    cha or coffee er sathe.
------<<<<<<*>>>>>>>>-----
D-35 Problem - Unique Number - 1462C
*/
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
public class UniqueNumber {
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
            int testCases = s.nextInt(),num,n,rem;
            String number;  
            StringBuilder output = new StringBuilder();
            boolean status;
            while(testCases-- > 0){
                n = 9;  num = s.nextInt();  number = String.valueOf(num);   status = false; rem = num;
                if(num > 45)out.println(-1);
                else{
                    while(!status && rem != 0 ){
                        if(rem >= n){
                            rem -= n;   output.append(n);   --n;
                        }else{
                            output.append(rem); status = true;
                        }
                    }
                    output.reverse();   out.println(output);    output.setLength(0);
                }  
            }
            out.close();
        } catch (Exception e) {
            return;
        }
    }
}
