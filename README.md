<p align="center">
   <img src="./.github/logo.svg" alt="Reddit" width="100"/>
</p>

<p align="center">	
   <a href="https://www.linkedin.com/in/nikolaslacerda/">
      <img alt="Nikolas Lacerda" src="https://img.shields.io/badge/-Nikolas Lacerda-00D4FF?style=flat&logo=Linkedin&logoColor=white" />
   </a>
  
  <img alt="GitHub language count" src="https://img.shields.io/github/languages/count/nikolaslacerda/reddit-clone?color=00D4FF">
  
  <img alt="Repository size" src="https://img.shields.io/github/repo-size/nikolaslacerda/reddit-clone?color=00D4FF">
  
  <a href="https://github.com/nikolaslacerda/reddit-clone/commits/master">
    <img alt="GitHub last commit" src="https://img.shields.io/github/last-commit/nikolaslacerda/reddit-clone?color=00D4FF">
  </a> 
  
  <img alt="License" src="https://img.shields.io/badge/license-MIT-00D4FF">
  
</p>

<p align="center">
 <a href="#computer-projeto">Projeto</a> •
 <a href="#rocket-tecnologias">Tecnologias</a> •
 <a href="#construction_worker-como-executar">Como executar</a>
</p>

## :computer: Projeto

O projeto consiste em uma simples plataforma de survey em games construída usando Spring Boot, Spring Data JPA com PostgreSQL e Spring MVC. A aplicação permite a votação e a visualização da listagem de votos e seus respectivos gráficos. O frontend foi construído usando Angular. 

## :rocket: Tecnologias

Esse projeto foi desenvolvido com as seguintes tecnologias:

- [Java 11](https://www.java.com/en/)
- [Spring Boot 2.3.4](https://spring.io/projects/spring-boot)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [Hibernate](https://hibernate.org)
- [PostgreSQL](https://www.postgresql.org)
- [Maven](https://maven.apache.org)
- [Angular](https://angular.io)
- [Angular CLI](https://cli.angular.io)

## :construction_worker: Como executar


#### :repeat: Clone o Repositório

```bash

$ git clone https://github.com/nikolaslacerda/big-game-survey.git

```

#### :package: Executando a API

```bash

# Acesse a pasta do server no terminal/cmd:

$ cd big-game-survey/server

# Instale as dependências:

$ mvn install

# Execute a aplicação:

$ mvn spring-boot:run

```

O servidor iniciará na porta 8080 - acesse http://localhost:8080

#### :computer: Executando a aplicação web

```bash

# Acesse a pasta web no terminal/cmd:

$ cd big-game-survey/web

# Instale as dependências:

$ npm install

# Execute a aplicação:

$ ng serve

```

A aplicação iniciará na porta 4200 - acesse http://localhost:4200
