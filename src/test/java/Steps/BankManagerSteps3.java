package Steps;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.example.BankManager;



import static org.junit.jupiter.api.Assertions.assertEquals;


public class BankManagerSteps3 {
    /*Scenario 1*/
    private BankManager bankManager;


    @Given("Deux compte bancaire sont cree le {int} avec un solde de {double}")
    public void Un_nouveau_compte_bancaire(int premier, double solde1) {
        System.out.println("Dans Given");
        bankManager = new BankManager();
        bankManager.create(premier);
        bankManager.deposit(premier,solde1);
    }
    @And("Un compte {int} avec un solde de {double}")
    public void Un_second_compte_bancaire(int second, double solde2) {
        System.out.println("Dans And Given");
        bankManager.create(second);
        bankManager.deposit(second,solde2);
    }

    @When("Je depose {double} dans le second compte {int}")
    public void je_depose_dans_le_compte(double montant, int second){
        System.out.println("Dans When");
        bankManager.deposit(second,montant);
    }

    @And("Je retire {double} dans le premier compte {int}")
    public void je_retire_dans_le_compte(double montant, int premier){
        System.out.println("Dans And When");
        bankManager.withdraw(premier,montant);
    }



    @Then("Le solde du compte {int} qui retire est de {double}")
    public void le_Solde_DuCompte1(int premier, double attendue1) {
        System.out.println("Dans Then");
        assertEquals(attendue1,bankManager.getBalance(premier));
        System.out.println(" SUCCES 1 ");
    }

    @And("Le solde du compte {int} qui recoit est de {double}")
    public void le_Solde_DuCompte2(int second, double attendue2) {
        System.out.println("Dans And Then");
        assertEquals(attendue2,bankManager.getBalance(second));
        System.out.println(" SUCCES 2 ");
        System.out.println(" ");
    }

    }
