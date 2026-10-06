# Backend

Backend REST do WhatsApp AI Reply.

## Requisitos

- Java 17+
- Maven 3.9+

## Executar

```bash
mvn spring-boot:run
```

## Testar

```bash
mvn test
```

## Health check

`GET /api/v1/health`

Resposta esperada:

```json
{"status":"UP"}
```

Configurações sensíveis deverão ser fornecidas por variáveis de ambiente e nunca commitadas.
