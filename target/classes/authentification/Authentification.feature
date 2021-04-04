@connexion
Feature: Authentification - OrangeHRM
 En tant que utilisateur je souhaite m'authentifier

  @cnx
  Scenario: Vérifier l'authentification 
    Given j'ouvre l'application OrangeHRM
    When je saisie le username
    And je saisie le mot de passe
    And je clique sur le boutton login
    Then Redirection vers la page home OrangeHRM
    

