# Dependency Inversion Principle (Bağımlılıkların Tersine Çevrilmesi Prensibi) - Java Örneği

Bu proje, SOLID prensiplerinden beşincisi olan **Dependency Inversion Principle (DIP)** yani **Bağımlılıkların Tersine Çevrilmesi Prensibi**'ni Java ile örneklendirmektedir.

---

## 🧠 İlkenin Tanımı

> **Yüksek seviye sınıflar, düşük seviye sınıflara bağlı olmamalıdır. Her ikisi de soyutlamalara bağlı olmalıdır.**
>
> **Soyutlamalar, detaylara bağlı olmamalıdır. Detaylar soyutlamalara bağlı olmalıdır.**

Bu prensip ile bağımlılıklar **doğrudan sınıflara değil**, **arayüzlere (soyutlamalara)** bağlanır. Böylece kodun esnekliği ve test edilebilirliği artar.

---

## ❓ Open/Closed ile Farkı Nedir?

Open/Closed prensibi, **yeni davranışları eklemek için mevcut kodu değiştirmemeyi** savunur.

Dependency Inversion ise, **bağımlılıkların yüksek seviye sınıflardan soyutlamalar aracılığıyla yönetilmesini** savunur.

Her iki prensip de **bağımlılıkların kontrolünü kolaylaştırır**, ancak:

- OCP: Genişletilebilirlik sağlar.
- DIP: Bağımlılık yönünü ters çevirerek soyutlamaya bağlar.

---


## ✅ Uygulama Açıklaması

- `Payment`: Ödeme işlemi için soyut bir arayüz.
- `CreditCardPayment`, `PaypalPayment`: Farklı ödeme yöntemleri, `Payment` arayüzünü implemente eder.
- `PaymentService`: Yüksek seviye sınıf, `Payment` arayüzüne bağımlıdır (implementasyona değil).

Bu sayede:

- `PaymentService`, ödeme yöntemi değişse bile etkilenmez.
- Test senaryolarında kolaylıkla `MockPayment` sınıfı eklenebilir.
- Yeni bir ödeme yöntemi eklendiğinde `PaymentService` koduna dokunulmaz (OCP'ye de uyumlu).

---

## 🚫 Kötü Tasarım Ne Olurdu?

```java
public class PaymentService {
    private CreditCardPayment payment = new CreditCardPayment();
}
```


Bu tasarımda:

- `PaymentService`, doğrudan `CreditCardPayment` sınıfına bağımlıdır.
- `PaypalPayment` gibi yeni bir ödeme yöntemi geldiğinde `PaymentService` değiştirilmek zorunda kalır.
- Test etmek zordur, çünkü bağımlılığı dışarıdan yönetemeyiz.

---

## ✅ Doğru Tasarımın Kazanımları

- Esnek ve genişletilebilir yapı
- Test edilebilirlik artışı
- Bağımlılıkların yönü soyutlamalara doğru çevrilmiştir
- Açık kapalı prensibi ile birlikte çalışır
