/*
    Junaeid As Jknight
    Somoy paile dekha koiro
    alap-adda-gopposob hobe
    cha or coffee er sathe.
------<<<<<<*>>>>>>>>-----
D-34 Problem - Pashmak and Garden - 1676B
*/
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import static java.lang.Math.abs;
public class PashmakandGarden {
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
            int x1,x2,x3,x4,y1,y2,y3,y4,d;
            x1 = s.nextInt();   y1 = s.nextInt();
            x2 = s.nextInt();   y2 = s.nextInt();
            if(x1 == x2){
                d = abs(y1 - y2);
                x3 = x1+d;  y3 = y1;
                x4 = x2+d;  y4 = y2;
                out.println(x3+" "+y3+" "+x4+" "+y4);
            }else if(y1 == y2){
                d = abs(x1 - x2);
                x3 = x1;  y3 = y1+d;
                x4 = x2;  y4 = y2+d;
                out.println(x3+" "+y3+" "+x4+" "+y4);
            }else if(abs(x1-x2) == abs(y1 - y2)){
                d = abs(y1 - y2);
                if(y2 > y1){
                    x3 = x1;    y3 = y1+d;
                    x4 = x2;    y4 = y2-d;
                }else{
                    x3 = x1;    y3 = y1-d;
                    x4 = x2;    y4 = y2+d;
                }
                out.println(x3+" "+y3+" "+x4+" "+y4);
            }else{
                out.println(-1);
            }

            out.close();
        } catch (Exception e) {
            return;
        }
    }
}
