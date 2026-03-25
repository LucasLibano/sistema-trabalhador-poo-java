#Este projeto é um Sistema de Gestão de Trabalhador desenvolvido em Java, com o objetivo de praticar e consolidar conceitos fundamentais de Programação Orientada a Objetos (POO).

A aplicação permite cadastrar trabalhadores, associá-los a departamentos, registrar contratos por hora e calcular a renda mensal com base nesses contratos.

🚀 Funcionalidades

Cadastro de trabalhador
Associação com departamento
Definição de nível profissional:
JUNIOR
MID_LEVEL
SENIOR
Registro de múltiplos contratos por hora
Cálculo de renda mensal (salário base + contratos)

🧠 Conceitos Aplicados
Programação Orientada a Objetos (POO)
Encapsulamento
Composição de objetos
Enum (NivelTrabalho)
Coleções (ArrayList)
Manipulação de datas (Date e Calendar)
Entrada de dados com Scanner

🏗️ Estrutura do Projeto
📁 aplicação
 └── Main.java

📁 entidade
 ├── Departamento.java
 ├── HorasContrato.java
 ├── NivelTrabalho.java
 └── Trabalho.java


🖥️ Exemplo de Uso
Entre com o nome do departamento: TI
Nome: Alex
Nivel de trabalho: MID_LEVEL
Base salarial: 1200.00

Quantos contratos esse trabalhador vai ter? 2

Entre com a data (DD/MM/AAAA): 20/08/2023
Valor por hora: 50
Duração: 20

Entre com a data (DD/MM/AAAA): 13/08/2023
Valor por hora: 30
Duração: 18

Entre com o mes e ano para calculo (MM/YYYY): 08/2023

Nome: Alex
Departamento: TI
Ganhou no mes: 08/2023: 2600.00

⚠️ Regras de Entrada
O nível deve ser informado exatamente como:

JUNIOR
MID_LEVEL
SENIOR
Formato de data:
DD/MM/YYYY
Formato de mês/ano:
MM/YYYY