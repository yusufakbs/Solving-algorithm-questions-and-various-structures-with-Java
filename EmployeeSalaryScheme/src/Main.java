import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Calisan> calisanlar = new ArrayList<>();

        Muhendis muhendis1 = new Muhendis("Ali", "Yılmaz", 11000);
        calisanlar.add(muhendis1);

        OfisCalisani ofisCalisani1 = new OfisCalisani("Ayşe", "Kara", 9000);
        calisanlar.add(ofisCalisani1);

        muhendis1.zamYap(0.1);
        ofisCalisani1.zamYap(0.1);

        for (Calisan calisan : calisanlar) {
            System.out.println(calisan.isim + " " + calisan.soyisim + ", " + calisan.unvan + ", Maaşı: " + calisan.maas);
        }
    }
}