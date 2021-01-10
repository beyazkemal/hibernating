# Primary Key Üzerinden Tek Yönlü 1:1 İlişki Kurmak

- İki entity arasında şöyle bir ilişki var: Birisi diğerine bağlı. O olmadan diğeri olamaz ve sadece bir tane olabilir.
- Mesela image ve image content. İmage'ın bir tane image content'i olabilir. İmage olmadan image content olamaz.
- Şimdi bu açıdan bakarak:
- ImageContent'e image'ı @OneToOne olarak ekliyoruz.
- ImageContent'in ID alanı var ve @Id ile işaretli ancak assign modunda. Yani auto generated değil.
- @OneToOne dediğimiz tanımın üzerine @MapsId anotasyonu koyuyoruz. Bu anotasyon image content'in id'sini image
  entity'sinin id'si olmasını sağlıyor. (Foreign Key)
    - Yani image entity'sinin PK'i üzerinden ilişki kurduk.

---

# Çift Yönlü Olması için

- Image tarafında geliriz.
- @OneToOne anotasyonu ile ImageContent'i ekleriz.
- @OneToOne'a mappedBy attr.a ImageContent içindeki Image field'ının ismini veriririz. İlişkiyi o yönetir yani. :S
- Burada image tablosunda herhangi bir kolon eklenmiyor. Runtime'da oluyo herşey.