public class OfisCalisani extends Calisan{
    public OfisCalisani(String isim, String soyisim, double maas) {
        super(isim, soyisim, "", maas);
        guncelleUnvan();
    }

    private void guncelleUnvan() {
        if (maas >= 8000 && maas < 12000)
            unvan = "Çalışan";
        else if (maas >= 12000)
            unvan = "Kıdemli Çalışan";
        else
            unvan = "Stajyer";
    }

    @Override
    public void zamYap(double zamOrani) {
        super.zamYap(zamOrani);
        guncelleUnvan();
    }
}
