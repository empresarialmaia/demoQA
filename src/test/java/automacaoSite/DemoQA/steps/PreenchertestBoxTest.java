package automacaoSite.DemoQA.steps;

import automacaoSite.DemoQA.page.TextBoxPage;
import automacaoSite.DemoQA.runner.Executa;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PreenchertestBoxTest {

	TextBoxPage page = new TextBoxPage();
	
	@After
	public void encerrarTeste() {
		Executa.fecharNavegador();
	}

	@Given("que esteja na tela de principal")
	public void queEstejaNaTelaDePrincipal() {
		Executa.abrirNavegador("chrome");

	}

	@When("clicar no menu elements")
	public void clicarNoMenuElements() {
		page.clicarNoCard("Elements");

	}

	@When("clicar em text box")
	public void clicarEmTextBox() {
		page.menuTextBox("Text Box");

	}

	@When("preencher todos os campos")
	public void preencherTodosOsCampos() {
		page.infomacoesFormulario("Eduardo", "eduardo.eduardo@gmail.com", "teste1", "teste2");
	}

	@Then("formulario deve ser enviado com sucesso")
	public void formularioDeveSerEnviadoComSucesso() {
		page.enviarFormulario();
		page.infomacoesValidacaoFormulario("Name:Eduardo", "Email:eduardo.eduardo@gmail.com", "Current Address :teste1",
				"Permananet Address :teste2");
		

	}

}
