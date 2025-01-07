# Sistema de Cadastro e Consulta de Livros

## Descrição

Este projeto é um sistema para cadastrar e consultar livros, autores e suas respectivas informações no banco de dados. Ele consome uma API para obter informações dos livros, que são então armazenadas em um banco de dados PostgreSQL. O sistema permite que os usuários façam buscas por livros e autores, armazenando as informações no banco de dados para facilitar consultas rápidas.

## Tecnologias Utilizadas

- **Spring Boot**: Framework principal para o desenvolvimento do backend.
- **PostgreSQL**: Banco de dados utilizado para armazenar informações dos livros e autores.
- **JPA/Hibernate**: Ferramentas para mapeamento objeto-relacional e persistência de dados.
- **API Externa de Livros**: Consumida para obter informações sobre os livros.
- **REST API**: Interface para interagir com o sistema de forma simples e eficiente.

## Funcionalidades

- **Cadastro de Livros**: Armazenamento de informações sobre livros, como título, autor, ano de nascimento e morte do autor.
- **Consulta de Livros e Autores**: Busca rápida e eficiente por título de livro ou nome do autor.
- **Armazenamento em Banco de Dados**: Uso do PostgreSQL para persistência das informações.
