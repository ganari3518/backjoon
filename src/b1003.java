import java.io.*;

public class b1003 {
    public static int cnt0 = 0, cnt1 = 0;
    public static void fibonacci(int n){
        int zero = 0;
        int one = 1;
        int sum;
        if(n == 0){
            cnt0++;
        } else if(n == 1){
            cnt1++;
        } else{
            for(int k = 1; k < n; k++){
                sum = zero + one;
                zero = one;
                one = sum;
            }
            cnt0 = zero;
            cnt1 = one;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(br.readLine());
        int[] n = new int[i];

        for(int j = 0; j < n.length; j++){
            int tmp;
            tmp = Integer.parseInt(br.readLine());
            if(0 > tmp || tmp > 40) {
                j--;
                continue;
            }
            n[j] = tmp;
        }

        for (int k : n) {
            fibonacci(k);
            System.out.println(cnt0 + " " + cnt1);
            cnt0 = cnt1 = 0;
        }
    }
}

// 0일 때         ->          1   0
// 1일 때         ->          0   1
// 2일 때         ->          1   1
// 3일 때         ->          1   2
// 4일 때         ->          2   3
// 5일 때         ->          3   5
