$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("authentification/Authentification.feature");
formatter.feature({
  "line": 2,
  "name": "Authentification - OrangeHRM",
  "description": "En tant que utilisateur je souhaite m\u0027authentifier",
  "id": "authentification---orangehrm",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@connexion"
    }
  ]
});
formatter.before({
  "duration": 3125105900,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Vérifier l\u0027authentification",
  "description": "",
  "id": "authentification---orangehrm;vérifier-l\u0027authentification",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@cnx"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "J\u0027ouvre l\u0027application OrangeHRM",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Je saisie le username \"Admin\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Je saisie le mot de passe \"admin123\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Je clique sur le boutton login",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Redirection vers la page home OrangeHRM \"Welcome Paul\"",
  "keyword": "Then "
});
formatter.match({
  "location": "AuthentificationStepDefinition.jOuvreLApplicationOrangeHRM()"
});
formatter.result({
  "duration": 7945221000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 23
    }
  ],
  "location": "AuthentificationStepDefinition.jeSaisieLeUsername(String)"
});
formatter.result({
  "duration": 107423300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin123",
      "offset": 27
    }
  ],
  "location": "AuthentificationStepDefinition.jeSaisieLeMotDePasse(String)"
});
formatter.result({
  "duration": 84227300,
  "status": "passed"
});
formatter.match({
  "location": "AuthentificationStepDefinition.jeCliqueSurLeBouttonLogin()"
});
formatter.result({
  "duration": 4475472400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Welcome Paul",
      "offset": 41
    }
  ],
  "location": "AuthentificationStepDefinition.redirectionVersLaPageHomeOrangeHRM(String)"
});
formatter.result({
  "duration": 77228600,
  "status": "passed"
});
formatter.after({
  "duration": 1648219200,
  "status": "passed"
});
});