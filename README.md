# 🚀 QA Automation Challenge | Gilvando Matos

Projeto de automação de testes desenvolvido como solução para desafio técnico, cobrindo **Web, API e Performance**, com foco em boas práticas de engenharia de testes e arquitetura escalável.

---

## 👨‍💻 Autor

**Gilvando Matos**  
QA Senior / QA Leader  

🔗 LinkedIn: https://www.linkedin.com/in/gilvando-matos-3a259821/  
🔗 GitHub: https://github.com/Gilvando21  

---

## 📌 Objetivo

Demonstrar habilidades em:

- Automação Web (UI)
- Automação de APIs
- Testes de Performance
- Estruturação de framework de testes
- Boas práticas (POM, reutilização, organização)

---

## 🧪 Cobertura de Testes

### 🌐 Web
- Busca no blog do AGI
- Validação de resultados
- Estrutura Page Object Model

### 🔌 API
- Testes completos da Dog API
- Validações de status code e payload
- Cenários positivos e negativos

### ⚡ Performance
- Teste com JMeter
- Geração de relatório HTML

---

## 🧰 Stack utilizada

- Java 17
- Maven
- JUnit 5
- Selenium WebDriver
- RestAssured
- Allure Reports
- JMeter
- GitHub Actions (CI/CD)

---

## ▶️ Como executar

### Executar testes:
mvn clean test

### Gerar relatório Allure:
allure serve target/allure-results

### Executar teste de performance:
jmeter -n -t performance-tests/test-plan.jmx -l result.jtl -e -o report/

---

## 📊 Relatórios

- Relatórios interativos com Allure
- Evidências de execução organizadas
- Suporte a screenshots em falha

---

## 🧠 Boas práticas aplicadas

- Page Object Model (POM)
- Separação por camadas (web / api / utils)
- Reutilização de código
- Estrutura escalável
- Testes independentes
- Versionamento limpo com `.gitignore`

---

## ⚙️ CI/CD

Pipeline configurado com GitHub Actions para:

- Build automático
- Execução dos testes
- Validação contínua

---

## 💡 Diferenciais

✔ Testes Web + API + Performance no mesmo projeto  
✔ Estrutura pronta para escala  
✔ Integração com Allure  
✔ Código limpo e organizado  
✔ Pronto para uso em ambientes reais  

---

## 📎 Observações

- Projeto focado em clareza, organização e boas práticas
- Pode ser facilmente expandido para cenários mais complexos
