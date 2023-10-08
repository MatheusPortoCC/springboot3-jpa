# Projeto web services com Spring Boot e JPA / Hibernate 

Este projeto é um exemplo de como criar um projeto Web services usando Spring Boot e JPA / Hibernate.

## Tecnologias

- Java
- Maven
- Spring Boot
- JPA / Hibernate

## Domain model 
![](https://media.discordapp.net/attachments/1024146545186197585/1160572514041335899/image.png?ex=65352661&is=6522b161&hm=2cafd02e5d284238bb401f93d1bc20dbb8b55d791d8df7131a2f488e0803b193&=)

## Endpoints

### GET /categories

Retorna uma lista de todas as categorias.

### GET /categories/{id}

Retorna uma categoria

### GET /orders

Retorna uma lista de todos os pedidos.

### GET /orders/{id}

Retorna um pedido

### GET /products

Retorna uma lista de todos os produtos.

### GET /products/{id}

Retorna um produto

### GET /users

Retorna uma lista de todos os usuários.

### GET /users/{id}

Retorna um usuário

### POST /users

Insere um usuário 

Body: `{
    "name": "João",
    "email": "joao@github.com",
    "phone": "421444",
    "password": "123456"
}`

### DELETE /users/{id}

Deleta um usuário 

### PUT /users/{id}

Atualiza um usuário 

Body: `{
    "name": "João",
    "email": "joao@github.com",
    "phone": "421444",
    "password": "123456"
}`
