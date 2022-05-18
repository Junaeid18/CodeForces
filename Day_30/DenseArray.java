/*
    Junaeid As Jknight
    Somoy paile dekha koiro
    alap-adda-gopposob hobe
    cha or coffee er sathe.
------<<<<<<*>>>>>>>>-----
D-30 Problem - 1490A
*/
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.Math.ceil;;
public class DenseArray {
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
            int testCases = s.nextInt(),n,curNum,prevNum,max,min,count,chk;
            while(testCases-- > 0){
                n = s.nextInt();    prevNum = s.nextInt();  --n;    count = 0;
                while(n-- > 0){
                    curNum = s.nextInt();
                    max = max(curNum,prevNum);  min = min(curNum,prevNum);
                    chk = (int) ceil((double)max/min);
                    if(chk > 2){
                        min *= 2;
                        while(min < max){
                            ++count;    min *= 2; 
                        }
                    }   
                    prevNum = curNum;
                }
                out.println(count); 
            }
            out.close();
        } catch (Exception e) {
            return;
        }
    }
}
