package com.fiore.banco;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirStatus() {
        System.out.println("--- Extrato Conta Poupanca ---");
        imprimir();
    }
}
