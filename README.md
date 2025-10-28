# 💻 4 Questões de Programação Orientada a Objetos (POO)

Este repositório contém a implementação de **4 exercícios práticos de Programação Orientada a Objetos (POO)**, desenvolvidos em **Java**, com foco em **abstração, herança, encapsulamento, polimorfismo** e **interfaces**.  
Cada questão representa um cenário diferente para aplicar conceitos fundamentais da orientação a objetos.

---

## 🧩 Questão 1 — Sistema de Entrega de Botijões de Gás

Simula o funcionamento de uma empresa de entrega de botijões 24h.  
O sistema gerencia pedidos através da classe `Pedido`, armazenados em um `ArrayList`.  
O usuário pode **fazer pedidos, confirmar entregas, visualizar pedidos confirmados ou entregues**.  

### 🧠 Conceitos aplicados
- Criação e manipulação de objetos via `ArrayList`;
- Encapsulamento e controle de estado (`status`, `data`, `hora`, etc.);
- Geração automática de código sequencial de pedidos;
- Cálculo de valores e tempo estimado de entrega;
- Interação via menu no console.

### ⚙️ Funcionalidades principais
- Fazer novo pedido (com confirmação e edição);
- Cálculo automático de preço total e hora de entrega (+2h);
- Registro do pagamento via cartão de crédito;
- Atualização do status (“confirmado” / “entregue”);
- Consulta de pedidos confirmados e entregues.

---

## 🤖 Questão 2 — Robô em uma Sala

Implementa um sistema para **controlar o movimento de um robô em uma sala 20x40**, respeitando os limites do ambiente.  
A classe `Robo` controla posição (`linha`, `coluna`) e passo de deslocamento.

### 🧠 Conceitos aplicados
- Representação espacial e movimentação em matriz;
- Validação de limites e colisões;
- Interação com o usuário via menu;
- Métodos de movimentação: `andarFrente`, `andarTras`, `andarDireita`, `andarEsquerda`.

### ⚙️ Funcionalidades principais
- Exibição gráfica simples da sala no console;
- Movimento passo a passo controlado pelo usuário;
- Prevenção de ultrapassagem de fronteiras.

---

## 🎲 Questão 3 — Jogo de Dados OO

Um jogo para até **11 jogadores**, com dois dados de 6 faces.  
Os jogadores apostam em um número (2–12) e o sistema sorteia o resultado.  
Vitórias são registradas em arquivo e exibidas em um ranking TOP 5.

### 🧠 Conceitos aplicados
- Classes `Dado`, `Player` e `Game`;
- Persistência de dados em arquivo `.txt` (ASCII);
- Manipulação de listas e rankings;
- Uso de `Random` para simular dados;
- Controle de duplicidade de apostas;
- Reaproveitamento de código e polimorfismo.

### ⚙️ Funcionalidades principais
- Cadastro e apostas de até 11 jogadores;
- Lançamento dos dados e verificação de vencedores;
- Armazenamento e atualização de vitórias em arquivo;
- Exibição do ranking TOP 5 no início do jogo.

---

## 🧱 Questão 4 — Herança, Interfaces e Polimorfismo

Implementação prática de **herança múltipla via interfaces**, **sobrecarga** e **sobreposição** de métodos.  
Demonstra o relacionamento entre classes abstratas, concretas e interfaces.

### 🧠 Estrutura de Classes
- `C1` — classe abstrata base;  
- `C2`, `C3` — herdam de `C1`;  
- `C4`, `C5` — herdam de `C2`;  
- `I1` — interface com 1 método;  
- `I2` — interface com 2 métodos.  

### ⚙️ Conceitos demonstrados
- Herança hierárquica e implementação de múltiplas interfaces;
- Sobrecarga de construtores e métodos;
- Sobreposição de métodos (`@Override`);
- Instanciação e teste de todos os objetos na classe `Principal`.

---

## 🛠️ Tecnologias Utilizadas

- **Java 17+**
- **IDE:** Visual Studio Code / IntelliJ IDEA
- **Paradigma:** Programação Orientada a Objetos
- **Armazenamento:** Arquivo ASCII (para o jogo de dados)

---

## 📁 Estrutura do Projeto

