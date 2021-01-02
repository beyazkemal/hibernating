package com.kemalbeyaz.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author kemal.beyaz
 */
@Entity
@Table(name = "t_owner")
public class Owner {

    @Id
    private OwnerId id;

    public OwnerId getId() {
        return id;
    }

    public void setId(OwnerId id) {
        this.id = id;
    }
}
