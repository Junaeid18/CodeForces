/*
    Junaeid As Jknight
    Somoy paile dekha koiro
    alap-adda-gopposob hobe
    cha or coffee er sathe.
------<<<<<<*>>>>>>>>-----
D-33 Problem - 115A - Party
*/
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
public class Party {
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
            int ar[],ar2[],count,n = s.nextInt(),i=1,num,group=0;
            ar = new int[n+1];  ar2 = new int[n+1];
            while(i <= n){
                num = s.nextInt();  count = 0;
                if(num == -1)ar[i]=num;
                else{
                    ar[i] = num;
                    while(ar[num] != -1){
                        num = ar[num];  ++count;
                    }   ++count;
                    if(count > ar2[num])ar2[num] = count;
                }   ++i;
            }   i = 1;
            while(i <= n){
                if(ar[i] == -1)break;   else ++i;
            }   group = ar2[i]; ++i;
            for (int j = i; j <= n; j++) {
                if(ar[j] == -1){
                    if(ar2[j] > group)group = ar2[j];
                }
            }
            out.println(group+1);
            out.close();
        } catch (Exception e) {
            return;
        }
    }
}

/* while(i < n){
    boss = s.nextInt();
    if(boss != -1)ar[boss]++;
    ++i;
}   i = 2;  maxHier = ar[1];
while(i <= n){
    if(maxHier < ar[i])maxHier = ar[i];
    ++i;
}
out.println(maxHier+1); */