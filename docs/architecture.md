# Arquitetura inicial

O projeto será dividido em backend e aplicativo Android.

## Backend

API responsável por autenticação, perfis de escrita, histórico autorizado de conversas e integração com provedores de IA.

Tecnologias previstas: Java, Spring Boot, PostgreSQL, Flyway, JWT e API REST.

## Android

Aplicativo responsável pela integração local com notificações do WhatsApp, apresentação de sugestões e envio de respostas mediante ação do usuário.

Tecnologias previstas: Kotlin, Android SDK, NotificationListenerService, RemoteInput e cliente HTTP.

## Segurança

Secrets devem ser fornecidos por variáveis de ambiente ou mecanismos seguros da plataforma. Nenhuma credencial real deve ser versionada.
