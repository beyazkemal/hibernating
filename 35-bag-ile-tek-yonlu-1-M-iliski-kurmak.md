# Bag ile Tek Yönlü 1:M İlişki Kurmak

- Bag veri tipi: Dublikasyona izin veren ve elemanları ekleme sırasında gözetmeyen? veri tipi ?
- Java'a tam karşılığı yok. Ancak List tipindekiler bag yerine kullanılabilir.
- Initialize etmeyi unutma. :) List<Owner> owners = new Arraylist(); gibi.

---
- @OneToMany
- @OrderColumn anotasyonu ile list tipli verilerde sıralı olarak veriyi tutabiliriz.