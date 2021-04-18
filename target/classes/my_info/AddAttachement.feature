@info3
Feature: Edit my info3 - Orange HRM
  En tant que utilisateur je souhaite ajouter un fichier

Background: 
    Given J'ouvre l'application OrangeHRM
    When Je saisie le username "Admin"
    And Je saisie le mot de passe "admin123"
    And Je clique sur le boutton login
    Then Redirection vers la page home OrangeHRM "Welcome Paul"

  
  Scenario: Edit my info3 - Orange HRM
    WhenWhen Je clique sur le module MyInfo  
    And Je clique sur le boutton AddFile
    And Je choisis un fichiers "C:\Users\Taher\Desktop\Formation Selenuim" 
    Then Je clique sur le boutton upload

 