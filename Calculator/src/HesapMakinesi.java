import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Uygulama uygulama = new Uygulama();

        while (true) {
            uygulama.Menu();
            int secim = sc.nextInt();
            uygulama.IslemSec(secim);

        }
    }
}
