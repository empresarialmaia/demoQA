package automacaoSite.DemoQA.steps;

import automacaoSite.DemoQA.page.TextBoxPage;
import automacaoSite.DemoQA.runner.Executa;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PreenchertestBoxTest {

	TextBoxPage page = new TextBoxPage();

	@Given("que esteja na tela de principal {string}")
	public void queEstejaNaTelaDePrincipal(String url) {
		Executa.iniciarTest(url);

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
		Executa.encerrarTeste();

	}

}
