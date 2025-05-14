# Interface Segregation Principle (Arayüz Ayrımı Prensibi) - Java Örneği

Bu proje, SOLID prensiplerinden dördüncüsü olan **Interface Segregation Principle (ISP)** yani **Arayüz Ayrımı Prensibi**'ni Java dili ile göstermektedir.

## 🧠 İlkenin Tanımı

> "Hiçbir sınıf, kullanmadığı bir arayüze bağlı kalmaya zorlanmamalıdır."  
— Robert C. Martin

Bu prensip, arayüzlerin **küçük ve amaca yönelik** olması gerektiğini savunur.  
Böylece her sınıf sadece **kendi işiyle ilgili metotları** uygulamak zorunda kalır.


## 🧩 Arayüzler ve Sınıflar

- `OrderTaking`: Sipariş alma işlemini temsil eder.
- `MakeFood`: Yemek hazırlama işlemini temsil eder.
- `PaymentProcessing`: Ödeme alma işlemini temsil eder.

### Sınıflar:

- `Waiter`: Sadece `OrderTaking` arayüzünü uygular.
- `Chef`: Sadece `MakeFood` arayüzünü uygular.
- `Cashier`: Sadece `PaymentProcessing` arayüzünü uygular.

## ❌ ISP'ye Aykırı Ne Olurdu?

Eğer şöyle bir arayüz olsaydı:

```java
public interface RestaurantWorker {
    void takeOrder();
    void makeFood();
    void processPayment();
}
```

Ve Waiter, Chef, Cashier bu interface’i implemente etseydi:

- Waiter, yemek yapma ve ödeme alma metodlarını **boş bırakmak zorunda kalırdı**.

- Bu da kodda:
  - boş metotlar,
  - `UnsupportedOperationException`,
  - ya da `if-else` gibi kontrol yapıları

gibi **kötü kod** yapılarına yol açardı.

---

✅ **Doğru Tasarımın Kazanımları**

- Arayüzler amaca yönelik ve ayrık.
- Sınıflar yalnızca kendi görevini yerine getiriyor.
- Kod daha sade, okunabilir ve genişletilebilir.
