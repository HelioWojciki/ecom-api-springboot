# E-commerce API | Spring Boot

<p align="center">
  <img src="https://img.shields.io/badge/Spring%20Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white" />
  <img src="https://img.shields.io/badge/Java-007396?style=for-the-badge&logo=java&logoColor=white" />
  <img src="https://img.shields.io/badge/PostgreSQL-316192?style=for-the-badge&logo=postgresql&logoColor=white" />
  <img src="https://img.shields.io/badge/JPA%20/%20Hibernate-59666C?style=for-the-badge&logo=hibernate&logoColor=white" />
</p>

## API Online

A API está disponível para testes em produção:

[![API Online](https://img.shields.io/badge/API-Online-brightgreen?style=for-the-badge)](https://hecom-api.up.railway.app)

## Testando a API Online

A API está hospedada no Railway e pode ser testada, mas:

- `GET` endpoints podem ser acessados diretamente pelo navegador.
- `POST`, `PUT` e `DELETE` precisam de ferramentas como **Postman**, **Insomnia** ou **curl**.



<br><br><br><br>
## Sobre o Projeto

Este projeto é uma API REST que simula o backend de um sistema de comércio eletrônico. Desenvolvido em Java com o framework **Spring Boot**, a aplicação é responsável por gerenciar:

* **Usuários** (Clientes)
* **Produtos** e suas **Categorias**
* **Pedidos** (Orders) com diferentes status (`WAITING_PAYMENT`, `PAID`, etc.)
* **Itens de Pedido** (OrderItem), utilizando uma chave primária composta (PK Composta) para mapear a relação N:M.



<br><br><br><br>
## Tecnologias Utilizadas

O projeto foi desenvolvido com as seguintes ferramentas e tecnologias:

* **Linguagem:** Java (JDK 17+)
* **Framework:** Spring Boot 3
* **Persistência:** Spring Data JPA & Hibernate
* **Banco de Dados:** H2 (padrão para testes)
* **Gerenciador de Dependências:** Maven



<br><br><br><br>
## Arquitetura

A aplicação segue o padrão de arquitetura em camadas (MVC Service-Repository) para garantir alta manutenibilidade e separação de responsabilidades (SRP - _Single Responsibility Principle_).

| Camada | Pacote | Função |
| :--- | :--- | :--- |
| **Resources** | `com.helio.ecom_api_springboot.resources` | Controladores REST (`@RestController`) |
| **Services** | `com.helio.ecom_api_springboot.services` | Lógica de Negócio (`@Service`) |
| **Repositories**| `com.helio.ecom_api_springboot.repositories`| Acesso a dados (`@Repository`) |
| **Entities** | `com.helio.ecom_api_springboot.entities` | Mapeamento Objeto-Relacional (`@Entity`) |

> **Destaque de Design:** A relação **Pedido - Produto** é mapeada pela entidade `OrderItem`, que usa a classe `OrderItemPK` (`@EmbeddedId`) para implementar uma **Chave Primária Composta** com as FKs de `Order` e `Product`, garantindo a unicidade de cada item dentro de um pedido.



<br><br><br><br>
## Como Executar o Projeto

### Pré-requisitos

Certifique-se de ter instalado:
* Java JDK 17+
* Maven
* Uma IDE de sua preferência (IntelliJ IDEA, VS Code, Eclipse)

<br>

### Passo a Passo

1.  **Clone o repositório:**
    ```bash
    git clone https://github.com/HelioWojciki/ecom-api-springboot.git
    ```

2.  **Configurar o Banco de Dados:**
    <br>
    O projeto possuí um perfil de desenvolvimento (dev) já configurado para PostgreSQL, para facilitar o teste local.<br>
    No arquivo `application.properties`, certifique-se de deixar `spring.profiles.active=dev`.<br>

    Em seguida, crie um banco de exemplo no PostgreSQL:<br>
    `CREATE DATABASE springboot_ecom`;<br>

    e configure as credenciais no arquivo application-dev.properties:<br>

    `spring.datasource.url=jdbc:postgresql://localhost:5432/springboot_ecom` <!-- substitua "springboot_ecom" caso queira outro nome de banco --><br>
    `spring.datasource.username=postgres` <!-- substitua "postgres" caso seu usuário seja diferente --><br>
    `spring.datasource.password=root` <!-- substitua "root" pela sua senha caso necessário --><br>
    `spring.jpa.hibernate.ddl-auto=update`<br>
    Observação: Se você quiser usar outro banco, usuário ou senha, basta alterar os valores acima conforme necessário.
    <br>
    Com isso, o Spring Boot usará o PostgreSQL local ao executar a aplicação com o perfil dev ativo, permitindo testar todos os endpoints da API localmente.


3.  **Executar a Aplicação:**
    * **Via IDE:** Abra o projeto e execute a classe principal `EcomApiSpringbootApplication.java`.
    * **Via Terminal (Maven):**
        ```bash
        mvn clean install
        mvn spring-boot:run
        ```


        
<br><br><br>
A API estará rodando em `http://localhost:8080`.

## Endpoints de Exemplo

| Recurso | Método | Rota |
| :--- | :--- | :--- |
| **Usuário** | `GET` | `/users` |
| **Usuário** | `GET` | `/users/{id}` |
| **Pedido** | `GET` | `/orders` |
| **Produto** | `GET` | `/products` |
