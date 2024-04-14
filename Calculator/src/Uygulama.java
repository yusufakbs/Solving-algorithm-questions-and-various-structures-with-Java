import java.util.Scanner;

public class Uygulama {
    static Scanner sc = new Scanner(System.in);

    public Uygulama() {
    }

    public static void Menu(){
        System.out.println("1- Toplama \n2- Çıkarma \n3- Çarpma \n4- Bölme \n0- Çıkış");
    }

    public static void Toplama(){
        double toplam = 0;
        while (true) {
            System.out.print("Değer girin veya '=' girerek işlem sonucunu alın: ");
            String input = sc.nextLine();
            if(SayiKontrol.isNumeric(input) == false && !input.equals("=")){
                System.err.println("Numerik bir değer giriniz!");;
            }
            else if (input.equals("=")) {
                break;
            }
            try {
                double sayi = Double.parseDouble(input);
                toplam = sayi + toplam;
            } catch (NumberFormatException e) {
                System.err.println("Geçersiz giriş. Lütfen bir double değer veya '=' girin.");
            }
        }
        System.out.println("Toplam = " + toplam +
                "\n-------------------------------");
    }


    public static void Cikarma() {
        double fark = 0;
        boolean ilkGiris = true;
        while (true) {
            System.out.print("Değer girin veya '=' girerek işlem sonucunu alın: ");
            String input = sc.nextLine();
            if(SayiKontrol.isNumeric(input) == false && !input.equals("=")){
                System.err.println("Numerik bir değer giriniz!");;
            }
            else if (input.equals("=")) {
                break;
            }

            try {
                double sayi = Double.parseDouble(input);
                if (ilkGiris) {
                    fark = sayi;
                    ilkGiris = false;
                } else {
                    fark -= sayi;
                }
            } catch (NumberFormatException e) {
                System.err.println("Geçersiz giriş. Lütfen bir double değer veya '=' girin.");
            }
        }

        System.out.println("Fark = " + fark +
                "\n-------------------------------");
    }

    public static void Carpma(){
        double carpimDeger = 1;
        while (true) {
            System.out.print("Değer girin veya '=' girerek toplamı alın: ");
            String input = sc.nextLine();

            if(SayiKontrol.isNumeric(input) == false && !input.equals("=")){
                System.err.println("Numerik bir değer giriniz!");;
            }
            else if (input.equals("=")) {
                break;
            }
            try {
                double sayi = Double.parseDouble(input);
                carpimDeger *= sayi;

            } catch (NumberFormatException e) {
                System.err.println("Geçersiz giriş. Lütfen bir double değer veya '=' girin.");
            }
        }
        System.out.println("Çarpım değeri = " + carpimDeger +
                "\n-------------------------------");
    }

    public static void Bolme(){
        double bolmeDeger = 0;
        boolean giris = true;

        while (true) {
            System.out.print("Değer girin veya '=' girerek toplamı alın: ");
            String input = sc.nextLine();

            if(SayiKontrol.isNumeric(input) == false && !input.equals("=")){
                System.err.println("Numerik bir değer giriniz!");;
                break;
            }
            else if (input.equals("=")) {
                break;
            }

            try {
                double sayi = Double.parseDouble(input);
                if (giris) {
                    bolmeDeger = sayi;
                    giris = false;
                } else {
                    if (sayi == 0) {
                        System.err.println("Sıfıra bölme hatası! Lütfen farklı bir değer girin.");
                    }
                    bolmeDeger /= sayi;
                }
            } catch (NumberFormatException e) {
                System.err.println("Geçersiz giriş. Lütfen bir double değer veya '=' girin.");
            }
        }

        System.out.println("Toplam = " + bolmeDeger +
                "\n-------------------------------");
    }

    public static void IslemSec(int islem) {

            switch (islem){
                case 1:
                    Toplama();
                    break;
                case 2:
                    Cikarma();
                    break;
                case 3:
                    Carpma();
                    break;
                case 4:
                    Bolme();
                    break;
                case 0:
                    System.exit(1);
                    break;
            }

        }

}
