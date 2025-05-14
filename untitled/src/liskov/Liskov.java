package liskov;

import liskov.model.BenzinliAraba;
import liskov.model.ElektrikliAraba;

public class Liskov {

    public static void main(String[] args) {
        BenzinliAraba araba1 = new BenzinliAraba();
        ElektrikliAraba araba2 = new ElektrikliAraba();

        araba1.calistir();
        araba1.benzinAl();

        araba2.calistir();
        araba2.sarjEt();
    }
}
