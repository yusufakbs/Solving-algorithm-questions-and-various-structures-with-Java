import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] countryArray = { "Türkiye", "Japonya", "Moğolistan", "Amerika", "Rusya", "Çin" };

        System.out.println("Lütfen bir ülke ismi giriniz:");
        String inputCountry = sc.nextLine();
        boolean found = false;

        for (String country : countryArray){
            if (country.equalsIgnoreCase(inputCountry)){
                System.out.println("Girilen ülke bulunuyor.");
                found = true;
            }
        }
        if (found == false){
            System.out.println("Girilen ülke bulunamadı.");
        }

    }
}