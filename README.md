

![Badge-Conversor](https://github.com/user-attachments/assets/0c87073c-9b87-4aad-a79a-8820373edcce)

# 💱 Conversor de Moedas em Java

Neste emocionante desafio de programação, você é convidado a construir o seu próprio **Conversor de Moedas**! O objetivo é aplicar conhecimentos práticos de Java, incluindo:

- Requisições HTTP a uma **API de taxas de câmbio**
- Manipulação e parsing de **dados JSON**
- Filtros e exibição dinâmica de **moedas de interesse**

Este projeto é ideal para quem deseja se aprofundar em desenvolvimento Java com integração a APIs externas.

---

## 🚀 Funcionalidades

- ✅ Busca de **todas as moedas suportadas**
- ✅ Conversão entre **dois pares de moedas**
- ✅ Exibição das taxas de câmbio atualizadas
- ✅ Interface de terminal simples e clara

---

## 🧰 Tecnologias utilizadas

- **Java 8+**
- **Gson** (para manipular JSON)
- **HTTP Client (HttpURLConnection ou HttpClient)**

---

## ▶️ Como executar

# Substitua  " System.getenv("apiKey") " nas requisições à API pela sua chave API (https://www.exchangerate-api.com/)

### 1. Compile os arquivos

```bash
mkdir -p bin
javac -d bin -cp gson-2.10.1.jar src/app/*.java


java -cp bin:gson-2.10.1.jar app.Main

```

## 📡 API utilizada

Este projeto utiliza uma API pública de taxas de câmbio. Certifique-se de revisar a documentação da API utilizada para possíveis alterações ou uso de chave.

## 🎯 Objetivo educacional

Este projeto tem caráter educacional e é voltado para o desenvolvimento de habilidades como:

    Consumo de APIs REST

    Manipulação de JSON em Java

    Modularização de código

    Organização de projetos Java

## 📌 Requisitos

    JDK 8 ou superior

    Acesso à internet (para consumo da API)

    Biblioteca Gson (gson-2.10.1.jar)

## 📝 Licença

Projeto com fins didáticos. Sinta-se à vontade para adaptar, modificar e compartilhar.

## 👨‍💻 Autor

Desenvolvido por Iago Real como parte de um desafio prático de aprendizado em Java.
