# WhatsApp AI Reply

Assistente de respostas com IA para mensagens do WhatsApp, com backend e aplicativo Android.

## Estrutura

- `backend/` — API e serviços backend.
- `android/` — aplicativo Android.
- `docs/` — documentação técnica.

## Branches

Fluxo principal: `feature/*` → `develop` → `main`.

A branch `main` deve conter apenas versões estáveis.

## Segurança

Nunca versione credenciais, tokens, chaves de API, secrets JWT, arquivos `.env`, keystores ou credenciais reais de banco de dados. Use `.env.example` como referência.
