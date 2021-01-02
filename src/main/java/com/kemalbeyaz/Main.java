package com.kemalbeyaz;

import com.kemalbeyaz.hibernating.config.HibernateConfig;
import com.kemalbeyaz.hibernating.config.HibernateIntegrator;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.mapping.PersistentClass;

/**
 * @author kemal.beyaz
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Hey");

        Session session = HibernateConfig.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        tx.commit();
        session.close();
        Metadata metadata = HibernateIntegrator.getMetadata();
        HibernateConfig.getSessionFactory().close();

        for (PersistentClass metadataEntityBinding : metadata.getEntityBindings()) {
            String className = metadataEntityBinding.getClassName();
            System.out.println(className);
        }
        
        System.out.println("Hooop!");
    }

}
