@info2
Feature: Edit my info2 - Orange HRM
  En tant que utilisateur je souhaite ajouter le type du sang


Background: 
    Given J'ouvre l'application OrangeHRM
    When Je saisie le username "Admin"
    And Je saisie le mot de passe "admin123"
    And Je clique sur le boutton login
    Then Redirection vers la page home OrangeHRM "Welcome Paul"

  Scenario: Edit my info2 - OrangeHRM
    When Je clique sur le module My Info
    And JE clique sur le boutton Edit 
    And je selectionne le type du sang
    Then Je clique sur le boutton save
    

  
