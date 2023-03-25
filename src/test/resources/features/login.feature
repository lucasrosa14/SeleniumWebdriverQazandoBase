# language: pt

  @login
  Funcionalidade: Login
    Eu como usuário do sistema
    Quero fazer login
    Para fazer uma compra no site

    @login-sucesso
    Cenário: Login com sucesso
      Dado que estou na tela de login
      Quando preencho login "eduardo.finotti@qazando.com" e senha "123456"
      E clico em Login
      Então vejo mensagem de login com sucesso