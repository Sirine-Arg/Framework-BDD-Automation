@Admin
Feature: Ajouter Admin - Orange HRM
  En tant que utilisateur je souhaite ajouter des admins dans la liste system users

  Background: 
    Given J'ouvre l'application OrangeHRM
    When Je saisie le username "Admin"
    And Je saisie le mot de passe "admin123"
    And Je clique sur le boutton login
    Then Redirection vers la page home OrangeHRM "Welcome Paul"

  Scenario Outline: Ajouter Admin - OrangeHRM
    When Je clique sur le module Admin
    And Je clique sur le boutton Add
    And je saisie le champ Employee Name "<Employee>"
    And je saisie le champ Username "<Username>"
    And je saisie le champ Password "<Password>"
    And je saisie le champ Confirm Password "<Confirm Password>"
    Then je clique sur le boutton Save

    #And je remplis le formulaire User System "<Employee>" et "<Username>" et "<Password>" et "<Confirm Password>"
    Examples: 
      | Employee | Username | Password   | Confirm Password |
      | Sirine   | Argoubi  | sirine123  | sirine123        |
      | Fadhila  | Ayachi   | Fadhila123 | Fadhila123       |
      | Taher    | taher    | taher123   | taher123         |
      | Meriam   | Cheb     | meriam123  | meriam123        |
