# Livro - Projet de Librairie en Ligne

## [](https://github.com/mvfoliveira/projeta21_complete_final/blob/main/README.md#table-des-mati%C3%A8res)Table des matières

- [Introduction](https://github.com/mvfoliveira/projeta21_complete_final/blob/main/README.md#introduction)
- [Technologies utilisées](https://github.com/mvfoliveira/projeta21_complete_final/blob/main/README.md#technologies-utilis%C3%A9es)
- [Architecture de l'application](https://github.com/mvfoliveira/projeta21_complete_final/blob/main/README.md#architecture-de-l'application)
    - [Backend](https://github.com/mvfoliveira/projeta21_complete_final/blob/main/README.md#backend)
    - [Frontend](https://github.com/mvfoliveira/projeta21_complete_final/blob/main/README.md#frontend)
- [Endpoints de l'API](https://github.com/mvfoliveira/projeta21_complete_final/blob/main/README.md#endpoints-de-lapi)
- [Installation](https://github.com/mvfoliveira/projeta21_complete_final/blob/main/README.md#installation)
- [Exécution du projet](https://github.com/mvfoliveira/projeta21_complete_final/blob/main/README.md#ex%C3%A9cution-du-projet)
- [Auteurs](https://github.com/mvfoliveira/projeta21_complete_final/blob/main/README.md#Auteurs)

## [](https://github.com/mvfoliveira/projeta21_complete_final/blob/main/README.md#introduction)Introduction

Livro est une application web de librairie en ligne, construite en utilisant le modèle d'architecture des microservices. Elle permet aux utilisateurs de parcourir la liste des livres disponibles, d'ajouter des livres à leur panier, de passer des commandes, et aussi de s'inscrire et se connecter à l'application.

## [](https://github.com/mvfoliveira/projeta21_complete_final/blob/main/README.md#technologies-utilis%C3%A9es)Technologies utilisées

- Backend: Spring Boot et Spring Gateway
- Frontend: Angular
- Base de données: MySQL
- Outil de construction: Maven

## [](https://github.com/mvfoliveira/projeta21_complete_final/blob/main/README.md#architecture-de-lapplication)Architecture de l'application

[![Schéma d'architecture](https://github.com/mvfoliveira/projeta21_complete_final/raw/main/images/arch.svg)](https://github.com/mvfoliveira/projeta21_complete_final/blob/main/images/arch.svg)

### [](https://github.com/mvfoliveira/projeta21_complete_final/blob/main/README.md#backend)Backend

L'architecture du système Livro est basée sur l'architecture des microservices. Ainsi, l'application est divisée en services indépendants. Pour Livro, il y a deux principaux microservices : Livres et User. Ces services sont chacun construits avec Spring Boot et ils communiquent avec le frontend via une passerelle API construite avec Spring Gateway.

#### [](https://github.com/mvfoliveira/projeta21_complete_final/blob/main/README.md#microservice-livres)Microservice Livres

Ce microservice gère toutes les fonctionnalités liées aux livres. Il a sa propre base de données et expose ses propres endpoints. Il est responsable des opérations CRUD sur les livres.

#### [](https://github.com/mvfoliveira/projeta21_complete_final/blob/main/README.md#microservice-user)Microservice User

Ce microservice gère toutes les fonctionnalités liées aux utilisateurs. Il a également sa propre base de données et expose ses propres endpoints. Il est responsable de l'authentification des utilisateurs et de la gestion des informations sur les utilisateurs.

- **Modèles** : Ces entités représentent les données qui seront stockées dans la base de données. Nous avons les modèles `Utilisateur` pour les utilisateurs et `Livres` pour les livres.
    
- **Repository** : Cette couche est utilisée pour interagir avec la base de données. Elle utilise Spring Data JPA pour effectuer les opérations CRUD (Create, Read, Update, Delete) sur les modèles.
    
- **Service** : Cette couche contient la logique métier de l'application. Elle fait appel à la couche repository pour interagir avec la base de données.
    
- **Contrôleur** : Cette couche gère les requêtes HTTP entrantes et renvoie les réponses HTTP. Elle utilise la couche service pour obtenir les données nécessaires.
    

### [](https://github.com/mvfoliveira/projeta21_complete_final/blob/main/README.md#frontend)Frontend

Le frontend de l'application est construit en utilisant le framework Angular. Il comprend plusieurs composants pour gérer les différentes parties de l'application, tels que l'affichage des livres, le détail des livres, l'inscription des utilisateurs, la connexion et le panier d'achats.

- `AppComponent` : Le composant principal de l'application.
    
- `LivresComponent` : Le composant pour afficher la liste des livres disponibles.
    
- `LivredetailsComponent` : Le composant pour afficher les détails d'un livre spécifique.
    
- `LoginComponent` : Le composant pour la page de connexion.
    
- `InscriptionComponent` : Le composant pour la page d'inscription.
    
- `CartComponent` : Le composant pour gérer la page du panier d'achats.
    

## [](https://github.com/mvfoliveira/projeta21_complete_final/blob/main/README.md#bases-de-donn%C3%A9es)Bases de données

Chaque microservice possède sa propre base de données afin d'assurer l'isolation des données et d'éviter toute interférence entre les services. MySQL est utilisé pour gérer les bases de données.

- La base de données du microservice Livres stocke les informations sur les livres disponibles.
    
- La base de données du microservice User stocke les informations sur les utilisateurs, y compris leurs informations d'authentification.
    

## [](https://github.com/mvfoliveira/projeta21_complete_final/blob/main/README.md#api-gateway)API Gateway

L'API Gateway, construite en utilisant Spring Gateway, est un point d'entrée unique pour le frontend pour accéder aux microservices. Elle achemine les requêtes du frontend vers le microservice approprié et renvoie les réponses au frontend.

[![Diagramme de séquence](https://github.com/mvfoliveira/projeta21_complete_final/raw/main/images/sequ.svg)](https://github.com/mvfoliveira/projeta21_complete_final/blob/main/images/sequ.svg)

## [](https://github.com/mvfoliveira/projeta21_complete_final/blob/main/README.md#endpoints-de-lapi)Endpoints de l'API

Voici une liste des principaux endpoints de l'API :

- `GET /livres` : Retourne une liste de tous les livres disponibles.
- `GET /livres/{id}` : Retourne les détails d'un livre spécifique.
- `POST /utilisateurs/ajouterutilisateur` : Crée un nouvel utilisateur.
- `POST /login` : Authentifie un utilisateur existant.

## [](https://github.com/mvfoliveira/projeta21_complete_final/blob/main/README.md#installation)Installation

Pour installer et configurer ce projet localement, suivez les étapes suivantes :

1. Assurez-vous que vous avez installé Java 8 ou une version ultérieure, Node.js, Angular CLI et MySQL.
    
2. Clonez le dépôt Git sur votre machine locale en utilisant la commande `git clone`.
    
3. Dans le répertoire du backend du projet, exécutez la commande `mvn clean install` pour installer les dépendances du projet.
    
4. Dans le répertoire du frontend, exécutez la commande `npm install` pour installer les dépendances du projet.
    

## [](https://github.com/mvfoliveira/projeta21_complete_final/blob/main/README.md#ex%C3%A9cution-du-projet)Exécution du projet

Une fois que vous avez correctement installé le projet, vous pouvez l'exécuter en suivant ces étapes :

1. Démarrer le serveur de base de données MySQL.
    
2. Dans le répertoire du backend, exécutez la commande `mvn spring-boot:run` pour démarrer le serveur backend.
    
3. Dans le répertoire du frontend, exécutez la commande `ng serve` pour démarrer le serveur frontend.
    
4. Ouvrez votre navigateur et allez à `http://localhost:4200` pour voir l'application en action.
    

## [](https://github.com/mvfoliveira/projeta21_complete_final/blob/main/README.md#auteurs)Auteurs

- Marcos Olveira
- Hassan Yaghi
- Jamila El Kerbani
- Zakia Katem
