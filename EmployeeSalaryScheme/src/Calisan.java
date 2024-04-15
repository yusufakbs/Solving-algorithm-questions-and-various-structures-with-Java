import java.util.List;

public class Calisan {

     String isim;
     String soyisim;
     String unvan;
     double maas;


    public Calisan() {

    }

    public Calisan(String isim, String soyisim, String unvan, double maas) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.unvan = unvan;
        this.maas = maas;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public String getUnvan() {
        return unvan;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }

    public double getMaas() {
        return maas;
    }

    public void setMaas(double maas) {
        this.maas = maas;
    }

    public void zamYap(double zamOrani) {
        maas += maas * zamOrani;
    }
}
