package liskov.model;

import liskov.interfaces.Elektrikli;

public class ElektrikliAraba extends Arac implements Elektrikli {

    @Override
    public void calistir(){
        System.out.println("Elektrikli araba calıştırılıyor");
    }

    @Override
    public void sarjEt() {
        System.out.println("Elektrikli araba şarj ediliyor.");
    }
}
