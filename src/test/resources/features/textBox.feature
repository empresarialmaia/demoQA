
@regressivoFormulario @regressivo
Feature: Preenchimento dos campos formulario
  COMO usuario do sistema
  QUERO inserir os dados necessarios
  PARA enviar as informacoes com sucesso
  
  Background: Como usuario do sistema
    Given que esteja na tela de principal "https://demoqa.com/"

  @positivo
  Scenario: preencher o formulario com sucesso
    When clicar no menu elements
    And clicar em text box
    And preencher todos os campos
    Then formulario deve ser enviado com sucesso
    

 