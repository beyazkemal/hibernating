# Çift Yönlü İlişkilerin Yönetilmesi ve mappedBy

- Collection tarafında yaptığımız değişiklikler db'ye yansımaz.
- mappedBy ile belirttiğimiz yer artık ilişkiyi yönetiyor.
- Cascade.All felan işe yaramaz.
- tek yapılması gereken ilişkiyi mappedBy dediğimiz yerden yönetmez. Sileceksek orayı null'a çekeriz. Ekleyecekek oraya
  değer atarız.

--- 
ekstra: <br>
Transaction içinde olduğu için persistence contexte yaptığımız değişiklik commit sonrası db'ye gönderilir.
session.merge, session.update dememize gerek kalmaz.
<br>
.... <br>
tx.begin(); <br>
Owner owner = session.get(Owner.class, 1L); owner.setName("Kemal"); <br>
tx.commit(); <br>
...