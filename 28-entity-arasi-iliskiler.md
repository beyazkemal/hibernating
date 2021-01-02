# Entity Nesneler Arasındaki İlişkiler

- Dört farklı kategoride değerlendirebiliriz.
    - 1 - Tekli ilişkiler - Çoklu ilişkiler
    - 2 - Çoklu ilişkilerde set list map ve bag kullanımı
    - 3 - Tek yönlü (uni-directional) ilişkiler, çift yönlü (bi-directional) ilişkiler
    - 4 - İlişkiyi tutmak için join column veya join table kullanımı

1 - Tekli: One to One ve Many to One Çoklu: One to Many ve Many to Many

2 - Çoklu ilişkilerde tip. Hangi collection?

3 - İlişkisel modelde ilişkinin yönü diye bir şey yok. Ancak domain - nesne modelde ilişkinin yönü diye bir şey var.
Object networkü üzerinde uni-directionalda source entityden target entitye gidilebilir. Ama geri dönülemez.
Bidirectional ilişkili entityde bu mümkün.

4 - Many to Many harici diğer ilişkilerde **join column** ile tutulabilir.
