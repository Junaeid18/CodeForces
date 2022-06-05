/*
    Junaeid As Jknight
    Somoy paile dekha koiro
    alap-adda-gopposob hobe
    cha or coffee er sathe.
------<<<<<<*>>>>>>>>-----
D-33 Problem - 1341A - NastyaAndRice
*/
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
public class NastyaAndRice {
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
            int testCases = s.nextInt(),a,b,c,d,n,num,min,max;
            boolean status;
            while(testCases-- > 0){
                n = s.nextInt();
                a = s.nextInt();    b = s.nextInt();
                c = s.nextInt();    d = s.nextInt();
                min = (a-b) * n;    max = (a+b) * n;
                if(c-d > max || c+d < min)out.println("NO");
                else out.println("YES");
            }
            out.close();
        } catch (Exception e) {
            return;
        }
    }
}

/* status = false;
if((a-b) <= (c+d)){
    for (int i = a-b; i <= (a+b); i++) {
        num = i * n;
        if(num <= (c+d)){
            for (int j = c-d; j <= (c+d); j++) {
                if(j%num == 0){
                    if(n == (j/i)){
                        status = true; break;
                    }
                }
            }
        }else break;
    }
}
if(status){
    out.println("YES");
}else out.println("NO"); */