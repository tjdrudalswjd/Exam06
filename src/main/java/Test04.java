import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int a = s.nextInt();

        if (a % 2 == 0){
            System.out.printf("짝수입니다.");
        }else {
            System.out.printf("홀수입니다.");
        }

        int hap = 0;

        for (int i = 0; i < 101; i++){
            if ((i % 3 == 0) || (i % 5 == 0)){
                hap += i;
            }
        }
    }
}
