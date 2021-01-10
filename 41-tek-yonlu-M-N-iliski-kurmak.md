# Tek Yönlü M:N İlişki Kurmak

- Many to Many ilişkilerde join table kullanmak zorunludur.
- Diğer tipli ilişkşerde @JoinColumn yapılması daha performanslıdır. Bir tane daha join işlemi oluyor.
- @JoinTable anotasyonu ile yapılandırılır.
- joinColumns -> source id
- inverseJoniColumn -> target id

---

- Çift yönlü olması da mümkükün.
- İki tarafta da @ManyToMany tanımlıyoruz.
- MappedBy ile ilişkiyi yönetecek olan tarafı işaretliyoruz.
- @JoinTable anotasyonu ile yaptığımız tanımı da ilişkiyi yöneten tarafa koyraız.