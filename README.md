# 🚌 Oni+ - Sistema de Gerenciamento de Ônibus

Projeto desenvolvido para a disciplina de Programação Orientada a Objetos (POO), com o objetivo de simular o gerenciamento de ônibus escolares, incluindo cadastro de alunos e motoristas, alocação de dias de uso e controle de disponibilidade.


## ⚙️ Funcionalidades

- Cadastro de alunos e motoristas
- Alocação de dias da semana para os alunos
- Alocação de motoristas aos ônibus
- Controle da quantidade de ônibus disponíveis
- Controle da quantidade de ônibus a serem disponibilizados por dia


## 🛠️ Tecnologias e ferramentas

- **Java** (Orientação a Objetos)
- **Scanner** para entrada de dados
- **EnumSet** para controle de dias
- **ArrayList** para armazenar alunos, motoristas e ônibus


## 📁 Estrutura de Classes

- `Pessoa` — classe base para alunos, motoristas e secretarioAluno
- `Aluno` — herda de Pessoa, inclui seleção de dias
- `Motorista` — herda de Pessoa, pode ser alocado a ônibus
- `Onibus` — representa um ônibus e os alunos associados
- `Dias` — enum com os dias da semana (SEGUNDA a SABADO)
- `SecretarioAluno`, `SecretarioMotorista`, `SecretarioOnibus` — responsáveis por gerenciar cada tipo
- `SecretarioPai` — interface que implementa os outros secretarios 


## 👥Equipe responsável
- Deborah da Cunha Alves
- Daniel da Silva Lima
- Jade Hemiliane Diniz Santiago
- Junior Silva dos Santos

 
## 🚀 Como executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/jadedinizz/Oni-mais.git
