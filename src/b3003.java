import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b3003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int[] ch = {1, 1, 2, 2, 2, 8};
        if(str.length > 6) {
            System.out.println("6개만 입력하세요.");
            str = br.readLine().split(" ");
        }
        int[] tmp = new int[str.length];
        for(int i = 0; i < str.length; i++){
            tmp[i] = Integer.parseInt(str[i]);

            if(tmp[i] == ch[i])
                System.out.print("0" + " ");
            else
                System.out.print((ch[i] - tmp[i]) + " ");
        }
    }
}
