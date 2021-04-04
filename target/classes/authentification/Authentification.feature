@connexion
Feature: Authentification - OrangeHRM
 En tant que utilisateur je souhaite m'authentifier

  @cnx
  Scenario: Vérifier l'authentification 
    Given J'ouvre l'application OrangeHRM
    When Je saisie le username
    And Je saisie le mot de passe
    And Je clique sur le boutton login
    Then Redirection vers la page home OrangeHRM
    

