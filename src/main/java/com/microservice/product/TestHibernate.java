package com.microservice.product;

import com.microservice.product.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Classe de test simple pour valider l'initialisation du contexte Spring,
 * la connexion à la base de données et la création de la SessionFactory Hibernate.
 */
public class TestHibernate {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println("Contexte Spring initialisé avec succès !");
        context.close();
    }
}
