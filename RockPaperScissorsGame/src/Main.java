import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int computerScore = 0;
        int playerScore = 0;
        System.out.println("Oyun başlıyor...");

        while (true){
            System.out.println("1-Taş" +
                    "\n2-Kağıt" +
                    "\n3-Makas" +
                    "\n---------------------");
            System.out.println("Bir seçim yapınız..");
            int computerSecim = random.nextInt(3) + 1;
            int playerSecim = sc.nextInt();
            sc.nextLine();
            System.out.println("Bilgisayarın seçimi :" + computerSecim);
            System.out.println("Player seçimi :" + playerSecim);
            if((playerSecim == 1 && computerSecim == 3) || (playerSecim == 3 && computerSecim == 2) || (playerSecim == 2 && computerSecim == 1)){
                playerScore++;
            } else if ((playerSecim == 1 && computerSecim == 2) || (playerSecim == 2 && computerSecim == 3) || (playerSecim == 3 && computerSecim == 1) ){
                computerScore++;
            } else if ((playerSecim == 3 && computerSecim == 3) || (playerSecim == 1 && computerSecim == 1) || (playerSecim == 2 && computerSecim == 2) ) {
                System.out.println("Aynı seçimleri yaptınız");
            }else{
                System.out.println("Lütfen geçerli bir değer giriniz...");
            }
            System.out.println("Computer score: " + computerScore);
            System.out.println("Player score: " + playerScore);
            System.out.println("Oyuna devam etmek istiyor musunuz ?(Evet ise E yazınız!)");
            String oyunaDevam = sc.nextLine();
            if(!oyunaDevam.equalsIgnoreCase("e")){
                break;
            }

            }
        }
    }
