# JPA ile Çalışırken Transaction Kullanımı
- Persistence işlemi gerçekleşebilemsi için aktif bir tx gereklidir.
- JPA aktif tx olmadan veri tabanına persistence işlemi yapmaz.
- Hibernate de v.5 ile birlikte aktif tx yoksa persistence yapılamaz. (Config ile değişebilir.)
- 