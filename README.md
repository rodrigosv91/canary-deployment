# Canary Deployment

Este repositório demonstra um exemplo de Canary Deployment, uma técnica de DevOps usada para implementar novas versões de software gradualmente para um subconjunto de usuários antes de liberar para todos. Isso ajuda a mitigar riscos ao detectar problemas na nova versão antes de afetar todos os usuários.

## Estrutura do Projeto

- **gateway**: Módulo responsável por rotear o tráfego.
- **stable-service**: Serviço estável que já está em produção.
- **canary-service**: Nova versão do serviço que está sendo testada.

## Tecnologias Utilizadas

- Java
- Spring Boot

## Como Executar

1. Clone este repositório:
    ```bash
    git clone https://github.com/rodrigosv91/canary-deployment.git
    cd canary-deployment
    ```

2. Certifique-se de que o arquivo `toolchains.xml` está corretamente configurado no diretório `~/.m2` e então compile todos os serviços:
    ```bash
    mvn clean install
    ```

3. Execute os serviços (em terminais separados):
    ```bash
    java -jar gateway/target/gateway-0.0.1-SNAPSHOT.jar
    java -jar stable-service/target/stable-service-0.0.1-SNAPSHOT.jar
    java -jar canary-service/target/canary-service-0.0.1-SNAPSHOT.jar
    ```

4. Acesse o gateway:
    ```
    http://localhost:8080
    ```

## Contribuições

Contribuições são bem-vindas! Por favor, abra uma issue ou um pull request.

## Licença

Este projeto está licenciado sob a Licença MIT.
