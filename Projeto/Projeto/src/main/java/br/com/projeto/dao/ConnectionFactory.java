
package br.com.projeto.dao;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.EntityManager;

public class ConnectionFactory {
    
    private static EntityManagerFactory factory = Persistence.createEntityManagerFactory ("Projeto");
    
    public static EntityManager getEntityManager(){
        return factory.createEntityManager();
        
    }
}
