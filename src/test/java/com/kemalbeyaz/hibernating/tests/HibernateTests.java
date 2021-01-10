package com.kemalbeyaz.hibernating.tests;

import com.kemalbeyaz.hibernating.config.HibernateConfig;
import com.kemalbeyaz.model.Owner;
import com.kemalbeyaz.model.OwnerId;
import com.kemalbeyaz.model.Pet;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

/**
 * @author kemal.beyaz
 */
public class HibernateTests {

    @Test
    public void testSetup() {
        Session session = HibernateConfig.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        tx.commit();
        session.close();
        HibernateConfig.getSessionFactory().close();
    }

    @Test
    public void testCreateEntity() {
        Session session = HibernateConfig.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        Pet pet = new Pet();
        pet.setId(1L);
        pet.setName("Kedicik");
        session.persist(pet);

        transaction.commit();
        session.close();
    }

    @Test
    public void testCreateEntityWithoutTX() {
        Session session = HibernateConfig.getSessionFactory().openSession();

        Pet pet = new Pet();
        pet.setId(1L);
        pet.setName("Kedicik");
        session.persist(pet);

        session.flush(); // no transaction is in progress

        session.close();
    }

    @Test
    public void checkNullability() {
        Session session = HibernateConfig.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        Pet pet = new Pet();
        pet.setId(1L);
        session.persist(pet);

        transaction.commit();
        session.close();
    }

    @Test
    public void testCompositePK() {
        Session session = HibernateConfig.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        Owner owner = new Owner();

        OwnerId id = new OwnerId();
        id.setFirstName("kemal");
        id.setLastName("beyaz");
        owner.setId(id);

        session.persist(owner);

        transaction.commit();
        session.close();
    }
}
