/*
    Junaeid As Jknight
    Somoy paile dekha koiro
    alap-adda-gopposob hobe
    cha or coffee er sathe.
------<<<<<<*>>>>>>>>-----
D-30 Problem - 1529A - Eshag Loves Big Array
*/
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
public class EshagLovesBigArray {
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
            int testCases = s.nextInt(),n,num,min,i,ar[];
            while(testCases-- > 0){
                n = s.nextInt();    i = 0;  min = 101; ar = new int[101];
                while(i < n){
                    num = s.nextInt();  ar[num]++;
                    if(num < min)min = num;
                    ++i;
                }   
                out.println(n-ar[min]);
            }
            out.close();
        } catch (Exception e) {
            return;
        }
    }
}

    /* if(ar[n-1] * n == sum)out.println(0);
    else{
        Arrays.sort(ar); i = n-1;
        while(i >= 0 && status){
            delSum += ar[i];
            if(delSum > (sum - delSum)){status = false; ++count;} else {--i; ++count;}
        }
        if(ar[i] == ar[i-1]){
            while(ar[i] == ar[i-1]){
                ++count;    --i;
            }
        }
        out.println(count);
    } */