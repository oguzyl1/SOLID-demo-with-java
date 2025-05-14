# Single Responsibility Principle (Tek Sorumluluk İlkesi) - Java Örneği

Bu proje, SOLID prensiplerinden ilki olan **Single Responsibility Principle (SRP)** yani **Tek Sorumluluk İlkesi**'ni Java dili ile göstermektedir.

## 🧠 İlkenin Tanımı

> "Bir sınıfın sadece tek bir sorumluluğu olmalıdır ve bu sorumluluk sadece bir nedenden ötürü değişmelidir."  
— Robert C. Martin (Uncle Bob)

Bu ilkeye göre her sınıf sadece **tek bir iş** yapmalıdır. Eğer bir sınıfın birden fazla nedeni varsa değişmeye, o sınıf SRP'yi ihlal ediyor demektir.


## 🔍 Açıklama

Her sınıf sadece kendi işini yapacak şekilde tasarlanmıştır:

- `EmployeeData`: Veri taşır (Model).
- `PayrollCalculator`: Maaş hesaplar.
- `HoursReporter`: Çalışma saatlerini raporlar.
- `EmployeeRepository`: Veriyi saklar.
- `EmployeeService`: Yukarıdaki bileşenleri orkestre eder.
- `SingleResponsibility`: Uygulama başlangıç noktasıdır.

## ✅ Kazanımlar

- Kod okunabilirliği artar.
- Test edilebilirlik yükselir.
- Bakım maliyeti azalır.
- Geliştirme sırasında hataların izole edilmesi kolaylaşır.

---

**Not:** Bu yapı, daha büyük projelerde servisleri, repository katmanlarını ve yardımcı sınıfları ayrı ayrı yönetmeyi kolaylaştırır.

