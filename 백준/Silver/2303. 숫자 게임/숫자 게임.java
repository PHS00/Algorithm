import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // N 입력
        int N = scanner.nextInt();

        // 카드 입력
        List<List<Integer>> Cards = new ArrayList<>(N);
        for(int i = 0; i < N; i++){
            List<Integer> cards = new ArrayList<>();
            Cards.add(cards);
            for(int j = 0; j < 5; j++){
                cards.add(scanner.nextInt());
            }
        }

        List<Integer> lastNum = new ArrayList<>(N);
        // 각 유저의 최대 일의 자리 수 구하기
        for(List<Integer> cards : Cards){

            int max = 0;
            for(int i = 0; i < cards.size() - 1; i++){
                for(int j = i+1; j < cards.size(); j++){
                    int sum = 0;
                    for(int k = 0; k < cards.size(); k++){
                        if(k == i || k == j) continue;
                        sum += cards.get(k);
                    }
                    int last = sum % 10;
                    if(last > max) max = last;
                }

            }
//            System.out.println(max);
            lastNum.add(max);
        }

        int winner = 0;
        int max = 0;
        for(int i = 0; i < lastNum.size(); i++){
            if(lastNum.get(i) >= lastNum.get(winner)){
                max = lastNum.get(i);
                winner = i;
            }
        }
        System.out.println(++winner);


    }
}
