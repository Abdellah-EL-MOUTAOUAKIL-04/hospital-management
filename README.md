# Gestion Hôpital

Ce projet est une application de gestion hospitalière développée en Java avec le framework Spring Boot. Elle vise à faciliter la gestion des patients, des médecins, des rendez-vous et des consultations au sein d'un établissement hospitalier, en fournissant à la fois des API REST et potentiellement une interface utilisateur web.

## Fonctionnalités principales

L'application est conçue pour offrir les fonctionnalités suivantes (basées sur les entités et services définis) :

- **Gestion des Patients :**
  - Enregistrement et mise à jour des informations des patients (nom, date de naissance, contact, etc.).
  - Consultation de la liste des patients et des détails de chaque patient (exposé via `GET /patients`).
  - (Potentiellement : recherche, suppression des fiches patients via d'autres services ou interfaces).
- **Gestion des Médecins :**
  - Enregistrement et mise à jour des informations des médecins (nom, spécialité, contact, etc.).
  - (Potentiellement : recherche, affichage, modification et suppression des profils médecins via des services ou interfaces).
- **Gestion des Rendez-vous :**
  - Enregistrement et mise à jour des rendez-vous entre un patient et un médecin.
  - Gestion du statut des rendez-vous (ex: Planifié, Confirmé, Annulé, Terminé).
  - (Potentiellement : consultation, modification, annulation des rendez-vous via des services ou interfaces).
- **Gestion des Consultations :**
  - Enregistrement et mise à jour des rapports de consultation.
  - (Potentiellement : association aux rendez-vous/patients, et consultation via des services ou interfaces).

## Technologies utilisées

- **Langage :** Java 17
- **Framework principal :** Spring Boot 3.4.3
  - **Spring Data JPA :** Pour l'interaction avec la base de données.
  - **Spring Web :** Pour la création d'APIs RESTful et d'applications web.
- **Moteur de template (probable) :**
  - Thymeleaf (suggéré par la présence d'un répertoire `templates`, pour le rendu HTML côté serveur).
- **Bases de données :**
  - H2 Database (pour le développement et les tests en mémoire, configurée par défaut).
  - MySQL (connecteur inclus, pour une utilisation en production ou développement principal).
- **Utilitaires :**
  - Lombok : Pour réduire le code boilerplate.
- **Gestion de projet et build :** Maven

## Prérequis

- JDK 17 ou supérieur
- Maven 3.6 ou supérieur
- Un client Git (pour cloner le projet, si applicable)
- Un IDE compatible Java/Spring (ex: IntelliJ IDEA, Eclipse STS)
- (Optionnel) Un serveur MySQL si vous souhaitez l'utiliser à la place de H2.

## Installation

1.  Clonez le dépôt (si applicable, sinon assurez-vous d'avoir le code source) :
    ```bash
    # git clone [URL_DU_DEPOT_GIT_SI_APPLICABLE]
    # cd hospital-management
    ```
2.  Configuration de la base de données :
    - Par défaut, l'application utilise la base de données H2 en mémoire. Aucune configuration supplémentaire n'est requise pour H2.
    - Pour utiliser MySQL, configurez les informations de connexion dans le fichier application.proprties. Si ce fichier contient déjà des configurations pour H2, vous devrez les ajuster ou les commenter pour prioriser MySQL. Exemple de configuration MySQL :
      ```properties
      spring.datasource.url=jdbc:mysql://localhost:3306/votre_base_de_donnees
      spring.datasource.username=votre_utilisateur
      spring.datasource.password=votre_mot_de_passe
      spring.jpa.hibernate.ddl-auto=update # ou create, create-drop selon vos besoins
      spring.jpa.show-sql=true
      # Assurez-vous que les configurations H2 ne sont pas conflictuelles
      # spring.h2.console.enabled=true # Peut être gardé ou mis à false si MySQL est prioritaire
      # spring.datasource.url=jdbc:h2:mem:testdb # A commenter si MySQL est utilisé
      # spring.datasource.driverClassName=org.h2.Driver # A commenter si MySQL est utilisé
      # spring.datasource.username=sa # A commenter si MySQL est utilisé
      # spring.datasource.password= # A commenter si MySQL est utilisé
      ```
3.  Compilez et empaquetez le projet avec Maven :
    ```bash
    mvn clean install
    ```

## Utilisation

Pour lancer l'application :

```bash
mvn spring-boot:run
```

---

© Réalisé par **EL MOUTAOUAKIL Abdellah** – [abdamota123@gmail.com](mailto:abdamota123@gmail.com)
