import java.util.*;
public class Randomset {
    public int[] ran (int a) {
        Random ran = new Random();
        ArrayList<Integer> numList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numList.add(i);
        }
        int[] targetNum = new int[a];
        for (int i = 0; i < targetNum.length; i++) {
            int n = ran.nextInt(numList.size());
            targetNum[i] = numList.get(n);
            numList.remove(n);
        }
        return targetNum;
    }
}
