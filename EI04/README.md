# Projeto Web Apache Tomcat
---

O **Apache Tomcat** é um **servidor web e contêiner de Servlets/JSP** de código aberto, amplamente usado para executar aplicações web **Java**.

Ele implementa especificações do **Jakarta EE** (antigo Java EE) como Servlets, JSP, EL e WebSocket, fornecendo um ambiente para que o código Java da sua aplicação web seja executado e acessível via navegadores.

Não existe um "Tomcat EE" oficial; quando se fala em Tomcat nesse contexto, refere-se ao **Apache Tomcat** tradicional, que é um componente chave para muitas aplicações web Java, mas não um servidor Jakarta EE completo (que incluiria todas as especificações, como EJB, JMS, etc.). Ele é valorizado por ser leve, robusto e ter uma vasta comunidade de suporte.

-----

###  Instalação do Apache Tomcat EE

1.  Baixe a versão desejada do Apache Tomcat EE do [site oficial do Apache Tomcat](https://tomcat.apache.org/).
2.  Descompacte o arquivo ZIP/TAR.GZ em um diretório de sua preferência (ex: `C:\tomcat` ou `~/tomcat`).

### Configuração do Tomcat no NetBeans

1.  Abra o **Apache NetBeans IDE**.
2.  Vá em `Tools` \> `Servers`.
3.  Clique no botão `Add Server...`.
4.  Selecione `Apache Tomcat or TomEE` e clique em `Next >`.
5.  No campo `Server Location`, navegue até o diretório onde você descompactou o Tomcat (passo 2).
6.  Opcionalmente, insira um `Username` e `Password` se você configurou credenciais para o Tomcat Manager.
7.  Clique em `Finish`.

-----

## 📂 Estrutura do Projeto

A estrutura de diretórios do projeto no NetBeans será similar a esta:

```
MeuProjetoWeb/
├── web/
│   ├── WEB-INF/
│   │   ├── web.xml          (Descritor de implantação - opcional para Servlets 3.0+)
│   │   └── lib/             (Bibliotecas JAR do projeto)
│   ├── index.jsp            (Página de boas-vindas padrão, se existir)
│   └── (outros arquivos estáticos como CSS, JS, imagens)
└── src/
    └── java/
        └── com/
            └── example/
                └── web/
                    └── BoasVindasServlet.java
```

  * **`web/`**: Contém os arquivos web acessíveis publicamente (HTML, JSP, CSS, JS) e o diretório `WEB-INF`.
  * **`WEB-INF/`**: Contém recursos privados da aplicação, como o `web.xml` (se usado) e bibliotecas.
  * **`src/main/java/`**: Contém o código-fonte Java da sua aplicação.

-----

## 💻 Como Compilar e Executar

Siga os passos abaixo para implantar e executar o projeto no Tomcat usando o NetBeans:

1.  **Abra o Projeto no NetBeans:**

      * No NetBeans, vá em `File` \> `Open Project...` e selecione a pasta raiz do seu projeto web.

2.  **Verifique o Código-Fonte do Servlet:**

      * Navegue até `src/main/java/com/mycompany/ei04/BoasVindasServlet.java` e revise o código.
      * Certifique-se de que o pacote (`package com.mycompany.ei04;`) corresponde à estrutura de pastas do seu projeto.

3.  **Execute o Projeto:**

      * No painel `Projects` do NetBeans, clique com o botão direito no seu projeto (ex: `EI04`).
      * Selecione a opção `Run`.

    O NetBeans irá:

      * Compilar o código Java.
      * Construir o arquivo `.war` da sua aplicação.
      * Iniciar o servidor Tomcat (se ainda não estiver rodando).
      * Implantar a aplicação (`.war`) no Tomcat.
      * Abrir automaticamente seu navegador padrão na URL base da sua aplicação (ex: `http://localhost:8080/EI04/`).

4.  **Acesse o Serviço de Boas-Vindas:**

      * Após a implantação, no seu navegador, navegue para a seguinte URL:
        ```
        http://localhost:8080/EI04/boasvindas
        ```

    Você deverá ver a mensagem "Olá do Servlet de Boas-Vindas\!" exibida no navegador.

-----
