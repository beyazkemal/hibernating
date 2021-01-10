# List Kullanarak Çift Yönlü 1:M İlişki Kurmak

- List, Set gibi değil. Hibernate açısından @OneToMany tarafında mappedBy attr kullanamayız çünkü @OrderColumn dikkate
  alınmak istenir.
- Liste içine yapılan ekleme ve çıkarmaları takip etmek zorunda. @OrderColumn yüzünden.
- @JoinColumn anotasyonun attr. insertable ve updateable
- @OneToMany
    - Bu tarafta mappedBy kullanmıyoruz. @OrderColumn için.
    - @JoinColumn kullanılabilir.
- @ManyToOne
    - Bu tarafta @JoinColumn kullanıyoruz ve insertable ve updateable diyoruz.
    - Böylelikle hibernate bootsrap esnasında oluşan entity sql'lerinde bu alanı çıkarır.
- Yani ilişki yönetimi Collection tarafında olur.

---

- Hibernate bootsrap sırasında bütün entityler için delete, update, create sql'leri oluşturur.
- Eğer updatebla, insertable attr. false edilirse discard edilmiş olur.

--- 

- hibernate debug logları açılırsa hazırlanan SQL'leri görebiliriz.