# Parent-Child İlişkiler

- orphanRemoval
- Pet -> Owner <br>
  Yani bir pet'in mutlaka Owner'ı olmalıdır. Gibi. Bu bir parent-child ilişkidir.
- orphanRemoval JPA 2.0 ile geldi.
- CascadeType.DELETE_ORPHAN -> Hibernatein önceki desteği. Depracted olmuş.
- 