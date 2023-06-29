import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class b5341 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> al = new ArrayList<String>();
        int cnt = -1;
        while(true) {
            al.add(br.readLine());
            cnt++;
            if (al.get(cnt).equals("0"))
                break;
        }

        int cnt1 = 0;
        while(cnt1 < cnt){
            int sum = 0;
            for(int i = 1; i <= Integer.parseInt(al.get(cnt1)); i++){
                sum += i;
            }
            System.out.println(sum);
            cnt1++;
        }
    }
}
