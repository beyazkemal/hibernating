# Entity Yazılması, Basic Property ve Assigned PK Kullanımı

- **@Entity** -> JPA anotasyonu
- @Table -> JPA anotasyonu. Optinal. Entity ismi ile tablo oluşturulur default olarka.
- **@Id** -> JPA anotasyonu. PK tanımı için. **ZORUNLU.**
- @Basic -> JPA anotasyonu. Temel java tipli fieldların eşleştirmesi için. (long, int, boolean, string, character,
  class, ?)
    - Default -> Bütün alanları persistence kabul eder ve fieldların karşılığı ne ise onunla eşleştirmeye çalışır.
    - İki tane propertysi var:
        - optional -> null olabilir mi? Primitive bir alan değilse default olarak null olur. Bunu değiştirmek için
          kullanabilirsinmiş.
        - fetch -> FetchType -> Lazy or Eager

- @Cloumn -> JPA anotasyoun. Kolon bilgisi.

- _`hbm2ddl`_ -> Java sınıflarından DDL ile table create edilmesi. - Default olarak none'dur property.


