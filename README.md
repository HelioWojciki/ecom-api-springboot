# E-commerce API | Spring Boot

![Spring Boot](https://img.shields.io/badge/Spring%20Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)
![Java](https://img.shields.io/badge/Java-007396?style=for-the-badge&logo=java&logoColor=white)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-316192?style=for-the-badge&logo=postgresql&logoColor=white)
![Hibernate](https://img.shields.io/badge/JPA%20/%20Hibernate-59666C?style=for-the-badge&logo=hibernate&logoColor=white)

---

## 🌐 API Online

A API está disponível para testes em produção:  
[![API Online](https://img.shields.io/badge/API-Online-brightgreen?style=for-the-badge)](https://hecom-api.up.railway.app)

### Testando a API Online

A API está hospedada no **Railway** e pode ser testada diretamente:

- Endpoints `GET` podem ser acessados via navegador.  
- Para `POST`, `PUT` e `DELETE`, utilize ferramentas como **Postman**, **Insomnia** ou **curl**.

---

## Sobre o Projeto

Esta é uma **API REST** que simula o backend de um sistema de **comércio eletrônico**, desenvolvida em **Java (Spring Boot)**.  
A aplicação gerencia:

- **Usuários** (Clientes)  
- **Produtos** e **Categorias**  
- **Pedidos** (Orders) com status (`WAITING_PAYMENT`, `PAID`, etc.)  
- **Itens de Pedido** (OrderItem), utilizando **chave primária composta** (PK Composta)

---

## Tecnologias Utilizadas

| Categoria | Ferramenta |
|:---|:---|
| **Linguagem** | Java (JDK 17+) |
| **Framework** | Spring Boot 3 |
| **Persistência** | Spring Data JPA & Hibernate |
| **Banco de Dados (teste)** | H2 |
| **Banco de Dados (dev)** | PostgreSQL |
| **Gerenciador de Dependências** | Maven |

---

## Arquitetura

A aplicação segue o padrão **MVC (Service-Repository)**, garantindo **separação de responsabilidades (SRP)**.

| Camada | Pacote | Função |
|:---|:---|:---|
| **Resources** | `com.helio.ecom_api_springboot.resources` | Controladores REST (`@RestController`) |
| **Services** | `com.helio.ecom_api_springboot.services` | Lógica de Negócio (`@Service`) |
| **Repositories** | `com.helio.ecom_api_springboot.repositories` | Acesso a dados (`@Repository`) |
| **Entities** | `com.helio.ecom_api_springboot.entities` | Mapeamento Objeto-Relacional (`@Entity`) |

> **Destaque:**  
> A relação **Pedido ↔ Produto** é mapeada pela entidade `OrderItem`,  
> que utiliza `OrderItemPK` (`@EmbeddedId`) como **chave primária composta**,  
> garantindo unicidade de cada item em um pedido.

---

## Como Executar o Projeto

### Pré-requisitos

- Java JDK 17+  
- Maven  
- IDE (IntelliJ IDEA, VS Code ou Eclipse)

---

### Passo a Passo

1. **Clone o repositório:**
   ```bash
   git clone https://github.com/HelioWojciki/ecom-api-springboot.git
   ```

2. **Configurar o Banco de Dados (PostgreSQL):**

   No arquivo `application.properties`, defina:
   ```
   spring.profiles.active=dev
   ```

   Crie o banco:
   ```sql
   CREATE DATABASE springboot_ecom;
   ```

   Configure o arquivo `application-dev.properties`:
   ```
   spring.datasource.url=jdbc:postgresql://localhost:5432/springboot_ecom
   spring.datasource.username=postgres
   spring.datasource.password=root
   spring.jpa.hibernate.ddl-auto=update
   ```

   *(Ajuste o nome do banco, usuário e senha conforme o seu ambiente.)*

3. **Executar a Aplicação:**
   - **Via IDE:** Execute a classe `EcomApiSpringbootApplication.java`  
   - **Via Terminal (Maven):**
     ```bash
     mvn clean install
     mvn spring-boot:run
     ```

---

## Endereço Local

A aplicação estará disponível no endereço padrão:  
**http://localhost:8080**

---

## 📡 Endpoints de Exemplo

| Recurso | Método | Rota |
|:---|:---|:---|
| Usuário | `GET` | `/users` |
| Usuário | `GET` | `/users/{id}` |
| Pedido | `GET` | `/orders` |
| Produto | `GET` | `/products` |

---
