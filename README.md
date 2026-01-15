# 🎫 Sistema de Gerenciamento de Eventos

[![License](https://img.shields.io/badge/license-MIT-green.svg?style=flat)](LICENSE)


Este projeto consiste em uma API REST desenvolvida com Spring Boot, voltada para o gerenciamento de eventos, atividades, categorias, participantes e blocos de horário. A aplicação foi estruturada seguindo boas práticas de arquitetura em camadas, utilizando Spring Data JPA, Hibernate e banco de dados H2 em memória, com o objetivo de demonstrar modelagem relacional, persistência de dados e exposição de endpoints REST.

<br>
<br>

🏗️ **Arquitetura da Aplicação**

-A aplicação está organizada nas seguintes camadas:

-Camada de Entrada (Controller): Responsável por expor os endpoints REST.

-Camada de Serviço (Service): Centraliza a lógica de negócio.

-Camada de Persistência (Repository): Comunicação com o banco de dados via JPA.

-Camada de Domínio (Model): Entidades JPA que representam o modelo de dados.

<br>
<br>

Diagrama de Domínio:

<p align="center">
  <img 
    src="https://github.com/user-attachments/assets/733a0388-aa9c-41a6-ae47-93bcea5765f0"
    alt="Sistema Evento"
    width="600"
  />
</p>

<br>
<br>


⚙️ **Tecnologias**
- Java 17+
- Spring Boot
- Spring Data JPA
- H2 Database
- Maven
- Hibernate

<br>
<br>

**Passo a Passo para Execução**

1.Clonar o repositório
``
git clone https://github.com/seu-usuario/seu-repositorio.git


Acessar o diretório do projeto

cd seu-repositorio


Compilar o projeto

mvn clean install


Executar a aplicação

mvn spring-boot:run


Após a inicialização, a aplicação estará disponível em:

http://localhost:8080

<br>
<br>



