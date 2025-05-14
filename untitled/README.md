# SOLID Prensipleri - Java ile Uygulamalı Örnekler

Bu proje, yazılım geliştirme dünyasında **temel prensipler** arasında yer alan **SOLID** ilkelerini, Java dilinde örneklerle göstermeyi amaçlamaktadır.

Her prensip ayrı bir klasör altında gerçek dünya senaryolarına uygun olacak şekilde sade ve anlaşılır örneklerle sunulmuştur.

---

## 📚 SOLID Nedir?

SOLID, beş temel nesne yönelimli tasarım prensibini temsil eder:

- **S**: Single Responsibility Principle (SRP) - Tek Sorumluluk Prensibi
- **O**: Open/Closed Principle (OCP) - Açık/Kapalı Prensibi
- **L**: Liskov Substitution Principle (LSP) - Liskov Yerine Geçme Prensibi
- **I**: Interface Segregation Principle (ISP) - Arayüz Ayrımı Prensibi
- **D**: Dependency Inversion Principle (DIP) - Bağımlılıkların Tersine Çevrilmesi Prensibi

Bu prensipler, yazılımın sürdürülebilirliğini, okunabilirliğini ve yeniden kullanılabilirliğini artırmak için kullanılır.

---

## 📁 Klasörler

| Prensip | Açıklama | Klasör |
|--------|----------|--------|
| ✅ SRP | Bir sınıfın yalnızca **tek bir sorumluluğu** olmalıdır. | [`single_responsibility/`](src/single_responsibility) |
| ✅ OCP | Sınıflar **geliştirmeye açık**, ancak **değişikliğe kapalı** olmalıdır. | [`open_closed/`](src/open_closed) |
| ✅ LSP | Bir alt sınıf, üst sınıf yerine **sorunsuz** geçebilmeli. | [`liskov/`](src/liskov) |
| ✅ ISP | Sınıflar, **ihtiyaç duymadıkları metodlara bağımlı kalmamalıdır**. | [`interface_segregation/`](src/interface_segregation) |
| ✅ DIP | Sınıflar, **somut sınıflara değil, soyutlamalara bağımlı** olmalıdır. | [`dependency_inversion/`](src/dependency_inversion) |

---

## 👨‍💻 Amaç

Bu projedeki örnekler:
- SOLID prensiplerini öğrenmek isteyen geliştiricilere temel oluşturmak,
- Mülakat hazırlıklarında kullanılmak,
- Gerçek dünyada kaliteli yazılım mimarileri için fikir vermek amacıyla hazırlanmıştır.

