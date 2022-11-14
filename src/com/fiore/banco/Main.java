package com.fiore.banco;

public class Main {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNome("jose da silva");

        Conta corrente = new ContaCorrente(cliente);
        corrente.depositar(250);

        Conta poupanca = new ContaPoupanca(cliente);
        corrente.transferir(250, poupanca);

        corrente.imprimirStatus();
        poupanca.imprimirStatus();
    }

}
