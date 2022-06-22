/*
    Junaeid As Jknight
    Somoy paile dekha koiro
    alap-adda-gopposob hobe
    cha or coffee er sathe.
------<<<<<<*>>>>>>>>-----
D-36 Problem - Triple - 1669B
*/
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
public class Triple {
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
            int testCases = s.nextInt(),n,i,number,ar[],result;
            while(testCases-- > 0){
                n = s.nextInt();    i = 1;  ar = new int[n+1]; result = -1;
                while(i <= n){
                    number = s.nextInt(); ++ar[number];
                    result = (ar[number] >= 3)? number : result;
                    ++i;
                }
                out.println(result);
            }
            out.close();
        } catch (Exception e) {
            return;
        }
    }
}

/* 
        HashSet<Integer> once = new HashSet<>(); HashSet<Integer> twice = new HashSet<>();
        while(i < n){
            number = s.nextInt();  
            if(!status){
                if(!once.contains(number))once.add(number);
                else if(!twice.contains(number))twice.add(number);
                else{
                    status = true;  out.println(number);
                }
            }   ++i;
        }
        if(!status)out.println(-1);
*/
