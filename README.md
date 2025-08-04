# 📦 Projeto API de Cadastro de Usuários

Este é um projeto backend desenvolvido em **Java com Spring Boot**, que implementa uma API REST para cadastro de usuários com persistência em banco de dados.

## 🚀 Funcionalidades

- ✅ Cadastro de usuários via método HTTP `POST`
- ✅ Persistência dos dados com Spring Data JPA
- ✅ Validação básica de entrada
- ✅ Estrutura modular seguindo boas práticas

## 🛠 Tecnologias utilizadas

- Java 17+
- Spring Boot
- Spring Web
- Spring Data JPA
- Banco de dados H2 (ou outro configurado)
- Postman (para testes)
- Maven


1. **Clone o repositório**:
   ```bash
   git clone https://github.com/seuusuario/seu-projeto.git
   cd seu-projeto
Abra no IntelliJ ou Eclipse (ou qualquer IDE de sua preferência)

Execute a aplicação:

Via IDE: Run > Application

Ou via terminal:

bash
Copiar
Editar
./mvnw spring-boot:run

Teste no Postman:

Endpoint: POST http://localhost:8080/users

Body (JSON):

json
Copiar
Editar
{
  "name": "Jose Modolo",
  "email": "josenetozxc@yahoo.com"
}
