import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b2738 {
    public static void main(String[] args) throws IOException {
        int n, m;
        int[][] a, b;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        a = new int[n][m];
        b = new int[n][m];

        for(int i = 0; i < n; i++){
            String[] tmp = br.readLine().split(" ");
            for(int j = 0; j < m; j++){
                a[i][j] = Integer.parseInt(tmp[j]);
            }
        }

        for(int i = 0; i < n; i++){
            String[] tmp = br.readLine().split(" ");
            for(int j = 0; j < m; j++){
                b[i][j] = Integer.parseInt(tmp[j]);
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print((a[i][j]+b[i][j])+" ");
            }
            System.out.println();
        }
    }
}