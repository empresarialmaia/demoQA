package automacaoSite.DemoQA.metodos;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import automacaoSite.DemoQA.driver.Driver;

public class Metodos extends Driver {

	public void escrever(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);
	}

	public void clicar(By elemento) {
		driver.findElement(elemento).click();

	}

	public void scroll(int px) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,"+px+")");
	}
	
	public void clicarPorTexto(String atributo, String valor) {
		driver.findElement(By.xpath("//"+atributo+"[contains(text(),'"+valor+"')]")).click();
	}
	
	public void validarTexto(By elemento, String textoEsperado) {
		String textoCapturado = driver.findElement(elemento).getText();
		assertEquals(textoCapturado, textoEsperado);
	}
}
