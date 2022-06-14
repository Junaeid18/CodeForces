/*
    Junaeid As Jknight
    Somoy paile dekha koiro
    alap-adda-gopposob hobe
    cha or coffee er sathe.
------<<<<<<*>>>>>>>>-----
D-34 Problem - 1400A - String Similarity
*/
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
public class StringSimilarity {
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
            int testCases = s.nextInt(),n,temp;
            StringBuilder result = new StringBuilder();
            String input;
            char c; boolean  status;
            while(testCases-- > 0){
                n = s.nextInt();    input = s.nextLine();      
                for (int i = 0; i < n; i++) {
                    status = false;
                    for (int j = i; j < (i+n); j++) {
                        if(input.charAt(j) == '1'){
                            result.append(1);   status = true;  break;
                        }
                    }
                    if(!status)result.append(0);
                }
                out.println(result);    result.setLength(0);
            }
            out.close();
        } catch (Exception e) {
            return;
        }
    }
}


/* 
            while(testCases-- > 0){
                n = s.nextInt();    input = s.nextLine();   status = false;   
                c = input.charAt((n-1));    temp = (2 * n) - 1;
                for (int i = n; i < temp; i++) {
                    if(input.charAt(i) != c){
                        status = true;  break;
                    }
                }
                if(status)result.append(0); else result.append(c);
                for (int i = 1; i < n; i++) result.append(0);
                result.reverse();
                out.println(result);    result.setLength(0);
            }
 */