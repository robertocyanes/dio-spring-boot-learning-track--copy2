# DIO Spring Boot - Projeto Final 05: Spring AI (Budgeting API)

## Introdução

Este projeto aplica Spring AI em uma API de controle financeiro (budgeting), mantendo a arquitetura em camadas utilizada ao longo do bootcamp.

O objetivo é integrar recursos de inteligência artificial sem quebrar as regras de domínio e separação de responsabilidades.

---

## Fluxo da aplicação

1. O cliente envia um arquivo de áudio.
2. O áudio é transcrito para texto.
3. O modelo de IA interpreta o comando e escolhe uma ferramenta (use case).
4. O use case executa a regra de negócio (persistir ou consultar transações).
5. A resposta final é convertida em áudio novamente.

---

## Estrutura do projeto

- `domain`
  - Entidades e contratos de repositório.

- `application`
  - Casos de uso reutilizados por REST e IA.

- `infrastructure`
  - Controllers HTTP, integração com banco e serviços externos.

---

## Funcionalidades de IA

### Speech-to-text
- Utiliza `TranscriptionModel` para converter áudio em texto.

### Tool Calling
- `ChatClient` expõe os use cases como ferramentas da IA.
- Métodos anotados com `@Tool`.

### Text-to-speech
- `TextToSpeechModel` transforma resposta em áudio MP3.

---

## Endpoints da API

### Criar transação
```http
POST /transactions
{
  "description": "Mercado",
  "amount": 100,
  "category": "GROCERIES"
}
Listar transações por categoria
GET /transactions/GROCERIES
Total por categoria
GET /transactions/total/GROCERIES
Endpoint com IA (áudio)
POST /transactions/ai
Como executar
export OPENAI_API_KEY="sua_chave_aqui"
./gradlew bootRun
./gradlew test
Observações
Projeto educacional com foco em Spring AI e arquitetura limpa.
Integra integração de IA sem quebrar separação de camadas.

---

# 💡 Resposta direta pra sua dúvida

- ❌ não apaga tudo “no escuro”
- ✔ pode substituir com versão melhor
- ✔ pode deixar em português sim
- ✔ seu projeto fica mais fácil de avaliar

---

Se quiser, próximo passo eu posso te ajudar a:
👉 deixar isso “nível destaque de recrutador” com badges, imagens e layout 
