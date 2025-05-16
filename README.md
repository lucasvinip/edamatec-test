# 🧪 Teste Prático - Cadastro de Clientes em Java Swing

Este projeto foi desenvolvido como parte de um teste prático para demonstrar conhecimentos em **Java**, **Swing** e **MySQL**, bem como habilidades de desenvolvimento autodidata.

## 🎯 Objetivo

Criar uma aplicação GUI com Java Swing para realizar operações **CRUD** (Create, Read, Update, Delete) em um cadastro simples de clientes, armazenando os dados em um banco de dados **MySQL**.

---

## 🧰 Tecnologias Utilizadas

- Java
- Swing (Java GUI)
- JDBC (para conexão com o MySQL)
- MySQL
- IDE: NetBeans

---

## 🖥️ Funcionalidades

- Inserir cliente
- Buscar cliente por nome (com filtro dinâmico)
- Atualizar dados do cliente
- Excluir cliente com confirmação
- Interface gráfica intuitiva com tabela de listagem

---

## 📋 Campos do Formulário

- **Nome**
- **CPF**
- **Telefone**
- **Email**

---

## ✅ Extras Implementados

- ✅ Confirmação antes de excluir ou atualizar um cliente
- ✅ Filtro de busca por nome em tempo real
- ❌ Máscara e validação dos campos (não implementado)

---

## 🖼️ Capturas de Tela

### 🧾 Atualizar Usuário
![Confirmação de Atualização](img/update.png)

### 🔍 Busca com Filtro
![Busca com Filtro](img/search.png)

### ❗ Confirmação de Exclusão
![Confirmação de Exclusão](img/delete.png)

---

## 🔌 Configuração do Banco de Dados

Crie um banco de dados MySQL com o seguinte comando:

```sql
CREATE DATABASE customer_register;

USE customer_register;

create table if not exists customer(
	id int auto_increment primary key,
    customer_name varchar(100) not null,
    cpf varchar(14) not null unique,
    phone varchar(20),
    email varchar(100)
);

No arquivo Connecting.java, substitua pelos seus dados de acesso ao MySQL:

private static final String URL = "jdbc:mysql://localhost:3306/customer_register";
private static final String USER = "seu_usuario";
private static final String PASSWORD = "sua_senha";

Certifique-se de adicionar o MySQL Connector/J (JAR) ao seu projeto:

No NetBeans:
Vá em Bibliotecas (Libraries).

Clique com o botão direito e selecione Adicionar JAR/Pasta (Add JAR/Folder).

Selecione o arquivo mysql-connector-java-x.x.xx.jar.

Confirme e execute sua aplicação.


