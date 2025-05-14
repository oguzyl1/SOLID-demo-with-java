# Liskov Substitution Principle (Liskov Yerine Geçme Prensibi) - Java Örneği

Bu proje, SOLID prensiplerinden üçüncüsü olan **Liskov Substitution Principle (LSP)** yani **Liskov Yerine Geçme Prensibi**'ni Java dili ile göstermektedir.

## 🧠 İlkenin Tanımı

> "Bir sınıfın alt sınıfları, türedikleri sınıfların yerine geçebilmelidir."  
— Barbara Liskov

Bu ilkeye göre alt sınıflar, üst sınıfın yerine geçtiğinde programın davranışı **bozulmamalıdır**.  
Kodda `instanceof`, `if-else` gibi kontrollerle hangi tür olduğunu anlamaya çalışmak LSP'ye **aykırıdır**.


## 🔍 Açıklama

- `Arac`: Ortak davranışı (`calistir`) tanımlar.
- `BenzinliAraba`: Benzinli araçtır ve `Benzinli` interface'ini uygular.
- `ElektrikliAraba`: Elektrikli araçtır ve `Elektrikli` interface'ini uygular.
- `Benzinli`, `Elektrikli`: Yalnızca ilgili araba türleri için geçerli özel davranışları tanımlar.

## ❌ LSP'ye Aykırı Ne Olurdu?

Eğer `Arac` sınıfına `benzinAl()` metodu eklenmiş olsaydı:
- Elektrikli araçlar bu metodu miras alırdı ama kullanamazdı.
- Ya override edip boş bırakmak gerekirdi ya da exception fırlatılırdı.
- Bu durumda `ElektrikliAraba`, `Arac`'ın yerine geçemez hale gelirdi.
- Bu LSP’ye doğrudan aykırıdır.

## ✅ Doğru Tasarımın Kazanımları

- Alt sınıflar üst sınıf yerine sorunsuz kullanılabilir.
- Gereksiz `if/else`, `instanceof` gibi kötü kodlara gerek kalmaz.
- Kod daha sağlam, esnek ve genişletilebilir olur.

---

Bu örnek, gerçek dünyada araçlar, cihazlar, ödeme sistemleri gibi türlerine göre davranışları farklılaşan sistemlerde LSP prensibini nasıl uygulayabileceğimizi gösterir.

