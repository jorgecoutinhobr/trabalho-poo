# Estrutura do Projeto

## Models
Localizadas em `src/main/java/com/demo/Models/`.

- [`Aluno`](src/main/java/com/demo/Models/Aluno.java)
- [`GerenciadorDeUsuario`](src/main/java/com/demo/Models/GerenciadorDeUsuario.java)
- [`Busca`](src/main/java/com/demo/Models/Busca.java) 
- [`GerenciadorDeView`](src/main/java/com/demo/Models/GerenciadorDeView.java)
- [`Performance`](src/main/java/com/demo/Models/Performance.java)
- [`Professor`](src/main/java/com/demo/Models/Professor.java)
- [`Usuario`](src/main/java/com/demo/Models/Usuario.java)
- 
## Controllers
Localizados em `src/main/java/com/demo/Controllers/`.

### [`LoginController`](src/main/java/com/demo/Controllers/LoginController.java)

### Alunos/
- [`AlunosController`](src/main/java/com/demo/Controllers/Alunos/AlunosController.java)
- [`ExercitarController`](src/main/java/com/demo/Controllers/Alunos/ExercitarController.java) 
- [`HistoricoController`](src/main/java/com/demo/Controllers/Alunos/HistoricoController.java) 

### Professores/
- [`CriaUsuarioController`](src/main/java/com/demo/Controllers/Professores/CriaUsuarioController.java)
- [`CriarPerguntaController`](src/main/java/com/demo/Controllers/Professores/CriarPerguntaController.java)
- [`ProfessoresController`](src/main/java/com/demo/Controllers/Professores/ProfessoresController.java)
- [`AlteraUsuarioController`](src/main/java/com/demo/Controllers/Professores/AlteraUsuarioController.java)

## Database
Arquivos CSV localizados em `src/main/java/com/demo/Database/`.

- `usuarios.csv`
- `nivel[n].csv`
- `performance.csv`

## Views
Localizadas em `src/main/java/com/demo/Views/`.

- [`Views`](src/main/java/com/demo/Views/Views.java)

## Resources
Localizados em `src/main/resources/com/demo/`.

- `Login.fxml`
- `AlunosMenu.fxml`
- `Exercitar.fxml`
- `Historico.fxml`
- `Professor.fxml`
- `CriaUsuario.fxml`
- `CriaPergunta.fxml`
- `AlteraUsuario.fxml`

## Como Rodar o Projeto

### Pré-requisitos
1. Java: Versão 22
2. JavaFX: Versão 22-ea+11

### Adicionando JavaFX
JavaFX é necessário para executar este projeto, pois ele utiliza componentes gráficos para a interface do usuário. Siga os passos abaixo para configurar o JavaFX em seu ambiente de desenvolvimento:

#### Download do JavaFX SDK
Acesse o site oficial do OpenJFX e faça o download do SDK do JavaFX indicado.

#### Configuração do Ambiente:

##### IntelliJ IDEA:
1. Extraia o arquivo ZIP do JavaFX SDK em uma pasta de sua escolha.
2. Abra o projeto no IntelliJ IDEA.
3. Vá para File > Project Structure > Libraries e clique no ícone de + para adicionar uma nova biblioteca.
4. Selecione Java e navegue até a pasta `lib` do JavaFX SDK que você extraiu. Selecione todos os arquivos JAR e clique em OK.
5. Aplique as alterações.
