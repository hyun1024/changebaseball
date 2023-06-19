public class Startset {
    public int placeSet(String num) {
        int tm;
            try {
                tm = Integer.parseInt(num);
                if (tm != 3 && tm != 4) {
                    throw new IllegalArgumentException();
                }
            } catch (NumberFormatException e) {
                System.out.println("입력 값이 올바르지 않습니다. 숫자를 입력하세요.");
                tm=0;
            } catch (IllegalArgumentException e) {
                System.out.println("입력 값이 올바르지 않습니다. 3 또는 4를 입력하세요.");
                tm=0;
            }
        return tm;
    }
    public int levelSet(String num){
        switch (num.toLowerCase()) {
                    case "easy":
                        return 10;
                    case "normal":
                        return 7;
                    case "hard":
                        return 5;
                    default:
                        System.out.println("유효하지 않은 난이도입니다. Easy, Normal, Hard 중 하나를 입력해주세요.");
                        return 0;
        }
    }
}
