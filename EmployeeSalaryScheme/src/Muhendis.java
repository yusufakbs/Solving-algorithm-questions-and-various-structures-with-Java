import java.util.ArrayList;
import java.util.List;

public class Muhendis extends Calisan{
    public Muhendis(String isim, String soyisim, double maas) {
        super(isim, soyisim, "", maas);
        guncelleUnvan();
    }

    private void guncelleUnvan() {
        if (maas >= 10000 && maas < 12000)
            unvan = "Mühendis";
        else if (maas >= 12000 && maas < 17000)
            unvan = "Kıdemli Mühendis";
        else if (maas >= 17000)
            unvan = "Uzman Mühendis";
        else
            unvan = "Stajyer Mühendis";
    }

    @Override
    public void zamYap(double zamOrani) {
        super.zamYap(zamOrani);
        maas += 250;
        guncelleUnvan();
    }
}
