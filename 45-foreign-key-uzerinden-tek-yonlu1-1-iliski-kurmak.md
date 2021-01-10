# Foreign Key Üzerinden Tek Yönlü 1:1 İlişki Kurmak

- Foreign key üzerinden ilişki kurmak normalde bildiğim yol üzeredir. :)
- Yani Image - Image Content ilişkisinde PK ile ilişki kurarken Image Content'in kendi ID'si yoktu. Burada artık kendi
  ID'si olmalı. Ancak @JoinColumn ile image'in ID'si FK olarak almış olacak.
  