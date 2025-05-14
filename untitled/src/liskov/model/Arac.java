package liskov.model;

/*** Bu sınıf tüm araçlarda bulunan özellikleri kapsamalı örneğin benzin
 al metodu elektrikli araçta çalışmaz buraya eklersek elektrikli araçlar için
  ek kontrol (if else) gerekecek ve bu da liskov presibine aykırı bir durum
*/
public class Arac{
    public void calistir(){
        System.out.println("Araç çalıştırılıyor");
    }
}
