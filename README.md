
# QA Automation Challenge (Senior Level)

## ✔ Cobertura do desafio
- Web: busca no blog
- API: todos endpoints obrigatórios
- Performance: JMeter (script incluso)
- Relatórios: Allure + HTML

## 🚀 Como rodar
mvn clean test

## 📊 Allure
allure serve target/allure-results

## ⚡ Performance
jmeter -n -t performance-tests/test-plan.jmx -l result.jtl -e -o report/

## 🧠 Diferenciais
- Page Object Model
- Testes negativos
- Waits inteligentes
- Estrutura escalável
