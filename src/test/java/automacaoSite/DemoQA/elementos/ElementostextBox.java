package automacaoSite.DemoQA.elementos;

import org.openqa.selenium.By;

public class ElementostextBox {

	public By fullName = By.id("userName");
	public By email = By.id("userEmail");
	public By currentAddress = By.id("currentAddress");
	public By permanentAddress = By.id("permanentAddress");
	public By submit = By.id("submit");
	
	//elementos formulário enviado
    public By name = By.xpath("//p[@id='name']");	
    public By emailEnviado = By.xpath("//p[@id='email']");	
    public By currentA = By.xpath("//p[@id='currentAddress']");	
    public By permanentA = By.xpath("//p[@id='permanentAddress']");	


}
