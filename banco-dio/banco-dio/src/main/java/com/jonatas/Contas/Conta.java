package com.jonatas.Contas;

import com.jonatas.Cliente.Cliente;

public abstract class Conta {
    
    private static int SEQUENCIAL = 1;
    private Cliente cliente;
    private int numero;
    private static final int agencia_padrao = 1;
    private double saldo;

    public Conta(Cliente cliente, double saldo) {
        this.cliente = cliente;
        this.numero = SEQUENCIAL++;
        this.saldo = saldo;
        this.cliente.adicionarConta(this);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String depositar(double deposito) {
        this.saldo += deposito;
        return "Depósito com sucesso. Novo saldo: " + this.saldo;
    }

    public String sacar(double saque) {
        if (this.saldo >= saque) {
            this.saldo -= saque;
            return "Saque com sucesso. Novo saldo: " + this.saldo;
        } else {
            return "Saldo insuficiente. Saldo atual: " + this.saldo;
        }
    }

    public String transferir(double valor, Conta conta) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            conta.saldo += valor;
            return "Transferência com sucesso. Novo saldo: " + this.saldo;
        } else {
            return "Saldo insuficiente. Saldo atual: " + this.saldo;
        }
    }

    public void imprimirExtrato() {
        System.out.println("=== EXTRATO ===");
        System.out.println("Agência: " + agencia_padrao);
        System.out.println("Número: " + this.numero);
        System.out.println("Saldo: " + this.saldo);
    }
}
