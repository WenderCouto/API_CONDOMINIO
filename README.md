# 🏢 Condominium Management System

## 📌 Overview

Este projeto é um sistema completo de gerenciamento de condomínios, composto por uma **API REST** desenvolvida com **Spring Boot** e um frontend feito em **Angular**. Ele permite que síndicos e administradores gerenciem condomínios, apartamentos, moradores e contratos de locação de maneira prática e integrada.

---

## 🧱 Arquitetura do Sistema

### 🔙 Backend

- API RESTful com **Spring Boot**
- Banco de dados **PostgreSQL** com **JPA/Hibernate**
- Modelo de domínio baseado em entidades
- Endpoints RESTful para gerenciamento de recursos
- Configuração de CORS para integração com o frontend

### 🔜 Frontend

- **Angular 17** com **Angular Material**
- Arquitetura baseada em componentes
- Design responsivo com suporte para dispositivos móveis
- Comunicação via serviços com a API
- Roteamento utilizando Angular Router

---

## ✅ Funcionalidades Implementadas

### Gerenciamento de Condomínios

- Listagem paginada de condomínios
- Visualização de detalhes (inclusive endereço)
- Cadastro e edição de condomínios

### Gerenciamento de Apartamentos

- Listagem de apartamentos por condomínio
- Cadastro de novos apartamentos
- Exibição de detalhes (número, unidade consumidora, valor, etc.)
- Controle de disponibilidade

---

## ⚙️ Instruções de Setup

### Backend (Spring Boot)

**Pré-requisitos:**
- Java 17
- Maven
- PostgreSQL ou Docker

**Subir banco com Docker:**
```sh
docker-compose up -d
```

**Rodar o projeto:**
```sh
cd API-Condominio
./mvnw spring-boot:run
```
A API estará disponível em: [http://localhost:8080](http://localhost:8080)

---

### Frontend (Angular)

**Pré-requisitos:**
- Node.js + npm

**Instalar dependências:**
```sh
cd Front-end/front-end-condominio/front
npm install
```

**Rodar servidor de desenvolvimento:**
```sh
ng serve
```
A aplicação estará acessível em: [http://localhost:4200](http://localhost:4200)

---

## 📡 Principais Endpoints

### Condomínios

- `GET /condominios` – Lista paginada
- `GET /condominios/{id}` – Detalhes
- `POST /condominios` – Criar
- `PUT /condominios/{id}` – Atualizar

### Apartamentos

- `GET /apartamentos/{condominioId}` – Lista por condomínio
- `POST /apartamentos` – Criar

### Pessoas

- `POST /pessoas` – Cadastrar morador

### Contratos

- `POST /contratos` – Criar contrato de aluguel

---

## 🛠️ Tecnologias Utilizadas

### Backend

- Spring Boot 3.3.2
- Spring Data JPA
- PostgreSQL
- Lombok
- Maven

### Frontend

- Angular 17.3.0
- Angular Material 17.3.10
- TypeScript
- RxJS
- Angular Reactive Forms

---

## 🚧 Funcionalidades a Implementar

- **Gestão de Contratos**
    - Listagem, edição e renovação de contratos
    - Acompanhamento de pagamentos
- **Gestão de Moradores**
    - Perfil completo do morador
    - Associação com apartamentos
    - Filtros e busca
- **Relatórios**
    - Taxa de ocupação
    - Relatórios financeiros
    - Manutenção preventiva/corretiva
- **Autenticação e Segurança**
    - Login seguro com JWT
    - Controle de acesso baseado em perfis
- **Extras**
    - Solicitações de manutenção
    - Notificações (e-mail/WhatsApp)
    - Gerenciamento de documentos (contratos escaneados, etc.)

---

## 🗂️ Estrutura do Projeto

### Backend

```
API-Condominio/
├── src/
│   ├── main/
│   │   ├── java/com/condominio/API/Condominio/
│   │   │   ├── Config/
│   │   │   ├── Controller/
│   │   │   ├── Domain/
│   │   │   │   ├── Entity/
│   │   │   │   │   ├── Apartamento/
│   │   │   │   │   ├── Condominio/
│   │   │   │   │   ├── Contrato/
│   │   │   │   │   ├── Endereco/
│   │   │   │   │   └── Pessoa/
│   │   │   │   └── Repository/
│   │   └── resources/
└── pom.xml
```

### Frontend

```
Front-end/front-end-condominio/front/
├── src/
│   ├── app/
│   │   ├── Interface/
│   │   ├── service/
│   │   ├── criar-apartamento/
│   │   ├── criar-condominio/
│   │   ├── editar-condominio/
│   │   ├── listar-apartamento/
│   │   ├── listar-condominios/
│   │   └── home/
│   ├── assets/
│   └── environments/
└── package.json
```

---

## 🤝 Contribuindo

1. Fork o repositório
2. Crie uma branch com sua feature:
     ```sh
     git checkout -b feature/nome-da-feature
     ```
3. Commit suas mudanças:
     ```sh
     git commit -m "feat: adiciona nova funcionalidade"
     ```
4. Push para sua branch:
     ```sh
     git push origin feature/nome-da-feature
     ```
5. Abra um Pull Request 🚀
