import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b2480 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] n = new int[3];

        for(int i = 0; i < n.length; i++)
            n[i] = Integer.parseInt(st.nextToken());

        if(n[2] == n[1] && n[2] == n[0])
            System.out.println(10000+n[2]*1000);
        else if(n[2] == n[1] || n[2] == n[0])
            System.out.println(1000+n[2]*100);
        else if(n[1] == n[0] || n[1] == n[2])
            System.out.println(1000+n[1]*100);
        else if(n[0] == n[1] || n[0] == n[2])
            System.out.println(1000+n[0]*100);
        else{
            int max = 0;
            for(int i = 0; i < n.length; i++){
                if(n[i] > max)
                    max = n[i];
            }
            System.out.println(max*100);
        }
    }
}
