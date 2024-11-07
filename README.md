# Todo List API

Este projeto consiste em uma API para gerenciar tarefas (CRUD), como parte de um desafio para desenvolvedores backend júnior que se candidataram à vaga na Simplify.

## Tecnologias Utilizadas

- **Spring Boot**
- **Spring MVC**
- **Spring Data JPA**
- **SpringDoc OpenAPI 3**
- **MySQL**

## Práticas Adotadas

- **SOLID** (Princípios de design orientado a objetos)
- **DRY** (Don't Repeat Yourself)
- **YAGNI** (You Aren't Gonna Need It)
- **KISS** (Keep It Simple, Stupid)
- API **REST**
- Consultas com **Spring Data JPA**
- **Injeção de Dependências**
- Tratamento de respostas de erro
- Geração automática do **Swagger** com a **OpenAPI 3**

## Como Executar

1. Clone o repositório:

    ```bash
    git clone https://github.com/alinecintracamargo/todolist.git
    ```

2. Construa o projeto:

    ```bash
    ./mvnw clean package
    ```

3. Execute a aplicação:

    ```bash
    java -jar target/todolist-0.0.1-SNAPSHOT.jar
    ```

4. A API estará acessível em `http://localhost:8081`.
   O Swagger pode ser visualizado em `http://localhost:8080/swagger-ui.html`.

## API Endpoints

Os seguintes endpoints estão disponíveis para interagir com a API.

### Criar Tarefa

Para criar uma nova tarefa:

```bash
http POST :8081/todos nome="Todo 1" descricao="Desc Todo 1" prioridade=1
