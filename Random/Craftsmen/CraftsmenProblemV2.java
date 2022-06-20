/*
    Junaeid As Jknight
------<<<<<<*>>>>>>>>-----
*/
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import static java.lang.Math.max;
import static java.lang.Math.min;
public class CraftsmenProblemV2 {
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
            int maxL = 0, maxR = 0, i = 0, result,length,currL = 0, currR = 0;
            String input = s.nextLine(),input2;    length = input.length();
            StringBuilder inp = new StringBuilder();
            char c;
            while(i < length){
                c = input.charAt(i);
                if(c == '<')++currL;
                else if(c == '>'){
                    currL = (currL > 0)? --currL : currL;
                }
                maxL = max(currL, maxL);    ++i;
            }   i = 0;  inp.append(input);  inp.reverse();  input2 = inp.toString();  
            while(i < length){
                c = input2.charAt(i);
                if(c == '>')++currR;
                else if(c == '<'){
                    currR = (currR > 0)? --currR : currR;
                }
                maxR = max(currR, maxR);    ++i;
            }
            out.println(result = min(maxL,maxR));
            out.close();
        } catch (Exception e) {
            return;
        }
    }
}
