import java.util.*;
public class Randomset {
    public int[] ran (int a) {
        Random ran = new Random();
        ArrayList<Integer> numList = new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6,7,8,9));
        int[] targetNum = new int[a];
        for (int i = 0; i < targetNum.length; i++) {
            int n = ran.nextInt(numList.size());
            targetNum[i] = numList.get(n);
            numList.remove(n);
        }
        return targetNum;
    }
}
