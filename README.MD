💼 Sistema de Gestão de Trabalhador
📖 Sobre o Projeto

Este projeto consiste em um Sistema de Gestão de Trabalhador desenvolvido em Java, com o objetivo de aplicar e consolidar conceitos fundamentais de Programação Orientada a Objetos (POO).

A aplicação simula um cenário de controle de pagamentos, permitindo o cadastro de trabalhadores, sua associação a departamentos e o registro de contratos de trabalho por hora. Com base nessas informações, o sistema calcula a renda mensal do trabalhador, considerando o salário base somado aos ganhos provenientes dos contratos realizados no período informado.

Sobre o Projeto

Este projeto consiste em um Sistema de Gestão de Trabalhador desenvolvido em Java, com o objetivo de aplicar e consolidar conceitos fundamentais de Programação Orientada a Objetos (POO).

A aplicação simula um cenário de controle de pagamentos, permitindo o cadastro de trabalhadores, sua associação a departamentos e o registro de contratos de trabalho por hora. Com base nessas informações, o sistema calcula a renda mensal do trabalhador, considerando o salário base somado aos ganhos provenientes dos contratos realizados no período informado.

Funcionalidades

Cadastro de trabalhador
Associação com departamento
Definição de nível profissional:
JUNIOR
MID_LEVEL
SENIOR
Registro de múltiplos contratos por hora
Cálculo de renda mensal (salário base + contratos)
Conceitos Aplicados
Programação Orientada a Objetos (POO)
Encapsulamento
Composição de objetos
Uso de enum (NivelTrabalho)
Coleções (ArrayList)
Manipulação de datas (Date e Calendar)
Entrada de dados com Scanner
Estrutura do Projeto

📁 aplicação
 └── Main.java

📁 entidade
 ├── Departamento.java
 ├── HorasContrato.java
 ├── NivelTrabalho.java
 └── Trabalho.java
Exemplo de Uso
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
Regras de Entrada
O nível do trabalhador deve ser informado exatamente como:
JUNIOR
MID_LEVEL
SENIOR
O formato das datas deve seguir o padrão:
DD/MM/YYYY
O formato para cálculo de mês e ano deve ser:
MM/YYYY
