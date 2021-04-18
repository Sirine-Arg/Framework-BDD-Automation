@myinfo
Feature: Edit my info - OrangeHRM
 En tant que utilisateur je souhaite modifier mes info


 Background: 
    Given J'ouvre l'application OrangeHRM
    When Je saisie le username "Admin"
    And Je saisie le mot de passe "admin123"
    And Je clique sur le boutton login
    Then Redirection vers la page home OrangeHRM "Welcome Paul"

  Scenario: Edit my info - OrangeHRM
    When Je clique sur le module My Info
    And Je clique sur le boutton Edit
    And je saisie le champ Full Name "<Name>"
    Then Je clique sur le boutton Save

