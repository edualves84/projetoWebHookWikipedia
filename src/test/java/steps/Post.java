package steps;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static org.junit.Assert.assertTrue;

public class Post extends Base {
    private Base base;

    public Post (Base base){
        this.base = base;
    }


   /* @Dado("^que acesso a Wikipedia em portugues$")
    public void queAcessoAWikipediaEmPortugues(){
        base.driver.get(url);

    }

    @Quando("^pesquiso por \"([^\"]*)\"$")
    public void pesquisoPor(String produto)   {
      base.driver.findElement(By.name("search")).sendKeys(produto + Keys.ENTER);


    }

    @Entao("^exibe a expressao \"([^\"]*)\" no titulo da guia$")
    public void exibeAExpressaoNoTituloDaGuia(String produto)  {
     assertTrue(base.driver.getTitle().contains(produto));
    }


    */
    @Given("^que acesso a Wikipedia em portugues$")
    public void queAcessoAWikipediaEmPortugues(){
        base.driver.get(url);

    }

    @When("^pesquiso por \"([^\"]*)\"$")
    public void pesquisoPor(String produto)   {
        base.driver.findElement(By.name("search")).sendKeys(produto + Keys.ENTER);


    }

    @Then("^exibe a expressao \"([^\"]*)\" no titulo da guia$")
    public void exibeAExpressaoNoTituloDaGuia(String produto)  {
        assertTrue(base.driver.getTitle().contains(produto));
    }










}
