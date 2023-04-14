package Online_Space.Apt.WinningCard;


import java.util.*;

public class WinningCard {
    public static int solution(int [][]cards) {
        Set<Integer> mySet = new HashSet<>();
        int res = -1;
        mySet.add(res);

        for (int i = 0; i < cards.length; i++) {
            Arrays.sort(cards[i]);
            for (int card : cards[i]) {
                if(mySet.contains(card)){
                    mySet.remove(card);
                } else {
                    mySet.add(card);
                }
            }
        }
        for(int value : mySet){
            res = value;
        }
        return res;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String[] components = sc.nextLine().split(",");
        List<int[]> myList = new ArrayList<int[]>();

        int size = components.length;
        int[][] mtx = new int[1][size];
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            String [] numbersStr = components[i].split(" ");
            int[] numbers = new int[numbersStr.length];
            for(int j = 0; j < numbersStr.length; j++){
                numbers[j] = Integer.parseInt(numbersStr[j]);
            }
            myList.add(numbers);
        }
        mtx = myList.toArray(mtx);
        System.out.println(WinningCard.solution(mtx));
    }
}
/*

enter a list of array like 8,9,5,4,3 and it will return the highest
 */