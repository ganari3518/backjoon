import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b2845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int[] n = new int[2];
        int[] val = new int[5];
        int s = 1;

        for(int i = 0; i < n.length; i++) {
            n[i] = Integer.parseInt(st1.nextToken());
            s *= n[i];
        }

        for(int i = 0; i < val.length; i++)
            val[i] = Integer.parseInt(st2.nextToken());

        for(int i = 0; i < val.length; i++){
            if(val[i] == s)
                System.out.print("0" + " ");
            else
                System.out.print((val[i] - s) + " ");
        }
    }
}