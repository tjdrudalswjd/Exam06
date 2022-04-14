import java.util.Scanner;

/*계산기*/

public class study_01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a, b;
        char ch;

        System.out.printf("첫번째 숫자를 입력하세요. \n");
        a = s.nextInt();

        System.out.printf("연산을 입력하세요. \n");
        ch = s.next().charAt(0);

        System.out.printf("두번째 숫자를 입력하세요. \n");
        b = s.nextInt();

        if (ch == '+')
            System.out.printf(" %d + %d = %d 입니다. \n", a, b, a + b);

        if (ch == '-')
            System.out.printf(" %d - %d = %d 입니다. \n", a, b, a - b);



    }
}
