package kp01;

public class Main {
    public static int[] getSliceOfArray(int[] arr, int start, int end){
        int[] slice = new int[end - start];
  
        for (int i = 0; i < slice.length; i++) {
            slice[i] = arr[start + i];
        }
        return slice;
    }

    public static int solution(int[] gift_cards, int[] wants) {
        int ans = 0;
        for(int i=0;i< wants.length;i++) {
            if(wants[i] == gift_cards[i])
                continue;
            else {
                int [] tmp = getSliceOfArray(gift_cards, i, gift_cards.length);
                int j;
                for (j=i;j<tmp.length; j++) {
                    if(gift_cards[j] == wants[i]) {
                        int t = gift_cards[j];
                        gift_cards[j] = gift_cards[i];
                        gift_cards[i] = t;
                        break;
                    }
                }
                if (j == tmp.length) {
                    ans += 1;
                }
                
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] gift_cards = {4, 5, 3, 2, 1};
        int[] wants = {2, 4, 4, 5, 1};

        int res = solution(gift_cards, wants);
        System.out.println(res);
    }        
}
