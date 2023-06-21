import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        Startset ss = new Startset();
        Randomset rs = new Randomset();
        Baseballplay bp = new Baseballplay();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int corNum = 0;
        int levelNum = 0;
        while (true) {
            try {
                while (corNum == 0) {
                    System.out.println("맞추실 숫자의 자릿수를 선택해주세요. ex) 3 or 4");
                    corNum = ss.placeSet(br.readLine());
                }
                while (levelNum == 0) {
                    System.out.println("난이도를 선택해 주세요. ex) Easy, Normal, Hard");
                    levelNum = ss.levelSet(br.readLine());
                }
                int[] targetNum = rs.ran(corNum);
                bp.playing(levelNum, corNum, targetNum, br);
                System.out.println("한 번 더 하시려면 아무 값이나 입력해주세요." + "\n" + "종료를 원하시면 x 를 입력해주세요.");
                String reStart = br.readLine();
                corNum=levelNum=0;
                if (reStart.equalsIgnoreCase("x")) {
                    break;
                }
            } catch (IOException e) {
                System.out.println("입력 중 오류가 발생했습니다. 다시 입력해주세요.");
            }
        }
        try {
            br.close();
        } catch (IOException e) {
            System.out.println("입력 스트림을 닫는 도중 오류가 발생하였습니다.");
        }
        Integer.toString()
                String.valueOf()
    }
}