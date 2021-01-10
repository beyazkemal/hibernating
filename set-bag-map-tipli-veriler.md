# Set

- Aynı veri birden fazla kez olamaz.
- Çift yönlü ilişkide mappedBy, @ManyToOne kısmındaki field'a işaret eder ve oradan ilişki yönetilir.

# Bag (Collection)

- Collection tiplerinde sıralama tutulabilir. Bunun için @OrderColumn kullanılır.
- Aynı veri birden fazla kez olabilir. :)
- Çift yönlü ilişkide ilişki yönetimi @OneToMany tarafından yapılır. Yani Collection tarafında.
- Çünkü sıralama verisi tutulmak istenebilir.
- Bu yüzden @ManyToOne tarafında @JoniColumn içinde insertable=false updatable=false yapılır.

# Map

- Map'in key değeri hedef entity'nin benzersiz bir alanı olmalıdır. Primary Key gibi.
- @MapKey(name="") ile key belirtili. Map<String, Image> images; için image class'ındaki bir alanı versek @MapKey("
  filePath") gibi olur.
- Çift yönlü ilişki set tipindeki gibi kurulur. Yani @OneToMany tarafında mappedBy ile @ManyToOne filed'ı işaret edilir.
- İlişki de o map'dei entity ile kurulur.
