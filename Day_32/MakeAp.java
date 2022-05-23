/*
    Junaeid As Jknight
    Somoy paile dekha koiro
    alap-adda-gopposob hobe
    cha or coffee er sathe.
------<<<<<<*>>>>>>>>-----
D-32 Problem - Make Ap - 1624B
*/
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
public class MakeAp {
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
            int testCases = s.nextInt(),a,b,c,a1,b1,c1,diff1,diff2,num;
            while(testCases-- > 0){
                a = s.nextInt(); b = s.nextInt();   c = s.nextInt();
                if(a == b && b == c)out.println("YES");
                else if((a-b == b-c)|| (c-b == b-a))out.println("YES");
                else if(a < b && b == c){
                    num = b/a;  
                    if(num * a == b)out.println("YES"); else out.println("NO");
                }else if(a == b && b > c){
                    num = b/c;
                    if(num * c == b)out.println("YES"); else out.println("NO");
                }else{
                    diff1 = b - c;  a1 = c + (2 * diff1);
                    b1 = (a + c)/2; 
                    diff2 = b - a; c1 = a + (2 * diff2);
                    if(a1>a && a1%a==0)out.println("YES");
                    else if(b1>b && b1%b==0 && a-b1 == b1-c)out.println("YES");
                    else if(c1>c && c1%c==0)out.println("YES");
                    else out.println("NO");
                }
            }
            out.close();
        } catch (Exception e) {
            return;
        }
    }
}
/* if(a == b && b == c)out.println("YES");
else if((a-b == b-c)|| (c-b == b-a))out.println("YES");
else if(a < b && b == c){
    num = b/a;  
    if(num * a == b)out.println("YES"); else out.println("NO");
}else if(a == b && b > c){
    num = b/c;
    if(num * c == b)out.println("YES"); else out.println("NO");
}else{

} */