@buzz
Feature: Module buzz - OrangeHRM
  En tant que utilisateur je souhaite verifier le module buzz

  Background: 
    Given J'ouvre l'application OrangeHRM
    When Je saisie le username "Admin"
    And Je saisie le mot de passe "admin123"
    And Je clique sur le boutton login
    Then Redirection vers la page home OrangeHRM "Welcome Paul"

  Scenario: Module buzz - OrangeHRM
    When Je clique sur le module Buzz
    And Je saisie un message dans le champ Update Status "I do my homework"
