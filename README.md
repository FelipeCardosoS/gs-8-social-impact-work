
# Global Solution – gs-8-social-impact-work

## Membros do Grupo
- **Felipe Cardoso Scalesse Ferreira – RM 99062**
- **Carlos Augusto Gorgulho – RM 98456**

---
##  Tema da Global Solution
**Modelos de trabalho baseados em impacto social e sustentabilidade**

Este tema explora novas formas de organização do trabalho que priorizam impacto social positivo, responsabilidade ambiental, inclusão e sustentabilidade. O objetivo é criar soluções tecnológicas que ajudem empresas e profissionais a atuarem de maneira mais ética, sustentável e alinhada a propósitos sociais relevantes.

---

## Finalidade da API
Esta API foi desenvolvida como requisito da Global Solution – Microservices and Web Engineering.  
Ela disponibiliza um único endpoint:

```
GET /info
```

Que retorna um JSON com:

- Nome do tema  
- Nome dos membros  
- RMs  
- Uma descrição explicativa do tema  

---

##  Como Executar o Projeto Localmente

### Pré-requisitos
- Java 17+  
- Maven 3.8+  

### Rodando a aplicação

```bash
mvn spring-boot:run
```

Acesse:

```
http://localhost:8081/info
http://localhost:8081/swagger-ui.html
```

---

## Execução via Docker

### Build da imagem localmente
```bash
docker build -t felipescalesse/gs-8-social-impact-work:latest .
```

### Executar o container
#### Porta padrão:
```bash
docker run -p 8081:8081 felipescalesse/gs-8-social-impact-work:latest
```
---

## Repositórios

### Docker Hub
Imagem disponível em:

https://hub.docker.com/r/felipescalesse/gs-8-social-impact-work

### GitHub
Repositório oficial:

https://github.com/felipescalesse/gs-8-social-impact-work

---

# Workflows – CI/CD (GitHub Actions)

Abaixo está a explicação de cada workflow exigido pela prova.

---

##  1. Versioning (Automação de Versões)
**Arquivo:** `.github/workflows/versioning.yml`  
**Acionamento:** push na branch `main`  
**Função:**
- Gera tags automáticas no formato `v0.1.0`, `v0.1.1`, `v0.1.2`…
- Mantém histórico de versões da API

**Status:**  Concluído e testado (workflow rodou e gerou tag)

---

## 2. Continuous Integration – CI
**Arquivo:** `.github/workflows/ci.yml`  
**Acionamento:** push nas branches:

- `feature/**`  
- `release`  
- `hotfix`  

**Funções:**
- Realiza build do projeto
- Executa testes automatizados
- Faz build da imagem Docker (apenas validação)

Serve para validar alterações antes de integrarem em `develop`.

---

## 3. Continuous Delivery – CD
**Arquivo:** `.github/workflows/cd.yml`  
**Acionamento:** Pull Request para branch `develop`

**Funções:**
- Builda o projeto
- Gera o JAR
- Cria a imagem Docker
- Envia automaticamente para o Docker Hub

 Requer os secrets no GitHub:
- `DOCKERHUB_USERNAME`
- `DOCKERHUB_TOKEN`

---

## Observações Importantes
- A API usa porta 8081 dentro do container (exigência da prova)  
- CI e CD só rodam quando commits são feitos nas branches corretas  

---

Linha de teste para o workflow de CD apontando para develop.
