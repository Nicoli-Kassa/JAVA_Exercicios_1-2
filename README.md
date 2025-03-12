# Sistema de Gestão de Biblioteca

Este é um sistema simples de gestão de biblioteca desenvolvido em Java. O sistema permite o controle de livros, membros e empréstimos, facilitando a administração de uma biblioteca.

## Funcionalidades

- **Gerenciamento de Livros**: Adicionar e remover livros da biblioteca.
- **Gerenciamento de Membros**: Registrar novos membros da biblioteca.
- **Empréstimos**: Registrar o empréstimo de livros e devolver livros emprestados.
- **Listagem**: Listar livros disponíveis, membros registrados e empréstimos ativos.

## Estrutura do Projeto

O projeto é composto pelas seguintes classes:

- **Livro**: Representa um livro na biblioteca, com atributos como título, autor e ISBN.
- **Membro**: Representa um membro da biblioteca, com atributos como nome, ID e email.
- **Emprestimo**: Representa um empréstimo de um livro por um membro, incluindo a data do empréstimo.
- **Biblioteca**: Classe principal que gerencia a coleção de livros, membros e empréstimos.
- **SistemaBiblioteca**: Classe principal para executar o sistema.

## Como Usar

1. **Compilação**: Compile o código Java usando um ambiente de desenvolvimento Java (como Eclipse, IntelliJ IDEA ou diretamente no terminal).
2. **Execução**: Execute a classe `SistemaBiblioteca` para iniciar o sistema.

<br><br>
---
<br><br>

# Sistema de Pedidos para Restaurante

Este é um sistema simples de gerenciamento de pedidos para um restaurante, desenvolvido em Java. O sistema permite que os usuários gerenciem pratos do cardápio e os pedidos dos clientes, incluindo a adição e remoção de pratos, bem como a visualização dos detalhes do pedido.

## Funcionalidades

- Gerenciar pratos do cardápio (nome, preço e descrição).
- Criar e gerenciar pedidos de clientes.
- Adicionar e remover pratos do cardápio.
- Adicionar e remover pratos de um pedido.
- Calcular o total do pedido.
- Visualizar detalhes do pedido.

## Estrutura do Projeto

O projeto contém as seguintes classes:

- **Cardapio**: Gerencia a lista de pratos disponíveis, permitindo adicionar e remover pratos do cardápio.
- **Prato**: Representa um prato do cardápio, com atributos para nome, preço e descrição.
- **Pedido**: Representa um pedido feito por um cliente, contendo informações sobre o número do pedido, cliente, lista de pratos e total.
- **SistemaRestaurante**: Classe principal que demonstra o uso das classes `Prato` e `Pedido`.

## Como Usar

1. **Compilação**: Compile o código Java usando um ambiente de desenvolvimento Java (como Eclipse, IntelliJ IDEA ou diretamente no terminal).
2. **Execução**: Execute a classe `SistemaRestaurante` para iniciar o sistema.
