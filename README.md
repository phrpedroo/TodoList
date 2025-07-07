<h1>📝 Projeto Todo List</h1>

<h4>
Este é um projeto simples de uma API REST para gerenciamento de tarefas ("Todo List") utilizando Spring Boot. A aplicação permite criar, listar, atualizar e deletar tarefas.

🚀 Funcionalidades
✅ Criar novas tarefas

📋 Listar todas as tarefas

✏️ Atualizar tarefas existentes

🗑️ Deletar tarefas por ID


<h2>🔗 Endpoints da API
Método HTTP	Endpoint	Descrição</h2>

POST /todos/salvar	Cria uma nova tarefa

GET	/todos/mostrar	Lista todas as tarefas

PUT	/todos/atualizar	Atualiza uma tarefa

DELETE	/todos/delete{id}	Deleta uma tarefa por ID

<h2>⚙️ Tecnologias Utilizadas</h2>


Spring Boot

Srping MVC

Spring Data JPA

Mysql

Maven

📥 Como Executar Localmente
Clone o repositório:

```bash


git clone https://github.com/seu-usuario/todoList.git
cd todoList
```
```bash

./mvnw clean install

```
```bash


./mvnw spring-boot:run
A aplicação estará disponível em http://localhost:8080.
```
</h4>
