# Open/Closed Principle (Açık/Kapalı Prensibi) - Java Örneği

Bu proje, SOLID prensiplerinden ikincisi olan **Open/Closed Principle (OCP)** yani **Açık/Kapalı Prensibi**'ni Java dili ile göstermektedir.

## 🧠 İlkenin Tanımı

> "Yazılım varlıkları (sınıflar, modüller, fonksiyonlar vs.) geliştirilmeye **açık**, değişikliğe **kapalı** olmalıdır."  
— Bertrand Meyer

Yani yeni bir davranış eklemek istediğimizde mevcut kodları **değiştirmeden**, genişletilebilir şekilde tasarlamalıyız.


## 🔍 Açıklama

- `Payment` arayüzü, farklı ödeme türlerinin ortak davranışını tanımlar.
- `CreditCardPayment` ve `CryptoPayment`, `Payment` arayüzünü implemente eder.
- `PaymentProcessor` sınıfı, sadece `Payment` türünü bilir, alt sınıflardan habersizdir.
- Ana sınıf (`OpenClosed`) üzerinden farklı ödeme türleriyle ödeme işlemi gerçekleştirilir.

## ✅ Kazanımlar

- Yeni ödeme yöntemleri (örneğin `PaypalPayment`) eklemek için mevcut kodu değiştirmeye gerek yoktur.
- Kod daha modüler ve genişlemeye uygundur.
- Bakımı ve test edilmesi daha kolaydır.
- Hata riski azalır çünkü mevcut çalışan kodlara dokunulmaz.

---

Bu yapı, gerçek dünya uygulamalarında ödeme sistemleri, dosya formatı okuyucuları, vergi hesaplama algoritmaları gibi sürekli genişleyen alanlarda sıkça kullanılır.
