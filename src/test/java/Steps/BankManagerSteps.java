package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.example.BankManager;



import static org.junit.jupiter.api.Assertions.assertEquals;


public class BankManagerSteps {
    /*Scenario 1*/
    private BankManager bankManager;


    @Given("Un nouveau compte bancaire {int} est cree avec un solde initiale de {double}")
    public void Un_nouveau_compte_bancaire(int idAccount, double solde) {
        System.out.println("Dans Given");
        bankManager = new BankManager();
        bankManager.create(idAccount);
        bankManager.deposit(idAccount,solde);
    }

    @When("Je depose {double} dans le compte {int}")
    public void je_depose_dans_le_compte(double montant, int idAccount){
        System.out.println("Dans When");
        bankManager.deposit(idAccount,montant);
    }

    @Then("Le solde du compte {int} est de {double}")
    public void Le_solde_du_compte(int idAccount,double attendue){
        System.out.println("Dans Then");
        assertEquals(attendue,bankManager.getBalance(idAccount));
        System.out.println(" SUCCES ");
        System.out.println(" ");

    }
}
