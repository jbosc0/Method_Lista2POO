# Atividade usando o Padrão Template Method

Esta questão aplica o padrão de projeto **Template Method** para unificar dois processadores de texto apresentados no PDF:  
`TudoMaiuscula` e `TudoMinuscula`.

O objetivo é remover duplicação, organizar o fluxo de processamento e reutilizar um algoritmo comum.

---

## Estrutura

### Classe Abstrata (Template)
`ProcessadorTexto.java`

Define o algoritmo fixo:
1. extrairCaracteres()
2. converterCaracteres()
3. juntarCaracteres()

A etapa variável (`converterCaracteres`) é implementada nas subclasses.

---

## Subclasses (do PDF)

### `TudoMaiuscula`
Converte todos os caracteres recebidos para maiúsculos.

### `TudoMinuscula`
Converte todos os caracteres recebidos para minúsculos.

Ambas herdaram o algoritmo da classe abstrata.

---

## Teste

A classe `Main` demonstra:

- entrada original  
- conversão para maiúsculo  
- conversão para minúsculo


---

## Uso da IA

A IA foi usada como norteadora para:

- formular um prompt para me ajudar nas ideias de desenvolvimento e apliccação do padrão na questão
- organizar commits e documentação  
Compile:

