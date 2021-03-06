![Platform Builders](https://img.shields.io/badge/Platform-Builders-yellow)
[![Build Status](https://app.travis-ci.com/devmorfeu/rest-with-spring-boot.svg?branch=main)](https://travis-ci.com/devmorfeu/rest-with-spring-boot)
[![codecov](https://codecov.io/gh/devmorfeu/rest-with-spring-boot/branch/main/graph/badge.svg?token=7QKNLL90QB)](https://app.codecov.io/gh/devmorfeu/rest-with-spring-boot)

<p align="center">
  <i>
    <a href="#introdução">Introdução</a> •
    <a href="#instalação">Instalação</a> •
    <a href="#projeto">Projeto</a>
  <i/>
</p>

## Introdução
   
Aplicação simples simulando uma calculadora;
   
## Instalação

* [x] abra o terminal e confirme a versão com o comando `java --version` (a versão 11 ou superior terá que estar instalada).
* [x] realize o download do [IntelliJ](https://www.jetbrains.com/pt-br/idea/download).
* [x] baixe o projeto do GitHub com `git clone`.
   
### Apêndice
* [x] para utilizar a API, use o [Postman](https://www.postman.com/downloads)  v8.10.0 ou superior.
   - `/postman/rest-with-spring-boot-postman_collection.json`

## Projeto

Pequeno DevOps (compilação, cobertura): *[Travis CI](https://app.travis-ci.com/github/devmorfeu/rest-with-spring-boot), [Codecov](https://app.codecov.io/gh/devmorfeu/rest-with-spring-boot)*.

#### Testes Unitários   

**Assert**
   
```java
// ...
final var result = service.subtract(numbers);

assertEquals(new BigDecimal(0), result.getResultMath());
// ...
```

**MockMvc**

```java
// ...
mockMvc.perform(get("/v1/sum/{numberOne}/{numberTwo}", "10", "10")
       .contentType("application/json"))
       .andExpect(status().is2xxSuccessful());
// ...
```
