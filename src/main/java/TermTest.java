import java.util.Scanner;

public class TermTest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a;

        System.out.printf("숫자를 입력하세요");
        a = s.nextInt();

        if (a % 2 == 0) {
            System.out.printf("짝입니다.\n");
        } else {
            System.out.printf("홀입니다.\n");
        }


    }
}
