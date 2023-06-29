import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b2530 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] pt = new int[3];
        int tt;

        for(int i = 0; i < 3; i++)
            pt[i] = Integer.parseInt(st.nextToken());
        tt = Integer.parseInt(br.readLine());

        pt[2] += tt;
        while(pt[2] >= 60){
            pt[2] -= 60;
            pt[1]++;
        }
        while(pt[1] >= 60){
            pt[1] -= 60;
            pt[0]++;
        }
        while(pt[0] >= 24){
            pt[0] %= 24;
        }

        System.out.println(pt[0] + " " + pt[1] + " " + pt[2]);
    }
}

//        pt[2] = pt[2] + (tt % 60);
//        pt[1] = (pt[1] + (tt / 60)) % 60;
//        pt[0] = pt[0] + ((pt[1] + (tt / 60)) / 60);
//
//        if(pt[2] >= 60){
//            pt[1] = pt[1] + 1;
//            pt[2] = pt[2] - 60;
//        } if(pt[1] >= 60){
//            pt[0] = pt[0] + 1;
//            pt[1] = pt[1] - 60;
//        } if(pt[0] >= 24)
//            pt[0] = pt[0] % 24;