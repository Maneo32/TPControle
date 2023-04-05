@US1
Feature: Gerer les comptes bancaires
  En tant que manager
  je veux gerer les comptes
  A fin de connaitre la situation du bank

  @Depot
  Scenario Outline: Creation et depot sur un compte
    Given Un nouveau compte bancaire <numero> est cree avec un solde initiale de <solde>
    When Je depose <montant> dans le compte <numero>
    Then Le solde du compte <numero> est de <attendue>

    Examples:
    | numero | solde | montant | attendue |
    | 1      | 1000  | 500     | 1500     |

  @Depot2
  Scenario Outline: Creation depot puis retrait sur le compte
    Given Un nouveau compte bancaire <numero> est cree avec un solde de <solde>
    When Je depose <montant> dans le nouveau compte <numero>
    And Je retire <retire> dans le nouveau compte <numero>
    Then Le solde du compte <numero> est de <attendue> maintenant

    Examples:
      | numero | solde | montant | retire | attendue |
      | 3      | 1000  | 500     | 200    | 1300     |

  @Depot3
  Scenario Outline: Envoie argent
    Given Deux compte bancaire sont cree le <premier> avec un solde de <solde1>
    And Un compte <second> avec un solde de <solde2>
    When Je depose <montant> dans le second compte <second>
    And Je retire <montant> dans le premier compte <premier>
    Then Le solde du compte <premier> qui retire est de <attendue1>
    And Le solde du compte <second> qui recoit est de <attendue2>

    Examples:
      | premier | solde1 | second | solde2 | montant | attendue1 | attendue2 |
      | 3       | 1000   | 1      | 200    | 300     | 700       | 500       |






