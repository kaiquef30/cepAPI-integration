# Projeto de Integração com Feign e Consulta de CEP

![Java](https://img.shields.io/badge/Java-21-orange)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.1.5-brightgreen)
![Spring Data JPA](https://img.shields.io/badge/Spring%20Data%20JPA-2.5.4-brightgreen)
![Feign](https://img.shields.io/badge/Feign-2022.0.4-blue)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-15.5-blue)

Este projeto demonstra uma integração eficiente entre sistemas utilizando o Spring Boot, Spring Data JPA e Feign para consumir uma API de consulta de CEP. A aplicação utiliza o PostgreSQL como banco de dados para armazenar dados relacionados às consultas de CEP.

## Tecnologias Utilizadas

- **Java 11**: Linguagem de programação principal do projeto.
- **Spring Boot 2.5.4**: Framework para criação de aplicativos Java baseados em microservices.
- **Spring Data JPA 2.5.4**: Facilita o acesso a dados em bancos de dados relacionais.
- **Feign 2.5.4**: Cliente HTTP declarativo para integração com serviços web.
- **PostgreSQL 13.4**: Sistema de gerenciamento de banco de dados relacional.

## Pré-requisitos

Antes de começar, certifique-se de ter instalado em sua máquina:

- Java 11
- PostgreSQL 13.4

## Configuração do Banco de Dados

1. Crie um banco de dados PostgreSQL chamado `cep_database`.
2. Configure as propriedades do banco de dados no arquivo `application.properties`:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/cep_database
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
