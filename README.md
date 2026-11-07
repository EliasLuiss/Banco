# Banco (Java POO)

Simulador de conta bancária no console, feito para praticar Programação Orientada a Objetos em Java.

## O que o programa faz

Ao iniciar, o programa pede o nome do titular (com validação) e mostra os dados da conta. Depois, pelo menu:

1. Informações da conta (titular, agência, número e limite)
2. Consultar saldo
3. Sacar
4. Depositar
5. Sair

Regras implementadas:
- A conta tem limite de R$ 1.200,00 (cheque especial).
- Não permite saque de valor negativo nem acima do limite.
- Valida o nome do titular antes de continuar.

## Conceitos praticados

- Classe `Conta` com atributos, métodos e encapsulamento (`limiteConta` privado com getter)
- Classe `Main` com menu interativo (`Scanner`, `switch` e `while`)
- Validação de entrada do usuário com laços

## Como executar

Requer o JDK instalado.

```bash
cd src
javac *.java
java Main
```

Também é possível abrir o projeto no IntelliJ IDEA e executar a classe `Main`.

## Autor

Elias Luís dos Santos Bierhals · [LinkedIn](https://www.linkedin.com/in/elias-bierhals)
