Sistema de Gestão de Trabalhador
Sobre o Projeto

Este projeto é um sistema desenvolvido em Java com o objetivo de praticar Programação Orientada a Objetos (POO).

A aplicação permite cadastrar um trabalhador, associá-lo a um departamento, registrar contratos por hora e calcular a renda mensal com base nesses contratos. O cálculo considera o salário base do trabalhador somado aos valores dos contratos realizados no mês informado.

Funcionalidades
Cadastro de trabalhador
Associação com departamento
Definição de nível (JUNIOR, MID_LEVEL, SENIOR)
Registro de contratos por hora
Cálculo de renda mensal
Conceitos Utilizados
Programação Orientada a Objetos (POO)
Encapsulamento
Composição de classes
Enum (NivelTrabalho)
Listas (ArrayList)
Manipulação de datas (Date e Calendar)
Entrada de dados com Scanner
Estrutura do Projeto

aplicação
└── Main.java

entidade
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

Regras
Nível deve ser: JUNIOR, MID_LEVEL ou SENIOR
Data no formato: DD/MM/YYYY
Mês/ano no formato: MM/YYYY
