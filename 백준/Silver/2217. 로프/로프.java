import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<Integer> ropes = new ArrayList<>(N);
        for(int i = 0; i < N; i++){
            ropes.add(scanner.nextInt());
        }
        Collections.sort(ropes);    // 오름차순 정렬
        Collections.reverse(ropes);    // 내림차순 정렬
        int step = 1;
        int maxWeight = -1;
        for(int i = 0; i < N; i++){
            int rope = ropes.get(i);
            if(maxWeight < rope * (i+1))
                maxWeight = rope * (i+1);
        }
        System.out.println(maxWeight);
    }
}
