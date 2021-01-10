# Set ile Çift Yönlü 1:M İlişki Kurmak
- @OneToMany
  - Source One, target Many
    - owner -> pets
- @ManyToOne
  - Source Many, target One
    - pet -> owner
    
- Çift yönlü ilişki için @OneToMany'e "mappedBy"="" gerekli. Diğer entitydeki filed ismini veriyoruz.
    - JoinColumn ile birlikte kullanılamaz.
    
- Çift yönlü ilişkide hibernate @OneToMany'deki collection'a bakmaz. Artık mapped by ile işaret ettğimiz
filed'a bakacak. 
  