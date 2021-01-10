# Set ile Tek Yönlü 1:M İlişki Kurmak

- @OneToMany
- İlişki tablosu ekler default olarak. (Association table)
- Tavsiye: join column ekle, tablo oluşmasın.
- İp ucu: Sınıf içindeki collection alanlarını initialize et ki nesne oluştuğunda null check yapmak zorunda kalma.
  Hibernate için bu gerekli değil.
- Örnek:
  Owner sınıfının içinde pet listesi var.<br>
  @OneToMany <br>
  @JoinColumn(name="owner_id") <br>
  private Set<Pet> pets = new HashSet<>(); <br>
  Bu sayede pet tablosunda owner_id diye bir kolon olacak ve ilişkiyi tutacak.

- Bu collection tipli değişkenler hep interface ile tanımlanmalı. Concrete sınıflar ile değil. Hibernate hata verir.

- one to many ilişkilerde assosication table kullanımı...