import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] st = new boolean[30];

        for(int i = 0; i < st.length-2; i++){
            int n;
            n = Integer.parseInt(br.readLine());
            if(st[n-1] == true){
                i--;
                continue;
            }
            st[n-1] = true;
        }

        for(int i = 0; i < st.length; i++){
            if(st[i] == false)
                System.out.println(i+1);
        }
    }
}
