import java.util.Scanner;

public class StrScanner {
    public void str() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сумму:");
        String str = sc.nextLine();
        sc.close();
    }
}
