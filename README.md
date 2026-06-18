# 💰 Budgeting API + Spring AI

API de controle financeiro com integração de Inteligência Artificial usando Spring AI.  
Projeto desenvolvido como parte do bootcamp DIO Spring Boot, aplicando arquitetura limpa, DDD e tool calling com LLM.

---

# 🚀 Visão geral

A aplicação permite:

- Criar transações financeiras
- Consultar transações por categoria
- Calcular total por categoria
- Processar comandos via IA (texto e áudio)
- Converter áudio → texto → ação → áudio de resposta

---

# 🧠 Arquitetura

O projeto segue arquitetura em camadas:


domain → application → infrastructure


### 📦 Domain
- Entidades de negócio
- Repositórios (contratos)

### ⚙️ Application
- Use Cases (regras de negócio)
- Reutilizados por REST e IA

### 🌐 Infrastructure
- Controllers REST
- Integração com banco (JPA)
- Integração com Spring AI

---

# 🤖 Integração com IA

A aplicação utiliza Spring AI para:

### 🎙 Speech-to-Text
- Transcrição de áudio usando `TranscriptionModel`

### 🧠 Tool Calling (ChatClient)
A IA pode chamar diretamente os use cases:

- Criar transação
- Listar transações
- Calcular totais por categoria

### 🔊 Text-to-Speech
- Respostas da IA são convertidas em áudio MP3 via `TextToSpeechModel`

---

# 📡 Endpoints da API

## ➕ Criar transação
```http
POST /transactions
{
  "description": "Mercado",
  "amount": 100,
  "category": "GROCERIES"
}
📋 Listar por categoria
GET /transactions/{category}

Exemplo:

GET /transactions/GROCERIES
💵 Total por categoria
GET /transactions/total/{category}

Exemplo:

GET /transactions/total/GROCERIES
🎧 Endpoint com IA (áudio)
POST /transactions/ai
Fluxo:
Envia áudio
IA transcreve
IA executa ações (tools)
Gera resposta
Converte resposta em áudio MP3

🧪 Exemplos de uso (curl)
Criar transação
curl -X POST http://localhost:8080/transactions \
-H "Content-Type: application/json" \
-d '{"description":"Teste","amount":100,"category":"GROCERIES"}'
Consultar total
curl http://localhost:8080/transactions/total/GROCERIES

🛠 Tecnologias
Java 21
Spring Boot 4
Spring Data JPA
Spring AI
MySQL
Docker Compose

⚙️ Como executar
1. Configurar variável de ambiente
export OPENAI_API_KEY="sua_chave"
2. Rodar aplicação
./gradlew bootRun
3. Rodar testes
./gradlew test

📌 Observações
Projeto educacional com foco em arquitetura limpa + IA
Tool calling respeita as regras de domínio (sem bypass de camada)
Integração com IA feita via Spring AI ChatClient
Banco gerenciado via Docker Compose

🏁 Status
✔ Backend funcional
✔ Integração com IA ativa
✔ API REST completa
✔ Arquitetura em camadas aplicada
✔ Pronto para avaliação


Projeto desenvolvido como parte do bootcamp DIO Spring Boot + AI
