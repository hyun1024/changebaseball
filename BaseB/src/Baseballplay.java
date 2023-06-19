import java.io.*;
import java.util.*;
public class Baseballplay {
    public void playing(int count, int corNum, int[] targetNum, BufferedReader br) throws IOException {
        int tr = 0;
        int strike, ball;
        while (count > 0) {
            System.out.println(corNum + "자리 숫자를 한 칸씩 띄워서 입력하세요. 남은 기회 " + count + "번");
            try {
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");
                if (st.countTokens() != corNum) {
                    throw new NoSuchElementException(); // 토큰 개수가 다를 경우 예외 발생
                }
                int tmp;
                strike = ball = 0;
                tr += 1;
                for (int i = 0; i < corNum; i++) {
                    tmp = Integer.parseInt(st.nextToken());
                    if (tmp > 9) {
                        throw new NumberFormatException(); // 입력 중 두 자리 이상의 숫자인 경우 예외 발생
                    }
                    if (targetNum[i] == tmp) {
                        strike++;
                    } else if (contains(targetNum, tmp)) {
                        ball++;
                    }
                }

                if (strike == corNum) {
                    System.out.println("정답입니다! 총 시도 횟수 : " + tr + "번");
                    break;
                } else if (count == 1) {
                    System.out.println("아쉽게도 기회를 모두 소진하셨습니다.");
                    System.out.println("정답은 "+Arrays.toString(targetNum) +" 입니다.");
                    break;
                } else {
                    System.out.println(strike + "S " + ball + "B");
                    count--;
                }
            } catch (NoSuchElementException e) {
                System.out.println("입력 값이 올바르지 않습니다. " + corNum + "자리 숫자를 한 칸씩 띄워서 입력하세요.");
            } catch (NumberFormatException e) {
                System.out.println("입력 값이 올바르지 않습니다.  " + corNum + "자리 숫자를 입력하세요.");
            }
        }
    }
    public boolean contains(int[] array, int number) {
        for (int num : array) {
            if (num == number) {
                return true;
            }
        }
        return false;
    }
}
