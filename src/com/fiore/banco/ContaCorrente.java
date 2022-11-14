package com.fiore.banco;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirStatus() {
        System.out.println("--- Extrato Conta Corrente ---");
        imprimir();
    }

}
