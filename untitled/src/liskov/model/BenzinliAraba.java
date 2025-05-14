package liskov.model;

import liskov.interfaces.Benzinli;

public class BenzinliAraba extends Arac implements Benzinli {

    @Override
    public void calistir() {
        System.out.println("Benzinli araba çalıştırılıyor");
    }

    @Override
    public void benzinAl() {
        System.out.println("Benzinli araba benzin alıyor");
    }
}
