# İlişkilerin Lazy/Eager Yapılması

- Entity'de bir ilişki Eager ise, db'den çekildiğinde ilişkili entity de çekilir. Ya join ile yada ayrı bir select ile.
- Lazy olduğunda ise o entity'e ulaşılmaya çalışılmazsa hiç yüklenmez.
- JPA'da @OneToMany ve @ManyToMany ilişkiler default olarak LAZY'dir.
- Ana entity yüklendiğinde o entity içindeki ilişkili entityler, o collection'lara ulaşılmak istenirse JPA ayrı bir
  select ile o ilişkili collection'ı initialize eder.
- JPA bu ilişkileri değiştirmemize izin verir. fetch attr.