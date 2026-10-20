package com.microservice.product;

import com.microservice.product.config.AppConfig;
import com.microservice.product.entity.Product;
import com.microservice.product.service.ProductService;
import com.microservice.product.service.ProductServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        // Démarrage du conteneur Spring IoC
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Récupération du service métier géré par Spring
        ProductService productService = context.getBean(ProductService.class);

        // Création et persistance d'un nouveau produit
        Product p = new Product("Microservice Gateway", 149.99);
        productService.addProduct(p);

        // Vérification et affichage du total en base
        System.out.println("Produit ajouté avec succès ! Total en base : " + productService.getAllProducts().size());

        // Affichage des produits présents pour visualiser le résultat
        System.out.println("--- Produits enregistrés en base ---");
        for (Product prod : productService.getAllProducts()) {
            System.out.println("ID: " + prod.getId() + " | Nom: " + prod.getName() + " | Prix: " + prod.getPrice() + " €");
        }

        // Fermeture du contexte Spring
        context.close();
    }
}
