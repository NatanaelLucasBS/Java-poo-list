# 💻 4 Questões de Programação Orientada a Objetos (POO)

Este repositório contém a implementação de **4 exercícios práticos de Programação Orientada a Objetos (POO)** em **Java**, aplicando conceitos de **abstração, herança, encapsulamento, polimorfismo** e **interfaces**.  
Cada questão representa um cenário diferente para praticar orientação a objetos.

---

## 🧩 Questão 1 — Sistema de Entrega de Botijões de Gás

Simula o funcionamento de uma empresa de entrega de botijões 24h, gerenciando pedidos via classe `Pedido` armazenados em um `ArrayList`.  

### 🧠 Conceitos aplicados
- Criação e manipulação de objetos com `ArrayList`
- Encapsulamento e controle de estado (`status`, `data`, `hora`, etc.)
- Geração automática de código sequencial de pedidos
- Cálculo de valores e hora estimada de entrega
- Interação via menu no console

### ⚙️ Funcionalidades
- Criar novo pedido com confirmação e possibilidade de alterar endereço
- Cálculo automático de preço total e hora de entrega (+2h)
- Registro de pagamento via cartão de crédito
- Atualização do status do pedido (“confirmado” / “entregue”)
- Consulta de pedidos confirmados e entregues

---

## 🤖 Questão 2 — Robô em uma Sala

Controla o movimento de um robô em uma **sala 20x40**, respeitando limites.  
A classe `Robo` gerencia posição (`linha`, `coluna`) e passo de deslocamento.

### 🧠 Conceitos aplicados
- Representação espacial e movimentação em matriz
- Validação de limites e colisões
- Interação com o usuário via menu
- Métodos de movimentação: `andarFrente`, `andarTras`, `andarDireita`, `andarEsquerda`

### ⚙️ Funcionalidades
- Exibição gráfica simples da sala no console
- Movimentação passo a passo controlada pelo usuário
- Prevenção de ultrapassagem de fronteiras

---

## 🎲 Questão 3 — Jogo de Dados OO

Jogo para até **11 jogadores**, utilizando **dois dados de 6 faces**.  
Os jogadores apostam em um número (2–12) e o sistema sorteia o resultado, registrando vitórias em arquivo ASCII e exibindo um ranking TOP 5.

### 🧠 Conceitos aplicados
- Classes `Dado`, `Player` e `Game`
- Persistência de dados em arquivo `.txt`
- Manipulação de listas e ranking de jogadores
- Uso de `Random` para simular lançamento de dados
- Controle de duplicidade de apostas
- Reaproveitamento de código e polimorfismo

### ⚙️ Funcionalidades
- Cadastro de jogadores e registro de apostas
- Lançamento dos dados e verificação de vencedores
- Armazenamento e atualização de vitórias em arquivo
- Exibição do ranking TOP 5 ao iniciar o jogo

---

## 🧱 Questão 4 — Herança, Interfaces e Polimorfismo

Demonstra herança múltipla via interfaces, sobrecarga e sobreposição de métodos.  

### 🧠 Estrutura de Classes
- `C1` — classe abstrata base  
- `C2`, `C3` — herdam de `C1`  
- `C4`, `C5` — herdam de `C2`  
- `I1` — interface com 1 método  
- `I2` — interface com 2 métodos  

### ⚙️ Conceitos demonstrados
- Herança hierárquica e implementação de múltiplas interfaces
- Sobrecarga de construtores e métodos
- Sobreposição de métodos (`@Override`)
- Testes de objetos na classe `Principal`

---

## 🛠️ Tecnologias Utilizadas
- **Java 17+**
- **IDE:** Visual Studio Code / IntelliJ IDEA
- **Paradigma:** Programação Orientada a Objetos
- **Armazenamento:** Arquivo ASCII (Questão 3)

---

## 📁 Estrutura do Projeto
