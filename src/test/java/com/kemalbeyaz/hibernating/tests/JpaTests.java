package com.kemalbeyaz.hibernating.tests;

import com.kemalbeyaz.hibernating.config.JpaConfig;
import com.kemalbeyaz.model.Pet;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

/**
 * @author kemal.beyaz
 */
public class JpaTests {

    @Test
    public void testSetup() {
        EntityManager entityManager = JpaConfig.getEntityManagerFactory().createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        transaction.commit();
        entityManager.close();

        JpaConfig.getEntityManagerFactory().close();
    }

    @Test
    public void testCreateEntity() {
        EntityManager entityManager = JpaConfig.getEntityManagerFactory().createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        Pet pet = new Pet();
        pet.setId(1L);
        pet.setName("Kedicik");
        entityManager.persist(pet);

        transaction.commit();
        entityManager.close();
    }

    @Test
    public void testCreateEntityWithoutTX() {
        EntityManager entityManager = JpaConfig.getEntityManagerFactory().createEntityManager();
        // EntityTransaction transaction = entityManager.getTransaction();
        // transaction.begin();

        Pet pet = new Pet();
        pet.setId(1L);
        pet.setName("Kedicik");
        entityManager.persist(pet);

        // TX yoksa ve commit edilmezse hemen DB'ye aktarılmaz.
        // JPA'nın persistence context dediği yerde tutulur.
        // persistence context ile DB arasında senkronizasyon işlemi gerekir.
        // Senkronizasyon ya transaction bitince commit ile olur yada em flush() ile zorlanabilir.
        // entityManager.flush(); // gereksiz aslında
        // transaction.commit(); //
        entityManager.close();
    }

}
