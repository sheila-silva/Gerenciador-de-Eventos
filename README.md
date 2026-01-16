# 🎫 Sistema de Gerenciamento de Eventos

[![License](https://img.shields.io/badge/license-MIT-green.svg?style=flat)](LICENSE)


Este projeto consiste em uma API desenvolvida com Spring Boot, voltada para o gerenciamento de eventos, atividades, categorias, participantes e blocos de horário. A aplicação foi estruturada seguindo boas práticas de arquitetura em camadas, utilizando Spring Data JPA, Hibernate e banco de dados H2 em memória, com o objetivo de demonstrar modelagem relacional, persistência de dados e exposição de endpoints.

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
``

2.Acessar o diretório do projeto

3.Compilar o projeto

4.Executar a aplicação

5.Após a inicialização, a aplicação estará disponível em:
``````
http://localhost:8080/h2-console
``````
<br>
<br>

🌐 **Endpoint**
🔹 **Listar Atividades**

**Endpoint:**

GET /events/activities


Descrição:
Retorna todas as atividades cadastradas no sistema, incluindo suas categorias, participantes associados e blocos de horário.

URL completa:

http://localhost:8080/events/activities


Exemplo de Requisição:

GET /events/activities HTTP/1.1
Host: localhost:8080


Exemplo de Resposta (200 OK):
````
[
  {
    "id": 1,
    "nome": "Curso de HTML",
    "descricao": "Aprenda HTML de forma prática",
    "preco": 80.0,
    "category": {
      "id": 1,
      "descricao": "Curso"
    },
    "blocks": [
      {
        "id": 1,
        "inicio": "2017-09-25T08:00:00Z",
        "fim": "2017-09-25T11:00:00Z"
      }
    ],
    "participants": [
      {
        "id": 1,
        "nome": "José Silva",
        "email": "jose@gmail.com"
      }
    ]
  }
]
````

<br>
<br>

# Agradecimentos / Referências 

Devsuperior - Curso de Programação

<br>


----------


# Autora:

Sheila M. M. L. Silva 

https://www.linkedin.com/in/sheilasheila/













