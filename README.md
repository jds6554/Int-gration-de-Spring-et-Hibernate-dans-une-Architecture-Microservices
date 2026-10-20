# Intégration de Spring et Hibernate dans une Architecture Microservices

Projet de laboratoire démontrant la mise en place d'une couche de persistance robuste au sein d'un microservice Java en combinant **Spring Framework** (IoC, Transactions) et **Hibernate** (ORM / JPA) via le **pattern DAO générique `<T>`**.

---

## 🎯 Objectifs

- **Gestion des dépendances Maven** : intégration conjointe de Spring Context, Spring ORM, Hibernate Core et du pilote JDBC MySQL.
- **Pattern DAO Générique `<T>`** : factorisation et mutualisation des opérations CRUD de base (`save`, `update`, `delete`, `findById`, `findAll`).
- **Configuration Spring & Hibernate** : utilisation de `@Configuration` avec `DriverManagerDataSource` et `LocalSessionFactoryBean` pour la gestion des entités.
- **Transactions déclaratives** : orchestration des frontières transactionnelles via l'annotation `@Transactional` et `HibernateTransactionManager`.
- **Validation métier** : séparation claire entre la couche DAO (accès données) et la couche Service (règles de gestion et vérifications).

---

## 🏗️ Structure du Projet

```text
microservice-product/
├── pom.xml
├── README.md
└── src/
    └── main/
        ├── resources/
        │   └── application.properties
        └── java/
            └── com/
                └── microservice/
                    └── product/
                        ├── MainApp.java
                        ├── TestHibernate.java
                        ├── config/
                        │   ├── AppConfig.java
                        │   ├── HibernateConfig.java
                        │   └── TransactionConfig.java
                        ├── dao/
                        │   ├── IDao.java
                        │   └── ProductDaoImpl.java
                        ├── entity/
                        │   └── Product.java
                        └── service/
                            ├── ProductService.java
                            └── ProductServiceImpl.java
```

---

## ⚙️ Configuration & Prérequis

- **Java JDK** : 11 ou supérieur
- **Apache Maven** : 3.6+
- **SGBD** : MySQL (ou PostgreSQL en adaptant le driver et le dialecte)

### 1. Base de données
Créer la base MySQL locale :
```sql
CREATE DATABASE IF NOT EXISTS product_db;
```

### 2. Paramètres de connexion
Adapter au besoin les identifiants dans `src/main/resources/application.properties` :
```properties
jdbc.driver=com.mysql.cj.jdbc.Driver
jdbc.url=jdbc:mysql://localhost:3306/product_db?useSSL=false&serverTimezone=UTC
jdbc.username=root
jdbc.password=secret

hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
hibernate.show_sql=true
hibernate.hbm2ddl.auto=update
```

---

## 🚀 Exécution

### Test de connexion et d'initialisation du contexte :
Lancer la classe `com.microservice.product.TestHibernate`.

### Test du scénario complet (Création & Consultation de produits) :
Lancer la classe `com.microservice.product.MainApp`.
