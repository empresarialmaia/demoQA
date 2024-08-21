package automacaoSite.DemoQA.page;

import org.openqa.selenium.By;

import automacaoSite.DemoQA.metodos.Metodos;

public class TextBoxPage {
	
	 By fullName = By.id("userName");
	 By email = By.id("userEmail");
	 By currentAddress = By.id("currentAddress");
	 By permanentAddress = By.id("permanentAddress");
	 By submit = By.id("submit");
		
     By name = By.xpath("//p[@id='name']");	
     By emailEnviado = By.xpath("//p[@id='email']");	
     By currentA = By.xpath("//p[@id='currentAddress']");	
     By permanentA = By.xpath("//p[@id='permanentAddress']");	
	
	Metodos metodo = new Metodos ();
	
	
	public void clicarNoCard(String menuElements) {
		metodo.scroll(500);
		metodo.clicarPorTexto("h5", menuElements);
		
	}
	
	public void menuTextBox(String menuTextBox) {
		metodo.clicarPorTexto("span", menuTextBox);
		
		
	}
   public void infomacoesFormulario(String fullName, String email, String currentAddress, String permanentAddress) {
	   metodo.escrever(this.fullName, fullName);
	   metodo.escrever(this.email, email);
	   metodo.escrever(this.currentAddress, currentAddress);
	   metodo.escrever(this.permanentAddress, permanentAddress);
	   
	  
   }
   
   public void enviarFormulario() {
	   metodo.scroll(500);
	   metodo.clicar(this.submit);

	   
   }
   
   public void infomacoesValidacaoFormulario(String name, String emailEviado, String currentA, String permanentA) {

	   metodo.validarTexto(this.name, name);
	   metodo.validarTexto(this.emailEnviado, emailEviado);
	   metodo.validarTexto(this.currentA, currentA);
	   metodo.validarTexto(this.permanentA, permanentA);
   }
}
