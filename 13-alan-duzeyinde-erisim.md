# Field Level Access - Alan Düzeyinde Erişim

- Getter ve Setter'a ihtiyaç duyulmaz.
    - Entity'nin attributelarına reflection API vasıtasıyla ulaşır Hibernate.
    - Bu sebepten Getter ve Setter zorunlu değildir.
    - Eğer attr. mappingi anotasyonla yaparsak ve getId() methoduna koyarsak diğer anotasyonları da methodlara koymamızı
      bekler. Eğer field üzerinde olursa @Id anotasyonu diğer mappingler de field'da olmalıdır.
        - Tavsiye edilen yöntem field üzerine koyulması yönündedir.
    
