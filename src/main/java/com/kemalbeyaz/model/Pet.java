package com.kemalbeyaz.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * @author kemal.beyaz
 */
@Entity
@Table(name = "t_pet")
public class Pet {

    /**
     * Assigned PK
     * Kendi atadığımız PK.
     *
     * */
    /**
     * 17. ders - PK Stratejileri
     * Sentetik ID
     * Üretilen PK
     * ---
     * @GeneratedValue ile pk generation st. belirtilir.
     * SEQUENCE -> Veritabanı genelinde tanımlı hibernate_squence isimli sequnce'den id üretir.
     * IDENTITY -> mysql'in auto incrementi gibi.
     * TABLE -> Veri tabanı düzeyince sequence desteklenmediği durumlarda
     * AUTO -> default olan strategy kullanılır.
     * ****
     * Sentetik ID
     * ***
     * SequenceGenerator ile sequence generator ekleyebiliriz. Bu durumda GeneratedValue'ya generator vermemiz gerekir.
     * */

    /**
     * 18. ders
     * Composite PK
     * Bileşke PK.
     *
     * @see Owner
     */

    @Id
    @SequenceGenerator(name = "seqGen", sequenceName = "pet_seq")
    @GeneratedValue(generator = "seqGen")
    private long id;

    /**
     * 16. ders
     * Basic -> optinal nullable kontrolü
     * Column -> nullable kontrolü
     * bu kontrol koyulursa -> ConstraintViolationException alınır. Bu hata DB'den gelir. insert oluşur ama çalışmaz.
     * **
     * İnsertten önce kontrol edebilmesi için hibernate.properties -> hibernate.check_nullability=true
     * PropertyValueException bu exception alınır. Yani hibernate kontrol ediyor, DB değil. insert oluşturulmaz.
     */
    @Basic()
    @Column(name = "pet_name", nullable = false)
    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
