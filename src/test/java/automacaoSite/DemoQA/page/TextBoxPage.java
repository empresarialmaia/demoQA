package automacaoSite.DemoQA.page;

import automacaoSite.DemoQA.elementos.ElementostextBox;
import automacaoSite.DemoQA.metodos.Metodos;

public class TextBoxPage {
	
	ElementostextBox eleBox = new ElementostextBox();
	
	public void clicarNoCard(String menuElements) {
		Metodos.scroll(500);
		Metodos.clicarPorTexto("h5", menuElements);
		
	}
	
	public void menuTextBox(String menuTextBox) {
		Metodos.clicarPorTexto("span", menuTextBox);
		
		
	}
   public void infomacoesFormulario(String fullName, String email, String currentAddress, String permanentAddress) {
	   Metodos.escrever(eleBox.fullName, fullName);
	   Metodos.escrever(eleBox.email, email);
	   Metodos.escrever(eleBox.currentAddress, currentAddress);
	   Metodos.escrever(eleBox.permanentAddress, permanentAddress);
	   
	  
   }
   
   public void enviarFormulario() {
	   Metodos.scroll(500);
	   Metodos.clicar(eleBox.submit);

	   
   }
   
   public void infomacoesValidacaoFormulario(String fullName, String email, String currentAddress, String permanentAddress) {

	   Metodos.validarTexto(eleBox.name, fullName);
	   Metodos.validarTexto(eleBox.emailEnviado, email);
	   Metodos.validarTexto(eleBox.currentA, currentAddress);
	   Metodos.validarTexto(eleBox.permanentA, permanentAddress);
   }
}
