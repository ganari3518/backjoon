import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b1032 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n;
        String[] st;
        n = Integer.parseInt(br.readLine());
        st = new String[n];

        for(int i = 0; i < n; i++)
            st[i] = br.readLine();

        char[] tmp;
        tmp = st[n-1].toCharArray();

        for(int i = n-1; i >= 0; i--){
            char[] temp;
            temp = st[i].toCharArray();
            for(int j = 0; j < st[i].length(); j++){
                if(tmp[j] == temp[j])
                    tmp[j] = temp[j];
                else
                    tmp[j] = '?';
            }
        }

        for (char c : tmp)
            System.out.print(c);
    }
}
