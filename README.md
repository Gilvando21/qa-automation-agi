#  QA Automation Challenge | Gilvando Matos

![CI](https://github.com/Gilvando21/qa-automation-agi/actions/workflows/ci.yml/badge.svg)

Projeto de automação de testes desenvolvido como solução para desafio técnico, cobrindo **Web, API e Performance**, com foco em boas práticas de engenharia de testes, confiabilidade e escalabilidade.

---

##  Autor

**Gilvando Matos**  
QA Senior / QA Leader  

🔗 LinkedIn: https://www.linkedin.com/in/gilvando-matos-3a259821/  
🔗 GitHub: https://github.com/Gilvando21  

---

##  Objetivo

Demonstrar habilidades em:

- Automação Web (UI)
- Automação de APIs
- Testes de Performance
- Estruturação de framework de testes
- Boas práticas de engenharia (POM, reutilização, organização)
- Tratamento de cenários reais (ex: APIs instáveis)

---

##  Cobertura de Testes

###  Web
- Busca no blog do AGI
- Validação de resultados
- Estrutura baseada em Page Object Model (POM)
- Gerenciamento de WebDriver com lifecycle controlado

###  API
- Testes da Dog API
- Validação de status code e payload
- Cenários positivos
-  Implementação de retry automático para lidar com instabilidade externa (HTTP 520)

###  Performance
- Testes com JMeter
- Execução via CLI
- Geração de relatório HTML

---

##  Stack utilizada

- Java 17
- Maven
- JUnit 5
- Selenium WebDriver
- RestAssured
- Allure Reports
- JMeter
- GitHub Actions (CI/CD)

---

##  Como executar

###  Executar testes (Web + API)
mvn clean test

###  Executar em modo headless
mvn clean test -Dheadless=true

###  Gerar relatório Allure
allure serve target/allure-results

###  Executar teste de performance
jmeter -n -t performance-tests/test-plan.jmx -l result.jtl -e -o report/

---

##  Relatórios

- Relatórios interativos com Allure
- Evidências automáticas (screenshots em falhas)
- Logs organizados para análise

---

##  Arquitetura do Projeto

- base → configuração e ciclo de vida do WebDriver  
- web.pages → Page Objects (POM)  
- web.tests → testes Web  
- api → testes de API  
- utils → utilitários (ex: retry para APIs)  

---

##  Boas práticas aplicadas

- Page Object Model (POM)
- Separação por camadas (web / api / utils)
- Reutilização de código
- Estrutura escalável
- Testes independentes
- Tratamento de flaky tests (retry)
- Versionamento limpo com `.gitignore`

---

##  CI/CD

Pipeline configurado com GitHub Actions para:

- Build automático
- Execução dos testes
- Validação contínua
- Pronto para evolução com execução headless e paralela

---

##  Diferenciais

✔ Testes Web + API + Performance no mesmo projeto  
✔ Estrutura escalável e desacoplada  
✔ Integração com Allure  
✔ Tratamento de instabilidade externa (retry)  
✔ Código limpo e organizado  
✔ Pronto para uso em ambiente real  

---

##  Observações

- Projeto desenvolvido com foco em clareza, organização e boas práticas
- Inclui tratamento para cenários reais (ex: falhas externas de API)
- Pode ser facilmente expandido para testes paralelos, pipelines avançados e ambientes distribuídos
