# Projet E-commerce

## Description
Ce projet est une application d'e-commerce complète qui regroupe quatre composants principaux :
1. **Backend** : Une application Spring Boot avec PostgreSQL pour la gestion des commandes, des stocks et des utilisateurs.
2. **Frontend Utilisateurs** : Une application Angular pour l'interface utilisateur permettant aux clients de naviguer, d'acheter des produits, et de gérer leur compte.
3. **Backoffice Administrateurs** : Une application Angular dédiée aux administrateurs pour la gestion des stocks, des produits et des utilisateurs.
4. **Système de Recommandation** : Une application Python utilisant TensorFlow et Keras pour fournir des recommandations personnalisées de produits aux clients.

## Structure du Projet

- **Backend (Spring Boot)**
  - Gestion des commandes : création, mise à jour, suppression, suivi.
  - Gestion des stocks : suivi des niveaux de stock, gestion des entrées et sorties de produits.
  - Gestion des utilisateurs : authentification, autorisation, gestion des profils.
  - Base de données : PostgreSQL.

- **Frontend Utilisateurs (Angular)**
  - Interface utilisateur conviviale pour la navigation dans les produits.
  - Gestion du panier et processus de commande.
  - Système de recherche et de filtrage des produits.
  - Espace utilisateur pour la gestion du compte.

- **Backoffice Administrateurs (Angular)**
  - Interface de gestion des stocks et des produits.
  - Gestion des utilisateurs : création, suppression, modification des rôles.
  - Suivi des commandes et gestion des retours.

- **Système de Recommandation (Python, TensorFlow, Keras)**
  - Recommandations de produits basées sur l'historique d'achat et les préférences des clients.
  - Modèles de machine learning pour analyser les données des utilisateurs et prédire les produits susceptibles de les intéresser.

## Prérequis

### Backend
- Java 17+
- Maven 3.6+
- PostgreSQL 12+

### Frontend Utilisateurs & Backoffice Administrateurs
- Node.js 14+
- Angular CLI 12+

### Système de Recommandation
- Python 3.8+
- TensorFlow 2.5+
- Keras 2.4+

## Installation
git clone https://github.com/username/salesapp.git

### 1. Backend
cd backend-ecommerce

#### Configurer la base de données PostgreSQL
#### Modifier les paramètres dans src/main/resources/application.properties

#### Construire et exécuter l'application
mvn clean install
mvn spring-boot:run

### 2. Frontend utilisateurs
cd ecommerce-salesapp

#### Installer les dépendances
npm install

#### Lancer l'application
ng serve

### 3. Backoffice administrateurs
cd stockage-salesapp

#### Installer les dépendances
npm install

#### Lancer l'application
ng serve --open

### 4. Système de recommandation
cd recommander-server-salesapp

#### Créer un environnement virtuel et installer les dépendances
python3 -m venv venv
source venv/bin/activate
pip install -r requirements.txt

#### Entraîner le modèle (si nécessaire) et lancer les recommandations


## Utilisation
### Backend
L'API RESTful est disponible à l'adresse http://localhost:8080/salesapp/api. Vous pouvez utiliser des outils comme Postman pour tester les différents endpoints (gestion des commandes, utilisateurs, stocks, etc.).

### Frontend Utilisateurs
Accédez à l'interface utilisateur via http://localhost:4200. Les utilisateurs peuvent naviguer sur le site, ajouter des produits à leur panier, et finaliser leur commande.

### Backoffice Administrateurs
Accédez à l'interface d'administration via http://localhost:4200/admin. Les administrateurs peuvent gérer les stocks, les produits, et les utilisateurs.

### Système de Recommandation
Le système de recommandation peut être utilisé pour fournir des suggestions personnalisées aux utilisateurs dans le frontend.

### Auteurs
Touré William - Développeur Principal - GitHub
